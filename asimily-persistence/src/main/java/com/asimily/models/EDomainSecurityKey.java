package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "domain_security_key", schema = "raw_cloud")
public class EDomainSecurityKey extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "sec_type")
  private Integer secType;

  @Column(name = "key_id")
  private String keyId;

  @Column(name = "key_text")
  private String keyText;

  @Column(name = "insert_src")
  private String insertSrc;

  public EDomainSecurityKey() {
  }

  public Integer getSecType() {
    return secType;
  }

  public void setSecType(Integer secType) {
    this.secType = secType;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

  public String getKeyId() {
    return keyId;
  }

  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }

  public String getKeyText() {
    return keyText;
  }

  public void setKeyText(String keyText) {
    this.keyText = keyText;
  }
}