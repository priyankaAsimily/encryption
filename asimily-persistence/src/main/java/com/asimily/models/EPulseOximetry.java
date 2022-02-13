package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pulse_oximetry", schema = "raw_on_prem")
public class EPulseOximetry extends ETenantBase {

  @Column(name = "model")
  private String model;

  @Column(name = "has_pattern_1")
  private Boolean hasPattern1;

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Boolean getHasPattern1() {
    return hasPattern1;
  }

  public void setHasPattern1(Boolean hasPattern1) {
    this.hasPattern1 = hasPattern1;
  }

}
