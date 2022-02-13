package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "kerberos", schema = "raw_on_prem")
public class EKerberos extends ETenantBase {

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

}
