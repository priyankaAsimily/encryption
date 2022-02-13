package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "nac_policy", schema = "portal")
public class ENacPolicy extends ETenantBase {

  private static final long serialVersionUID = 1L;
  
  @Column(name = "ers_policy_id")
  private String ersPolicyId;

  private String name;

  private String details;
  
  @Column(name = "connector_type")
  private Integer connectorType;
  
  @Column(name = "policy_type")
  private Integer policyType;
  
  @Column(name = "insert_src")
  private Integer insertSrc;

  public String getErsPolicyId() {
    return ersPolicyId;
  }

  public void setErsPolicyId(String ersPolicyId) {
    this.ersPolicyId = ersPolicyId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public Integer getConnectorType() {
    return connectorType;
  }

  public void setConnectorType(Integer connectorType) {
    this.connectorType = connectorType;
  }

  public Integer getPolicyType() {
    return policyType;
  }

  public void setPolicyType(Integer policyType) {
    this.policyType = policyType;
  }

  public Integer getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(Integer insertSrc) {
    this.insertSrc = insertSrc;
  }

}
