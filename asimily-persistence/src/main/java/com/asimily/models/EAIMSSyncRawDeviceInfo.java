package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "aims_sync_raw_device_info", schema = "raw_third_party")
public class EAIMSSyncRawDeviceInfo extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "cmms_id")
  private String cmmsId;

  private String equipment;

  @Column(name = "is_equipment")
  private String isEquipment;

  public String getCmmsId() {
    return cmmsId;
  }

  public void setCmmsId(String cmmsId) {
    this.cmmsId = cmmsId;
  }

  public String getEquipment() {
    return equipment;
  }

  public void setEquipment(String equipment) {
    this.equipment = equipment;
  }

  public String getIsEquipment() {
    return isEquipment;
  }

  public void setIsEquipment(String isEquipment) {
    this.isEquipment = isEquipment;
  }

}
