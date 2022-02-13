package com.asimily.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "connectiv_device_info", schema = "raw_third_party")
public class EConnectivDeviceInfo extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "serial_number")
  private String serialNumber;

  @Column(name = "ip_addr")
  private String ipAddr;

  @Column(name = "sys_id")
  private String sysId;

  @Column(name = "mac_addr")
  private String macAddr;

  @Column(name = "mfg_name")
  private String mfg_Name;

  @Column(name = "device_model")
  private String deviceModel;

  @Column(name = "os")
  private String os;

  @Column(name = "os_version")
  private String osVersion;

  @Column(name = "asset_name")
  private String assetName;

  @Column(name = "facilitiy_sys_id")
  private String facility;

  @Column(name = "location_description")
  private String locationDescription;

  @Column(name = "host_name")
  private String hostName;

  @Column(name = "ci")
  private String ci;

  @Column(name = "asset_category_sys_id")
  private String asset_sys_id;

  @Column(name = "network_adapters")
  private String networkAdapters;

  @Column(name = "asset_tag")
  private String assetTag;

  @Column(name = "business_unit")
  private String businessUnit;

  @Column(name = "state")
  private String state;

  @Column(name = "location_sys_id")
  private String locationSysId;

  @Column(name = "mac_addr_based_device_id")
  private Integer macAddrBasedDeviceId;

  @Column(name = "ip_addr_based_device_id")
  private Integer ipAddrBasedDeviceId;

  @Column(name = "host_name_based_device_id")
  private String hostNameBasedDeviceId;

  @Column(name = "serial_number_based_device_id")
  private Integer serialNumberBasedDeviceId;

  @Column(name = "device_model_based_device_id")
  private Integer deviceModelBasedDeviceId;

  @Column(name = "comments")
  private String comments;

  @Column(name = "cmms_id")
  private String cmmsId;

  @Column(name = "cmms_id_based_device_id")
  private Integer cmmsIdBasedDeviceId;

  public String getCmmsId() {
    return cmmsId;
  }

  public void setCmmsId(String cmmsId) {
    this.cmmsId = cmmsId;
  }

  public Integer getCmmsIdBasedDeviceId() {
    return cmmsIdBasedDeviceId;
  }

  public void setCmmsIdBasedDeviceId(Integer cmmsIdBasedDeviceId) {
    this.cmmsIdBasedDeviceId = cmmsIdBasedDeviceId;
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

  public String getHostname() {
    return hostName;
  }

  public void setHostname(String hostname) {
    this.hostName = hostname;
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

  public Integer getDeviceModelBasedDeviceId() {
    return deviceModelBasedDeviceId;
  }

  public void setDeviceModelBasedDeviceId(Integer deviceModelBasedDeviceId) {
    this.deviceModelBasedDeviceId = deviceModelBasedDeviceId;
  }

  public String getMfgName() {
    return mfg_Name;
  }

  public void setMfgName(String mfgName) {
    this.mfg_Name = mfgName;
  }

  public Integer getSerialNumberBasedDeviceId() {
    return serialNumberBasedDeviceId;
  }

  public void setSerialNumberBasedDeviceId(Integer serialNumberBasedDeviceId) {
    this.serialNumberBasedDeviceId = serialNumberBasedDeviceId;
  }

  public String getAssetName() {
    return assetName;
  }

  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }

  public String getFacilityId() {
    return facility;
  }

  public void setFacilityId(String facilityId) {
    this.facility = facilityId;
  }

  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public String getSysId() {
    return sysId;
  }

  public void setSysId(String sysId) {
    this.sysId = sysId;
  }

  public String getAssetSysId() {
    return asset_sys_id;
  }

  public void setAssetSysId(String category) {
    this.asset_sys_id = category;
  }

  public String getNetworkAdapters() {
    return networkAdapters;
  }

  public void setNetworkAdapters(String networkAdapters) {
    this.networkAdapters = networkAdapters;
  }

  public String getAssetTag() {
    return assetTag;
  }

  public void setAssetTag(String assetTag) {
    this.assetTag = assetTag;
  }

  public String getBusinessUnit() {
    return businessUnit;
  }

  public void setBusinessUnit(String businessUnit) {
    this.businessUnit = businessUnit;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getLocationSysId() {
    return locationSysId;
  }

  public void setLocation(String location) {
    this.locationSysId = location;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public String getFacility() {
    return facility;
  }

  public void setFacility(String facility) {
    this.facility = facility;
  }

  public String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }

  public String getCi() {
    return ci;
  }

  public void setCi(String ci) {
    this.ci = ci;
  }

}
