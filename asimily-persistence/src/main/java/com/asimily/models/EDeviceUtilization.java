package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "device_utilization", schema = "portal")
public class EDeviceUtilization extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "utilization_percent")
  private BigDecimal utilizationPercent;

  private Integer uptime;

  @Column(name = "total_uptime")
  private Integer totalUptime;

  @Column(name = "meas_start_timestamp")
  private Timestamp measStartTime;

  @Column(name = "meas_end_timestamp")
  private Timestamp measEndTime;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public BigDecimal getUtilizationPercent() {
    return utilizationPercent;
  }

  public void setUtilizationPercent(BigDecimal utilizationPercent) {
    this.utilizationPercent = utilizationPercent;
  }

  public Integer getUptime() {
    return uptime;
  }

  public void setUptime(Integer uptime) {
    this.uptime = uptime;
  }

  public Integer getTotalUptime() {
    return totalUptime;
  }

  public void setTotalUptime(Integer totalUptime) {
    this.totalUptime = totalUptime;
  }

  public Timestamp getMeasStartTime() {
    return measStartTime;
  }

  public void setMeasStartTime(Timestamp measStartTime) {
    this.measStartTime = measStartTime;
  }

  public Timestamp getMeasEndTime() {
    return measEndTime;
  }

  public void setMeasEndTime(Timestamp measEndTime) {
    this.measEndTime = measEndTime;
  }

}
