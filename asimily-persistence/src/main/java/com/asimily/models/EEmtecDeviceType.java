package com.asimily.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "emtec_device_type", schema = "raw_cloud")
public class EEmtecDeviceType extends EBase{
    private static final long serialVersionUID = 1L;

@Column(name = "instruction_recommendation")
private String instructionRecommendation;

@Column(name = "device_name")
private String deviceName;

@Column(name = "expectet_lifetime_max")
private Integer expectetLifetimeMax;

@Column(name = "expectet_lifetime_min")
private Integer expectetLifetimeMin;

public EEmtecDeviceType() {

}

public String getInstructionRecommendation() {
    return instructionRecommendation;
}

public void setInstructionRecommendation(String instructionrecommendation){
    this.instructionRecommendation = instructionrecommendation;
}

public String getDeviceName() {
    return deviceName;
}

public void setDeviceName(String devicename){
    this.deviceName = devicename;
}

public Integer getExpectetLifetimeMax() {
    return expectetLifetimeMax;
}

public void setExpectetLifetimeMax(Integer expectetlifetimemax){
    this.expectetLifetimeMax = expectetlifetimemax;
}

public Integer getExpectetLifetimeMin() {
    return expectetLifetimeMin;
}

public void setExpectetLifetimeMin(Integer expectetlifetimemin){
    this.expectetLifetimeMin = expectetlifetimemin;
}

}

