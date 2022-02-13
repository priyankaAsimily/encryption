package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "master_setting", schema = "admin")
public class EMasterSetting extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "master_perference_json")
  private String masterPreferenceJson;

  public String getMasterPreferenceJson() {
    return masterPreferenceJson;
  }

  public void setMasterPreferenceJson(String masterPreferenceJson) {
    this.masterPreferenceJson = masterPreferenceJson;
  }
  
}
