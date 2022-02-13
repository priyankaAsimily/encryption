package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.asimily.models.EBase;

@Entity
@Table(name = "device_phlp_monitor", schema = "portal")
public class EDevicePhlpMonitor extends EBase {

  @Id
  @Column(name = "customer_id")
  private Integer customerId;

  @Id
  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "manufacturer")
  private String manufacturer;

  @Column(name = "model_name")
  private String modelName;

  @Column(name = "model_number")
  private String modelNumber;

  @Column(name = "mac_address")
  private String macAddress;

  @Column(name = "power_hardware_rev")
  private String powerHardwareRev;

  @Column(name = "primary_boot_firmware_rev")
  private String primaryBootFirmwareRev;

  @Column(name = "product_firmware_rev")
  private String productFirmwareRev;

  @Column(name = "product_hardware_rev")
  private String productHardwareRev;

  @Column(name = "product_software_rev")
  private String productSoftwareRev;

  @Column(name = "radio_firmware_rev")
  private String radioFirmwareRev;

  @Column(name = "radio_hardware_rev")
  private String radioHardwareRev;

  @Column(name = "secondary_boot_firmware_rev")
  private String secondaryBootFirmwareRev;

  @Column(name = "serial_number")
  private String serialNumber;

  @Column(name = "system_number")
  private String systemNumber;

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

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public String getModelNumber() {
    return modelNumber;
  }

  public void setModelNumber(String modelNumber) {
    this.modelNumber = modelNumber;
  }

  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  public String getPowerHardwareRev() {
    return powerHardwareRev;
  }

  public void setPowerHardwareRev(String powerHardwareRev) {
    this.powerHardwareRev = powerHardwareRev;
  }

  public String getPrimaryBootFirmwareRev() {
    return primaryBootFirmwareRev;
  }

  public void setPrimaryBootFirmwareRev(String primaryBootFirmwareRev) {
    this.primaryBootFirmwareRev = primaryBootFirmwareRev;
  }

  public String getProductFirmwareRev() {
    return productFirmwareRev;
  }

  public void setProductFirmwareRev(String productFirmwareRev) {
    this.productFirmwareRev = productFirmwareRev;
  }

  public String getProductHardwareRev() {
    return productHardwareRev;
  }

  public void setProductHardwareRev(String productHardwareRev) {
    this.productHardwareRev = productHardwareRev;
  }

  public String getProductSoftwareRev() {
    return productSoftwareRev;
  }

  public void setProductSoftwareRev(String productSoftwareRev) {
    this.productSoftwareRev = productSoftwareRev;
  }

  public String getRadioFirmwareRev() {
    return radioFirmwareRev;
  }

  public void setRadioFirmwareRev(String radioFirmwareRev) {
    this.radioFirmwareRev = radioFirmwareRev;
  }

  public String getRadioHardwareRev() {
    return radioHardwareRev;
  }

  public void setRadioHardwareRev(String radioHardwareRev) {
    this.radioHardwareRev = radioHardwareRev;
  }

  public String getSecondaryBootFirmwareRev() {
    return secondaryBootFirmwareRev;
  }

  public void setSecondaryBootFirmwareRev(String secondaryBootFirmwareRev) {
    this.secondaryBootFirmwareRev = secondaryBootFirmwareRev;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public String getSystemNumber() {
    return systemNumber;
  }

  public void setSystemNumber(String systemNumber) {
    this.systemNumber = systemNumber;
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
