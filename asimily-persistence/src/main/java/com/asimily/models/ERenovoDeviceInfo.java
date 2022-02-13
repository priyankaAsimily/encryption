package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "renovo_device_info", schema = "raw_third_party")
public class ERenovoDeviceInfo extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "ip_addr")
  private String ipAddr;

  @Column(name = "mac_addr")
  private String macAddr;

  private String manufacturer;

  @Column(name = "device_type")
  private String deviceType;
  
  @Column(name = "device_model")
  private String deviceModel;

  private String os;
  
  @Column(name = "os_version")
  private String osVersion;
  
  @Column(name = "serial_number")
  private String serialNumber;  

  @Column(name = "software_version")
  private String softwareVersion;

  private String facility1;
  
  @Column(name = "facility_name")
  private String facilityName;
  
  @Column(name = "cmms_id")
  private String cmmsId;
  
  private String hostname;
  
  @Column(name = "vlan_id")
  private String vlanId;
  
  @Column(name = "mac_addr_based_device_id")
  private Integer macAddrBasedDeviceId;
  
  @Column(name = "ip_addr_based_device_id")
  private Integer ipAddrBasedDeviceId;
  
  @Column(name = "serial_number_based_device_id")
  private Integer serialNumberBasedDeviceId;
  
  @Column(name = "host_name_based_device_id")
  private String hostNameBasedDeviceId;
  
  @Column(name = "cmms_id_based_device_id")
  private Integer cmmsIdBasedDeviceId;

  @Column(name = "device_model_based_device_id")
  private Integer deviceModelBasedDeviceId;

  @Column(name = "additional_info")
  private String additionalInfo;

  @Column(name = "is_ism")
  private Boolean isISM;

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

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public String getDeviceModel() {
    return deviceModel;
  }

  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public String getSoftwareVersion() {
    return softwareVersion;
  }

  public void setSoftwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
  }

  public String getFacility1() {
    return facility1;
  }

  public void setFacility1(String facility1) {
    this.facility1 = facility1;
  }

  public String getFacilityName() {
    return facilityName;
  }

  public void setFacilityName(String facilityName) {
    this.facilityName = facilityName;
  }

  public String getCmmsId() {
    return cmmsId;
  }

  public void setCmmsId(String cmmsId) {
    this.cmmsId = cmmsId;
  }

  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public String getVlanId() {
    return vlanId;
  }

  public void setVlanId(String vlanId) {
    this.vlanId = vlanId;
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

  public Integer getSerialNumberBasedDeviceId() {
    return serialNumberBasedDeviceId;
  }

  public void setSerialNumberBasedDeviceId(Integer serialNumberBasedDeviceId) {
    this.serialNumberBasedDeviceId = serialNumberBasedDeviceId;
  }

  public String getHostNameBasedDeviceId() {
    return hostNameBasedDeviceId;
  }

  public void setHostNameBasedDeviceId(String hostNameBasedDeviceId) {
    this.hostNameBasedDeviceId = hostNameBasedDeviceId;
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

  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public Boolean getIsISM() {
    return isISM;
  }

  public void setIsISM(Boolean isISM) {
    this.isISM = isISM;
  }

}
