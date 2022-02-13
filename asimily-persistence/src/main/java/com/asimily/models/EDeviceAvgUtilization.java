package com.asimily.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_avg_utilization", schema = "portal")
public class EDeviceAvgUtilization extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "business_date")
  private String businessDate;

  @Column(name = "avg_utilization_percent")
  private BigDecimal avgUtilizationPercent;

  @Column(name = "uptime")
  private Integer uptime;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public String getBusinessDate() {
    return businessDate;
  }

  public void setBusinessDate(String businessDate) {
    this.businessDate = businessDate;
  }

  public BigDecimal getAvgUtilizationPercent() {
    return avgUtilizationPercent;
  }

  public void setAvgUtilizationPercent(BigDecimal avgUtilizationPercent) {
    this.avgUtilizationPercent = avgUtilizationPercent;
  }

  public Integer getUptime() {
    return uptime;
  }

  public void setUptime(Integer uptime) {
    this.uptime = uptime;
  }

}
