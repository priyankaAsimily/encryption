package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "high_risk_device_excel_data", schema = "portal")
public class EHighRiskDeviceExcelData extends ETenantBase implements Serializable {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "likelihood")
  private Double likelihood;

  @Column(name = "impact")
  private Integer impact;

  @Column(name = "cve_score")
  private Double cveScore;

  @Column(name = "cve_title")
  private String cveTitle;

  @Column(name = "cve_desc")
  private String cveDesc;

  @Column(name = "cve_name")
  private String cveName;

  @Column(name = "cve_config_trigger")
  private String cveConfigTrigger;

  @Column(name = "vulnerability_expoit_vector")
  private String vulnerabilityExpoitVector;

  @Column(name = "recommendations")
  private String recommendations;
  
  @Column(name = "manufacturer")
  private String manufacturer;

  @Column(name = "device_model")
  private String deviceModel;

  @Column(name = "device_type")
  private String deviceType;

  @Column(name = "facility")
  private String facility;

  @Column(name = "cve_source")
  private String cveSource;

  @Column(name = "is_fixed")
  private Integer isFixed;

  @Column(name="fix_action_taken")
  private String fixActionTaken;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public Integer getImpact() {
    return impact;
  }

  public void setImpact(Integer impact) {
    this.impact = impact;
  }

  public Double getCveScore() {
    return cveScore;
  }

  public void setCveScore(Double cveScore) {
    this.cveScore = cveScore;
  }

  public String getCveTitle() {
    return cveTitle;
  }

  public void setCveTitle(String cveTitle) {
    this.cveTitle = cveTitle;
  }

  public String getCveDesc() {
    return cveDesc;
  }

  public void setCveDesc(String cveDesc) {
    this.cveDesc = cveDesc;
  }

  public String getCveConfigTrigger() {
    return cveConfigTrigger;
  }

  public void setCveConfigTrigger(String cveConfigTrigger) {
    this.cveConfigTrigger = cveConfigTrigger;
  }

  public String getVulnerabilityExpoitVector() {
    return vulnerabilityExpoitVector;
  }

  public void setVulnerabilityExpoitVector(String vulnerabilityExpoitVector) {
    this.vulnerabilityExpoitVector = vulnerabilityExpoitVector;
  }

  public String getCveName() {
    return cveName;
  }

  public void setCveName(String cveName) {
    this.cveName = cveName;
  }

  public String getRecommendations() {
    return recommendations;
  }

  public void setRecommendations(String recommendations) {
    this.recommendations = recommendations;
  }

  public Integer getIsFixed() {
    return isFixed;
  }

  public void setIsFixed(Integer isFixed) {
    this.isFixed = isFixed;
  }

  public String getFixActionTaken() {
    return fixActionTaken;
  }

  public void setFixActionTaken(String fixActionTaken) {
    this.fixActionTaken = fixActionTaken;
  }

  public Double getLikelihood() {
    return likelihood;
  }

  public void setLikelihood(Double likelihood) {
    this.likelihood = likelihood;
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

  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public String getFacility() {
    return facility;
  }

  public void setFacility(String facility) {
    this.facility = facility;
  }

  public String getCveSource() {
    return cveSource;
  }

  public void setCveSource(String cveSource) {
    this.cveSource = cveSource;
  }
}
