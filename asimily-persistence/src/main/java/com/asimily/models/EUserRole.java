package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the user_role database table.
 * 
 */
@Entity
@Table(name = "user_role", schema = "admin")
public class EUserRole extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "customer_id")
  private Integer customerId;

  @Column(name = "user_id")
  private Integer userId;

  @Column(name = "role_id")
  private Integer roleId;

  public EUserRole() {
  }

  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

}