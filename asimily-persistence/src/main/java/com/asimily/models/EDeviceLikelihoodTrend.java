package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "device_likelihood_trend", schema = "portal")
public class EDeviceLikelihoodTrend extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "likelihood_score")
  private Integer likelihoodScore;

  @Column(name = "cves_fixed")
  private Boolean cvesFixed;

  @Column(name = "computed_time")
  private Timestamp computedTime;

  @Column(name = "is_weekly_data")
  private Boolean isWeeklyData;

  public Boolean getIsWeeklyData() {
    return this.isWeeklyData;
  }

  public void setIsWeeklyData(Boolean isWeeklyData) {
    this.isWeeklyData = isWeeklyData;
  }

  public Integer getDeviceInfoId() {
    return this.deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public Integer getLikelihoodScore() {
    return this.likelihoodScore;
  }

  public void setLikelihoodScore(Integer likelihoodScore) {
    this.likelihoodScore = likelihoodScore;
  }

  public Boolean isCvesFixed() {
    return this.cvesFixed;
  }

  public Boolean getCvesFixed() {
    return this.cvesFixed;
  }

  public void setCvesFixed(Boolean cvesFixed) {
    this.cvesFixed = cvesFixed;
  }

  public Timestamp getComputedTime() {
    return this.computedTime;
  }

  public void setComputedTime(Timestamp computedTime) {
    this.computedTime = computedTime;
  }

}
