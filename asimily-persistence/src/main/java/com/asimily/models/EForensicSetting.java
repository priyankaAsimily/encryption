package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "forensic_settings", schema = "customer_config")
public class EForensicSetting extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "facility")
  private String facility;
  public String getFacility() {
    return facility;
  }

  public void setFacility(String facility) {
    this.facility = facility;
  }
	  
  @Column(name = "url")
  private String url;
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
	  
  @Column(name = "type")
  private String type;
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
  
  @Column(name = "config")
  private String config;

  public String getConfig() {
    return config;
  }

  public void setConfig(String config) {
    this.config = config;
  }
  
}
