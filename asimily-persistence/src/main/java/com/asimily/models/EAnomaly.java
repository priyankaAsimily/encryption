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
@Table(name = "anomaly", schema = "raw_cloud")
// @Converter(name="uuidConverter",converterClass=UUIDConverter.class)
public class EAnomaly extends EBase {
  private static final long serialVersionUID = 1L;

  private String name;

  private String description;

  private String rule;

  private Integer criticality;

  private String mitigation;

  private String category;

  private String subcategory;

  @Column(name = "insert_src")
  private String insertSrc;

  // @Convert("uuidConverter")
  @Column(name = "uuid")
  private String globalId;

  @Column(name = "recommendation")
  private String recommendation;

  public EAnomaly() {
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

  public String getGlobalId() {
    return globalId;
  }

  public void setGlobalId(String globalId) {
    this.globalId = globalId;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

  public String getRecommendation() {
    return recommendation;
  }

  public void setRecommendation(String recommendation) {
    this.recommendation = recommendation;
  }
}
