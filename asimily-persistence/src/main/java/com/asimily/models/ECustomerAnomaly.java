package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the customer_anomaly database table.
 * 
 */
@Entity
@Table(name = "customer_anomaly", schema = "portal")
public class ECustomerAnomaly extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "anomaly_id")
  private Integer anomalyId;

  private Integer criticality;

  @Column(name = "type_id")
  private Integer typeId;

  public ECustomerAnomaly() {
  }

  public Integer getAnomalyId() {
    return this.anomalyId;
  }

  public void setAnomalyId(Integer anomalyId) {
    this.anomalyId = anomalyId;
  }

  public Integer getCriticality() {
    return this.criticality;
  }

  public void setCriticality(Integer criticality) {
    this.criticality = criticality;
  }

  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }
}
