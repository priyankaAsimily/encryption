package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "anomaly_settings", schema = "customer_config")
public class EAnomalySettings extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "anomaly_id")
  private Integer anomalyId;

  @Column(name = "type_id")
  private Integer typeId;

  @Column(name = "status_id")
  private Integer statusId;

  @Column(name = "insert_src")
  private Integer insertSrc;

  public Integer getAnomalyId() {
    return anomalyId;
  }

  public void setAnomalyId(Integer anomalyId) {
    this.anomalyId = anomalyId;
  }

  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }

  public Integer getStatusId() {
    return statusId;
  }

  public void setStatusId(Integer statusId) {
    this.statusId = statusId;
  }

  public Integer getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(Integer insertSrc) {
    this.insertSrc = insertSrc;
  }
}
