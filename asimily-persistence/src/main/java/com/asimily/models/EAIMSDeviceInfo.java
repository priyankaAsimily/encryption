package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "aims_device_info", schema = "raw_third_party")
public class EAIMSDeviceInfo extends ETenantBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "tag_number")
  private String tagNumber;

  private String facility;

  private String description;

  private String manufacturer;

  @Column(name = "device_model")
  private String deviceModel;

  @Column(name = "serial_number")
  private String serialNumber;

  @Column(name = "device_type")
  private String deviceType;

  private String os;

  @Column(name = "firmware_version")
  private String firmwareVersion;

  private String dicom;

  @Column(name = "ae_title")
  private String aeTitle;

  @Column(name = "ip_addr")
  private String ipAddr;

  @Column(name = "mac_addr")
  private String macAddr;

  @Column(name = "software")
  private String software;

  private String hostname;

  @Column(name = "handle_ephi")
  private Boolean handleEPHI;

  @Column(name = "mac_addr_based_device_id")
  private Integer macAddrBasedDeviceId;

  @Column(name = "ip_addr_based_device_id")
  private Integer ipAddrBasedDeviceId;

  @Column(name = "serial_number_based_device_id")
  private Integer serialNumberBasedDeviceId;

  @Column(name = "host_name_based_device_id")
  private String hostNameBasedDeviceId;

  @Column(name = "device_model_based_device_id")
  private Integer deviceModelBasedDeviceId;

  @Column(name = "sub_device_sequence")
  private String SubDeviceSequence;

  public String getTagNumber() {
    return tagNumber;
  }

  public void setTagNumber(String tagNumber) {
    this.tagNumber = tagNumber;
  }

  public String getFacility() {
    return facility;
  }

  public void setFacility(String facility) {
    this.facility = facility;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public String getFirmwareVersion() {
    return firmwareVersion;
  }

  public void setFirmwareVersion(String firmwareVersion) {
    this.firmwareVersion = firmwareVersion;
  }

  public String getDicom() {
    return dicom;
  }

  public void setDicom(String dicom) {
    this.dicom = dicom;
  }

  public String getAeTitle() {
    return aeTitle;
  }

  public void setAeTitle(String aeTitle) {
    this.aeTitle = aeTitle;
  }

  public String getSoftware() {
    return software;
  }

  public void setSoftware(String software) {
    this.software = software;
  }

  public String getDeviceModel() {
    return deviceModel;
  }

  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public String getIpAddr() {
    return ipAddr;
  }

  public void setIpAddr(String ipAddr) {
    this.ipAddr = ipAddr;
  }

  public String getMacAddr() {
    return macAddr;
  }

  public void setMacAddr(String macAddr) {
    this.macAddr = macAddr;
  }

  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public Boolean getHandleEPHI() {
    return handleEPHI;
  }

  public void setHandleEPHI(Boolean handleEPHI) {
    this.handleEPHI = handleEPHI;
  }

  public Integer getMacAddrBasedDeviceId() {
    return macAddrBasedDeviceId;
  }

  public void setMacAddrBasedDeviceId(Integer macAddrBasedDeviceId) {
    this.macAddrBasedDeviceId = macAddrBasedDeviceId;
  }

  public Integer getIpAddrBasedDeviceId() {
    return ipAddrBasedDeviceId;
  }

  public void setIpAddrBasedDeviceId(Integer ipAddrBasedDeviceId) {
    this.ipAddrBasedDeviceId = ipAddrBasedDeviceId;
  }

  public Integer getSerialNumberBasedDeviceId() {
    return serialNumberBasedDeviceId;
  }

  public void setSerialNumberBasedDeviceId(Integer serialNumberBasedDeviceId) {
    this.serialNumberBasedDeviceId = serialNumberBasedDeviceId;
  }

  public String getHostNameBasedDeviceId() {
    return hostNameBasedDeviceId;
  }

  public void setHostNameBasedDeviceId(String hostNameBasedDeviceId) {
    this.hostNameBasedDeviceId = hostNameBasedDeviceId;
  }

  public Integer getDeviceModelBasedDeviceId() {
    return deviceModelBasedDeviceId;
  }

  public void setDeviceModelBasedDeviceId(Integer deviceModelBasedDeviceId) {
    this.deviceModelBasedDeviceId = deviceModelBasedDeviceId;
  }

  public String getSubDeviceSequence() {
    return SubDeviceSequence;
  }

  public void setSubDeviceSequence(String subDeviceSequence) {
    SubDeviceSequence = subDeviceSequence;
  }
  
}
