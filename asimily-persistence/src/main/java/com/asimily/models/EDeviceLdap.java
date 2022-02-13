package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.asimily.models.EBase;

@Entity
@Table(name = "device_ldap", schema = "portal")
public class EDeviceLdap extends EBase {

  @Id
  @Column(name = "customer_id")
  private Integer customerId;

  @Id
  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "protocol_operation")
  private Integer protocolOperation;

  @Column(name = "host_name")
  private String hostName;

  @Column(name = "mckesson")
  private Integer mckesson;

  @Column(name = "clinical")
  private Integer clinical;

  @Column(name = "workstations")
  private Integer workstations;

  @Column(name = "msg")
  private String msg;

  @Column(name = "is_sender")
  private Boolean isSender;
  
  @Column(name = "metadata_id")
  private Integer metadataId;
  
  @Column(name = "record_id")
  private Integer recordId;

  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public Integer getProtocolOperation() {
    return this.protocolOperation;
  }

  public void setProtocolOperation(int protocolOperation) {
    this.protocolOperation = protocolOperation;
  }

  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public Integer getMckesson() {
    return this.mckesson;
  }

  public void setMckesson(Integer mckesson) {
    this.mckesson = mckesson;
  }

  public Integer getClinical() {
    return this.clinical;
  }

  public void setClinical(Integer clinical) {
    this.clinical = clinical;
  }

  public Integer getWorkstations() {
    return this.workstations;
  }

  public void setWorkstations(Integer workstations) {
    this.workstations = workstations;
  }

  public String getMsg() {
    return this.msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public Boolean getIsSender() {
    return isSender;
  }

  public void setIsSender(Boolean isSender) {
    this.isSender = isSender;
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

}
