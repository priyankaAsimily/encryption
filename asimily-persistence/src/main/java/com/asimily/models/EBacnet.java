package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bacnet", schema = "raw_on_prem")
public class EBacnet extends ETenantBase {
  
  @Column(name = "bacnet_field_id")
  private Integer bacnetFieldId;
  
  @Column(name = "bacnet_field_value")
  private String bacnetFieldValue;

  public Integer getBacnetFieldId() {
    return bacnetFieldId;
  }

  public void setBacnetFieldId(Integer bacnetFieldId) {
    this.bacnetFieldId = bacnetFieldId;
  }

  public String getBacnetFieldValue() {
    return bacnetFieldValue;
  }

  public void setBacnetFieldValue(String bacnetFieldValue) {
    this.bacnetFieldValue = bacnetFieldValue;
  }
  
}
