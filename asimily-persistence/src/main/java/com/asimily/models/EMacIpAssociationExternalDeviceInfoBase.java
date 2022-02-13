package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass
public class EMacIpAssociationExternalDeviceInfoBase extends ETenantBase {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "ip_addr")
	private String ipAddr;
	
	@Column(name = "mac_addr")
	private String macAddr;
	
	@Column(name = "mac_addr_based_device_id")
	private int macAddrBasedDeviceId;

	
		public String getIpAddr() {
		return ipAddr;
	}

	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}

	public String getMacAddr() {
		return macAddr;
	}

	public void setMacAddr(String macAddr) {
		this.macAddr = macAddr;
	}

	public int getMacAddrBasedDeviceId() {
		return macAddrBasedDeviceId;
	}

	public void setMacAddrBasedDeviceId(int macAddrBasedDeviceId) {
		this.macAddrBasedDeviceId = macAddrBasedDeviceId;
	}
	
}

