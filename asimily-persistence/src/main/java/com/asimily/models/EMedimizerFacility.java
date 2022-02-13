package com.asimily.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "medimizer_facility", schema = "raw_third_party")
public class EMedimizerFacility extends ETenantBase {

  private static final long serialVersionUID = 1L;

  private String name;

  private String code;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }
}
