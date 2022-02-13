package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "device_utilization_config", schema = "portal")
public class EDeviceUtilizationConfig extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "compute_start_time")
  private String computeStartTime;

  @Column(name="compute_end_time")
  private String computeEndTime;

  @Column(name = "is_alert_reqd")
  private Boolean isAlertReqd;

  @Column(name = "lower_bound_for_alert")
  private BigDecimal lowerBoundForAlert;

  @Column(name = "upper_bound_for_alert")
  private BigDecimal upperBoundForAlert;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public String getComputeStartTime() {
    return computeStartTime;
  }

  public void setComputeStartTime(String computeStartTime) {
    this.computeStartTime = computeStartTime;
  }

  public String getComputeEndTime() {
    return computeEndTime;
  }

  public void setComputeEndTime(String computeEndTime) {
    this.computeEndTime = computeEndTime;
  }

  public Boolean getAlertReqd() {
    return isAlertReqd;
  }

  public void setAlertReqd(Boolean alertReqd) {
    isAlertReqd = alertReqd;
  }

  public BigDecimal getLowerBoundForAlert() {
    return lowerBoundForAlert;
  }

  public void setLowerBoundForAlert(BigDecimal lowerBoundForAlert) {
    this.lowerBoundForAlert = lowerBoundForAlert;
  }

  public BigDecimal getUpperBoundForAlert() {
    return upperBoundForAlert;
  }

  public void setUpperBoundForAlert(BigDecimal upperBoundForAlert) {
    this.upperBoundForAlert = upperBoundForAlert;
  }
}
