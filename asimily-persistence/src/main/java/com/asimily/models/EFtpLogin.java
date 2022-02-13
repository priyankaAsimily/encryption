package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ftp_login", schema = "raw_on_prem")
public class EFtpLogin extends ETenantBase {
    private static final long serialVersionUID = 1L;
    
 @Column(name = "server_username")
 private String serverUsername;
 
 @Column(name = "server_password")
 private String serverPassword;

  public String getServerUsername() {
    return serverUsername;
  }

  public void setServerUsername(String serverUsername) {
    this.serverUsername = serverUsername;
  }

  public String getServerPassword() {
    return serverPassword;
  }

  public void setServerPassword(String serverPassword) {
    this.serverPassword = serverPassword;
  }
}
