package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "rule", schema = "raw_cloud")
public class ERule extends EBase {
  private static final long serialVersionUID = 1L;

  private String rule;

  @Column(name = "rule_text_id")
  private Integer ruleTextId;

  @Column(name = "insert_src")
  private String insertSrc;

  public ERule() {
  }

  public String getRule() {
    return this.rule;
  }

  public void setRule(String rule) {
    this.rule = rule;
  }

  public Integer getRuleTextId() {
    return ruleTextId;
  }

  public void setRuleTextId(Integer ruleTextId) {
    this.ruleTextId = ruleTextId;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

}