package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * This is persistent class for table arp database table
 * @author Thai Nguyen
 *
 */
@Entity
@Table(name = "icmpv6", schema = "raw_on_prem")
public class EIcmpv6 extends ETenantBase {

	@Column(name = "type")
	private int type;

	@Column(name = "target_ip")
	private String targetIp;

	@Column(name = "link_layer_mac")
	private String linkLayerMac;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getTargetIp() {
		return this.targetIp;
	}

	public void setTargetIp(String targetIp) {
		this.targetIp = targetIp;
	}

	public String getLinkLayerMac() {
		return this.linkLayerMac;
	}

	public void setLinkLayerMac(String linkLayerMac) {
		this.linkLayerMac = linkLayerMac;
	}

}
