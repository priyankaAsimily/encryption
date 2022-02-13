package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "nvd_rule_text", schema = "raw_cloud")
public class ENvdRuleText extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "nvd_cve_product_id")
  private Integer nvdCveProductId;

  @Column(name = "rule_text_id")
  private Integer ruleTextId;

  @Column(name = "insert_src")
  private String insertSrc;

  public Integer getNvdCveProductId() {
    return nvdCveProductId;
  }

  public void setNvdCveProductId(Integer nvdCveProductId) {
    this.nvdCveProductId = nvdCveProductId;
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