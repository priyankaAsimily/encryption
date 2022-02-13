package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * This is persistent class for table capwap database table
 * @author umang
 *
 */
@Entity
@Table(name = "capwap", schema = "raw_on_prem")
public class ECapwap extends ETenantBase {
    private static final long serialVersionUID = 1L;

	@Column(name = "wlan_control_field")
	private String wlanControlField;
    
	@Column(name = "wlan_mac_addr_1")
	private String wlanMacAddr1;
  
	@Column(name = "wlan_mac_addr_2")
	private String wlanMacAddr2;
  
	@Column(name = "wlan_mac_addr_3")
	private String wlanMacAddr3;
  
	@Column(name = "wlan_mac_addr_4")
	private String wlanMacAddr4;

	@Column(name = "wlan_payload")
	private byte[] wlanPayload;

	public String getWlanMacAddr1() {
		return this.wlanMacAddr1;
	}

	public void setWlanMacAddr1(String wlanMacAddr1) {
		this.wlanMacAddr1 = wlanMacAddr1;
	}

	public String getWlanMacAddr2() {
		return this.wlanMacAddr2;
	}

	public void setWlanMacAddr2(String wlanMacAddr2) {
		this.wlanMacAddr2 = wlanMacAddr2;
	}

	public String getWlanMacAddr3() {
		return this.wlanMacAddr3;
	}

	public void setWlanMacAddr3(String wlanMacAddr3) {
		this.wlanMacAddr3 = wlanMacAddr3;
	}

	public String getWlanMacAddr4() {
		return this.wlanMacAddr4;
	}

	public void setWlanMacAddr4(String wlanMacAddr4) {
		this.wlanMacAddr4 = wlanMacAddr4;
	}

	public String getWlanControlField() {
		return wlanControlField;
	}

	public void setWlanControlField(String wlanControlField) {
		this.wlanControlField = wlanControlField;
	}

	public byte[] getWlanPayload() {
		return this.wlanPayload;
	}

	public void setWlanPayload(byte[] wlanPayload) {
		this.wlanPayload = wlanPayload;
  }

}
