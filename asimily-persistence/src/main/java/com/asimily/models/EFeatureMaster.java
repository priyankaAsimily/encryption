package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "feature_master", schema = "raw_cloud")
public class EFeatureMaster extends EBase {

  @Column(name = "name")
  private String name;

  @Column(name = "label")
  private String label;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

}
