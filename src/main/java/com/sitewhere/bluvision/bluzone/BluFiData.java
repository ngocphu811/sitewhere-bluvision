/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.bluvision.bluzone;

/**
 * Model object for marshaling BluFi information.
 * 
 * @author Derek
 */
public class BluFiData {

	private int deviceId;

	private int projectId;

	private String name;

	private String status;

	private String notes;

	private Firmware bleFirmware;

	private DeviceType deviceType;

	private Tag[] tags;

	private String configuration;

	private float altitude;

	private double latitude;

	private double longitude;

	private int floorNumber;

	private int mainFirmwareRev;

	private int bleFirmwareRev;

	private Selfie selfie;

	private String scanData;

	private int totalViolations;

	private long dateProvisioned;

	private long dateCreated;

	private long dateUpdated;

	private int wifiFirmwareRev;

	private String sid64;

	private String sid128;

	private String bleMac;

	private String ipAddress;

	private String gwAddress;

	private String dnsAddress;

	private String cloudAddress;

	private String macAddress;

	private String wifiSsid;
	
	private String blufiTemplateId;

	private String blufiTemplateName;

	private String wifiTemplateSsid;

	private String wifiTemplateSecurityType;

	private String wsEndpoint;

	private String[] locations;

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Firmware getBleFirmware() {
		return bleFirmware;
	}

	public void setBleFirmware(Firmware bleFirmware) {
		this.bleFirmware = bleFirmware;
	}

	public DeviceType getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(DeviceType deviceType) {
		this.deviceType = deviceType;
	}

	public Tag[] getTags() {
		return tags;
	}

	public void setTags(Tag[] tags) {
		this.tags = tags;
	}

	public String getConfiguration() {
		return configuration;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}

	public float getAltitude() {
		return altitude;
	}

	public void setAltitude(float altitude) {
		this.altitude = altitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public int getMainFirmwareRev() {
		return mainFirmwareRev;
	}

	public void setMainFirmwareRev(int mainFirmwareRev) {
		this.mainFirmwareRev = mainFirmwareRev;
	}

	public int getBleFirmwareRev() {
		return bleFirmwareRev;
	}

	public void setBleFirmwareRev(int bleFirmwareRev) {
		this.bleFirmwareRev = bleFirmwareRev;
	}

	public Selfie getSelfie() {
		return selfie;
	}

	public void setSelfie(Selfie selfie) {
		this.selfie = selfie;
	}

	public String getSid64() {
		return sid64;
	}

	public void setSid64(String sid64) {
		this.sid64 = sid64;
	}

	public String getSid128() {
		return sid128;
	}

	public void setSid128(String sid128) {
		this.sid128 = sid128;
	}

	public String getBleMac() {
		return bleMac;
	}

	public void setBleMac(String bleMac) {
		this.bleMac = bleMac;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getGwAddress() {
		return gwAddress;
	}

	public void setGwAddress(String gwAddress) {
		this.gwAddress = gwAddress;
	}

	public String getDnsAddress() {
		return dnsAddress;
	}

	public void setDnsAddress(String dnsAddress) {
		this.dnsAddress = dnsAddress;
	}

	public String getCloudAddress() {
		return cloudAddress;
	}

	public void setCloudAddress(String cloudAddress) {
		this.cloudAddress = cloudAddress;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getWifiSsid() {
		return wifiSsid;
	}

	public void setWifiSsid(String wifiSsid) {
		this.wifiSsid = wifiSsid;
	}

	public String getBlufiTemplateId() {
		return blufiTemplateId;
	}

	public void setBlufiTemplateId(String blufiTemplateId) {
		this.blufiTemplateId = blufiTemplateId;
	}

	public String getScanData() {
		return scanData;
	}

	public void setScanData(String scanData) {
		this.scanData = scanData;
	}

	public int getTotalViolations() {
		return totalViolations;
	}

	public void setTotalViolations(int totalViolations) {
		this.totalViolations = totalViolations;
	}

	public long getDateProvisioned() {
		return dateProvisioned;
	}

	public void setDateProvisioned(long dateProvisioned) {
		this.dateProvisioned = dateProvisioned;
	}

	public long getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(long dateCreated) {
		this.dateCreated = dateCreated;
	}

	public long getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(long dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public int getWifiFirmwareRev() {
		return wifiFirmwareRev;
	}

	public void setWifiFirmwareRev(int wifiFirmwareRev) {
		this.wifiFirmwareRev = wifiFirmwareRev;
	}

	public String getBlufiTemplateName() {
		return blufiTemplateName;
	}

	public void setBlufiTemplateName(String blufiTemplateName) {
		this.blufiTemplateName = blufiTemplateName;
	}

	public String getWifiTemplateSsid() {
		return wifiTemplateSsid;
	}

	public void setWifiTemplateSsid(String wifiTemplateSsid) {
		this.wifiTemplateSsid = wifiTemplateSsid;
	}

	public String getWifiTemplateSecurityType() {
		return wifiTemplateSecurityType;
	}

	public void setWifiTemplateSecurityType(String wifiTemplateSecurityType) {
		this.wifiTemplateSecurityType = wifiTemplateSecurityType;
	}

	public String getWsEndpoint() {
		return wsEndpoint;
	}

	public void setWsEndpoint(String wsEndpoint) {
		this.wsEndpoint = wsEndpoint;
	}

	public String[] getLocations() {
		return locations;
	}

	public void setLocations(String[] locations) {
		this.locations = locations;
	}

	public static class Firmware {

		private int firmwareId;

		private String type;

		private int version;

		private DeviceType deviceType;

		public int getFirmwareId() {
			return firmwareId;
		}

		public void setFirmwareId(int firmwareId) {
			this.firmwareId = firmwareId;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public int getVersion() {
			return version;
		}

		public void setVersion(int version) {
			this.version = version;
		}

		public DeviceType getDeviceType() {
			return deviceType;
		}

		public void setDeviceType(DeviceType deviceType) {
			this.deviceType = deviceType;
		}

	}

	public static class DeviceType {

		private int deviceTypeId;

		private String name;

		private String code;

		private boolean active;

		public int getDeviceTypeId() {
			return deviceTypeId;
		}

		public void setDeviceTypeId(int deviceTypeId) {
			this.deviceTypeId = deviceTypeId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public boolean isActive() {
			return active;
		}

		public void setActive(boolean active) {
			this.active = active;
		}
	}

	public static class Tag {

		private int tagId;

		private String value;

		public int getTagId() {
			return tagId;
		}

		public void setTagId(int tagId) {
			this.tagId = tagId;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public static class Selfie {

		private int selfieId;

		private String name;

		private String contentType;

		private float overlayX;

		private float overlayY;

		private float overlayRadius;

		private String url;

		public int getSelfieId() {
			return selfieId;
		}

		public void setSelfieId(int selfieId) {
			this.selfieId = selfieId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getContentType() {
			return contentType;
		}

		public void setContentType(String contentType) {
			this.contentType = contentType;
		}

		public float getOverlayX() {
			return overlayX;
		}

		public void setOverlayX(float overlayX) {
			this.overlayX = overlayX;
		}

		public float getOverlayY() {
			return overlayY;
		}

		public void setOverlayY(float overlayY) {
			this.overlayY = overlayY;
		}

		public float getOverlayRadius() {
			return overlayRadius;
		}

		public void setOverlayRadius(float overlayRadius) {
			this.overlayRadius = overlayRadius;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
	}
}
