package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_cve_triggered_rule", schema = "portal")
public class EDeviceCveTriggeredRule extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_cve_id")
  private Integer deviceCveId;

  @Column(name = "rule_id_list")
  private String ruleIdList;

  public EDeviceCveTriggeredRule() {
  }

  public Integer getDeviceCveId() {
    return deviceCveId;
  }

  public void setDeviceCveId(Integer deviceCveId) {
    this.deviceCveId = deviceCveId;
  }

  public String getRuleIdList() {
    return ruleIdList;
  }

  public void setRuleIdList(String ruleIdList) {
    this.ruleIdList = ruleIdList;
  }

}
