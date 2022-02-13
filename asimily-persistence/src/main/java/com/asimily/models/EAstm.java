package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "astm", schema = "raw_on_prem")
public class EAstm extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "msg_ctrl_id")
  private String msgCtrlId;

  @Column(name = "sender_id")
  private String senderId;

  @Column(name = "receiver_id")
  private String receiverId;

  @Column(name = "processing_id")
  private String processingId;

  @Column(name = "version")
  private String version;

  public String getMsgCtrlId() {
    return msgCtrlId;
  }

  public void setMsgCtrlId(String msgCtrlId) {
    this.msgCtrlId = msgCtrlId;
  }

  public String getSenderId() {
    return senderId;
  }

  public void setSenderId(String senderId) {
    this.senderId = senderId;
  }

  public String getReceiverId() {
    return receiverId;
  }

  public void setReceiverId(String receiverId) {
    this.receiverId = receiverId;
  }

  public String getProcessingId() {
    return processingId;
  }

  public void setProcessingId(String processingId) {
    this.processingId = processingId;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }
}
