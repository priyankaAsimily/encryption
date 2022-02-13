package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.asimily.models.EBase;

@Entity
@Table(name = "device_xml", schema = "portal")
public class EDeviceXml extends EBase {

  @Id
  @Column(name = "customer_id")
  private Integer customerId;

  @Id
  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "device_type")
  private String deviceType;

  @Column(name = "software_version")
  private String softwareVersion;

  @Column(name = "serial_number")
  private String serialNumber;

  @Column(name = "mfg_name")
  private String mfgName;

  @Column(name = "model_name")
  private String modelName;

  @Column(name = "model_number")
  private String modelNumber;

  @Column(name = "application_id")
  private String applicationId;

  @Column(name = "application_version")
  private String applicationVersion;

  @Column(name = "host_name")
  private String hostName;

  @Column(name = "application_name")
  private String applicationName;

  @Column(name = "architecture")
  private String architecture;

  @Column(name = "os_type")
  private String osType;

  @Column(name = "os_version")
  private String osVersion;

  @Column(name = "operating_system_version")
  private String operatingSystemVersion;

  @Column(name = "machine_type")
  private String machineType;

  @Column(name = "xmlns")
  private String xmlns;

  @Column(name = "ip_addr")
  private String ipAddr;

  @Column(name = "mac_addr")
  private String macAddr;

  @Column(name = "unique_id")
  private String uniqueId;

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

  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public String getSoftwareVersion() {
    return softwareVersion;
  }

  public void setSoftwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public String getMfgName() {
    return mfgName;
  }

  public void setMfgName(String mfgName) {
    this.mfgName = mfgName;
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

  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public String getApplicationVersion() {
    return applicationVersion;
  }

  public void setApplicationVersion(String applicationVersion) {
    this.applicationVersion = applicationVersion;
  }

  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public String getApplicationName() {
    return applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  public String getOsType() {
    return osType;
  }

  public void setOsType(String osType) {
    this.osType = osType;
  }

  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  public String getOperatingSystemVersion() {
    return operatingSystemVersion;
  }

  public void setOperatingSystemVersion(String operatingSystemVersion) {
    this.operatingSystemVersion = operatingSystemVersion;
  }

  public String getMachineType() {
    return machineType;
  }

  public void setMachineType(String machineType) {
    this.machineType = machineType;
  }

  public String getXmlns() {
    return xmlns;
  }

  public void setXmlns(String xmlns) {
    this.xmlns = xmlns;
  }

  public String getIpAddr() {
    return ipAddr;
  }

  public void setIpAddr(String ipAddr) {
    this.ipAddr = ipAddr;
  }

  public String getMacAddr() {
    return this.macAddr;
  }

  public void setMacAddr(String macAddr) {
    this.macAddr = macAddr;
  }

  public String getUniqueId() {
    return this.uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
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

