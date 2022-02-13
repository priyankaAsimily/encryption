package com.asimily.models;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the device_usl_anomaly database table.
 * 
 */
@Entity
@Table(name = "device_usl_anomaly", schema = "raw_on_prem")
public class EDeviceUSLAnomaly extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_id")
  private Integer deviceId;

  @Column(name = "anomaly_id")
  private Integer anomalyId;

  @Column(name = "device_stats_id")
  private Integer deviceStatsId ;


  public EDeviceUSLAnomaly() {
  }

  public Integer getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(Integer deviceId) {
    this.deviceId = deviceId;
  }


  public Integer getAnomalyId() {
    return anomalyId;
  }


  public void setAnomalyId(Integer anomalyId) {
    this.anomalyId = anomalyId;
  }


  public Integer getDeviceStatsId() {
    return deviceStatsId;
  }


  public void setDeviceStatsId(Integer deviceStatsId) {
    this.deviceStatsId = deviceStatsId;
  }

  
}
