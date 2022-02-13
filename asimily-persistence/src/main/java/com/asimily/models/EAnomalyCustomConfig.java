package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "anomaly", schema = "customer_config")
public class EAnomalyCustomConfig extends ETenantBase {

  private static final long serialVersionUID = 1L;

  private String name;

  private String description;
  
  private String rule;

  @Column(name = "UI_rule")
  private String UIRule;

  private Integer criticality;

  private String mitigation;

  private String category;

  private String subcategory;

  @Column(name = "insert_src")
  private Integer insertSrc;

  @Column(name = "recommendation")
  private String recommendation;
  
  public EAnomalyCustomConfig() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getRule() {
    return rule;
  }

  public void setRule(String rule) {
    this.rule = rule;
  }

  public String getUIRule() {
    return UIRule;
  }

  public void setUIRule(String uIRule) {
    UIRule = uIRule;
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

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getSubcategory() {
    return subcategory;
  }

  public void setSubcategory(String subcategory) {
    this.subcategory = subcategory;
  }

  public Integer getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(Integer insertSrc) {
    this.insertSrc = insertSrc;
  }

  public String getRecommendation() {
    return recommendation;
  }

  public void setRecommendation(String recommendation) {
    this.recommendation = recommendation;
  }
}
