package com.asimily.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * The persistent class for the device_impact_data database table.
 * 
 */
@Entity
@Table(name="device_impact_data",schema="portal")
public class EDeviceImpactData extends  EBase{
	private static final long serialVersionUID = 1L;

	private Integer criticality;

	@Column(name="device_info_id")
	private Integer deviceInfoId;

	@Column(name="document_id")
	private Integer documentId;

	@Column(name="key_notes")
	private String keyNotes;

	@Column(name="key_value")
	private String keyValue;

	@Column(name="keys_info_id")
	private Integer keysInfoId;

	private BigDecimal score;

	public EDeviceImpactData() {
	}

	public Integer getCriticality() {
		return this.criticality;
	}

	public void setCriticality(Integer criticality) {
		this.criticality = criticality;
	}

	public Integer getDeviceInfoId() {
		return this.deviceInfoId;
	}

	public void setDeviceInfoId(Integer deviceInfoId) {
		this.deviceInfoId = deviceInfoId;
	}

	public Integer getDocumentId() {
		return this.documentId;
	}

	public void setDocumentId(Integer documentId) {
		this.documentId = documentId;
	}

	public String getKeyNotes() {
		return this.keyNotes;
	}

	public void setKeyNotes(String keyNotes) {
		this.keyNotes = keyNotes;
	}

	public String getKeyValue() {
		return this.keyValue;
	}

	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}

	public Integer getKeysInfoId() {
		return this.keysInfoId;
	}

	public void setKeysInfoId(Integer keysInfoId) {
		this.keysInfoId = keysInfoId;
	}

	public BigDecimal getScore() {
		return this.score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

}