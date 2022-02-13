package com.asimily.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * This is persistent class for table device_other database table
 * @author richa
 *
 */
@Entity
@Table(name = "device_other", schema = "portal")
public class EDeviceOther extends ETenantBase {
    private static final long serialVersionUID = 1L;

 @Column(name = "device_info_id")
 private Integer deviceInfoId;
 
 @Column(name= "field_id")
 private Integer fieldId;
 
 @Column(name="field_value")
 private String fieldVal;
 
 @Column(name= "metadata_id")
 private Integer metadataId;
 
 @Column(name="record_id")
 private Integer recordId;

 @Column(name = "is_fixed")
 private Boolean isFixed;

 @Column(name="fix_action_taken")
 private String fixActionTaken;

 @Column(name="fixed_by")
 private String fixedBy;

 @Column(name="fixed_date")
 private Timestamp fixedDate;

public int getDeviceInfoId() {
  return deviceInfoId;
}

public void setDeviceInfoId(int deviceInfoId) {
  this.deviceInfoId = deviceInfoId;
}

public int getFieldId() {
  return fieldId;
}

public void setFieldId(int fieldId) {
  this.fieldId = fieldId;
}

public String getFieldVal() {
  return fieldVal;
}

public void setFieldVal(String fieldVal) {
  this.fieldVal = fieldVal;
}

public Integer getMetadataId() {
  return metadataId;
}

public void setMetadataId(Integer metadataId) {
  this.metadataId = metadataId;
}

public Integer getRecordId() {
  return recordId;
}

public void setRecordId(Integer recordId) {
  this.recordId = recordId;
}

  public Boolean getIsFixed() {
  return isFixed;
}

public void setIsFixed(Boolean isFixed) {
  this.isFixed = isFixed;
}

public String getFixActionTaken() {
  return fixActionTaken;
}

public void setFixActionTaken(String fixActionTaken) {
  this.fixActionTaken = fixActionTaken;
}

public String getFixedBy() {
  return fixedBy;
}

public void setFixedBy(String fixedBy) {
  this.fixedBy = fixedBy;
}

public Timestamp getFixedDate() {
  return fixedDate;
}

public void setFixedDate(Timestamp fixedDate) {
  this.fixedDate = fixedDate;
}

  @Override
  public String toString() {
    return "EDeviceOther{" +
        "deviceInfoId=" + deviceInfoId +
        ", fieldId=" + fieldId +
        ", fieldVal='" + fieldVal + '\'' +
        ", id=" + id +
        '}';
  }

  @Override
public int hashCode() {
  final int prime = 31;
  int result = 1;
  result = prime * result
      + ((deviceInfoId == null) ? 0 : deviceInfoId.hashCode());
  result = prime * result + ((fieldId == null) ? 0 : fieldId.hashCode());
  result = prime * result + ((fieldVal == null) ? 0 : fieldVal.hashCode());
  return result;
}

@Override
public boolean equals(Object obj) {
  if (this == obj)
    return true;
  if (obj == null)
    return false;
  if (getClass() != obj.getClass())
    return false;
  EDeviceOther other = (EDeviceOther) obj;
  if (deviceInfoId == null) {
    if (other.deviceInfoId != null)
      return false;
  } else if (!deviceInfoId.equals(other.deviceInfoId))
    return false;
  if (fieldId == null) {
    if (other.fieldId != null)
      return false;
  } else if (!fieldId.equals(other.fieldId))
    return false;
  if (fieldVal == null) {
    if (other.fieldVal != null)
      return false;
  } else if (!fieldVal.equals(other.fieldVal))
    return false;
  return true;
}


}
