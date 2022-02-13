package com.asimily.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the cve database table.
 * 
 */
@Entity
@Table(name = "nvd_cve", schema = "raw_cloud")
public class ENVDCVE extends EBase {
  private static final long serialVersionUID = 1L;

  private String cve;

  private Integer year;

  @Column(name = "insert_src")
  private String insertSrc;

  public ENVDCVE() {
  }

  public String getCve() {
    return this.cve;
  }

  public void setCve(String cve) {
    this.cve = cve;
  }

  public Integer getYear() {
    return this.year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof ENVDCVE) {
      ENVDCVE that = (ENVDCVE) o;
      return this.cve.equalsIgnoreCase(that.cve);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(cve);
  }
}