package com.asimily.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "anomaly_settings_view", schema = "customer_config")
public class EAnomalySettingsView extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "anomaly_id")
  private Integer anomalyId;

  @Column(name = "type_id")
  private Integer typeId;

  @Column(name = "status_id")
  private Integer statusId;

  @Column(name = "insert_src")
  private Integer insertSrc;

  @Column(name = "createdBy")
  private String createdBy;

  @Column(name = "modifiedBy")
  private String modifiedBy;
  
  @Column(name= "last_updated_time")
  private Timestamp lastUpdatedTime;

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

   //for created by
   public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  //for modified by
   public String getModifiedBy() {
    return modifiedBy;
  }
   
   public void setModifiedBy(String modifiedBy) {
	    this.modifiedBy = modifiedBy;
	  }
   
   public Timestamp getLastUpdatedTime() {
	    return lastUpdatedTime;
	  }
	   
   public void setLastUpdatedTime(Timestamp lastUpdatedTime) {
	    this.lastUpdatedTime = lastUpdatedTime;
	  }
}
