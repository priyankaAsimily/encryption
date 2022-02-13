package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "device_group", schema = "raw_on_prem")
public class EDeviceGroup extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "name")
  private String name;

  /*@Column(name = "rule_id")
  private Integer ruleId;*/

  public EDeviceGroup() {
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /*public Integer getRuleId() {
    return ruleId;
  }

  public void setRuleId(Integer ruleId) {
    this.ruleId = ruleId;
  }*/

}