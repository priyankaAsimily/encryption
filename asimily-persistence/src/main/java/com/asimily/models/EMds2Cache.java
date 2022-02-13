package com.asimily.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mds2_cache", schema = "raw_on_prem")
public class EMds2Cache extends EBase{
    private static final long serialVersionUID = 1L;

@Column(name = "uuid")
private String uuid;

@Column(name = "ddmm_model")
private String ddmmModel;

public EMds2Cache() {

}

public String getUUID() {
    return uuid;
}

public void setUUID(String uuid){
    this.uuid = uuid;
}

public String getDdmmModel(){
    return ddmmModel;
}

public void setDdmmModel(String ddmm_model){
    this.ddmmModel = ddmm_model;
}

}
