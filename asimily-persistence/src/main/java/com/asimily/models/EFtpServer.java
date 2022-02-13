package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * This is persistent class for table ftp_server database table
 * @author richa
 *
 */
@Entity
@Table(name = "ftp_server", schema = "raw_on_prem")
public class EFtpServer extends ETenantBase {
    private static final long serialVersionUID = 1L;
    
 @Column(name = "banner")
 private String banner;
 
 @Column(name = "system")
 private String system;
 
 @Column(name = "os_version")
 private String osVersion;
 
 @Column(name = "transfer_type")
 private String transferType;

public String getBanner() {
  return banner;
}

public void setBanner(String banner) {
  this.banner = banner;
}

public String getSystem() {
  return system;
}

public void setSystem(String system) {
  this.system = system;
}

public String getOsVersion() {
  return osVersion;
}

public void setOsVersion(String osVersion) {
  this.osVersion = osVersion;
}

public String getTransferType() {
  return transferType;
}

public void setTransferType(String transferType) {
  this.transferType = transferType;
}

@Override
public String toString() {
  return "EFtpServer [banner=" + banner + ", system=" + system + ", osVersion="
      + osVersion + ", transferType=" + transferType + "]";
}

}
