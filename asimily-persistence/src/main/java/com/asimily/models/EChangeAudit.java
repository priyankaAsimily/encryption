package com.asimily.models;

import javax.persistence.*;

@Entity
@Table(name = "change_audit", schema = "raw_on_prem")
public class EChangeAudit extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  protected Integer id;

  @Id
  @Column(name = "customer_id")
  private Integer customerId;

  @Column(name = "record_id")
  private Integer recordId;

  @Column(name = "metadata_id")
  private Integer metadataId;

  @Column(name = "old_value")
  private String oldValue;

  @Column(name = "new_value")
  private String newValue;

  @Column(name = "user_id")
  private Integer userId;

  @Column(name = "action_taken_id")
  private Integer actionTakenId;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getRecordId() {
    return recordId;
  }

  public void setRecordId(Integer recordId) {
    this.recordId = recordId;
  }

  public String getOldValue() {
    return oldValue;
  }

  public void setOldValue(String oldValue) {
    this.oldValue = oldValue;
  }

  public String getNewValue() {
    return newValue;
  }

  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }

  public Integer getMetadataId() {
    return metadataId;
  }

  public void setMetadataId(Integer metadataId) {
    this.metadataId = metadataId;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public Integer getActionTakenId() {
    return actionTakenId;
  }

  public void setActionTakenId(Integer actionTakenId) {
    this.actionTakenId = actionTakenId;
  }

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

}
