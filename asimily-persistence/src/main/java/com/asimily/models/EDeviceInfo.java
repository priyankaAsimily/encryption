package com.asimily.models;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the device_info database table.
 * 
 */
// @Multitenant
// @TenantDiscriminatorColumn(name = "customer_id", contextProperty =
// "user-cid")
// @AdditionalCriteria("this.customerId IN (:CUSTOMERID, 1)")
@Cacheable(false)
@Entity
@Table(name = "device_info", schema = "portal")
// @AdditionalCriteria("(this.customerId=:USER_CUST_ID OR
// this.customerId=:ASIMILY_CUST_ID) AND (this.softDelete = false OR
// this.softDelete is NULL) AND (this.deviceState = 1)")
public class EDeviceInfo extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "mac_addr")
  private String macAddr;

  // @Transient
  // private String ipAddr = "10.129.86.42";

  @Column(name = "device_type")
  private Integer deviceTypeId;

  @Column(name = "product_info_id")
  private String productInfoId;

  @Column(name = "os_version_id")
  private String osVersionId;

  @Column(name = "mfg_id")
  private String mfgId;

  @Column(name = "mds2_doc_state")
  private Integer mds2DocState;

  private Double likelihood;

  private Integer impact;

  @Column(name = "has_anomaly")
  private Boolean anomaly;

  private Boolean recall;

  @Column(name = "host_name")
  private String hostName;

  @Column(name = "serial_number")
  private String serialNumber;

  @Column(name = "software_version")
  private String softwareVersion;

  @Column(name = "status")
  private Integer status;

  // @Column(name = "os_id")
  // private Integer osId;

  @Column(name = "is_source")
  private Boolean isSource;

  private String vulnerability;

  @Column(name = "patient_impact")
  private Integer patientImpact;

  @Column(name = "data_impact")
  private Integer dataImpact;

  @Column(name = "business_impact")
  private Integer businessImpact;

  @Column(name = "device_class")
  private Integer deviceClass;

  @Column(name = "private_data")
  private Boolean privateData;

  // @Column(name="http_external_ip")
  // private Boolean httpExternalIp;

  @Column(name = "http_external_ip")
  private Boolean isHttpExternalIp;

  @Column(name = "is_smb_external_ip")
  private Boolean isSmbExternalIp;

  @Column(name = "is_telnet_external_ip")
  private Boolean isTelnetExternalIp;

  @Column(name = "is_rdp_external_ip")
  private Boolean isRdpExternalIp;

  @Column(name = "is_smtp_external_ip")
  private Boolean isSmtpExternalIp;

  @Column(name = "is_nfs_external_ip")
  private Boolean isNfsExternalIp;

  @Column(name = "is_ftp_external_flag")
  private Boolean isFtpExternalFlag;

  @Column(name = "avg_utilization_percent")
  private BigDecimal avgUtilizationPercent;

  @Column(name = "pkt_capture_id")
  private Integer pktCaptureId;

  @Column(name = "device_state")
  private Integer deviceState;

  @Column(name = "using_email")
  private Boolean isUsingEmail;

  @Column(name = "is_wireless")
  private Boolean isWireless;

  @Column(name = "connection_status")
  private Integer connectionStatus;

  private String location;

  private String department;

  private String facility;

  @Column(name = "risk_score")
  private Integer riskScore;

  @Column(name = "anomaly_score")
  private Integer anomalyScore;

  @Column(name = "uptime")
  private Long uptime;

  @Column(name = "mac_addr_origin")
  private Integer macAddrOrigin;

  @Column(name = "os_group")
  private String osGroup;

  @Column(name = "hardware_architecture")
  private String hardwareArchitecture;

  @Column(name = "high_risk_cve_count")
  private Integer highRiskCveCount;

  @Column(name = "stores_ephi")
  private Boolean storesEphi;

  @Column(name = "transmit_ephi")
  private Boolean transmitEphi;

  @Column(name = "ip_addr")
  private String ipAddr;

  @Column(name = "is_networking_device")
  private Boolean isNetworkingDevice;

  @Column(name = "vlan_id")
  private String vlanId;

  @Column(name = "submodule")
  private String submodule;

  private String region;

  @Column(name = "policy_action_id")
  private Integer policyActionId;

  @Column(name = "nas_ip_address")
  private String nasIpAddress;

  @Column(name = "nas_port_id")
  private String nasPortId;

  @Column(name = "fixed_high_risk_cve_count")
  private Integer fixedHighRiskCveCount;

  @Column(name = "security_group_tag")
  private String securityGroupTag;

  @Column(name = "is_medical_device")
  private Boolean isMedicalDevice;
  
  @Column(name = "cmms_id")
  private String cmmsId;
  
  @Column(name = "cves_fixed")
  private Boolean cvesFixed;

  @Column(name = "is_virtual_mac")
  private Boolean isVirtualMac;

  @Column(name = "is_ip_addr_current")
  private Boolean isIpAddrCurrent;

  @Column(name = "first_discovered_at")
  private Timestamp firstDiscoveredAt;

  @Column(name = "is_dns_external_ip")
  private Boolean isDnsExternalIp;
  
  @Column(name = "device_label")
  private String deviceLabel;
  
  @Column(name = "is_device_de_activated")
  private Boolean isDeviceDeActivated;

  @Column(name = "medium_low_risk_cve_count")
  private Integer mediumLowRiskCveCount;

  @Column(name = "fixed_medium_low_risk_cve_count")
  private Integer fixedMediumLowRiskCveCount;

  @Column(name = "discovery_source")
  private Integer discoverySource;

  @Column(name = "detector_serial_number")
  private String detectorSerialNumber;
  // TODO
  // @OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL }, mppedBy
  // = "deviceInfo")
  // private List<EDevicePortInfo> devicePortInfos;

  // @OneToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL }, mappedBy
  // = "deviceInfo")
  // private List<EDeviceApplicationInfo> deviceApplicationInfos;

  // @Column(name = "device_type")
  // private String deviceType;

  @Column(name = "managed_by")
  private String managedBy;

  @Column(name = "ip_reuse_zone")
  private Integer ipReuseZone;

  @Column(name = "sub_device_type_id")
  private Integer subDeviceTypeId;

  @Transient
  private Timestamp lastDiscoveredAt;

  public EDeviceInfo() {
  }

  public Integer getDeviceTypeId() {
    return deviceTypeId;
  }

  public void setDeviceTypeId(Integer deviceTypeId) {
    this.deviceTypeId = deviceTypeId;
  }

  public Integer getImpact() {
    return this.impact;
  }

  public void setImpact(Integer impact) {
    this.impact = impact;
  }

  // public String getIpAddr() {
  // return this.ipAddr;
  // }
  //
  // public void setIpAddr(String ipAddr) {
  // this.ipAddr = ipAddr;
  // }

  public String getMacAddr() {
    return this.macAddr;
  }

  public Double getLikelihood() {
    return likelihood;
  }

  public void setLikelihood(Double likelihood) {
    this.likelihood = likelihood;
  }

  public void setMacAddr(String macAddr) {
    this.macAddr = macAddr;
  }

  public String getMfgId() {
    return mfgId;
  }

  public void setMfgId(String mfgId) {
    this.mfgId = mfgId;
  }

  public String getOsVersionId() {
    return this.osVersionId;
  }

  public void setOsVersionId(String osVersionId) {
    this.osVersionId = osVersionId;
  }

  public Boolean getAnomaly() {
    return anomaly;
  }

  public void setAnomaly(Boolean anomaly) {
    this.anomaly = anomaly;
  }

  public Boolean getRecall() {
    return recall;
  }

  public void setRecall(Boolean recall) {
    this.recall = recall;
  }

  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
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

  public Boolean getIsSource() {
    return isSource;
  }

  public void setIsSource(Boolean isSource) {
    this.isSource = isSource;
  }

  public String getVulnerability() {
    return vulnerability;
  }

  public void setVulnerability(String vulnerability) {
    this.vulnerability = vulnerability;
  }

  public Integer getPatientImpact() {
    return patientImpact;
  }

  public void setPatientImpact(Integer patientImpact) {
    this.patientImpact = patientImpact;
  }

  public Integer getDataImpact() {
    return dataImpact;
  }

  public void setDataImpact(Integer dataImpact) {
    this.dataImpact = dataImpact;
  }

  public Integer getBusinessImpact() {
    return businessImpact;
  }

  public void setBusinessImpact(Integer businessImpact) {
    this.businessImpact = businessImpact;
  }

  public Integer getDeviceClass() {
    return deviceClass;
  }

  public void setDeviceClass(Integer deviceClass) {
    this.deviceClass = deviceClass;
  }

  public String getProductInfoId() {
    return productInfoId;
  }

  public void setProductInfoId(String productInfoId) {
    this.productInfoId = productInfoId;
  }

  public Integer getMds2DocState() {
    return mds2DocState;
  }

  public void setMds2DocState(Integer mds2DocState) {
    this.mds2DocState = mds2DocState;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public BigDecimal getAvgUtilizationPercent() {
    return avgUtilizationPercent;
  }

  public void setAvgUtilizationPercent(BigDecimal avgUtilizationPercent) {
    this.avgUtilizationPercent = avgUtilizationPercent;
  }

  public Boolean getSource() {
    return isSource;
  }

  public void setSource(Boolean source) {
    isSource = source;
  }

  public Integer getPktCaptureId() {
    return pktCaptureId;
  }

  public void setPktCaptureId(Integer pktCaptureId) {
    this.pktCaptureId = pktCaptureId;
  }

  public Boolean getHttpExternalIp() {
    return isHttpExternalIp;
  }

  public void setHttpExternalIp(Boolean httpExternalIp) {
    isHttpExternalIp = httpExternalIp;
  }

  public Boolean getSmbExternalIp() {
    return isSmbExternalIp;
  }

  public void setSmbExternalIp(Boolean smbExternalIp) {
    isSmbExternalIp = smbExternalIp;
  }

  public Boolean getTelnetExternalIp() {
    return isTelnetExternalIp;
  }

  public void setTelnetExternalIp(Boolean telnetExternalIp) {
    isTelnetExternalIp = telnetExternalIp;
  }

  public Boolean getRdpExternalIp() {
    return isRdpExternalIp;
  }

  public void setRdpExternalIp(Boolean rdpExternalIp) {
    isRdpExternalIp = rdpExternalIp;
  }

  public Boolean getSmtpExternalIp() {
    return isSmtpExternalIp;
  }

  public void setSmtpExternalIp(Boolean smtpExternalIp) {
    isSmtpExternalIp = smtpExternalIp;
  }

  public Integer getDeviceState() {
    return deviceState;
  }

  public void setDeviceState(Integer deviceState) {
    this.deviceState = deviceState;
  }

  public Boolean getNfsExternalIp() {
    return isNfsExternalIp;
  }

  public void setNfsExternalIp(Boolean nfsExternalIp) {
    isNfsExternalIp = nfsExternalIp;
  }

  public Boolean getIsFtpExternalFlag() {
    return isFtpExternalFlag;
  }

  public void setIsFtpExternalFlag(Boolean isFtpExternalFlag) {
    this.isFtpExternalFlag = isFtpExternalFlag;
  }

  public Boolean getIsUsingEmail() {
    return isUsingEmail;
  }

  public void setIsUsingEmail(Boolean isUsingEmail) {
    this.isUsingEmail = isUsingEmail;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getFacility() {
    return facility;
  }

  public void setFacility(String facility) {
    this.facility = facility;
  }

  public Integer getRiskScore() {
    return riskScore;
  }

  public void setRiskScore(Integer riskScore) {
    this.riskScore = riskScore;
  }

  public Integer getAnomalyScore() {
    return anomalyScore;
  }

  public void setAnomalyScore(Integer anomalyScore) {
    this.anomalyScore = anomalyScore;
  }

  public Long getUptime() {
    return uptime;
  }

  public void setUptime(Long uptime) {
    this.uptime = uptime;
  }

  public void setIsWireless(Boolean isWireless) {
    this.isWireless = isWireless;
  }

  public Boolean getIsWireless() {
    return isWireless;
  }

  public Integer getConnectionStatus() {
    return connectionStatus;
  }

  public void setConnectionStatus(Integer connectionStatus) {
    this.connectionStatus = connectionStatus;
  }

  public Integer getMacAddrOrigin() {
    return macAddrOrigin;
  }

  public void setMacAddrOrigin(Integer macAddrOrigin) {
    this.macAddrOrigin = macAddrOrigin;
  }

  public String getOsGroup() {
    return osGroup;
  }

  public void setOsGroup(String osGroup) {
    this.osGroup = osGroup;
  }

  public String getHardwareArchitecture() {
    return hardwareArchitecture;
  }

  public void setHardwareArchitecture(String hardwareArchitecture) {
    this.hardwareArchitecture = hardwareArchitecture;
  }

  public Integer getHighRiskCveCount() {
    return highRiskCveCount;
  }

  public void setHighRiskCveCount(Integer highRiskCveCount) {
    this.highRiskCveCount = highRiskCveCount;
  }

  public void setIsNetworkingDevice(Boolean isNetworkingDevice) {
    this.isNetworkingDevice = isNetworkingDevice;
  }

  public Boolean getIsNetworkingDevice() {
    return isNetworkingDevice;
  }

  public void setIsMedicalDevice(Boolean isMedicalDevice) {
    this.isMedicalDevice = isMedicalDevice;
  }

  public Boolean getIsMedicalDevice() {
    return isMedicalDevice;
  }

  @Override
  public String toString() {
    return "EDeviceInfo{" + ", id=" + id + ", macAddr='" + macAddr + '\'' + ", deviceTypeId=" + deviceTypeId
        + ", productInfoId=" + productInfoId + ", osVersionId=" + osVersionId + ", mfgId=" + mfgId + ", mds2DocState="
        + mds2DocState + ", likelihood=" + likelihood + ", impact=" + impact + ", anomaly=" + anomaly + ", recall="
        + recall + ", hostName='" + hostName + '\'' + ", serialNumber='" + serialNumber + '\'' + ", softwareVersion='"
        + softwareVersion + '\'' + ", status=" + status + ", isSource=" + isSource + ", vulnerability='" + vulnerability
        + '\'' + ", isWireless=" + isWireless + '\'' + ", patientImpact=" + patientImpact + ", dataImpact=" + dataImpact
        + ", businessImpact=" + businessImpact + ", deviceClass=" + deviceClass + ", privateData=" + privateData
        + ", transmitsEphi =" + transmitEphi + ", storesEphi =" + storesEphi + ", connectionStatus=" + connectionStatus + ", macAddrOrigin=" + macAddrOrigin 
        + ", isNetworkingDevice=" + isNetworkingDevice + ", submodule=" + submodule + ", cmms_id=" + cmmsId + ", deviceState=" + deviceState + ", subDeviceTypeId="+ subDeviceTypeId + '}';
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

  public String getIpAddr() {
    return ipAddr;
  }

  public void setIpAddr(String ipAddr) {
    this.ipAddr = ipAddr;
  }

  public String getVlanId() {
    return vlanId;
  }

  public void setVlanId(String vlanId) {
    this.vlanId = vlanId;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public Integer getPolicyActionId() {
    return policyActionId;
  }

  public void setPolicyActionId(Integer policyActionId) {
    this.policyActionId = policyActionId;
  }

  public String getSubmodule() {
    return submodule;
  }

  public void setSubmodule(String submodule) {
    this.submodule = submodule;
  }

  public String getNasIpAddress() {
    return nasIpAddress;
  }

  public void setNasIpAddress(String nasIpAddress) {
    this.nasIpAddress = nasIpAddress;
  }

  public String getNasPortId() {
    return nasPortId;
  }

  public void setNasPortId(String nasPortId) {
    this.nasPortId = nasPortId;
  }
  
  public String getSecurityGroupTag() {
    return securityGroupTag;
  }

  public void setSecurityGroupTag(String securityGroupTag) {
    this.securityGroupTag = securityGroupTag;
  }
  
  public String getCmmsId() {
    return cmmsId;
  }

  public void setCmmsId(String cmmsId) {
    this.cmmsId = cmmsId;
  }

  public Integer getFixedHighRiskCveCount() {
    return fixedHighRiskCveCount;
  }

  public void setFixedHighRiskCveCount(Integer fixedHighRiskCveCount) {
    this.fixedHighRiskCveCount = fixedHighRiskCveCount;
  }

  public Boolean getCvesFixed() {
    return cvesFixed;
  }

  public void setCvesFixed(Boolean cvesFixed) {
    this.cvesFixed = cvesFixed;
  }

  public Boolean getIsVirtualMac(){
    return isVirtualMac;
  }

  public void setIsVirtualMac( Boolean isVirtualMac){
    this.isVirtualMac = isVirtualMac;
  }

  public Boolean getIsIpAddrCurrent() {
    return isIpAddrCurrent;
  }

  public void setIsIpAddrCurrent(Boolean isIpAddrCurrent) {
    this.isIpAddrCurrent = isIpAddrCurrent;
  }

  public Timestamp getFirstDiscoveredAt() {
    return firstDiscoveredAt;
  }

  public void setFirstDiscoveredAt(Timestamp firstDiscoveredAt) {
    this.firstDiscoveredAt = firstDiscoveredAt;
  }

  public Boolean getDnsExternalIp() {
    return isDnsExternalIp;
  }

  public void setDnsExternalIp(Boolean dnsExternalIp) {
    isDnsExternalIp = dnsExternalIp;
  }

  public String getDeviceLabel() {
	return deviceLabel;
  }

  public void setDeviceLabel(String deviceLabel) {
	this.deviceLabel = deviceLabel;
  }

  public Boolean getIsDeviceDeActivated() {
	return isDeviceDeActivated;
  } 

  public void setIsDeviceDeActivated(Boolean isDeviceDeActivated) {
	this.isDeviceDeActivated = isDeviceDeActivated;
  }

  public Integer getMediumLowRiskCveCount() {
    return mediumLowRiskCveCount;
  }

  public void setMediumLowRiskCveCount(Integer mediumLowRiskCveCount) {
    this.mediumLowRiskCveCount = mediumLowRiskCveCount;
  }

  public Integer getFixedMediumLowRiskCveCount() {
    return fixedMediumLowRiskCveCount;
  }

  public void setFixedMediumLowRiskCveCount(Integer fixedMediumLowRiskCveCount) {
    this.fixedMediumLowRiskCveCount = fixedMediumLowRiskCveCount;
  }

	public Integer getDiscoverySource() {
		return discoverySource;
	}

	public void setDiscoverySource(Integer discoverySource) {
		this.discoverySource = discoverySource;
	}

  public String getManagedBy() {
    return managedBy;
  }

  public void setManagedBy(String managedBy) {
    this.managedBy = managedBy;
  }
  
  public String getDetectorSerialNumber() {
    return detectorSerialNumber;
  }

  public void setDetectorSerialNumber(String detectorSerialNumber) {
		this.detectorSerialNumber = detectorSerialNumber;
  }

  public Integer getIpReuseZone() {
    return ipReuseZone;
  }

  public void setIpReuseZone(Integer ipReuseZone) {
    this.ipReuseZone = ipReuseZone;
  }

  public Timestamp getLastDiscoveredAt() {
    return this.lastDiscoveredAt;
  }

  public void setLastDiscoveredAt(Timestamp lastDiscoveredAt) {
    this.lastDiscoveredAt = lastDiscoveredAt;
  }

  public Integer getSubDeviceTypeId() {
    return this.subDeviceTypeId;
  }

  public void setSubDeviceTypeId(Integer subDeviceTypeId) {
    this.subDeviceTypeId = subDeviceTypeId;
  }

}
