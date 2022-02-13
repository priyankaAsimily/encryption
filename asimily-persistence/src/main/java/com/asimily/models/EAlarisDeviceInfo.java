package com.asimily.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "alaris_device_info", schema = "raw_third_party")
public class EAlarisDeviceInfo extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "ip_addr")
  private String ipAddr;
  
  @Column(name = "serial_number")
  private String serialNumber;

  @Column(name = "ip_addr_based_device_id")
  private Integer ipAddrBasedDeviceId;
  
  @Column(name = "serial_number_based_device_id")
  private Integer serialNumberBasedDeviceId;
  
  @Column(name = "record_id")
  private String recordId;

  private Integer status;

  @Column(name = "channel_a")
  private String channelA;

  @Column(name = "channel_b")
  private String channelB;

  @Column(name = "channel_c")
  private String channelC;

  @Column(name = "channel_d")
  private String channelD;

  @Column(name = "software_version")
  private String softwareVersion;

  private String facility;

  private String department;

  private String location;

  @Column(name = "last_discovered_time")
  private Timestamp lastDiscoveredTime;

  @Column(name = "additional_info")
  private String additionalInfo;

  public String getIpAddr() {
    return ipAddr;
  }

  public void setIpAddr(String ipAddr) {
    this.ipAddr = ipAddr;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public Integer getIpAddrBasedDeviceId() {
    return ipAddrBasedDeviceId;
  }

  public void setIpAddrBasedDeviceId(Integer ipAddrBasedDeviceId) {
    this.ipAddrBasedDeviceId = ipAddrBasedDeviceId;
  }

  public Integer getSerialNumberBasedDeviceId() {
    return serialNumberBasedDeviceId;
  }

  public void setSerialNumberBasedDeviceId(Integer serialNumberBasedDeviceId) {
    this.serialNumberBasedDeviceId = serialNumberBasedDeviceId;
  }

  public String getRecordId() {
    return recordId;
  }

  public void setRecordId(String recordId) {
    this.recordId = recordId;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getChannelA() {
    return channelA;
  }

  public void setChannelA(String channelA) {
    this.channelA = channelA;
  }

  public String getChannelB() {
    return channelB;
  }

  public void setChannelB(String channelB) {
    this.channelB = channelB;
  }

  public String getChannelC() {
    return channelC;
  }

  public void setChannelC(String channelC) {
    this.channelC = channelC;
  }

  public String getChannelD() {
    return channelD;
  }

  public void setChannelD(String channelD) {
    this.channelD = channelD;
  }

  public String getSoftwareVersion() {
    return softwareVersion;
  }

  public void setSoftwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
  }

  public String getFacility() {
    return facility;
  }

  public void setFacility(String facility) {
    this.facility = facility;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Timestamp getLastDiscoveredTime() {
    return lastDiscoveredTime;
  }

  public void setLastDiscoveredTime(Timestamp lastDiscoveredTime) {
    this.lastDiscoveredTime = lastDiscoveredTime;
  }

  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  @Override
  public String toString() {
    return "EAlarisDeviceInfo{" + ", id=" + id + ", ipAddr=" + ipAddr + ", serialNumber=" + serialNumber + ", ip_addr_based_device_id=" + ipAddrBasedDeviceId
      + ", serial_number_based_device_id=" + serialNumberBasedDeviceId + ", last_discovered_time=" + lastDiscoveredTime + ", status=" + status + "}";
  }
}
