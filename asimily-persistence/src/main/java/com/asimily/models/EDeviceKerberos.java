package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.asimily.models.EBase;

@Entity
@Table(name = "device_kerberos", schema = "portal")
public class EDeviceKerberos extends ETenantBase {

  @Id
  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "version")
  private Integer version;

  @Column(name = "message_type")
  private Integer messageType;

  @Column(name = "padata_type")
  private Integer padataType;

  @Column(name = "authenticator_etype")
  private Integer authenticatorEtype;

  @Column(name = "padata_etype")
  private Integer padataEtype;

  @Column(name = "ticket_etype")
  private Integer ticketEtype;

  @Column(name = "enc_part_etype")
  private Integer encPartEtype;

  @Column(name = "realm")
  private String realm;

  @Column(name = "cname")
  private String cname;

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

  public Integer getVersion() {
    return this.version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Integer getMessageType() {
    return this.messageType;
  }

  public void setMessageType(Integer messageType) {
    this.messageType = messageType;
  }

  public Integer getPadataType() {
    return this.padataType;
  }

  public void setPadataType(Integer padataType) {
    this.padataType = padataType;
  }

  public Integer getAuthenticatorEtype() {
    return this.authenticatorEtype;
  }

  public void setAuthenticatorEtype(Integer authenticatorEtype) {
    this.authenticatorEtype = authenticatorEtype;
  }

  public Integer getPadataEtype() {
    return this.padataEtype;
  }

  public void setPadataEtype(Integer padataEtype) {
    this.padataEtype = padataEtype;
  }

  public Integer getTicketEtype() {
    return this.ticketEtype;
  }

  public void setTicketEtype(Integer ticketEtype) {
    this.ticketEtype = ticketEtype;
  }

  public Integer getEncPartEtype() {
    return this.encPartEtype;
  }

  public void setEncPartEtype(Integer encPartEtype) {
    this.encPartEtype = encPartEtype;
  }

  public String getRealm() {
    return this.realm;
  }

  public void setRealm(String realm) {
    this.realm = realm;
  }

  public String getCname() {
    return this.cname;
  }

  public void setCname(String cname) {
    this.cname = cname;
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
