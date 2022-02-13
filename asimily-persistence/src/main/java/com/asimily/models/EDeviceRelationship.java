package com.asimily.models;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "device_relationship", schema = "portal")
public class EDeviceRelationship extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;
  
  @Column(name = "parent_device_info_id")
  private Integer parentDeviceInfoId;
  
  @Column(name = "sub_device_type_id")
  private Integer subDeviceTypeId;
  
  @Column(name = "additional_info")
  private String additionalInfo;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public Integer getParentDeviceInfoId() {
    return parentDeviceInfoId;
  }

  public void setParentDeviceInfoId(Integer parentDeviceInfoId) {
    this.parentDeviceInfoId = parentDeviceInfoId;
  }

  public Integer getSubDeviceTypeId() {
    return subDeviceTypeId;
  }

  public void setSubDeviceTypeId(Integer subDeviceTypeId) {
    this.subDeviceTypeId = subDeviceTypeId;
  }

  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

}

