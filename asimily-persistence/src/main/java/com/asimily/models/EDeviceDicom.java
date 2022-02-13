package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "device_dicom", schema = "portal")
public class EDeviceDicom extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "is_dicom_server")
  private Boolean isDicomServer;

  @Column(name = "image_type")
  private String imageType;

  @Column(name = "modality")
  private String modality;

  @Column(name = "mfg_ID")
  private String mfgId;

  @Column(name = "institution_name")
  private String institutionName;

  @Column(name = "station_name")
  private String stationName;

  @Column(name = "dept_name")
  private String deptName;

  @Column(name = "model_name")
  private String modelName;

  @Column(name = "serial_number")
  private String serialNumber;

  @Column(name = "source_serial_number")
  private String sourceSerialNumber;

  @Column(name = "detector_serial_number")
  private String detectorSerialNumber;

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

  @Column(name = "is_sender")
  private Boolean isSender;

  @Column(name = "pdu_type")
  private Integer pduType;

  @Column(name = "port")
  private Integer port;

  @Column(name = "peer_port")
  private Integer peerPort;

  @Column(name = "station_ae_title")
  private String stationAeTitle;
  
  @Column(name = "metadata_id")
  private Integer metadataId;
  
  @Column(name = "record_id")
  private Integer recordId;

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

  public String getInstitutionName() {
    return institutionName;
  }

  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
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

  public String getSourceSerialNumber() {
    return sourceSerialNumber;
  }

  public void setSourceSerialNumber(String sourceSerialNumber) {
    this.sourceSerialNumber = sourceSerialNumber;
  }

  public String getDetectorSerialNumber() {
    return detectorSerialNumber;
  }

  public void setDetectorSerialNumber(String detectorSerialNumber) {
    this.detectorSerialNumber = detectorSerialNumber;
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

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public Boolean getDicomServer() {
    return isDicomServer;
  }

  public void setDicomServer(Boolean dicomServer) {
    isDicomServer = dicomServer;
  }

  public String getMissingMfg() {
    return missingMfg;
  }

  public String getSopClassUid() {
    return sopClassUid;
  }

  public void setSopClassUid(String sopClassUid) {
    this.sopClassUid = sopClassUid;
  }

  public void setMissingMfg(String missingMfg) {
    this.missingMfg = missingMfg;
  }

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

  public Boolean getIsSender() {
    return isSender;
  }

  public void setIsSender(Boolean isSender) {
    this.isSender = isSender;
  }

  public Integer getPduType() {
    return pduType;
  }

  public void setPduType(Integer pduType) {
    this.pduType = pduType;
  }

  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public Integer getPeerPort() {
    return peerPort;
  }

  public void setPeerPort(Integer peerPort) {
    this.peerPort = peerPort;
  }

  public String getStationAeTitle() {
    return stationAeTitle;
  }

  public void setStationAeTitle(String stationAeTitle) {
    this.stationAeTitle = stationAeTitle;
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
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    EDeviceDicom that = (EDeviceDicom) o;
    return Objects.equals(deviceInfoId, that.deviceInfoId) && Objects.equals(imageType, that.imageType)
        && Objects.equals(modality, that.modality) && Objects.equals(mfgId, that.mfgId)
        && Objects.equals(institutionName, that.institutionName) && Objects.equals(stationName, that.stationName)
        && Objects.equals(deptName, that.deptName) && Objects.equals(modelName, that.modelName)
        && Objects.equals(serialNumber, that.serialNumber) && Objects.equals(softwareVersion, that.softwareVersion)
        && Objects.equals(calibrationTime, that.calibrationTime) && Objects.equals(systemStatus, that.systemStatus)
        && Objects.equals(calledAETitle, that.calledAETitle) && Objects.equals(callingAETitle, that.callingAETitle)
        && Objects.equals(applicationContextName, that.applicationContextName)
        && Objects.equals(implementationUid, that.implementationUid)
        && Objects.equals(implementationVersion, that.implementationVersion)
        && Objects.equals(pduType, that.pduType)
        && Objects.equals(port, that.port)
        && Objects.equals(peerPort, that.peerPort)
        && Objects.equals(stationAeTitle, that.stationAeTitle)
        && Objects.equals(metadataId, that.metadataId)
        && Objects.equals(recordId, that.recordId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceInfoId, imageType, modality, mfgId, institutionName, stationName, deptName, modelName, serialNumber,
        softwareVersion, calibrationTime, systemStatus, calledAETitle, callingAETitle, applicationContextName,
        implementationUid, implementationVersion, pduType, port, peerPort, stationAeTitle, metadataId, recordId);
  }
}
