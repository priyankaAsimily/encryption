package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ssdp", schema = "raw_on_prem")
public class ESsdp extends ETenantBase {

  @Column(name = "server")
  private String server;

  @Column(name = "user_agent")
  private String userAgent;

  public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
  }

  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

}
