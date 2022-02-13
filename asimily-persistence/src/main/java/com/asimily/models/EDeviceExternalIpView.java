package com.asimily.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_external_ip_view", schema = "portal")
public class EDeviceExternalIpView extends EBase implements Serializable {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "device_external_ip_name")
  private String deviceExternalIpName;

  @Column(name = "device_external_ip_value")
  private String deviceExternalIpValue;

  @Column(name = "external_ip")
  protected String externalIp;

  @Column(name = "external_ip_country")
  private String externalIpCountry;

  @Column(name = "external_ip_manufacturer")
  private String externalIpManufacturer;

  @Column(name = "external_ip_reputation")
  private String externalIpReputation;

  @Column(name = "external_connectivity_service")
  private String externalConnectivityService;

  @Column(name = "field_id")
  private Integer fieldId;

  @Column(name = "is_fixed")
  private Boolean isFixed;

  @Column(name="fix_action_taken")
  private String fixActionTaken;

  @Column(name="fixed_by")
  private String fixedBy;

  @Column(name="fixed_date")
  private Timestamp fixedDate;

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public String getDeviceExternalIpName() {
    return deviceExternalIpName;
  }

  public void setDeviceExternalIpName(String deviceExternalIpName) {
    this.deviceExternalIpName = deviceExternalIpName;
  }

  public String getDeviceExternalIpValue() {
    return deviceExternalIpValue;
  }

  public void setDeviceExternalIpValue(String deviceExternalIpValue) {
    this.deviceExternalIpValue = deviceExternalIpValue;
  }

  public String getExternalIp() {
    return externalIp;
  }

  public void setExternalIp(String externalIp) {
    this.externalIp = externalIp;
  }

  public String getExternalIpCountry() {
    return externalIpCountry;
  }

  public void setExternalIpCountry(String externalIpCountry) {
    this.externalIpCountry = externalIpCountry;
  }

  public String getExternalIpManufacturer() {
    return externalIpManufacturer;
  }

  public void setExternalIpManufacturer(String externalIpManufacturer) {
    this.externalIpManufacturer = externalIpManufacturer;
  }

  public String getExternalIpReputation() {
    return externalIpReputation;
  }

  public void setExternalIpReputation(String externalIpReputation) {
    this.externalIpReputation = externalIpReputation;
  }

  public String getExternalConnectivityService() {
    return externalConnectivityService;
  }

  public void setExternalConnectivityService(String externalConnectivityService) {
    this.externalConnectivityService = externalConnectivityService;
  }

  public Integer getFieldId() {
    return fieldId;
  }

  public void setFieldId(Integer fieldId) {
    this.fieldId = fieldId;
  }

  public Boolean getIsFixed() {
    return isFixed;
  }

  public void setIsFixed(Boolean isFixed) {
    this.isFixed = isFixed;
  }

  public String getFixActionTaken() {
    return fixActionTaken;
  }

  public void setFixActionTaken(String fixActionTaken) {
    this.fixActionTaken = fixActionTaken;
  }

  public String getFixedBy() {
    return fixedBy;
  }

  public void setFixedBy(String fixedBy) {
    this.fixedBy = fixedBy;
  }

  public Timestamp getFixedDate() {
    return fixedDate;
  }

  public void setFixedDate(Timestamp fixedDate) {
    this.fixedDate = fixedDate;
  }

}
