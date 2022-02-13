package com.asimily.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the document_type database table.
 * 
 */
@Entity
@Table(name = "document_device_model_map", schema = "raw_on_prem")
public class EDocDeviceModelMap extends EBase {
    private static final long serialVersionUID = 1L;

    @Column(name = "document_id")
    private Integer documentId;

    @Column(name = "device_model")
    private String device_model;

    @Column(name = "key_info_id")
    private Integer key_info_id;

    public EDocDeviceModelMap() {
    }
    public Integer getDocId() {
        return this.documentId;
    }
    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }
    public String getDeviceModel() {
        return this.device_model;
    }
    public void setDeviceModel(String device_model) {
        this.device_model = device_model;
    }
    public Integer getKeyInfoId() {
        return this.key_info_id;
    }
    public void setKeyInfoId(Integer key_info_id) {
        this.key_info_id = key_info_id;
    }

}


  
