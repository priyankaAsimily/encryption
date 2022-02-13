package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "http_host_name_white_list", schema = "raw_cloud")
public class EHttpHostNameWhiteListCloud extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "host_name")
  private String hostName;

  @Column(name = "insert_src")
  private String insertSrc;

  @Column(name = "white_list")
  private Boolean whiteList;

  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

  public void setWhiteList(Boolean whiteList){
    this.whiteList = whiteList;
  }

  public Boolean isWhiteList(){
    return whiteList;
  }

}