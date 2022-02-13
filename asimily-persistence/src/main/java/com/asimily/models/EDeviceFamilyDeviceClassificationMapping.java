package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_family_device_classification_mapping", schema = "raw_cloud")
public class EDeviceFamilyDeviceClassificationMapping extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_family_id")
  private Integer deviceFamilyId;

  @Column(name = "device_classification_id")
  private Integer deviceClassificationId;

  public Integer getDeviceFamilyId() {
    return deviceFamilyId;
  }

  public void setDeviceFamilyId(Integer deviceFamilyId) {
    this.deviceFamilyId = deviceFamilyId;
  }

  public Integer getDeviceClassificationId() {
    return deviceClassificationId;
  }

  public void setDeviceClassificationId(Integer deviceClassificationId) {
    this.deviceClassificationId = deviceClassificationId;
  }

}
