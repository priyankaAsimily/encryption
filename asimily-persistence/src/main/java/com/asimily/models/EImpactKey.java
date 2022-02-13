package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the device_impact database table.
 * 
 */
@Entity
@Table(name = "impact_key", schema = "raw_cloud")
public class EImpactKey extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "key_id")
  private String keyId;

  @Column(name = "key_text")
  private String keyText;

  @Column(name = "parent_id")
  private Integer parentId;

  @Column(name = "impact_type")
  private Integer impactType;

  @Column(name = "insert_src")
  private String insertSrc;

  public EImpactKey() {
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

  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  public Integer getImpactType() {
    return impactType;
  }

  public void setImpactType(Integer impactType) {
    this.impactType = impactType;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

}