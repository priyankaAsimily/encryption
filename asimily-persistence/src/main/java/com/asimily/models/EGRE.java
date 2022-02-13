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
@Table(name = "gre", schema = "raw_on_prem")
public class EGRE extends ETenantBase {
    private static final long serialVersionUID = 1L;
    
 @Column(name = "protocol_type")
 private Integer protocolType;

	public Integer getProtocolType() {
		return this.protocolType;
	}

	public void setProtocolType(Integer protocolType) {
		this.protocolType = protocolType;
	}

}
