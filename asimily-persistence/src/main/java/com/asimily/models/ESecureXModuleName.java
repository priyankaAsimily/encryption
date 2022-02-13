package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "secureX_module_name", schema = "raw_cloud")
public class ESecureXModuleName extends EBase{
  private static final long serialVersionUID = 1L;
  
  @Column(name = "name")
  private String name;
  
  @Column(name = "source_type")
  private Integer sourceType;
 
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Integer getSourceType() {
    return sourceType;
  }
  public void setSourceType(Integer sourceType) {
    this.sourceType = sourceType;
  }
}
