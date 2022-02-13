package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the description database table.
 * 
 */
@Entity
@Table(name = "nvd_description", schema = "raw_cloud")
public class ENVDDescription extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "description_hash")
  private String descriptionHash;

  @Column(name = "description_lang")
  private String descriptionLang;

  @Column(name = "description_value")
  private String descriptionValue;

  @Column(name = "cve_id")
  private Integer cveId;

  @Column(name = "insert_src")
  private String insertSrc;

  public ENVDDescription() {
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDescriptionHash() {
    return this.descriptionHash;
  }

  public void setDescriptionHash(String descriptionHash) {
    this.descriptionHash = descriptionHash;
  }

  public String getDescriptionLang() {
    return this.descriptionLang;
  }

  public void setDescriptionLang(String descriptionLang) {
    this.descriptionLang = descriptionLang;
  }

  public String getDescriptionValue() {
    return this.descriptionValue;
  }

  public void setDescriptionValue(String descriptionValue) {
    this.descriptionValue = descriptionValue;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }
  
  public Integer getCveId() {
    return cveId;
  }

  public void setCveId(Integer cveId) {
    this.cveId = cveId;
  }

}