package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the device_recall_info database table.
 * 
 */
@Entity
@Table(name = "device_recall", schema = "portal")
public class EDeviceRecall extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "fda_recall_id")
  private Integer fdaRecallId;

  @Column(name = "is_fixed")
  private Integer isFixed;

  @Column(name = "fix_action_taken")
  private String fixActionTaken;

  public EDeviceRecall() {
  }

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
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

  public Integer getFdaRecallId() {
    return fdaRecallId;
  }

  public void setFdaRecallId(Integer fdaRecallId) {
    this.fdaRecallId = fdaRecallId;
  }

}