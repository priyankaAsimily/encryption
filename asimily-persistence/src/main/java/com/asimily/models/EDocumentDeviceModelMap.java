package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "document_device_model_map", schema = "raw_on_prem")
public class EDocumentDeviceModelMap extends EBase {

	private static final long serialVersionUID = 1L;

	@Column(name = "document_id")
	private Integer documentId;

	@Column(name = "device_model")
	private String deviceModel;

	@Column(name = "key_info_id")
	private Integer keyInfoId;

	public Integer getDocumentId() {
		return documentId;
	}

	public void setDocumentId(Integer documentId) {
		this.documentId = documentId;
	}

	public String getDeviceModel() {
		return deviceModel;
	}

	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}

	public Integer getKeyInfoId() {
		return keyInfoId;
	}

	public void setKeyInfoId(Integer keyInfoId) {
		this.keyInfoId = keyInfoId;
	}
}
