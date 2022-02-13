package com.asimily.models;

import javax.persistence.*;


@Entity
// @AdditionalCriteria("this.customerId=:CUSTOMERID OR
// (this.customerId=:ASIMILYCUSTID)")
@Table(name = "ce_input_utilization", schema = "raw_on_prem")
public class ECeInputUtilization extends ETenantBase {
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

  @Column(name = "processing_state")
  private Integer processingState;

  @Column(name = "busy")
  private Boolean busy;

  @Column(name = "processing_priority")
  private Integer processingPriority;

  @Column(name = "user_id")
  private Integer userId;

  public Boolean getBusy() {
    return busy;
  }

  public void setBusy(Boolean busy) {
    this.busy = busy;
  }

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

  public Integer getProcessingState() {
    return processingState;
  }

  public void setProcessingState(Integer processingState) {
    this.processingState = processingState;
  }

  public Integer getProcessingPriority() {
    return processingPriority;
  }

  public void setProcessingPriority(Integer processingPriority) {
    this.processingPriority = processingPriority;
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

}
