package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the data_group database table.
 * 
 */
@Entity
@Table(name = "data_group", schema = "raw_cloud")
public class EDataGroup extends EBase {
  private static final long serialVersionUID = 1L;

  private String name;

  private String description;

  @Column(name = "insert_src")
  private String insertSrc;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

}
