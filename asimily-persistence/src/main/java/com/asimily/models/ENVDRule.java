package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the nvd_rule database table.
 * 
 */
@Entity
@Table(name = "nvd_rule", schema = "raw_cloud")
public class ENVDRule extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "rule_list")
  private String ruleList;

  @Column(name = "nvd_cve_product_id")
  private Integer nvdCveProductId;

  @Column(name = "insert_src")
  private String insertSrc;

  public ENVDRule() {
  }

  public String getRuleList() {
    return this.ruleList;
  }

  public void setRuleList(String ruleList) {
    this.ruleList = ruleList;
  }

  public Integer getNvdCveProductId() {
    return nvdCveProductId;
  }

  public void setNvdCveProductId(Integer nvdCveProductId) {
    this.nvdCveProductId = nvdCveProductId;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

}
