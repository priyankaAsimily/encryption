package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the hl7 database table.
 * 
 */
@Entity
@Table(name = "hl7", schema = "raw_on_prem")
public class EHL7 extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "hl7_msh_id")
  private Integer hl7MshId;

  @Column(name = "hl7_sft_id")
  private Integer hl7SftId;

  @Column(name = "hl7_equ_id")
  private Integer hl7EquId;
  
  @Column(name = "hl7_pdc_id")
  private Integer hl7PdcId;
  
  @Column(name = "pid_present")
  private Boolean pidPresent;

  public EHL7() {
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getHl7MshId() {
    return hl7MshId;
  }

  public void setHl7MshId(Integer hl7MshId) {
    this.hl7MshId = hl7MshId;
  }

  public Integer getHl7SftId() {
    return hl7SftId;
  }

  public void setHl7SftId(Integer hl7SftId) {
    this.hl7SftId = hl7SftId;
  }

  public Integer getHl7EquId() {
    return hl7EquId;
  }

  public void setHl7EquId(Integer hl7EquId) {
    this.hl7EquId = hl7EquId;
  }

  public Integer getHl7PdcId() {
    return hl7PdcId;
  }

  public void setHl7PdcId(Integer hl7PdcId) {
    this.hl7PdcId = hl7PdcId;
  }

  public Boolean getPidPresent() {
    return pidPresent;
  }

  public void setPidPresent(Boolean pidPresent) {
    this.pidPresent = pidPresent;
  }
  
}