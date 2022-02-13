package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the http_platform_info database table.
 * 
 */
@Entity
@Table(name = "http_platform_info", schema = "raw_on_prem")
public class EHttpPlatformInfo extends ETenantBase {
  private static final long serialVersionUID = 1L;

  private String platform;

  public EHttpPlatformInfo() {
  }

  public String getPlatform() {
    return this.platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

}