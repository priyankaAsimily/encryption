package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the http_browser_info database table.
 * 
 */
@Entity
@Table(name = "http_browser_info", schema = "raw_on_prem")
public class EHttpBrowserInfo extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "application_id")
  private Integer applicationId;

  public EHttpBrowserInfo() {
  }


  public Integer getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(Integer applicationId) {
    this.applicationId = applicationId;
  }

}
