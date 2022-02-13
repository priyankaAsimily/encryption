package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.asimily.models.EBase;

@Entity
@Table(name = "device_patient_monitor", schema = "portal")
public class EDevicePatientMonitor extends EBase {

  @Id
  @Column(name = "customer_id")
  private Integer customerId;

  @Id
  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "waveforms")
  private Integer waveforms;

  @Column(name = "tram_scope")
  private Integer tramScope;

  @Column(name = "tele_bed")
  private Integer teleBed;

  @Column(name = "prism")
  private Integer prism;

  @Column(name = "eagle")
  private Integer eagle;

  @Column(name = "solar")
  private Integer solar;

  @Column(name = "model")
  private String model;

  @Column(name = "nibp_stopped")
  private Integer nibpStopped;

  @Column(name = "nibp_sys_high")
  private Integer nibpSysHigh;

  @Column(name = "arrhy")
  private Integer arrhy;

  @Column(name = "leads_fail")
  private Integer leadsFail;

  @Column(name = "spo2")
  private Integer spo2;

  @Column(name = "nbp_d")
  private Integer nbpD;

  @Column(name = "st_2_hi")
  private Integer st2Hi;

  @Column(name = "nbp_max")
  private Integer nbpMax;

  @Column(name = "phlp_intellivue")
  private Integer phlpIntellivue;

  @Column(name = "host_name")
  private String hostName;

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

  public Integer getWaveforms() {
    return waveforms;
  }

  public void setWaveforms(Integer waveforms) {
    this.waveforms = waveforms;
  }

  public Integer getTramScope() {
    return tramScope;
  }

  public void setTramScope(Integer tramScope) {
    this.tramScope = tramScope;
  }

  public Integer getTeleBed() {
    return teleBed;
  }

  public void setTeleBed(Integer teleBed) {
    this.teleBed = teleBed;
  }

  public Integer getPrism() {
    return prism;
  }

  public void setPrism(Integer prism) {
    this.prism = prism;
  }

  public Integer getEagle() {
    return eagle;
  }

  public void setEagle(Integer eagle) {
    this.eagle = eagle;
  }

  public Integer getSolar() {
    return solar;
  }

  public void setSolar(Integer solar) {
    this.solar = solar;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Integer getNibpStopped() {
    return nibpStopped;
  }

  public void setNibpStopped(Integer nibpStopped) {
    this.nibpStopped = nibpStopped;
  }

  public Integer getNibpSysHigh() {
    return nibpSysHigh;
  }

  public void setNibpSysHigh(Integer nibpSysHigh) {
    this.nibpSysHigh = nibpSysHigh;
  }

  public Integer getArrhy() {
    return arrhy;
  }

  public void setArrhy(Integer arrhy) {
    this.arrhy = arrhy;
  }

  public Integer getLeadsFail() {
    return leadsFail;
  }

  public void setLeadsFail(Integer leadsFail) {
    this.leadsFail = leadsFail;
  }

  public Integer getSpo2() {
    return spo2;
  }

  public void setSpo2(Integer spo2) {
    this.spo2 = spo2;
  }

  public Integer getNbpD() {
    return nbpD;
  }

  public void setNbpD(Integer nbpD) {
    this.nbpD = nbpD;
  }

  public Integer getSt2Hi() {
    return st2Hi;
  }

  public void setSt2Hi(Integer st2Hi) {
    this.st2Hi = st2Hi;
  }

  public Integer getNbpMax() {
    return nbpMax;
  }

  public void setNbpMax(Integer nbpMax) {
    this.nbpMax = nbpMax;
  }

  public Integer getPhlpIntellivue() {
    return phlpIntellivue;
  }

  public void setPhlpIntellivue(Integer phlpIntellivue) {
    this.phlpIntellivue = phlpIntellivue;
  }

  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
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
