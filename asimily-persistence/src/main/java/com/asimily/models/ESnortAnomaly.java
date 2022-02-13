package com.asimily.models;

import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

/**
 * The persistent class for the application_info database table.
 * 
 */
@Entity
@Table(name = "snort_anomaly", schema = "portal")
public class ESnortAnomaly extends EBase {

  @Column(name = "name")
  private String name;

  @Column(name = "criticality")
  private Integer criticality;
  
  @Column(name = "mitigation")
  private String mitigation;

  @Column(name = "recommendation")
  private String recommendation;

  public ESnortAnomaly() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getCriticality() {
    return criticality;
  }

  public void setCriticality(Integer criticality) {
    this.criticality = criticality;
  }

  public String getMitigation() {
    return mitigation;
  }

  public void setMitigation(String mitigation) {
    this.mitigation = mitigation;
  }

  public String getRecommendation() {
    return recommendation;
  }

  public void setRecommendation(String recommendation) {
    this.recommendation = recommendation;
  }

}
