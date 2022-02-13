package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "rule_text", schema = "raw_cloud")
public class ERuleText extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "rule_text")
  private String ruleText;

  @Column(name = "text_type")
  private Integer textType;

  @Column(name = "insert_src")
  private String insertSrc;

  @Column(name = "alternate_rule_1_id")
  private Integer alternateRule1Id;

  @Column(name = "alternate_rule_2_id")
  private Integer alternateRule2Id;

  public String getRuleText() {
    return ruleText;
  }

  public void setRuleText(String ruleText) {
    this.ruleText = ruleText;
  }

  public Integer getTextType() {
    return textType;
  }

  public void setTextType(Integer textType) {
    this.textType = textType;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

  public Integer getAlternateRule1Id() {
    return alternateRule1Id;
  }

  public void setAlternateRule1Id(Integer alternateRule1Id) {
    this.alternateRule1Id = alternateRule1Id;
  }

  public Integer getAlternateRule2Id() {
    return alternateRule2Id;
  }

  public void setAlternateRule2Id(Integer alternateRule2Id) {
    this.alternateRule2Id = alternateRule2Id;
  }
}