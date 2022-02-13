package com.asimily.models;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.PrePersist;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the anomaly_info database table.
 * 
 */
@Cacheable(false)
@Entity
@Table(name = "device_anomaly", schema = "portal")
public class EDeviceAnomaly extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "customer_anomaly_id")
  private Integer customerAnomalyId;

  @Column(name = "is_fixed")
  private Integer isFixed;

  @Column(name = "fix_action_taken")
  private String fixActionTaken;

  @Column(name = "earliest_trigger_time")
  private Timestamp earliestTriggerTime;

  @Column(name = "latest_trigger_time")
  private Timestamp latestTriggerTime;

  @Column(name = "mode")
  private Integer mode;

  private String details;

  private Integer criticality;

  @PrePersist
  protected void onCreateEarliestTriggerTime() {
    if (earliestTriggerTime == null) { earliestTriggerTime = new Timestamp(System.currentTimeMillis()); }
  }

  public EDeviceAnomaly() {
  }

  public Integer getCustomerAnomalyId() {
    return customerAnomalyId;
  }

  public void setCustomerAnomalyId(Integer customerAnomalyId) {
    this.customerAnomalyId = customerAnomalyId;
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

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public Integer getMode() {
    return mode;
  }

  public void setMode(Integer mode) {
    this.mode = mode;
  }

  public Integer getCriticality() {
    return criticality;
  }

  public void setCriticality(Integer criticality) {
    this.criticality = criticality;
  }

  public Timestamp getEarliestTriggerTime() {
    return earliestTriggerTime;
  }

  public void setEarliestTriggerTime(Timestamp earliestTriggerTime) {
    this.earliestTriggerTime = earliestTriggerTime;
  }

  public Timestamp getLatestTriggerTime() {
    return latestTriggerTime;
  }

  public void setLatestTriggerTime(Timestamp latestTriggerTime) {
    this.latestTriggerTime = latestTriggerTime;
  }

}
