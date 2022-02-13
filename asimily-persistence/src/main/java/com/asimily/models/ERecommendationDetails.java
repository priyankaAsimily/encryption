package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "recommendation_details", schema = "portal")
public class ERecommendationDetails extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "recommendation")
  private String recommendation;

  @Column(name = "no_of_devices")
  private Integer noOfDevices;


  @Column(name = "rule_text_id")
  private Integer ruleTextId;

  public String getRecommendation() {
    return recommendation;
  }

  public void setRecommendation(String recommendation) {
    this.recommendation = recommendation;
  }

  public Integer getNoOfDevices() {
    return noOfDevices;
  }

  public void setNoOfDevices(Integer noOfDevices) {
    this.noOfDevices = noOfDevices;
  }

  public Integer getRuleTextId() {
    return ruleTextId;
  }

  public void setRuleTextId(Integer ruleTextId) {
    this.ruleTextId = ruleTextId;
  }
}
