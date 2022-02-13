package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_info_alt", schema = "portal")
public class EDeviceInfoAlt extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "likelihood")
  private Double likelihood;

  @Column(name = "risk_score")
  private Integer riskScore;

  @Column(name = "high_risk_cve_count")
  private Integer highRiskCveCount;

  @Column(name = "fixed_high_risk_cve_count")
  private Integer fixedHighRiskCveCount;

  @Column(name = "cves_fixed")
  private Boolean cvesFixed;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public Double getLikelihood() {
    return likelihood;
  }

  public void setLikelihood(Double likelihood) {
    this.likelihood = likelihood;
  }

  public Integer getRiskScore() {
    return riskScore;
  }

  public void setRiskScore(Integer riskScore) {
    this.riskScore = riskScore;
  }

  public Integer getHighRiskCveCount() {
    return highRiskCveCount;
  }

  public void setHighRiskCveCount(Integer highRiskCveCount) {
    this.highRiskCveCount = highRiskCveCount;
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
}
