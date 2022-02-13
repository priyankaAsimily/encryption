package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.asimily.models.EBase;

@Entity
@Table(name = "device_profinet", schema = "portal")
public class EDeviceProfinet extends EBase {

  @Id
  @Column(name = "customer_id")
  private Integer customerId;

  @Id
  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "mrp_mfg_oui")
  private Integer mrpMfgOui;

  @Column(name = "mrp_sa")
  private String mrpSa;

  @Column(name = "is_sender")
  private Boolean isSender;

  @Column(name = "metadata_id")
  private Integer metadataId;
  
  @Column(name = "record_id")
  private Integer recordId;

  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public Integer getMrpMfgOui() {
    return mrpMfgOui;
  }

  public void setMrpMfgOui(Integer mrpMfgOui) {
    this.mrpMfgOui = mrpMfgOui;
  }

  public String getMrpSa() {
    return mrpSa;
  }

  public void setMrpSa(String mrpSa) {
    this.mrpSa = mrpSa;
  }

  public Boolean getIsSender() {
    return isSender;
  }

  public void setIsSender(Boolean isSender) {
    this.isSender = isSender;
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

}
