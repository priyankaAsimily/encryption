package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.google.gson.JsonObject;

@Entity
@Table(name = "crowdstrike_intel", schema = "raw_third_party")
public class ECrowdStrikeIntel extends EBase{
  private static final long serialVersionUID = 1L;

  @Column(name = "observable")
  private String observable;
  
  @Column(name = "observable_type")
  private Integer observableType;
  
  //Unlike SecureX there is no source module for CrowdStrike Intel
  //@Column(name = "module_id")
  //private Integer moduleId;
  
  @Column(name = "verdict")
  private String verdict;

  //The following is not appliocable for CrowdStrike unlike SecureX
  //@Column(name = "verdict_meta_info")
  //private String verdictMetaInfo;

  public String getObservable() {
    return observable;
  }
  public void setObservable(String observable) {
    this.observable = observable;
  }
  public Integer getObservableType() {
    return observableType;
  }
  public void setObservableType(Integer type) {
    this.observableType = type;
  }

  /*public Integer getModuleId() {
    return moduleId;
  }

  public void setModuleId(Integer moduleId) {
    this.moduleId = moduleId;
  }*/

  public String getVerdict() {
    return verdict;
  }
  public void setVerdict(String verdict) {
    this.verdict = verdict;
  }
  /*
  public String getVerdictMetaInfo() {
    return verdictMetaInfo;
  }
  public void setVerdictMetaInfo(String verdictMetaInfo) {
    this.verdictMetaInfo = verdictMetaInfo;
  }*/
  
}
