package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user_setting", schema = "admin")
public class EUserSetting extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "user_id")
  private Integer userId;
  
  @Column(name = "user_perference_json")
  private String userPreferenceJson;

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getUserPreferenceJson() {
    return userPreferenceJson;
  }

  public void setUserPreferenceJson(String userPreferenceJson) {
    this.userPreferenceJson = userPreferenceJson;
  }
  
}
