package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ce_input_p10", schema = "raw_on_prem")
public class ECeInputP10 extends ECeInputBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "record_uuid")
  private String recordUuid;

  public String getRecordUuid() {
    return recordUuid;
  }

  public void setRecordUuid(String recordUuid) {
    this.recordUuid = recordUuid;
  }
}
