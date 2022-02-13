package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "impacted_device_anomaly_view", schema = "portal")
public class EImpactedDeviceAnomalyView extends EBase implements Serializable {
  private static final long serialVersionUID = 1L;

//  @Id
//  @Column(name = "device_anomaly_id")
//  protected Integer deviceAnomalyId;

  @Column(name = "device_info_id")
  protected Integer deviceInfoId;

  @Column(name = "mac_address")
  private String macAddr;

  @Column(name = "ip_address")
  private String ipAddr;

  @Column(name = "mfg_id")
  private String mfgId;

  @Column(name = "device_type")
  private Integer deviceType;

  @Column(name = "customer_anomaly_id")
  private Integer customerAnomalyId;

  @Column(name = "anomaly_name")
  private String anomalyName;

  @Column(name = "earliest_trigger_time")
  private Timestamp earliestTriggerTime;

  @Column(name = "latest_trigger_time")
  private Timestamp latestTriggerTime;

  @Column(name = "is_fixed")
  private Integer isFixed;

  @Column(name = "fix_action_taken")
  private String fixActionTaken;

  private Integer criticality;

  @Column(name = "orig_criticality")
  private Integer origCriticality;

  @Column(name = "sub_device_type")
  private String subDeviceType;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public String getMacAddr() {
    return macAddr;
  }

  public void setMacAddr(String macAddr) {
    this.macAddr = macAddr;
  }

  public String getIpAddr() {
    return ipAddr;
  }

  public void setIpAddr(String ipAddr) {
    this.ipAddr = ipAddr;
  }

  public String getMfgId() {
    return mfgId;
  }

  public void setMfgId(String mfgId) {
    this.mfgId = mfgId;
  }

  public Integer getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(Integer deviceType) {
    this.deviceType = deviceType;
  }

  public Integer getCustomerAnomalyId() {
    return customerAnomalyId;
  }

  public void setCustomerAnomalyId(Integer customerAnomalyId) {
    this.customerAnomalyId = customerAnomalyId;
  }

  public String getAnomalyName() {
    return anomalyName;
  }

  public void setAnomalyName(String anomalyName) {
    this.anomalyName = anomalyName;
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

  public Integer getCriticality() {
    return criticality;
  }

  public void setCriticality(Integer criticality) {
    this.criticality = criticality;
  }

  public Integer getOrigCriticality() {
    return origCriticality;
  }

  public void setOrigCriticality(Integer origCriticality) {
    this.origCriticality = origCriticality;
  }

  public String getSubDeviceType() {
    return subDeviceType;
  }

  public void setSubDeviceType(String subDeviceType) {
    this.subDeviceType = subDeviceType;
  } 

}
