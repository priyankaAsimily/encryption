package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the problemtype database table.
 * 
 */
@Entity
@Table(name = "nvd_problemtype", schema = "raw_cloud")
public class ENVDProblemtype extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "cwe_title")
  private String cweTitle;

  @Column(name = "cwe_url")
  private String cweUrl;

  @Column(name = "problemtype_lang")
  private String problemtypeLang;

  @Column(name = "problemtype_value")
  private String problemtypeValue;

  @Column(name = "cve_id")
  private Integer cveId;

  @Column(name = "insert_src")
  private String insertSrc;

  public ENVDProblemtype() {
  }

  public String getCweTitle() {
    return this.cweTitle;
  }

  public void setCweTitle(String cweTitle) {
    this.cweTitle = cweTitle;
  }

  public String getCweUrl() {
    return this.cweUrl;
  }

  public void setCweUrl(String cweUrl) {
    this.cweUrl = cweUrl;
  }

  public String getProblemtypeLang() {
    return this.problemtypeLang;
  }

  public void setProblemtypeLang(String problemtypeLang) {
    this.problemtypeLang = problemtypeLang;
  }

  public String getProblemtypeValue() {
    return this.problemtypeValue;
  }

  public void setProblemtypeValue(String problemtypeValue) {
    this.problemtypeValue = problemtypeValue;
  }

  public Integer getCveId() {
    return cveId;
  }

  public void setCveId(Integer cveId) {
    this.cveId = cveId;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

}