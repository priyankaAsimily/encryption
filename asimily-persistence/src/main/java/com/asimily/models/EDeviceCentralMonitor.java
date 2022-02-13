package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.asimily.models.EBase;

@Entity
@Table(name = "device_central_monitor", schema = "portal")
public class EDeviceCentralMonitor extends EBase {

  @Id
  @Column(name = "customer_id")
  private Integer customerId;

  @Id
  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "wavecycle")
  private Integer wavecycle;

  @Column(name = "alarm")
  private Integer alarm;

  @Column(name = "philips")
  private Integer philips;

  @Column(name = "piicix")
  private Integer piicix;
  
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

  public Integer getWavecycle() {
    return wavecycle;
  }

  public void setWavecycle(Integer wavecycle) {
    this.wavecycle = wavecycle;
  }

  public Integer getAlarm() {
    return alarm;
  }

  public void setAlarm(Integer alarm) {
    this.alarm = alarm;
  }

  public Integer getPhilips() {
    return philips;
  }

  public void setPhilips(Integer philips) {
    this.philips = philips;
  }

  public Integer getPiicix() {
    return piicix;
  }

  public void setPiicix(Integer piicix) {
    this.piicix = piicix;
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
