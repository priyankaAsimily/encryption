package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * This is persistent class for raw_on_prem.mysql database table
 * @author richa
 *
 */
@Entity
@Table(name = "mysql", schema = "raw_on_prem")
public class EMySql extends ETenantBase {
    private static final long serialVersionUID = 1L;

 @Column(name = "app_version_id")
 private String appVersionId;

public String getAppVersionId() {
  return appVersionId;
}

public void setAppVersionId(String appVersionId) {
  this.appVersionId = appVersionId;
}
 
}
