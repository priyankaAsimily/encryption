package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the hl7_info database table.
 * 
 */
@Entity
@Table(name = "hl7_info", schema = "raw_on_prem")
public class EHL7Info extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "hl7_version_id")
  private String hl7VersionId;

  @Column(name = "hl7_recv_application_id")
  private Integer hl7RecvApplication;

  @Column(name = "hl7_send_application_id")
  private Integer hl7SendApplication;

  public EHL7Info() {
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getHl7VersionId() {
    return this.hl7VersionId;
  }

  public void setHl7VersionId(String hl7VersionId) {
    this.hl7VersionId = hl7VersionId;
  }

  public Integer getHl7RecvApplication() {
    return hl7RecvApplication;
  }

  public void setHl7RecvApplication(Integer hl7RecvApplication) {
    this.hl7RecvApplication = hl7RecvApplication;
  }

  public Integer getHl7SendApplication() {
    return hl7SendApplication;
  }

  public void setHl7SendApplication(Integer hl7SendApplication) {
    this.hl7SendApplication = hl7SendApplication;
  }

}