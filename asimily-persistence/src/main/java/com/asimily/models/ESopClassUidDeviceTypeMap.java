package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the sop_class_uid_device_type_map database table.
 * 
 */
@Entity
@Table(name = "sop_class_uid_device_type_map", schema = "raw_cloud")
public class ESopClassUidDeviceTypeMap extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "sop_class_uid")
  private String sopClassUid;

  @Column(name = "device_type")
  private String deviceType;

  public ESopClassUidDeviceTypeMap() {
  }

  public String getSopClassUid() {
    return sopClassUid;
  }

  public void setSopClassUid(String sopClassUid) {
    this.sopClassUid = sopClassUid;
  }

  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }
}