package com.asimily.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_nbr", schema = "portal")
public class EDeviceNbr extends ETenantBase {
  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "nbr_device_info_id")
  private Integer nbrDeviceInfoId;

  @Column(name = "nbr_type")
  private Integer nbrType;
  
  @Column(name = "last_nbr_update_time")
  private Timestamp lastNbrUpdateTime;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public Integer getNbrDeviceInfoId() {
    return nbrDeviceInfoId;
  }

  public void setNbrDeviceInfoId(Integer nbrDeviceInfoId) {
    this.nbrDeviceInfoId = nbrDeviceInfoId;
  }

  public Integer getNbrType() {
    return nbrType;
  }

  public void setNbrType(Integer nbrType) {
    this.nbrType = nbrType;
  }

  public Timestamp getLastNbrUpdateTime() {
	return lastNbrUpdateTime;
  }

  public void setLastNbrUpdateTime(Timestamp lastNbrUpdateTime) {
	this.lastNbrUpdateTime = lastNbrUpdateTime;
  }

}
