/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.bluvision.bluzone;

/**
 * Model object used to marshal BluZone JSON data.
 * 
 * @author Derek
 */
public class ScanData {

	private String metaData;

	private long serverTimestamp;

	private String blufiId;

	private long projectId;

	private AdvData[] advData;

	public String getMetaData() {
		return metaData;
	}

	public void setMetaData(String metaData) {
		this.metaData = metaData;
	}

	public long getServerTimestamp() {
		return serverTimestamp;
	}

	public void setServerTimestamp(long serverTimestamp) {
		this.serverTimestamp = serverTimestamp;
	}

	public String getBlufiId() {
		return blufiId;
	}

	public void setBlufiId(String blufiId) {
		this.blufiId = blufiId;
	}

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public AdvData[] getAdvData() {
		return advData;
	}

	public void setAdvData(AdvData[] advData) {
		this.advData = advData;
	}

	public static class AdvData {

		private String type;

		private String id;

		private int time;

		private int sdc;

		private int batt;

		private float temp;

		private int txPower;

		private int txChn;

		private Adapter adapter;

		private int[] raw;

		private String uuid;

		private int major;

		private int minor;

		private int measuredPower;

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public int getTime() {
			return time;
		}

		public void setTime(int time) {
			this.time = time;
		}

		public int getSdc() {
			return sdc;
		}

		public void setSdc(int sdc) {
			this.sdc = sdc;
		}

		public int getBatt() {
			return batt;
		}

		public void setBatt(int batt) {
			this.batt = batt;
		}

		public float getTemp() {
			return temp;
		}

		public void setTemp(float temp) {
			this.temp = temp;
		}

		public int getTxPower() {
			return txPower;
		}

		public void setTxPower(int txPower) {
			this.txPower = txPower;
		}

		public int getTxChn() {
			return txChn;
		}

		public void setTxChn(int txChn) {
			this.txChn = txChn;
		}

		public Adapter getAdapter() {
			return adapter;
		}

		public void setAdapter(Adapter adapter) {
			this.adapter = adapter;
		}

		public int[] getRaw() {
			return raw;
		}

		public void setRaw(int[] raw) {
			this.raw = raw;
		}

		public String getUuid() {
			return uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public int getMajor() {
			return major;
		}

		public void setMajor(int major) {
			this.major = major;
		}

		public int getMinor() {
			return minor;
		}

		public void setMinor(int minor) {
			this.minor = minor;
		}

		public int getMeasuredPower() {
			return measuredPower;
		}

		public void setMeasuredPower(int measuredPower) {
			this.measuredPower = measuredPower;
		}

		public static class Adapter {

			private int rssi;

			private String gid;

			private String ad128bit;

			private String ad128bitMore;

			private String adNameShort;

			private String[][] adFlags;

			private String ad32bitMore;

			private String ad32bit;

			private int rssiCh;

			private String adNameLong;

			private String adType;

			private String bdId;

			private String ad16bitMore;

			private String ad16bit;

			private String adPower;

			public int getRssi() {
				return rssi;
			}

			public void setRssi(int rssi) {
				this.rssi = rssi;
			}

			public String getGid() {
				return gid;
			}

			public void setGid(String gid) {
				this.gid = gid;
			}

			public String getAd128bit() {
				return ad128bit;
			}

			public void setAd128bit(String ad128bit) {
				this.ad128bit = ad128bit;
			}

			public String getAd128bitMore() {
				return ad128bitMore;
			}

			public void setAd128bitMore(String ad128bitMore) {
				this.ad128bitMore = ad128bitMore;
			}

			public String getAdNameShort() {
				return adNameShort;
			}

			public void setAdNameShort(String adNameShort) {
				this.adNameShort = adNameShort;
			}

			public String[][] getAdFlags() {
				return adFlags;
			}

			public void setAdFlags(String[][] adFlags) {
				this.adFlags = adFlags;
			}

			public String getAd32bitMore() {
				return ad32bitMore;
			}

			public void setAd32bitMore(String ad32bitMore) {
				this.ad32bitMore = ad32bitMore;
			}

			public String getAd32bit() {
				return ad32bit;
			}

			public void setAd32bit(String ad32bit) {
				this.ad32bit = ad32bit;
			}

			public int getRssiCh() {
				return rssiCh;
			}

			public void setRssiCh(int rssiCh) {
				this.rssiCh = rssiCh;
			}

			public String getAdNameLong() {
				return adNameLong;
			}

			public void setAdNameLong(String adNameLong) {
				this.adNameLong = adNameLong;
			}

			public String getAdType() {
				return adType;
			}

			public void setAdType(String adType) {
				this.adType = adType;
			}

			public String getBdId() {
				return bdId;
			}

			public void setBdId(String bdId) {
				this.bdId = bdId;
			}

			public String getAd16bitMore() {
				return ad16bitMore;
			}

			public void setAd16bitMore(String ad16bitMore) {
				this.ad16bitMore = ad16bitMore;
			}

			public String getAd16bit() {
				return ad16bit;
			}

			public void setAd16bit(String ad16bit) {
				this.ad16bit = ad16bit;
			}

			public String getAdPower() {
				return adPower;
			}

			public void setAdPower(String adPower) {
				this.adPower = adPower;
			}
		}
	}
}