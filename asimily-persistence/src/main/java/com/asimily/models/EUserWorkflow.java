package com.asimily.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user_workflow", schema = "admin")
public class EUserWorkflow extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "module_id")
  private Integer moduleId;

  @Column(name = "record_id")
  private Integer recordId;

  @Column(name = "user_id")
  private Integer userId;

  @Column(name = "priority")
  private Integer priority;

  @Column(name = "current_state")
  private Integer currentState;

  @Column(name = "prev_state")
  private Integer prevState;

  @Column(name = "due_date")
  private Timestamp dueDate;

  @Column(name = "module_type")
  private Integer moduleType;

  public Integer getModuleId() {
    return moduleId;
  }

  public void setModuleId(Integer moduleId) {
    this.moduleId = moduleId;
  }

  public Integer getRecordId() {
    return recordId;
  }

  public void setRecordId(Integer recordId) {
    this.recordId = recordId;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public Integer getCurrentState() {
    return currentState;
  }

  public void setCurrentState(Integer currentState) {
    this.currentState = currentState;
  }

  public Timestamp getDueDate() {
    return dueDate;
  }

  public void setDueDate(Timestamp dueDate) {
    this.dueDate = dueDate;
  }

  public Integer getPrevState() {
    return prevState;
  }

  public void setPrevState(Integer prevState) {
    this.prevState = prevState;
  }

  public Integer getModuleType() {
    return moduleType;
  }

  public void setModuleType(Integer moduleType) {
    this.moduleType = moduleType;
  }
}
