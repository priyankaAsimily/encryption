package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * This is persistent class for table arp database table
 * @author umang
 *
 */
@Entity
@Table(name = "arp", schema = "raw_on_prem")
public class EArp extends ETenantBase {
    private static final long serialVersionUID = 1L;

	@Column(name = "sender_mac")
	private String senderMac;

	@Column(name = "sender_ip")
	private String senderIp;

	@Column(name = "target_mac")
	private String targetMac;

	@Column(name = "target_ip")
	private String targetIp;

	@Column(name = "hardware_type")
	private Integer hardwareType;

	public String getSenderMac() {
		return this.senderMac;
	}

	public void setSenderMac(String senderMac) {
		this.senderMac = senderMac;
	}

	public String getSenderIp() {
		return this.senderIp;
	}

	public void setSenderIp(String senderIp) {
		this.senderIp = senderIp;
	}

	public String getTargetMac() {
		return this.targetMac;
	}

	public void setTargetMac(String targetMac) {
		this.targetMac = targetMac;
	}

	public String getTargetIp() {
		return this.targetIp;
	}

	public void setTargetIp(String targetIp) {
		this.targetIp = targetIp;
	}

  public Integer getHardwareType() {
    return this.hardwareType;
  }

  public void setHardwareType(Integer hardwareType) {
    this.hardwareType = hardwareType;
  }

}
