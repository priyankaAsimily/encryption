package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "syslog", schema = "raw_on_prem")
public class ESyslog extends ETenantBase {

  @Column(name = "message_type")
  private Integer messageType;

  @Column(name = "message")
  private String message;

  public Integer getMessageType() {
    return messageType;
  }

  public void setMessageType(Integer messageType) {
    this.messageType = messageType;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

}
