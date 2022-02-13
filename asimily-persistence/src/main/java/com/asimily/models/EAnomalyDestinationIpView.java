package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "anomaly_destination_ip_view", schema = "portal")
public class EAnomalyDestinationIpView extends EBase implements Serializable {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  protected Integer deviceInfoId;

  @Column(name = "field_id")
  private Integer fieldId;

  @Column(name = "external_ip_addr")
  private String externalIpAddr;

  @Column(name = "anomaly_name")
  private String anomalyName;

  @Column(name = "is_fixed")
  private Boolean isFixed;

  @Column(name="fix_action_taken")
  private String fixActionTaken;

  @Column(name="fixed_by")
  private String fixedBy;

  @Column(name="fixed_date")
  private Timestamp fixedDate;


  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public Integer getFieldId() {
    return fieldId;
  }

  public void setFieldId(Integer fieldId) {
    this.fieldId = fieldId;
  }

  public String getExternalIpAddr() {
    return externalIpAddr;
  }

  public void setExternalIpAddr(String externalIpAddr) {
    this.externalIpAddr = externalIpAddr;
  }

  public String getAnomalyName() {
    return anomalyName;
  }

  public void setAnomalyName(String anomalyName) {
    this.anomalyName = anomalyName;
  }

  public Boolean getIsFixed() {
    return isFixed;
  }

  public void setIsFixed(Boolean isFixed) {
    this.isFixed = isFixed;
  }

  public String getFixActionTaken() {
    return fixActionTaken;
  }

  public void setFixActionTaken(String fixActionTaken) {
    this.fixActionTaken = fixActionTaken;
  }

  public String getFixedBy() {
    return fixedBy;
  }

  public void setFixedBy(String fixedBy) {
    this.fixedBy = fixedBy;
  }

  public Timestamp getFixedDate() {
    return fixedDate;
  }

  public void setFixedDate(Timestamp fixedDate) {
    this.fixedDate = fixedDate;
  }
}
