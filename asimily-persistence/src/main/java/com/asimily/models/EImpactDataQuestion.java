package com.asimily.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the device_impact_data_ques database table.
 *
 */
@Entity
@Table(name = "device_impact_data_ques", schema = "portal")
public class EImpactDataQuestion extends ETenantBase implements Serializable {
  private static final long serialVersionUID = 1L;

  private String criticality;

  private String notes;

  private String question;

  private String response;

  private BigDecimal score;

  @Column(name = "category_id")
  private Integer categoryId;

  @Column(name = "parent_id")
  private Integer parentId;

  public EImpactDataQuestion() {
  }

  public String getCriticality() {
    return this.criticality;
  }

  public void setCriticality(String criticality) {
    this.criticality = criticality;
  }

  public String getNotes() {
    return this.notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public String getQuestion() {
    return this.question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public String getResponse() {
    return this.response;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  public BigDecimal getScore() {
    return this.score;
  }

  public void setScore(BigDecimal score) {
    this.score = score;
  }

  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

}