package com.asimily.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the device_details database table.
 * 
 */
@Entity
//@Table(name="device_details")
public class EDeviceDetail extends EBase implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="device_info_id")
	private Integer deviceInfoId;

	@Column(name="host_name")
	private String hostName;

	@Column(name="serial_number")
	private String serialNumber;

	@Column(name="software_version")
	private String softwareVersion;

	public EDeviceDetail() {
	}

	public Integer getDeviceInfoId() {
		return this.deviceInfoId;
	}

	public void setDeviceInfoId(Integer deviceInfoId) {
		this.deviceInfoId = deviceInfoId;
	}

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getSoftwareVersion() {
		return this.softwareVersion;
	}

	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}

}