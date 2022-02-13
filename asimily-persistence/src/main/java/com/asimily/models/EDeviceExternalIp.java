package com.asimily.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_external_ip", schema = "portal")
public class EDeviceExternalIp extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "field_id")
  private Integer fieldId;

  @Column(name = "field_value")
  private String fieldVal;
  
  @Column(name = "metadata_id")
  private Integer metadataId;
  
  @Column(name = "record_id")
  private Integer recordId;

  @Column(name = "protocol_service_name")
  private String protocolServiceName;

  @Column(name = "is_fixed")
  private Boolean isFixed;

  @Column(name="fix_action_taken")
  private String fixActionTaken;

  @Column(name="fixed_by")
  private String fixedBy;

  @Column(name="fixed_date")
  private Timestamp fixedDate;

  @Column(name = "inbound")
  private Boolean inbound;

  public int getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(int deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public int getFieldId() {
    return fieldId;
  }

  public void setFieldId(int fieldId) {
    this.fieldId = fieldId;
  }

  public String getFieldVal() {
    return fieldVal;
  }

  public void setFieldVal(String fieldVal) {
    this.fieldVal = fieldVal;
  }
  
  public Integer getMetadataId() {
    return metadataId;
  }

  public void setMetadataId(Integer metadataId) {
    this.metadataId = metadataId;
  }

  public Integer getRecordId() {
    return recordId;
  }

  public void setRecordId(Integer recordId) {
    this.recordId = recordId;
  }

  public String getProtocolServiceName() {
    return protocolServiceName;
  }

  public void setProtocolServiceName(String protocolServiceName) {
    this.protocolServiceName = protocolServiceName;
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

  public Boolean getInbound() {
    return inbound;
  }

  public void setInbound(Boolean inbound) {
    this.inbound = inbound;
  }

  @Override
  public String toString() {
    return "EDeviceExternalIp [deviceInfoId=" + deviceInfoId + ", fieldId=" + fieldId + ", fieldVal=" + fieldVal
        + ", metadataId=" + metadataId + ", recordId=" + recordId + ", protocolServiceName=" + protocolServiceName
        + ", inbound=" + inbound + "]";
  }

}
