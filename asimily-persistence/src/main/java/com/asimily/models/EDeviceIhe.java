package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.asimily.models.EBase;

@Entity
@Table(name = "device_ihe", schema = "portal")
public class EDeviceIhe extends EBase {

  @Id
  @Column(name = "customer_id")
  private Integer customerId;

  @Id
  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "is_control_present")
  private Boolean isControlPresent;

  @Column(name = "is_ack_present")
  private Boolean isAckPresent;

  @Column(name = "is_patient_id_present")
  private Boolean isPatientIdPresent;

  @Column(name = "is_eot_topic_present")
  private Boolean isEotTopicPresent;

  @Column(name = "version_id")
  private String versionId;

  @Column(name = "device_id")
  private String deviceId;

  @Column(name = "vendor_id")
  private String vendorId;

  @Column(name = "model_id")
  private String modelId;

  @Column(name = "serial_id")
  private String serialId;

  @Column(name = "manufacturer_name")
  private String manufacturerName;

  @Column(name = "hw_version")
  private String hwVersion;

  @Column(name = "sw_version")
  private String swVersion;

  @Column(name = "device_name")
  private String deviceName;

  @Column(name = "hdr_version_id")
  private String hdrVersionId;

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

  public Boolean getIsControlPresent(){
    return this.isControlPresent;
  }

  public void setIsControlPresent(Boolean isControlPresent) {
    this.isControlPresent = isControlPresent;
  }

  public Boolean getIsAckPresent(){
    return this.isAckPresent;
  }

  public void setIsAckPresent(Boolean isAckPresent) {
    this.isAckPresent = isAckPresent;
  }

  public Boolean getIsPatientIdPresent(){
    return this.isPatientIdPresent;
  }

  public void setIsPatientIdPresent(Boolean isPatientIdPresent) {
    this.isPatientIdPresent = isPatientIdPresent;
  }

  public Boolean getIsEotTopicPresent(){
    return this.isEotTopicPresent;
  }

  public void setIsEotTopicPresent(Boolean isEotTopicPresent) {
    this.isEotTopicPresent = isEotTopicPresent;
  }

  public String getDeviceId() {
    return this.deviceId;
  }

  public String getVersionId() {
    return this.versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public String getVendorId() {
    return this.vendorId;
  }

  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }

  public String getModelId() {
    return this.modelId;
  }

  public void setModelId(String modelId) {
    this.modelId = modelId;
  }

  public String getSerialId() {
    return this.serialId;
  }

  public void setSerialId(String serialId) {
    this.serialId = serialId;
  }

  public String getManufacturerName() {
    return this.manufacturerName;
  }

  public void setManufacturerName(String manufacturerName) {
    this.manufacturerName = manufacturerName;
  }

  public String getHwVersion() {
    return this.hwVersion;
  }

  public void setHwVersion(String hwVersion) {
    this.hwVersion = hwVersion;
  } 

  public String getSwVersion() {
    return this.swVersion;
  }

  public void setSwVersion(String swVersion) {
    this.swVersion = swVersion;
  }

  public String getDeviceName() {
    return this.deviceName;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  public String getHdrVersionId() {
    return this.hdrVersionId;
  }

  public void setHdrVersionId(String hdrVersionId) {
    this.hdrVersionId = hdrVersionId;
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
