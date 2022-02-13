package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "device_hl7", schema = "portal")
public class EDeviceHl7 extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "is_hl7_server")
  private Boolean isHl7Server;

  @Column(name = "send_application_name")
  private String sendApplicationName;

  @Column(name = "recv_application_name")
  private String recvApplicationName;

  @Column(name = "facility_name")
  private String facilityName;

  @Column(name = "version")
  private String version;

  @Column(name = "equipment_instance_id")
  private String equipmentInstanceId;

  @Column(name = "software_vendor_organization")
  private String softwareVendorOrganization;

  @Column(name = "software_product_name")
  private String softwareProductName;

  @Column(name = "manufacturer")
  private String manufacturer;

  @Column(name = "brand_name")
  private String brandName;

  @Column(name = "device_family_name")
  private String deviceFamilyName;

  @Column(name = "generic_name")
  private String genericName;

  @Column(name = "product_code")
  private String productCode;

  @Column(name = "model_identifier")
  private String modelIdentifier;

  @Column(name = "mfg_id")
  private String mfgId;

  @Column(name = "pid_present")
  private Boolean pidPresent;
  
  @Column(name = "is_sender")
  private Boolean isSender; 
  
  @Column(name = "metadata_id")
  private Integer metadataId;
  
  @Column(name = "record_id")
  private Integer recordId;
  
  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public Boolean getHl7Server() {
    return isHl7Server;
  }

  public void setHl7Server(Boolean hl7Server) {
    isHl7Server = hl7Server;
  }

  public String getFacilityName() {
    return facilityName;
  }

  public void setFacilityName(String facilityName) {
    this.facilityName = facilityName;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getEquipmentInstanceId() {
    return equipmentInstanceId;
  }

  public void setEquipmentInstanceId(String equipmentInstanceId) {
    this.equipmentInstanceId = equipmentInstanceId;
  }

  public String getSoftwareVendorOrganization() {
    return softwareVendorOrganization;
  }

  public void setSoftwareVendorOrganization(String softwareVendorOrganization) {
    this.softwareVendorOrganization = softwareVendorOrganization;
  }

  public String getSoftwareProductName() {
    return softwareProductName;
  }

  public void setSoftwareProductName(String softwareProductName) {
    this.softwareProductName = softwareProductName;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public String getDeviceFamilyName() {
    return deviceFamilyName;
  }

  public void setDeviceFamilyName(String deviceFamilyName) {
    this.deviceFamilyName = deviceFamilyName;
  }

  public String getGenericName() {
    return genericName;
  }

  public void setGenericName(String genericName) {
    this.genericName = genericName;
  }

  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public String getModelIdentifier() {
    return modelIdentifier;
  }

  public void setModelIdentifier(String modelIdentifier) {
    this.modelIdentifier = modelIdentifier;
  }

  public String getMfgId() { return mfgId; }

  public void setMfgId(String mfgId) { this.mfgId = mfgId; }

  public Boolean getPidPresent() { return pidPresent; }

  public void setPidPresent(Boolean pidPresent) { this.pidPresent = pidPresent; }

  public String getSendApplicationName() {
    return sendApplicationName;
  }

  public void setSendApplicationName(String sendApplicationName) {
    this.sendApplicationName = sendApplicationName;
  }

  public String getRecvApplicationName() {
    return recvApplicationName;
  }

  public void setRecvApplicationName(String recvApplicationName) {
    this.recvApplicationName = recvApplicationName;
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
  
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EDeviceHl7 that = (EDeviceHl7) o;
    return Objects.equals(deviceInfoId, that.deviceInfoId) &&
        Objects.equals(isHl7Server, that.isHl7Server) &&
        Objects.equals(sendApplicationName, that.sendApplicationName) &&
        Objects.equals(recvApplicationName, that.recvApplicationName) &&
        Objects.equals(facilityName, that.facilityName) &&
        Objects.equals(version, that.version) &&
        Objects.equals(equipmentInstanceId, that.equipmentInstanceId) &&
        Objects.equals(softwareVendorOrganization, that.softwareVendorOrganization) &&
        Objects.equals(softwareProductName, that.softwareProductName) &&
        Objects.equals(manufacturer, that.manufacturer) &&
        Objects.equals(brandName, that.brandName) &&
        Objects.equals(deviceFamilyName, that.deviceFamilyName) &&
        Objects.equals(genericName, that.genericName) &&
        Objects.equals(productCode, that.productCode) &&
        Objects.equals(modelIdentifier, that.modelIdentifier) &&
        Objects.equals(mfgId, that.mfgId) &&
        Objects.equals(pidPresent, that.pidPresent) &&
        Objects.equals(isSender, that.isSender) &&
        Objects.equals(metadataId, that.metadataId) &&
        Objects.equals(recordId, that.recordId);
  }

  @Override
  public int hashCode() {

    return Objects.hash(deviceInfoId, isHl7Server, sendApplicationName, recvApplicationName, facilityName, version, equipmentInstanceId, softwareVendorOrganization, softwareProductName, manufacturer, brandName, deviceFamilyName, genericName, productCode, modelIdentifier, mfgId, pidPresent, isSender, metadataId, recordId);
  }
}
