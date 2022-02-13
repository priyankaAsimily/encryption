package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_astm", schema = "portal")
public class EDeviceAstm extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

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

  @Column(name = "payload")
  private String payload;

  @Column(name = "metadata_id")
  private Integer metadataId;
  
  @Column(name = "record_id")
  private Integer recordId;

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

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
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

  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }
}
