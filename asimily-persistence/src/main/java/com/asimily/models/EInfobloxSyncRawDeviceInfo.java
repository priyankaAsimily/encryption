package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "infoblox_sync_raw_device_info", schema = "raw_third_party")
public class EInfobloxSyncRawDeviceInfo extends ETenantBase {

	private static final long serialVersionUID = 1L;

	@Column(name = "sync_id")
	private int syncId;
	
	@Column(name = "ipv4_addr")
	private String ipv4Addr;
	
	@Column(name = "ipv6_addr")
	private String ipv6Addr;

	@Column(name = "mac_addr")
	private String macAddr;

	@Column(name = "os")
	private String os;

	@Column(name = "host_names")
	private String hostNames;

	@Column(name = "network")
	private String network;

	@Column(name = "additional_info")
	private String additionalInfo;

	@Column(name = "lease_state")
	private String leaseState;
	
	
	public int getSyncId() {
		return syncId;
	}

	public void setSyncId(int syncId) {
		this.syncId = syncId;
	}

	public String getIpv4Addr() {
		return ipv4Addr;
	}

	public void setIpv4Addr(String ipv4Addr) {
		this.ipv4Addr = ipv4Addr;
	}

	public String getIpv6Addr() {
		return ipv6Addr;
	}

	public void setIpv6Addr(String ipv6Addr) {
		this.ipv6Addr = ipv6Addr;
	}

	public String getMacAddr() {
		return macAddr;
	}

	public void setMacAddr(String macAddr) {
		this.macAddr = macAddr;
	}

	public String getHostNames() {
		return hostNames;
	}

	public void setHostNames(String hostNames) {
		this.hostNames = hostNames;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public String getLeaseState() {
		return leaseState;
	}

	public void setLeaseState(String leaseState) {
		this.leaseState = leaseState;
	}


}