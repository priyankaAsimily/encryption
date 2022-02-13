package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * This is persistent class for table dicom database table
 * 
 * @author richa
 *
 */
@Entity
@Table(name = "dicom", schema = "raw_on_prem")
public class EDicom extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "image_type")
  private String imageType;

  @Column(name = "modality")
  private String modality;

  @Column(name = "mfg_ID")
  private String mfgId;

  @Column(name = "hcp_ID")
  private String hcpId;

  @Column(name = "station_name")
  private String stationName;

  @Column(name = "dept_name")
  private String deptName;

  @Column(name = "model_name")
  private String modelName;

  @Column(name = "serial_number")
  private String serialNumber;

  @Column(name = "software_version")
  private String softwareVersion;

  @Column(name = "calibration_time")
  private String calibrationTime;

  @Column(name = "system_status")
  private Integer systemStatus;

  @Column(name = "missing_mfg")
  private String missingMfg;

  @Column(name = "sop_class_uid")
  private String sopClassUid;

  @Column(name = "called_ae_title")
  private String calledAETitle;

  @Column(name = "calling_ae_title")
  private String callingAETitle;

  @Column(name = "application_context_name")
  private String applicationContextName;

  @Column(name = "implementation_uid")
  private String implementationUid;

  @Column(name = "implementation_version")
  private String implementationVersion;

  @Column(name = "pdu_type")
  private Integer pduType;

  @Column(name = "station_ae_title")
  private String stationAeTitle;

  public String getImageType() {
    return imageType;
  }

  public void setImageType(String imageType) {
    this.imageType = imageType;
  }

  public String getModality() {
    return modality;
  }

  public void setModality(String modality) {
    this.modality = modality;
  }

  public String getMfgId() {
    return mfgId;
  }

  public void setMfgId(String mfgId) {
    this.mfgId = mfgId;
  }

  public String getHcpId() {
    return hcpId;
  }

  public void setHcpId(String hcpId) {
    this.hcpId = hcpId;
  }

  public String getStationName() {
    return stationName;
  }

  public void setStationName(String stationName) {
    this.stationName = stationName;
  }

  public String getDeptName() {
    return deptName;
  }

  public void setDeptName(String deptName) {
    this.deptName = deptName;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public String getSoftwareVersion() {
    return softwareVersion;
  }

  public void setSoftwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
  }

  public String getCalibrationTime() {
    return calibrationTime;
  }

  public void setCalibrationTime(String calibrationTime) {
    this.calibrationTime = calibrationTime;
  }

  public Integer getSystemStatus() {
    return systemStatus;
  }

  public void setSystemStatus(Integer systemStatus) {
    this.systemStatus = systemStatus;
  }

  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public String getMissingMfg() {
    return missingMfg;
  }

  public void setMissingMfg(String missingMfg) {
    this.missingMfg = missingMfg;
  }

  public String getSopClassUid() { return sopClassUid; }

  public void setSopClassUid(String sopClassUid) { this.sopClassUid = sopClassUid; }

  public String getCalledAETitle() {
    return calledAETitle;
  }

  public void setCalledAETitle(String calledAETitle) {
    this.calledAETitle = calledAETitle;
  }

  public String getCallingAETitle() {
    return callingAETitle;
  }

  public void setCallingAETitle(String callingAETitle) {
    this.callingAETitle = callingAETitle;
  }

  public String getApplicationContextName() {
    return applicationContextName;
  }

  public void setApplicationContextName(String applicationContextName) {
    this.applicationContextName = applicationContextName;
  }

  public String getImplementationUid() {
    return implementationUid;
  }

  public void setImplementationUid(String implementationUid) {
    this.implementationUid = implementationUid;
  }

  public String getImplementationVersion() {
    return implementationVersion;
  }

  public void setImplementationVersion(String implementationVersion) {
    this.implementationVersion = implementationVersion;
  }

  public Integer getPduType() {
    return pduType;
  }

  public void setPduType(Integer pduType) {
    this.pduType = pduType;
  }

  public String getStationAeTitle() {
    return stationAeTitle;
  }

  public void setStationAeTitle(String stationAeTitle) {
    this.stationAeTitle = stationAeTitle;
  }

  @Override
  public String toString() {
    return "EDicom [imageType=" + imageType + ", modality=" + modality + ", mfgId=" + mfgId + ", hcpId=" + hcpId
        + ", stationName=" + stationName + ", deptName=" + deptName + ", serialNumber=" + serialNumber
        + ", softwareVersion=" + softwareVersion + ", calibrationTime=" + calibrationTime + ", systemStatus="
        + systemStatus + ", calledAETitle=" + calledAETitle + ", callingAETitle=" + callingAETitle
        + ", applicationContextName=" + applicationContextName + ", implementationUid=" + implementationUid
        + ", implementationVersion=" + implementationVersion
        + ", pduType=" + pduType
        + ", stationAeTitle=" + stationAeTitle
        + "]";
  }

}
