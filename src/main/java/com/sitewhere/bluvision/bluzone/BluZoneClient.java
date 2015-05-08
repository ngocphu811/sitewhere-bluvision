/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.bluvision.bluzone;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

/**
 * Client for REST calls to BluVision servers.
 * 
 * @author Derek
 */
public class BluZoneClient {

	/** Use CXF web client to send requests */
	private RestTemplate client;

	public BluZoneClient() {
		this.client = new RestTemplate();
		List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
		converters.add(new MappingJackson2HttpMessageConverter());
		client.setMessageConverters(converters);
		client.setErrorHandler(new ResponseErrorHandler() {

			@Override
			public boolean hasError(ClientHttpResponse response) throws IOException {
				return false;
			}

			@Override
			public void handleError(ClientHttpResponse response) throws IOException {
			}
		});
	}

	/**
	 * Get information about a BluFi device.
	 * 
	 * @param blufiId
	 * @return
	 */
	public BluFiData getBluFiData(long projectId, String blufiId) {
		return sendRest("https://beta.bluzone.io/portal/papis/v1/projects/" + projectId + "/devices/blufis/"
				+ blufiId, HttpMethod.GET, null, BluFiData.class, new HashMap<String, String>());
	}

	/**
	 * Send the REST payload.
	 * 
	 * @param url
	 * @param method
	 * @param input
	 * @param clazz
	 * @param vars
	 * @return
	 * @throws ResourceAccessException
	 */
	protected <S, T> S sendRest(String url, HttpMethod method, T input, Class<S> clazz,
			Map<String, String> vars) throws ResourceAccessException {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Cookie", " X-BZ-AuthToken=DGyrGXfCSyRHdbQJuB1lgBq8eJA799kL5Tyj;");
		HttpEntity<T> entity = new HttpEntity<T>(input, headers);
		ResponseEntity<S> response = client.exchange(url, method, entity, clazz, vars);
		return response.getBody();
	}
}