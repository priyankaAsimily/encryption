package com.asimily.models;

import java.util.Random;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Cacheable(false)
@Entity
@Table(name = "procurement_analysis", schema = "raw_cloud")
public class EProcurementAnalysis extends EUUIDBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "mfg")
  private String manufacturerId;

  @Column(name = "device_type")
  private Integer deviceTypeId;

  @Column(name = "device_model")
  private String deviceModelId;

  @Column(name = "device_count")
  private Integer deviceCount;

  @Column(name = "os")
  private String os;

  @Column(name = "sw_version")
  private String softwareVersion;

  @Column(name = "ports_services_nbrs")
  private String portServicesNbrs;

  @Column(name = "risk_scores")
  private String riskScores;

  @Column(name = "recommendations")
  private String recommendations;

  @Column(name = "common_nbrs")
  private String commonNbrs;

  @Column(name = "external_connections")
  private String externalConnections;

  @Column(name = "common_services")
  private String commonServices;

  @Column(name = "applications")
  private String applications;

  @Column(name = "risk_context")
  private String riskContext;

  @Column(name = "likelihood_status")
  private Integer likelihoodStatus;
  
  @Column(name = "impact")
  private String impact;

  @Column(name = "dummy_device_id")
  private Integer dummyDeviceId;

  @Column(name = "insert_src")
  private Integer insertSrc;

  @Column(name = "report_generate_time")
  private Integer reportGenerateTime;

  @Column(name = "view_report_flag")
  private Boolean viewReportFlag;

  @Column(name = "description")
  private String description;

  @Column(name = "document_id")
  private Integer documentId;

  @Column(name = "os_version")
  private String osAndversion;

  @Column(name = "report_name")
  private String reportName;

  @Column(name = "potential_risk_context")
  private String potentialRiskContext;

  @Column(name = "risk_mitigated_with_security_device")
  private Boolean isRiskMitigated;

  public String getManufacturerId() {
    return manufacturerId;
  }

  public void setManufacturerId(String manufacturerId) {
    this.manufacturerId = manufacturerId;
  }

  public Integer getDeviceTypeId() {
    return deviceTypeId;
  }

  public void setDeviceTypeId(Integer deviceTypeId) {
    this.deviceTypeId = deviceTypeId;
  }

  public Integer getDeviceCount() {
    return deviceCount;
  }

  public void setDeviceCount(Integer deviceCount) {
    this.deviceCount = deviceCount;
  }

  public String getDeviceModelId() {
    return deviceModelId;
  }

  public void setDeviceModelId(String deviceModelId) {
    this.deviceModelId = deviceModelId;
  }

  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public String getSoftwareVersion() {
    return softwareVersion;
  }

  public void setSoftwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
  }

  public String getPortServicesNbrs() {
    return portServicesNbrs;
  }

  public void setPortServicesNbrs(String portServicesNbrs) {
    this.portServicesNbrs = portServicesNbrs;
  }

  public String getRiskScores() {
    return riskScores;
  }

  public void setRiskScores(String riskScores) {
    this.riskScores = riskScores;
  }

  public String getRecommendations() {
    return recommendations;
  }

  public void setRecommendations(String recommendations) {
    this.recommendations = recommendations;
  }

  public String getCommonNbrs() {
    return commonNbrs;
  }

  public void setCommonNbrs(String commonNbrs) {
    this.commonNbrs = commonNbrs;
  }

  public String getExternalConnections() {
    return externalConnections;
  }

  public void setExternalConnections(String externalConnections) {
    this.externalConnections = externalConnections;
  }

  public String getCommonServices() {
    return commonServices;
  }

  public void setCommonServices(String commonServices) {
    this.commonServices = commonServices;
  }

  public String getApplications() {
    return applications;
  }

  public void setApplications(String applications) {
    this.applications = applications;
  }

  public String getRiskContext() {
    return riskContext;
  }

  public void setRiskContext(String riskContext) {
    this.riskContext = riskContext;
  }

  public Integer getLikelihoodStatus() {
    return likelihoodStatus;
  }

  public void setLikelihoodStatus(Integer likelihoodStatus) {
    this.likelihoodStatus = likelihoodStatus;
  }

  public Integer getDummyDeviceId() {
		return dummyDeviceId;
	}

	public void setDummyDeviceId(Integer dummyDeviceId) {
		this.dummyDeviceId = dummyDeviceId;
	}

  public String getImpact() {
    return impact;
  }

  public void setImpact(String impact) {
    this.impact = impact;
  }

  public Integer getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(Integer insertSrc) {
    this.insertSrc = insertSrc;
  }

  public Integer getReportGenerateTime() {
    return reportGenerateTime;
  }

  public void setReportGenerateTime(Integer reportGenerateTime) {
    this.reportGenerateTime = reportGenerateTime;
  }

  public Boolean getViewReportFlag() {
    return viewReportFlag;
  }

  public void setViewReportFlag(Boolean viewReportFlag) {
    this.viewReportFlag = viewReportFlag;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getDocumentId() {
    return documentId;
  }

  public void setDocumentId(Integer documentId) {
    this.documentId = documentId;
  }

  public String getOsAndversion() {
    return osAndversion;
  }

  public void setOsAndversion(String osAndversion) {
    this.osAndversion = osAndversion;
  }

  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public String getPotentialRiskContext() {
    return potentialRiskContext;
  }

  public void setPotentialRiskContext(String potentialRiskContext) {
    this.potentialRiskContext = potentialRiskContext;
  }

  public Boolean getIsRiskMitigated() {
    return isRiskMitigated;
  }

  public void setIsRiskMitigated(Boolean isRiskMitigated) {
    this.isRiskMitigated = isRiskMitigated;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    Random rd = new Random();
    String uniqueOn = this.getDeviceModelId()+rd.nextInt();
    uuid = UUIDType5.nameUUIDFromNamespaceAndString(UUIDType5.NAMESPACE_URL, uniqueOn).toString();
  }

  @Override
  public String toString() {
    return "EProcurementAnalysis [manufacturerId=" + manufacturerId + ", deviceTypeId=" + deviceTypeId
        + ", deviceModelId=" + deviceModelId + ", os=" + osAndversion + ", softwareVersion=" + softwareVersion
        + ", portServicesNbrs=" + portServicesNbrs + ", riskScores=" + riskScores + ", recommendations="
        + recommendations + ", commonNbrs=" + commonNbrs + ", externalConnections=" + externalConnections
        + ", commonServices=" + commonServices + ", applications=" + applications + ", riskContext=" + riskContext
        + ", likelihoodStatus=" + likelihoodStatus + ", impact=" + impact + ", dummyDeviceId=" + dummyDeviceId + "]";
  }
}
