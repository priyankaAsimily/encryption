package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the device_data_flow database table.
 * 
 */
@Entity
@Table(name = "device_data_flow", schema = "portal")
public class EDeviceDataFlow extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "src_device_id")
  private Integer srcDeviceId;

  @Column(name = "dst_device_id")
  private Integer dstDeviceId;

  @Column(name = "data_group_id")
  private Integer dataGroupId;
  
  @Column(name = "metadata_id")
  private Integer metadataId;
  
  @Column(name = "record_id")
  private Integer recordId;

  public Integer getSrcDeviceId() {
    return srcDeviceId;
  }

  public void setSrcDeviceId(Integer srcDeviceId) {
    this.srcDeviceId = srcDeviceId;
  }

  public Integer getDstDeviceId() {
    return dstDeviceId;
  }

  public void setDstDeviceId(Integer dstDeviceId) {
    this.dstDeviceId = dstDeviceId;
  }

  public Integer getDataGroupId() {
    return dataGroupId;
  }

  public void setDataGroupId(Integer dataGroupId) {
    this.dataGroupId = dataGroupId;
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

  public EDeviceDataFlow() {
  }


}
