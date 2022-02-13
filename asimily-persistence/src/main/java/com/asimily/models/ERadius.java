package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "radius", schema = "raw_on_prem")
public class ERadius extends ETenantBase {

  @Column(name = "user_name")
  private String userName;

  @Column(name = "nas_ip_addr")
  private String nasIpAddr;

  @Column(name = "frame_ip_addr")
  private String frameIpAddr;

  @Column(name = "callback_number")
  private String callbackNumber;

  @Column(name = "callback_id")
  private String callbackId;

  @Column(name = "called_station_id")
  private String calledStationId;

  @Column(name = "calling_station_id")
  private String callingStationId;

  @Column(name = "nas_identifier")
  private String nasIdentifier;

  @Column(name = "nas_port_type")
  private String nasPortType;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getNasIpAddr() {
    return this.nasIpAddr;
  }

  public void setNasIpAddr(String nasIpAddr) {
    this.nasIpAddr = nasIpAddr;
  }

  public String getFrameIpAddr() {
    return this.frameIpAddr;
  }

  public void setFrameIpAddr(String frameIpAddr) {
    this.frameIpAddr = frameIpAddr;
  }

  public String getCallbackNumber() {
    return this.callbackNumber;
  }

  public void setCallbackNumber(String callbackNumber) {
    this.callbackNumber = callbackNumber;
  }

  public String getCallbackId() {
    return this.callbackId;
  }

  public void setCallbackId(String callbackId) {
    this.callbackId = callbackId;
  }

  public String getCalledStationId() {
    return this.calledStationId;
  }

  public void setCalledStationId(String calledStationId) {
    this.calledStationId = calledStationId;
  }

  public String getCallingStationId() {
    return this.callingStationId;
  }

  public void setCallingStationId(String callingStationId) {
    this.callingStationId = callingStationId;
  }

  public String getNasIdentifier() {
    return this.nasIdentifier;
  }

  public void setNasIdentifier(String nasIdentifier) {
    this.nasIdentifier = nasIdentifier;
  }

  public String getNasPortType() {
    return this.nasPortType;
  }

  public void setNasPortType(String nasPortType) {
    this.nasPortType = nasPortType;
  }
}
