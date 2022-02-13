package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the device_classification database table.
 * 
 */
@Entity
@Table(name = "asimily_product_version", schema = "admin")
public class EAsimilyProductVersion extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "key")
  private String key;

  @Column(name = "value")
  private String value;

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

}