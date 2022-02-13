package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the http_os_info database table.
 * 
 */
@Entity
@Table(name = "http_os_info", schema = "raw_on_prem")
public class EHttpOsInfo extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "os_name")
  private String osName;

  @Column(name = "os_version")
  private String osVersion;


  public EHttpOsInfo() {
  }

  public String getOsName() {
    return this.osName;
  }

  public void setOsName(String osName) {
    this.osName = osName;
  }

  public String getOsVersion() {
    return this.osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

}