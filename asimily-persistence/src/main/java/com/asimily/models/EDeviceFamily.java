package com.asimily.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_family", schema = "raw_cloud")
public class EDeviceFamily extends EBase {
  private static final long serialVersionUID = 1L;

  private String name;

  private String description;

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

}
