package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the notification_parameter database table.
 * 
 */
@Entity
@Table(name = "notification_parameter", schema = "raw_cloud")
public class ENotificationParameter extends EBase {
  private static final long serialVersionUID = 1L;

  private String description;

  @Column(name = "param_name")
  private String paramName;

  @Column(name = "insert_src")
  private String insertSrc;

  public ENotificationParameter() {
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getParamName() {
    return this.paramName;
  }

  public void setParamName(String paramName) {
    this.paramName = paramName;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

}