package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * This is persistent class for table ftp database table
 * @author richa
 *
 */
@Entity
@Table(name = "ftp", schema = "raw_on_prem")
public class EFtp extends ETenantBase {
    private static final long serialVersionUID = 1L;
    
 @Column(name = "server_id")
 private Integer serverId;
 
 @Column(name = "client_id")
 private Integer clientId;

 @Column(name = "server_login_id")
 private Integer serverLoginId;

public Integer getServerId() {
  return serverId;
}

public void setServerId(Integer serverId) {
  this.serverId = serverId;
}

public Integer getClientId() {
  return clientId;
}

public void setClientId(Integer clientId) {
  this.clientId = clientId;
}

public Integer getServerLoginId() {
  return serverLoginId;
}

public void setServerLoginId(Integer serverLoginId) {
  this.serverLoginId = serverLoginId;
}

@Override
public String toString() {
  return "EFtp [serverId=" + serverId + ", clientId=" + clientId
      + ", serverLoginId=" + serverLoginId + "]";
}

}
