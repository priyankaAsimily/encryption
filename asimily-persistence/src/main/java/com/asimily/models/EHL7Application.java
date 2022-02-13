package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the hl7_application database table.
 * 
 */
@Entity
@Table(name = "hl7_application", schema = "raw_on_prem")
public class EHL7Application extends ETenantBase {
  private static final long serialVersionUID = 1L;

  private String name;

  public EHL7Application() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}