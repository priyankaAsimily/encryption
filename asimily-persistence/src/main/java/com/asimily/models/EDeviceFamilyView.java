package com.asimily.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "device_family_view", schema = "portal")
public class EDeviceFamilyView extends Object implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "device_info_id")
  protected Integer deviceInfoId;

  @Column(name = "device_family_names")
  private String deviceFamilyNames;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public String getDeviceFamilyNames() {
    return deviceFamilyNames;
  }

  public void setDeviceFamilyNames(String deviceFamilyNames) {
    this.deviceFamilyNames = deviceFamilyNames;
  }

}
