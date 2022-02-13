package com.asimily.models;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * This is persistent class for table device_other_fields database table
 * 
 * @author richa
 *
 */
@Entity
@Table(name = "device_other_fields", schema = "raw_cloud")
@Cacheable(true)
public class EDeviceOtherFields extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "field_name")
  private String fieldName;

  @Column(name = "insert_src")
  private String insertSrc;

  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

  @Override
  public String toString() {
    return "EDeviceOtherFields [fieldName=" + fieldName + "]";
  }

}
