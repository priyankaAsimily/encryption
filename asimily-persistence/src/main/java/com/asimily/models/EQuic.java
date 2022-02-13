package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "quic", schema = "raw_on_prem")
public class EQuic extends ETenantBase {

  @Column(name = "server_name")
  private String serverName;

  @Column(name = "uaid")
  private String uaid;

  public String getServerName() {
    return this.serverName;
  }

  public void setServerName(String serverName) {
    this.serverName = serverName;
  }

  public String getUaid() {
    return this.uaid;
  }

  public void setUaid(String uaid) {
    this.uaid = uaid;
  }
}
