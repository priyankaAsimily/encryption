package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "device_utilization_alerts", schema = "portal")
public class EDeviceUtilizationAlerts extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "alert_id")
  private Integer alertId;

  @Column(name = "trigger_time")
  private Timestamp triggerTime;

  @Column(name = "is_seen")
  private Boolean isSeen;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public Integer getAlertId() {
    return alertId;
  }

  public void setAlertId(Integer alertId) {
    this.alertId = alertId;
  }

  public Timestamp getTriggerTime() {
    return triggerTime;
  }

  public void setTriggerTime(Timestamp triggerTime) {
    this.triggerTime = triggerTime;
  }

  public Boolean getIsSeen() {
    return isSeen;
  }

  public void setIsSeen(Boolean isSeen) {
    this.isSeen = isSeen;
  }

}
