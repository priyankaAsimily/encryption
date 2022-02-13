package com.asimily.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "connectors_sync_info", schema = "admin")
public class EConnectorsSyncInfo extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "connector_id")
  private Integer connectorId;

  @Column(name = "sync_frequency")
  private String syncFrequency;
  
  @Column(name = "last_sync_time")
  private Timestamp lastSyncTime;

  @Column(name = "next_sync_time")
  private Timestamp nextSyncTime;

  public Integer getConnectorId() {
    return connectorId;
  }

  public void setConnectorId(Integer connectorId) {
    this.connectorId = connectorId;
  }

  public String getSyncFrequency() {
    return syncFrequency;
  }

  public void setSyncFrequency(String syncFrequency) {
    this.syncFrequency = syncFrequency;
  }

  public Timestamp getLastSyncTime() {
    return lastSyncTime;
  }

  public void setLastSyncTime(Timestamp lastSyncTime) {
    this.lastSyncTime = lastSyncTime;
  }

  public Timestamp getNextSyncTime() {
    return nextSyncTime;
  }

  public void setNextSyncTime(Timestamp nextSyncTime) {
    this.nextSyncTime = nextSyncTime;
  }
  
}
