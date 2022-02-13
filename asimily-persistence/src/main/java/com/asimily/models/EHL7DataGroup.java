package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the hl7_data_group database table.
 * 
 */
@Entity
@Table(name = "hl7_data_group", schema = "raw_cloud")
public class EHL7DataGroup extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "hl7_msg_type")
  private String hl7MsgType;

  @Column(name = "msg_description")
  private String msgDescription;

  @Column(name = "data_group_id")
  private Integer dataGroupId;
  

  public EHL7DataGroup() {
  }

  public String getHl7MsgType() {
    return hl7MsgType;
  }

  public void setHl7MsgType(String hl7MsgType) {
    this.hl7MsgType = hl7MsgType;
  }


  public String getMsgDescription() {
    return msgDescription;
  }

  public void setMsgDescription(String msgDescription) {
    this.msgDescription = msgDescription;
  }

  public Integer getDataGroupId() {
    return dataGroupId;
  }

  public void setDataGroupId(Integer dataGroupId) {
    this.dataGroupId = dataGroupId;
  }

   @Override
  public String toString() {
    return "EHL7DataGroup{" +
            "hl7MsgType='" + hl7MsgType + '\'' +
            ", msgDescription='" + msgDescription + '\'' +
            ", dataGroupId=" + dataGroupId +
            '}';
  }
   
  
}
