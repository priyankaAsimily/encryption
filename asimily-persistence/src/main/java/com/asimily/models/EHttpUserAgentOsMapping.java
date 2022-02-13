package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the http_user_agent_os_mapping database table.
 * 
 */
@Entity
@Table(name = "http_user_agent_os_mapping", schema = "raw_cloud")
public class EHttpUserAgentOsMapping extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "input_os")
  private String inputOs;

  @Column(name = "input_version")
  private String inputVersion;

  @Column(name = "os_version_id")
  private String osVersionId;

  @Column(name = "insert_src")
  private String insertSrc;

  public EHttpUserAgentOsMapping() {
  }

  public String getInputOs() {
    return this.inputOs;
  }

  public void setInputOs(String inputOs) {
    this.inputOs = inputOs;
  }

  public String getInputVersion() {
    return this.inputVersion;
  }

  public void setInputVersion(String inputVersion) {
    this.inputVersion = inputVersion;
  }

  public String getOsVersionId() {
    return osVersionId;
  }

  public void setOsVersionId(String osVersionId) {
    this.osVersionId = osVersionId;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

}