package com.asimily.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_vlan_view", schema = "portal")
public class EDeviceVlanView extends ETenantBase implements Serializable {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  protected Integer deviceInfoId;

  @Column(name = "vlan_id")
  private Integer vLanId;

  @Column(name = "mac_addr")
  private String macAddr;

  @Column(name = "ip_addr")
  private String ipAddr;

  @Column(name = "mfg_id")
  private String mfgId;

  @Column(name = "device_type")
  private Integer deviceType;

  @Column(name = "os_version_id")
  private String osVersionId;

  @Column(name = "product_info_id")
  private String productInfoId;

  @Column(name = "description")
  private String description;

  private String facility;

  private Double likelihood;

  @Column(name = "anomaly_score")
  private Integer anomalyScore;

  @Column(name = "connection_status")
  private Integer connectionStatus;

  @Column(name = "mds2_doc_state")
  private Integer mds2DocState;

  @Column(name = "first_discovered_at")
  private Timestamp firstDiscoveredAt;

  @Column(name = "private_data")
  private Boolean privateData;

  @Column(name = "stores_ephi")
  private Boolean storesEphi;

  @Column(name = "transmit_ephi")
  private Boolean transmitEphi;

  @Column(name = "is_networking_device")
  private Boolean isNetworkingDevice;

  private String department;

  @Column(name = "is_wireless")
  private Boolean isWireless;

  @Column(name = "has_anomaly")
  private Boolean anomaly;

  @Column(name = "host_name")
  private String hostName;

  private String location;

  @Column(name = "cmms_id")
  private String cmmsId;

  private Integer impact;

  @Column(name = "risk_score")
  private Integer riskScore;

  private String region;

  @Column(name = "managed_by")
  private String managedBy;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public Integer getvLanId() {
    return vLanId;
  }

  public void setvLanId(Integer vLanId) {
    this.vLanId = vLanId;
  }

  public String getMacAddr() {
    return macAddr;
  }

  public void setMacAddr(String macAddr) {
    this.macAddr = macAddr;
  }

  public String getIpAddr() {
    return ipAddr;
  }

  public void setIpAddr(String ipAddr) {
    this.ipAddr = ipAddr;
  }

  public String getMfgId() {
    return mfgId;
  }

  public void setMfgId(String mfgId) {
    this.mfgId = mfgId;
  }

  public Integer getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(Integer deviceType) {
    this.deviceType = deviceType;
  }

  public String getOsVersionId() {
    return osVersionId;
  }

  public void setOsVersionId(String osVersionId) {
    this.osVersionId = osVersionId;
  }

  public String getProductInfoId() {
    return productInfoId;
  }

  public void setProductInfoId(String productInfoId) {
    this.productInfoId = productInfoId;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getFacility() {
    return facility;
  }

  public void setFacility(String facility) {
    this.facility = facility;
  }

  public Double getLikelihood() {
    return likelihood;
  }

  public void setLikelihood(Double likelihood) {
    this.likelihood = likelihood;
  }

  public Integer getAnomalyScore() {
    return anomalyScore;
  }

  public void setAnomalyScore(Integer anomalyScore) {
    this.anomalyScore = anomalyScore;
  }

  public Integer getConnectionStatus() {
    return connectionStatus;
  }

  public void setConnectionStatus(Integer connectionStatus) {
    this.connectionStatus = connectionStatus;
  }

  public Integer getMds2DocState() {
    return mds2DocState;
  }

  public void setMds2DocState(Integer mds2DocState) {
    this.mds2DocState = mds2DocState;
  }

  public Timestamp getFirstDiscoveredAt() {
    return firstDiscoveredAt;
  }

  public void setFirstDiscoveredAt(Timestamp firstDiscoveredAt) {
    this.firstDiscoveredAt = firstDiscoveredAt;
  }

  public Boolean getPrivateData() {
    return privateData;
  }

  public void setPrivateData(Boolean privateData) {
    this.privateData = privateData;
  }

  public Boolean getStoresEphi() {
    return storesEphi;
  }

  public void setStoresEphi(Boolean storesEphi) {
    this.storesEphi = storesEphi;
  }

  public Boolean getTransmitEphi() {
    return transmitEphi;
  }

  public void setTransmitEphi(Boolean transmitEphi) {
    this.transmitEphi = transmitEphi;
  }

  public Boolean getIsNetworkingDevice() {
    return isNetworkingDevice;
  }

  public void setIsNetworkingDevice(Boolean isNetworkingDevice) {
    this.isNetworkingDevice = isNetworkingDevice;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public Boolean getIsWireless() {
    return isWireless;
  }

  public void setIsWireless(Boolean isWireless) {
    this.isWireless = isWireless;
  }

  public Boolean getAnomaly() {
    return anomaly;
  }

  public void setAnomaly(Boolean anomaly) {
    this.anomaly = anomaly;
  }

  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getCmmsId() {
    return cmmsId;
  }

  public void setCmmsId(String cmmsId) {
    this.cmmsId = cmmsId;
  }

  public Integer getImpact() {
    return impact;
  }

  public void setImpact(Integer impact) {
    this.impact = impact;
  }

  public Integer getRiskScore() {
    return riskScore;
  }

  public void setRiskScore(Integer riskScore) {
    this.riskScore = riskScore;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getManagedBy() {
    return managedBy;
  }

  public void setManagedBy(String managedBy) {
    this.managedBy = managedBy;
  }
}
