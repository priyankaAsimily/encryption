package com.asimily.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "medimizer_device_info", schema = "raw_third_party")
public class EMedimizerDeviceInfo extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "control_number")
  private String controlNumber;

  private String description;

  @Column(name = "ip_addr")
  private String ipAddr;

  @Column(name = "mac_addr")
  private String macAddr;

  private String hostname;

  @Column(name = "serial_number")
  private String serialNumber;  

  private String manufacturer;
  
  @Column(name = "device_model")
  private String deviceModel;

  private String location;

  private String facility;

  @Column(name = "last_date")
  private Timestamp lastDate;

  @Column(name = "next_date")
  private Timestamp nextDate;

  private String status;

  private String department;

  @Column(name = "cmms_id")
  private String cmmsId;

  @Column(name = "serial_number_based_device_id")
  private Integer serialNumberBasedDeviceId;
  
  @Column(name = "cmms_id_based_device_id")
  private Integer cmmsIdBasedDeviceId;

  @Column(name = "device_model_based_device_id")
  private Integer deviceModelBasedDeviceId;

  @Column(name = "mac_addr_based_device_id")
  private Integer macAddrBasedDeviceId;
  
  @Column(name = "ip_addr_based_device_id")
  private Integer ipAddrBasedDeviceId;
  
  @Column(name = "host_name_based_device_id")
  private String hostNameBasedDeviceId;

  public String getControlNumber() {
    return controlNumber;
  }

  public void setControlNumber(String controlNumber) {
    this.controlNumber = controlNumber;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

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

  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getDeviceModel() {
    return deviceModel;
  }

  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getFacility() {
    return facility;
  }

  public void setFacility(String facility) {
    this.facility = facility;
  }

  public Timestamp getLastDate() {
    return lastDate;
  }

  public void setLastDate(Timestamp lastDate) {
    this.lastDate = lastDate;
  }

  public Timestamp getNextDate() {
    return nextDate;
  }

  public void setNextDate(Timestamp nextDate) {
    this.nextDate = nextDate;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getCmmsId() {
    return cmmsId;
  }

  public void setCmmsId(String cmmsId) {
    this.cmmsId = cmmsId;
  }

  public Integer getSerialNumberBasedDeviceId() {
    return serialNumberBasedDeviceId;
  }

  public void setSerialNumberBasedDeviceId(Integer serialNumberBasedDeviceId) {
    this.serialNumberBasedDeviceId = serialNumberBasedDeviceId;
  }

  public Integer getCmmsIdBasedDeviceId() {
    return cmmsIdBasedDeviceId;
  }

  public void setCmmsIdBasedDeviceId(Integer cmmsIdBasedDeviceId) {
    this.cmmsIdBasedDeviceId = cmmsIdBasedDeviceId;
  }

  public Integer getDeviceModelBasedDeviceId() {
    return deviceModelBasedDeviceId;
  }

  public void setDeviceModelBasedDeviceId(Integer deviceModelBasedDeviceId) {
    this.deviceModelBasedDeviceId = deviceModelBasedDeviceId;
  }

  public Integer getMacAddrBasedDeviceId() {
    return macAddrBasedDeviceId;
  }

  public void setMacAddrBasedDeviceId(Integer macAddrBasedDeviceId) {
    this.macAddrBasedDeviceId = macAddrBasedDeviceId;
  }

  public Integer getIpAddrBasedDeviceId() {
    return ipAddrBasedDeviceId;
  }

  public void setIpAddrBasedDeviceId(Integer ipAddrBasedDeviceId) {
    this.ipAddrBasedDeviceId = ipAddrBasedDeviceId;
  }

  public String getHostNameBasedDeviceId() {
    return hostNameBasedDeviceId;
  }

  public void setHostNameBasedDeviceId(String hostNameBasedDeviceId) {
    this.hostNameBasedDeviceId = hostNameBasedDeviceId;
  }

}
