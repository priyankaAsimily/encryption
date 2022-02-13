package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the role database table.
 * 
 */
@Entity
@Table(name = "role", schema = "admin")
public class ERole extends EBase {
  private static final long serialVersionUID = 1L;
  @Column(name = "customer_id")
  private Integer customerId;

  private String description;

  private String name;

  @Column(name = "authorization_type_ids")
  private String authorizationTypeIds;

  @Column(name = "feature_disabled_ids")
  private String featureDisabledIds;

  @Column(name = "filter_map")
  private String filterMap;

  public ERole() {
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public String getAuthorizationTypeIds() {
    return authorizationTypeIds;
  }

  public void setAuthorizationTypeIds(String authorizationTypeIds) {
    this.authorizationTypeIds = authorizationTypeIds;
  }

  public String getFeatureDisabledIds() {
    return featureDisabledIds;
  }

  public void setFeatureDisabledIds(String featureDisabledIds) {
    this.featureDisabledIds = featureDisabledIds;
  }

  public String getFilterMap() {
    return filterMap;
  }

  public void setFilterMap(String filterMap) {
    this.filterMap = filterMap;
  }

}
