package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "domain_security_key_mapping", schema = "raw_cloud")
public class EDomainSecurityKeyMapping extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "domain_name")
  private String domainName;

  @Column(name = "product_name")
  private String productName;

  @Column(name = "security_type")
  private String securityType;

  @Column(name = "domain_sec_key_id")
  private Integer domainSecKeyId;

  @Column(name = "insert_src")
  private String insertSrc;

  public EDomainSecurityKeyMapping() {
  }

  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public Integer getDomainSecKeyId() {
    return domainSecKeyId;
  }

  public void setDomainSecKeyId(Integer domainSecKeyId) {
    this.domainSecKeyId = domainSecKeyId;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

  public String getSecurityType() {
    return securityType;
  }

  public void setSecurityType(String securityType) {
    this.securityType = securityType;
  }

}