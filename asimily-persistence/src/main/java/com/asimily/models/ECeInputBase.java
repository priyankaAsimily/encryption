package com.asimily.models;

import com.asimily.models.ETenantBase;

import java.sql.Timestamp;

import javax.persistence.*;

@MappedSuperclass
public class ECeInputBase extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  protected Integer id;

  @Column(name = "record_id")
  private Integer recordId;

  @Column(name = "metadata_id")
  private Integer metadataId;

  // @Column(name = "old_value")
  // private String oldValue;
  //
  // @Column(name = "new_value")
  // private String newValue;

  @Column(name = "processing_state")
  private Integer processingState;

  @Column(name = "busy")
  private Boolean busy;

  // @Column(name = "processing_priority")
  // private Integer processingPriority;

  @Column(name = "user_id")
  private Integer userId;

  @Column(name = "state")
  private Integer state;

  @Column(name = "process_start_time")
  private Timestamp processStateTime;

  @Column(name = "process_end_time")
  private Timestamp processEndTime;

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

  public Integer getProcessingState() {
    return processingState;
  }

  public void setProcessingState(Integer processingState) {
    this.processingState = processingState;
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

  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public Timestamp getProcessStateTime() {
    return processStateTime;
  }

  public void setProcessStateTime(Timestamp processStateTime) {
    this.processStateTime = processStateTime;
  }

  public Timestamp getProcessEndTime() {
    return processEndTime;
  }

  public void setProcessEndTime(Timestamp processEndTime) {
    this.processEndTime = processEndTime;
  }
}
