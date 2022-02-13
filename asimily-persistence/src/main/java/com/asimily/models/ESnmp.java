package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * This is persistent class for table snmp_info database table
 * @author richa
 *
 */
@Entity
@Table(name = "snmp", schema = "raw_on_prem")
public class ESnmp extends ETenantBase {
    private static final long serialVersionUID = 1L;
    
 @Column(name = "version")
 private String version;

public String getVersion() {
    return version;
}

public void setVersion(String version) {
    this.version = version;
}

}
