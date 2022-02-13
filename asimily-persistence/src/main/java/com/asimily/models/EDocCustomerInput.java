package com.asimily.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the document_customer_input database table.
 * 
 */
@Entity
@Table(name = "document_customer_input", schema = "raw_on_prem")
public class EDocCustomerInput extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "create_time")
  private Timestamp createTime;

  @Column(name = "create_user_id")
  private Integer createUserId;

  @Column(name = "device_id")
  private Integer deviceId;

  @Column(name = "last_update_user_id")
  private Integer lastUpdateUserId;

  @Column(name = "device_group_id")
  private Integer deviceGroupId;

  public EDocCustomerInput() {
  }

  public Timestamp getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
  }

  public Integer getCreateUserId() {
    return this.createUserId;
  }

  public void setCreateUserId(Integer createUserId) {
    this.createUserId = createUserId;
  }

  public Integer getDeviceId() {
    return this.deviceId;
  }

  public void setDeviceId(Integer deviceId) {
    this.deviceId = deviceId;
  }

  public Integer getLastUpdateUserId() {
    return this.lastUpdateUserId;
  }

  public void setLastUpdateUserId(Integer lastUpdateUserId) {
    this.lastUpdateUserId = lastUpdateUserId;
  }

  public Integer getDeviceGroupId() {
    return deviceGroupId;
  }

  public void setDeviceGroupId(Integer deviceGroupId) {
    this.deviceGroupId = deviceGroupId;
  }

}