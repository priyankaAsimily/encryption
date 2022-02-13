package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ihe", schema = "raw_on_prem")
public class EIhe extends ETenantBase {

  @Column(name = "is_control_present")
  private Boolean isControlPresent;

  @Column(name = "is_ack_present")
  private Boolean isAckPresent;

  @Column(name = "is_patient_id_present")
  private Boolean isPatientIdPresent;

  @Column(name = "is_eot_topic_present")
  private Boolean isEotTopicPresent;

  @Column(name = "payload")
  private byte[] payload;

  public Boolean getIsControlPresent(){
    return this.isControlPresent;
  }

  public void setIsControlPresent(Boolean isControlPresent) {
    this.isControlPresent = isControlPresent;
  }

  public Boolean getIsAckPresent(){
    return this.isAckPresent;
  }

  public void setIsAckPresent(Boolean isAckPresent) {
    this.isAckPresent = isAckPresent;
  }

  public Boolean getIsPatientIdPresent(){
    return this.isPatientIdPresent;
  }

  public void setIsPatientIdPresent(Boolean isPatientIdPresent) {
    this.isPatientIdPresent = isPatientIdPresent;
  }

  public Boolean getIsEotTopicPresent(){
    return this.isEotTopicPresent;
  }

  public void setIsEotTopicPresent(Boolean isEotTopicPresent) {
    this.isEotTopicPresent = isEotTopicPresent;
  }

  public byte[] getPayload(){
    return this.payload;
  }

  public void setPayload(byte[] payload) {
    this.payload = payload;
  }

}
