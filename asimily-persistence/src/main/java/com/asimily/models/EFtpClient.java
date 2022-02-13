package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * This is persistent class for table ftp_client database table
 * @author richa
 *
 */
@Entity
@Table(name = "ftp_client", schema = "raw_on_prem")
public class EFtpClient extends ETenantBase {
    private static final long serialVersionUID = 1L;
    
 @Column(name = "client_software")
 private String clientSoftware;

public String getClientSoftware() {
  return clientSoftware;
}
public void setClientSoftware(String clientSoftware) {
  this.clientSoftware = clientSoftware;
}

@Override
public String toString() {
  return "EFtpClient [clientSoftware=" + clientSoftware + "]";
}

}
