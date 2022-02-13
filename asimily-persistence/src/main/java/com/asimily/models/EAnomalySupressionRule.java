package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "anomaly_supression_rule", schema = "portal")
public class EAnomalySupressionRule extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "rule")
  private String rule;

  @Column(name = "ui_rule")
  private String UIRule;

  @Column(name = "supressed_anomalies")
  private String supressedAnomalies;

  @Column(name = "status_id")
  private Integer statusId;

  @Column(name = "insert_src")
  private Integer insertSrc;

  public EAnomalySupressionRule() {
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

  public String getSupressedAnomalies() {
    return supressedAnomalies;
  }

  public void setSupressedAnomalies(String supressedAnomalies) {
    this.supressedAnomalies = supressedAnomalies;
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
}
