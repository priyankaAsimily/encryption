package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bookmark", schema = "admin")
public class EBookmark extends EBase{
  private static final long serialVersionUID = 1L;
  
  @Column(name = "customer_id")
  private Integer customerId;
  
  @Column(name = "user_id")
  private Integer userId;
  
  @Column(name = "name")
  private String name;
  
  @Column(name = "url")
  private String url;
  
  @Column(name = "data")
  private String data;

  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
