package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "infoblox_device_info", schema = "raw_third_party")
public class EInfobloxDeviceInfo extends EMacIpAssociationExternalDeviceInfoBase {

	private static final long serialVersionUID = 1L;

	
	@Column(name = "ipv6_addr")
	private String ipv6Addr;

	@Column(name = "os")
	private String os;

	@Column(name = "host_names")
	private String hostNames;

	@Column(name = "network")
	private String network;

	@Column(name = "additional_info")
	private String additionalInfo;

	@Transient
	private String leaseState;
	

	public String getIpv6Addr() {
		return ipv6Addr;
	}

	public void setIpv6Addr(String ipv6Addr) {
		this.ipv6Addr = ipv6Addr;
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