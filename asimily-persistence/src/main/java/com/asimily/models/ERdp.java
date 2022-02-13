package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * This is persistent class for table rdp database table
 * @author richa
 *
 */
@Entity
@Table(name = "rdp", schema = "raw_on_prem")
public class ERdp extends ETenantBase {
    private static final long serialVersionUID = 1L;
    
 @Column(name = "major_version")
 private String majorVersion;
 
 @Column(name = "minor_version")
 private String minorVersion;

public String getMajorVersion() {
  return majorVersion;
}

public void setMajorVersion(String majorVersion) {
  this.majorVersion = majorVersion;
}

public String getMinorVersion() {
  return minorVersion;
}

public void setMinorVersion(String minorVersion) {
  this.minorVersion = minorVersion;
}

}
