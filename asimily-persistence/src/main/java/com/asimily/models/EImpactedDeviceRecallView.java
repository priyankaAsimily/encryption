package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "impacted_device_recall_view", schema = "portal")
public class EImpactedDeviceRecallView extends EBase implements Serializable {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  protected Integer deviceInfoId;

  @Column(name = "mac_addr")
  private String macAddr;

  @Column(name = "ip_addr")
  private String ipAddr;

  @Column(name = "mfg_id")
  private String mfgId;

  @Column(name = "device_type")
  private Integer deviceType;

  @Column(name = "fda_recall_id")
  private Integer fdaRecallId;

  @Column(name = "recall_number")
  private String recallNumber;

  @Column(name = "is_fixed")
  private Integer isFixed;

  @Column(name = "recall_status")
  private String recallStatus;


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

  public Integer getFdaRecallId() {
    return fdaRecallId;
  }

  public void setFdaRecallId(Integer fdaRecallId) {
    this.fdaRecallId = fdaRecallId;
  }

  public String getRecallNumber() {
    return recallNumber;
  }

  public void setRecallNumber(String recallNumber) {
    this.recallNumber = recallNumber;
  }

  public Integer getIsFixed() {
    return isFixed;
  }

  public void setIsFixed(Integer isFixed) {
    this.isFixed = isFixed;
  }

  public String getRecallStatus() {
    return recallStatus;
  }

  public void setRecallStatus(String recallStatus) {
    this.recallStatus = recallStatus;
  }
}
