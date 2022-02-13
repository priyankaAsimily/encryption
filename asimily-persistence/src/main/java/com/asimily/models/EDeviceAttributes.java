package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "device_attributes", schema = "portal")
public class EDeviceAttributes extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "mac_addr")
  private String macAddr;

  @Column(name = "ip_addr")
  private String ipAddr;

  @Column(name = "device_type")
  private String deviceType;

  @Column(name = "device_model")
  private String deviceModel;

  @Column(name = "os")
  private String os;

  @Column(name = "os_version")
  private String osVersion;

  @Column(name = "hostname")
  private String hostName;

  @Column(name = "serial_number")
  private String serialNumber;

  @Column(name = "facility")
  private String facility;

  @Column(name = "vlan_id")
  private String vlanId;

  @Column(name = "number_of_ports")
  private Integer numberOfPorts;

  @Column(name = "services")
  private String services;

  @Column(name = "number_of_applications")
  private Integer numberOfApplications;

  @Column(name = "applications")
  private String applications;

  @Column(name = "number_of_neighbors")
  private Integer numberOfNeighbors;

  @Column(name = "neighbor_device_types")
  private String neighborDeviceTypes;

  @Column(name = "http_host_names")
  private String httpHostNames;

  @Column(name = "likelihood_score")
  private Double likelihoodScore;

  @Column(name = "prev_likelihood_score")
  private Double prevLikelihoodScore;

  @Column(name = "high_risk_cves")
  private String highRiskCves;

  @Column(name = "has_anomaly")
  private Boolean hasAnomaly;

  @Column(name = "anomaly_details")
  private String anomalyDetails;

  @Column(name = "anomaly_name")
  private String anomalyName;

  @Column(name = "anomaly_criticality")
  private String anomalyCriticality;

  @Column(name = "overall_impact_score")
  private Integer overallImpactScore;

  @Column(name = "patient_impact")
  private Integer patientImpact;

  @Column(name = "business_impact")
  private Integer businessImpact;

  @Column(name = "data_impact")
  private Integer dataImpact;

  @Column(name = "patient_impact_details")
  private String patientImpactDetails;

  @Column(name = "business_impact_details")
  private String businessImpactDetails;

  @Column(name = "data_impact_details")
  private String dataImpactDetails;

  @Column(name = "recall")
  private Boolean recall;

  @Column(name = "recall_list")
  private String recallList;

  @Column(name = "manufacturer")
  private String manufacturer;

  @Column(name = "software_version")
  private String softwareVersion;

  @Column(name = "risk_score")
  private Integer riskScore;

  @Column(name = "anomaly_score")
  private Integer anomalyScore;

  @Column(name = "avg_utilization_percent")
  private BigDecimal avgUtilizationPercent;

  @Column(name = "uptime")
  private Long uptime;

  @Column(name = "oui_mfg")
  private String ouiMfg;

  @Column(name = "external_ip_details")
  private String externalIpDetails;

  @Column(name = "wireless_parameters")
  private String wirelessParameters;

  @Column(name = "discovered_over")
  private Timestamp discoveredOver;

  @Column(name = "device_family")
  private String deviceFamily;

  @Column(name = "security_capabilities")
  private String securityCapabilities;

  @Column(name = "device_master_family")
  private String deviceMasterFamily;

  @Column(name = "port")
  private String port;

  @Column(name = "client_server_port")
  private String clientServerPort;

  @Column(name = "ip_type")
  private String ipType;

  @Column(name = "connection_type")
  private String connectionType;

  @Column(name = "hardware_architecture")
  private String hardwareArchitecture;

  @Column(name = "cmms_id")
  private String cmmsId;
  
  private String location;

  private String department;

  private String region;

  private String submodule;

  @Column(name = "cves_fixed")
  private Boolean cvesFixed;
  
  @Column(name = "device_label")
  private String deviceLabel;
  
  @Column(name = "is_device_de_activated")
  private Boolean isDeviceDeActivated;

  @Column(name = "stores_ephi")
  private Boolean storesEphi;

  @Column(name = "transmit_ephi")
  private Boolean transmitEphi;

  @Column(name = "private_data")
  private Boolean privateData;

  @Column(name = "first_discovered_at")
  private Timestamp firstDiscoveredAt;

  @Column(name = "last_discovered_at")
  private Timestamp lastDiscoveredAt;

  @Column(name = "discovery_source_value")
  private String discoverySourceValue;
  
  @Column(name = "detector_serial_number")
  private String detectorSerialNumber;

  @Column(name = "station_name")
  private String stationName;

  @Column(name = "managed_by")
  private String managedBy;

  @Column(name = "sub_device_type_id")
  private Integer subDeviceTypeId;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
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

  public String getFacility() {
    return facility;
  }

  public void setFacility(String facility) {
    this.facility = facility;
  }

  public String getVlanId() {
    return vlanId;
  }

  public void setVlanId(String vlanId) {
    this.vlanId = vlanId;
  }

  public Integer getNumberOfPorts() {
    return numberOfPorts;
  }

  public void setNumberOfPorts(Integer numberOfPorts) {
    this.numberOfPorts = numberOfPorts;
  }

  public String getServices() {
    return services;
  }

  public void setServices(String services) {
    this.services = services;
  }

  public Integer getNumberOfApplications() {
    return numberOfApplications;
  }

  public void setNumberOfApplications(Integer numberOfApplications) {
    this.numberOfApplications = numberOfApplications;
  }

  public String getApplications() {
    return applications;
  }

  public void setApplications(String applications) {
    this.applications = applications;
  }

  public Integer getNumberOfNeighbors() {
    return numberOfNeighbors;
  }

  public void setNumberOfNeighbors(Integer numberOfNeighbors) {
    this.numberOfNeighbors = numberOfNeighbors;
  }

  public String getNeighborDeviceTypes() {
    return neighborDeviceTypes;
  }

  public void setNeighborDeviceTypes(String neighborDeviceTypes) {
    this.neighborDeviceTypes = neighborDeviceTypes;
  }

  public String getHttpHostNames() {
    return httpHostNames;
  }

  public void setHttpHostNames(String httpHostNames) {
    this.httpHostNames = httpHostNames;
  }

  public Double getLikelihoodScore() {
    return likelihoodScore;
  }

  public void setLikelihoodScore(Double likelihoodScore) {
    this.likelihoodScore = likelihoodScore;
  }

  public Double getPrevLikelihoodScore() {
    return prevLikelihoodScore;
  }

  public void setPrevLikelihoodScore(Double prevLikelihoodScore) {
    this.prevLikelihoodScore = prevLikelihoodScore;
  }

  public String getHighRiskCves() {
    return highRiskCves;
  }

  public void setHighRiskCves(String highRiskCves) {
    this.highRiskCves = highRiskCves;
  }

  public String getAnomalyDetails() {
    return anomalyDetails;
  }

  public void setAnomalyDetails(String anomalyDetails) {
    this.anomalyDetails = anomalyDetails;
  }

  public Integer getOverallImpactScore() {
    return overallImpactScore;
  }

  public void setOverallImpactScore(Integer overallImpactScore) {
    this.overallImpactScore = overallImpactScore;
  }

  public String getPatientImpactDetails() {
    return patientImpactDetails;
  }

  public void setPatientImpactDetails(String patientImpactDetails) {
    this.patientImpactDetails = patientImpactDetails;
  }

  public String getBusinessImpactDetails() {
    return businessImpactDetails;
  }

  public void setBusinessImpactDetails(String businessImpactDetails) {
    this.businessImpactDetails = businessImpactDetails;
  }

  public String getDataImpactDetails() {
    return dataImpactDetails;
  }

  public void setDataImpactDetails(String dataImpactDetails) {
    this.dataImpactDetails = dataImpactDetails;
  }

  public Boolean getHasAnomaly() {
    return hasAnomaly;
  }

  public void setHasAnomaly(Boolean hasAnomaly) {
    this.hasAnomaly = hasAnomaly;
  }

  public Boolean getRecall() {
    return recall;
  }

  public void setRecall(Boolean recall) {
    this.recall = recall;
  }

  public Integer getPatientImpact() {
    return patientImpact;
  }

  public void setPatientImpact(Integer patientImpact) {
    this.patientImpact = patientImpact;
  }

  public Integer getBusinessImpact() {
    return businessImpact;
  }

  public void setBusinessImpact(Integer businessImpact) {
    this.businessImpact = businessImpact;
  }

  public Integer getDataImpact() {
    return dataImpact;
  }

  public void setDataImpact(Integer dataImpact) {
    this.dataImpact = dataImpact;
  }

  public String getRecallList() {
    return recallList;
  }

  public void setRecallList(String recallList) {
    this.recallList = recallList;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getSoftwareVersion() {
    return softwareVersion;
  }

  public void setSoftwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
  }

  public String getAnomalyName() {
    return anomalyName;
  }

  public void setAnomalyName(String anomalyName) {
    this.anomalyName = anomalyName;
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

  public BigDecimal getAvgUtilizationPercent() {
    return avgUtilizationPercent;
  }

  public void setAvgUtilizationPercent(BigDecimal avgUtilizationPercent) {
    this.avgUtilizationPercent = avgUtilizationPercent;
  }

  public Long getUptime() {
    return uptime;
  }

  public void setUptime(Long uptime) {
    this.uptime = uptime;
  }

  public String getOuiMfg() {
    return ouiMfg;
  }

  public void setOuiMfg(String ouiMfg) {
    this.ouiMfg = ouiMfg;
  }

  public String getExternalIpDetails() {
    return externalIpDetails;
  }

  public void setExternalIpDetails(String externalIpDetails) {
    this.externalIpDetails = externalIpDetails;
  }

  public String getWirelessParameters() {
    return wirelessParameters;
  }

  public void setWirelessParameters(String wirelessParameters) {
    this.wirelessParameters = wirelessParameters;
  }

  public Timestamp getDiscoveredOver() {
    return discoveredOver;
  }

  public void setDiscoveredOver(Timestamp discoveredOver) {
    this.discoveredOver = discoveredOver;
  }

  public String getDeviceFamily() {
    return deviceFamily;
  }

  public void setDeviceFamily(String deviceFamily) {
    this.deviceFamily = deviceFamily;
  }

  public String getSecurityCapabilities() {
    return securityCapabilities;
  }

  public void setSecurityCapabilities(String securityCapabilities) {
    this.securityCapabilities = securityCapabilities;
  }

  public String getDeviceMasterFamily() {
    return deviceMasterFamily;
  }

  public void setDeviceMasterFamily(String deviceMasterFamily) {
    this.deviceMasterFamily = deviceMasterFamily;
  }

  public String getPort() {
    return port;
  }

  public void setPort(String ports) {
    this.port = ports;
  }

  public String getClientServerPort() {
    return clientServerPort;
  }

  public void setClientServerPort(String clientServerPort) {
    this.clientServerPort = clientServerPort;
  }

  public String getIpType() {
    return ipType;
  }

  public void setIpType(String ipType) {
    this.ipType = ipType;
  }

  public String getConnectionType() {
    return connectionType;
  }

  public void setConnectionType(String connectionType) {
    this.connectionType = connectionType;
  }

  public String getHardwareArchitecture() {
    return hardwareArchitecture;
  }

  public void setHardwareArchitecture(String hardwareArchitecture) {
    this.hardwareArchitecture = hardwareArchitecture;
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

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getSubmodule() {
    return submodule;
  }

  public void setSubmodule(String submodule) {
    this.submodule = submodule;
  }

  public String getCmmsId() {
    return cmmsId;
  }

  public void setCmmsId(String cmmsId) {
    this.cmmsId = cmmsId;
  }

  public String getAnomalyCriticality() {
	return anomalyCriticality;
  }

  public void setAnomalyCriticality(String anomalyCriticality) {
	this.anomalyCriticality = anomalyCriticality;
  }

  public Boolean getCvesFixed() {
    return cvesFixed;
  }

  public void setCvesFixed(Boolean cvesFixed) {
    this.cvesFixed = cvesFixed;
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

  public Boolean getPrivateData() {
    return privateData;
  }

  public void setPrivateData(Boolean privateData) {
    this.privateData = privateData;
  }

  public Timestamp getFirstDiscoveredAt() {
	return firstDiscoveredAt;
  }

  public void setFirstDiscoveredAt(Timestamp firstDiscoveredAt) {
	this.firstDiscoveredAt = firstDiscoveredAt;
  }

  public Timestamp getLastDiscoveredAt() {
	return lastDiscoveredAt;
  }

  public void setLastDiscoveredAt(Timestamp lastDiscoveredAt) {
	this.lastDiscoveredAt = lastDiscoveredAt;
  }

  public String getDiscoverySourceValue() {
    return discoverySourceValue;
  }

  public void setDiscoverySourceValue(String discoverySourceValue) {
    this.discoverySourceValue = discoverySourceValue;
  }

  public String getDetectorSerialNumber() {
    return detectorSerialNumber;
  }

  public void setDetectorSerialNumber(String detectorSerialNumber) {
    this.detectorSerialNumber = detectorSerialNumber;
  }

  public String getStationName() {
    return stationName;
  }

  public void setStationName(String stationName) {
    this.stationName = stationName;
  }

  public String getManagedBy() {
    return managedBy;
  }

  public void setManagedBy(String managedBy) {
    this.managedBy = managedBy;
  }

  public Integer getSubDeviceTypeId() {
    return subDeviceTypeId;
  }

  public void setSubDeviceTypeId(Integer subDeviceTypeId) {
    this.subDeviceTypeId = subDeviceTypeId;
  }
}
