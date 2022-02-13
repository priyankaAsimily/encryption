package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the hl7_msh database table.
 * 
 */
@Entity
@Table(name = "hl7_msh", schema = "raw_on_prem")
public class EHL7Msh extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "send_application")
  private String sendApplication;

  @Column(name = "recv_application")
  private String recvApplication;

  @Column(name = "version")
  private String version;
  
  @Column(name = "send_facility")
  private String sendFacility;
  
  @Column(name = "recv_facility")
  private String recvFacility;
  
  @Column(name = "msg_type")
  private String msgType;

  public EHL7Msh() {
  }

  public String getSendApplication() {
    return sendApplication;
  }

  public void setSendApplication(String sendApplication) {
    this.sendApplication = sendApplication;
  }

  public String getRecvApplication() {
    return recvApplication;
  }

  public void setRecvApplication(String recvApplication) {
    this.recvApplication = recvApplication;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getSendFacility() {
    return sendFacility;
  }

  public void setSendFacility(String sendFacility) {
    this.sendFacility = sendFacility;
  }

  public String getRecvFacility() {
    return recvFacility;
  }

  public void setRecvFacility(String recvFacility) {
    this.recvFacility = recvFacility;
  }

  public String getMsgType() {
    return msgType;
  }

  public void setMsgType(String msgType) {
    this.msgType = msgType;
  }

  @Override
  public String toString() {
    return "EHL7Msh{" +
            "sendApplication='" + sendApplication + '\'' +
            ", recvApplication='" + recvApplication + '\'' +
            ", version='" + version + '\'' +
            ", sendFacility='" + sendFacility + '\'' +
            ", recvFacility='" + recvFacility + '\'' +
            ", msgType='" + msgType + '\'' +
            '}';
  }
  
}
