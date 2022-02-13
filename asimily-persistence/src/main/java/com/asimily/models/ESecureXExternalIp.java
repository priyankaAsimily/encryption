package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.google.gson.JsonObject;

@Entity
@Table(name = "secureX_external_ip", schema = "raw_third_party")
public class ESecureXExternalIp extends EBase{
  private static final long serialVersionUID = 1L;

  @Column(name = "ip_and_domain")
  private String ipAndDomain;
  
  @Column(name = "type")
  private Integer type;
  
  @Column(name = "module_id")
  private Integer moduleId;
  
  @Column(name = "verdict_value")
  private String verdictValue;
  
  @Column(name = "verdict_meta_info")
  private String verdictMetaInfo;

  public String getIpAndDomain() {
    return ipAndDomain;
  }
  public void setIpAndDomain(String ipAndDomain) {
    this.ipAndDomain = ipAndDomain;
  }
  public Integer getType() {
    return type;
  }
  public void setType(Integer type) {
    this.type = type;
  }
  public Integer getModuleId() {
    return moduleId;
  }
  public void setModuleId(Integer moduleId) {
    this.moduleId = moduleId;
  }
  public String getVerdictValue() {
    return verdictValue;
  }
  public void setVerdictValue(String verdictValue) {
    this.verdictValue = verdictValue;
  }
  public String getVerdictMetaInfo() {
    return verdictMetaInfo;
  }
  public void setVerdictMetaInfo(String verdictMetaInfo) {
    this.verdictMetaInfo = verdictMetaInfo;
  }
  
}
