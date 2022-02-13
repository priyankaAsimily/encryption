package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.asimily.models.EBase;

@Entity
@Table(name = "http_host_name_black_list", schema = "raw_cloud")
public class EHttpHostNameBlackListCloud extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "host_name")
  private String hostName;

  @Column(name="category_id")
  private Integer categoryId;

  @Column(name = "insert_src")
  private String insertSrc;

  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

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

}
