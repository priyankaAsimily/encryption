package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "high_risk_cve_details_view", schema = "portal")
public class EHighRiskCveDetailsView extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "cve_name")
  private String cveName;

  @Column(name = "cve_id")
  private Integer cveId;

  @Column(name = "cve_desc")
  private String cveDesc;

  @Column(name = "cve_title")
  private String cveTitle;

  @Column(name = "affected_application")
  private String affectedApplication;

  @Column(name = "recommendation_present")
  private Boolean recommendationPresent;

  @Column(name = "high_risk_device_count")
  private Integer highRiskDeviceCount;

  @Column(name = "total_device_count")
  private Integer totalDeviceCount;
  
  @Column(name = "devices_fixed")
  private Boolean devicesFixed;

  @Column(name = "medium_low_risk_device_count")
  private Integer mediumLowRiskDeviceCount;

  public String getCveName() {
    return cveName;
  }

  public void setCveName(String cveName) {
    this.cveName = cveName;
  }

  public Integer getCveId() {
    return cveId;
  }

  public void setCveId(Integer cveId) {
    this.cveId = cveId;
  }

  public String getCveDesc() {
    return cveDesc;
  }

  public void setCveDesc(String cveDesc) {
    this.cveDesc = cveDesc;
  }

  public String getCveTitle() {
    return cveTitle;
  }

  public void setCveTitle(String cveTitle) {
    this.cveTitle = cveTitle;
  }

  public String getAffectedApplication() {
    return affectedApplication;
  }

  public void setAffectedApplication(String affectedApplication) {
    this.affectedApplication = affectedApplication;
  }

  public Boolean getRecommendationPresent() {
    return recommendationPresent;
  }

  public void setRecommendationPresent(Boolean recommendationPresent) {
    this.recommendationPresent = recommendationPresent;
  }

  public Integer getHighRiskDeviceCount() {
    return highRiskDeviceCount;
  }

  public void setHighRiskDeviceCount(Integer highRiskDeviceCount) {
    this.highRiskDeviceCount = highRiskDeviceCount;
  }

  public Integer getTotalDeviceCount() {
    return totalDeviceCount;
  }

  public void setTotalDeviceCount(Integer totalDeviceCount) {
    this.totalDeviceCount = totalDeviceCount;
  }

  public Boolean getDevicesFixed() {
    return devicesFixed;
  }

  public void setDevicesFixed(Boolean devicesFixed) {
    this.devicesFixed = devicesFixed;
  }

  public Integer getMediumLowRiskDeviceCount() {
    return mediumLowRiskDeviceCount;
  }

  public void setMediumLowRiskDeviceCount(Integer mediumLowRiskDeviceCount) {
    this.mediumLowRiskDeviceCount = mediumLowRiskDeviceCount;
  }

}
