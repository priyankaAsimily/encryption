package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the device_classification database table.
 * 
 */
@Entity
@Table(name = "enum_map", schema = "raw_cloud")
public class EEnumMap extends EBase{
  private static final long serialVersionUID = 1L;
  
  @Column(name = "enum_name")
  private String enumName;

  @Column(name = "enum_val")
  private String enumVal;

  @Column(name = "insert_src")
  private String insertSrc;
  
  public EEnumMap() {
  }

  public String getEnumName() {
    return enumName;
  }

  public void setEnumName(String enumName) {
    this.enumName = enumName;
  }

  public String getEnumVal() {
    return enumVal;
  }

  public void setEnumVal(String enumVal) {
    this.enumVal = enumVal;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

  

}