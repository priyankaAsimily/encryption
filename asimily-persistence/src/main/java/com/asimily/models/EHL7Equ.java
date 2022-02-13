package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "hl7_equ", schema = "raw_on_prem")
public class EHL7Equ extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "instance_id")
  private String instance_id;

  @Column(name = "event_time")
  private String event_time;

  @Column(name = "state")
  private String state;

  @Column(name = "control_state")
  private String control_state;

  @Column(name = "alert_level")
  private String alert_level;


  public EHL7Equ() {
  }

  public String getInstance_id() {
    return instance_id;
  }

  public void setInstance_id(String instance_id) {
    this.instance_id = instance_id;
  }

  public String getEvent_time() {
    return event_time;
  }

  public void setEvent_time(String event_time) {
    this.event_time = event_time;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getControl_state() {
    return control_state;
  }

  public void setControl_state(String control_state) {
    this.control_state = control_state;
  }

  public String getAlert_level() {
    return alert_level;
  }

  public void setAlert_level(String alert_level) {
    this.alert_level = alert_level;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EHL7Equ ehl7Equ = (EHL7Equ) o;
    return Objects.equals(instance_id, ehl7Equ.instance_id) &&
        Objects.equals(event_time, ehl7Equ.event_time) &&
        Objects.equals(state, ehl7Equ.state) &&
        Objects.equals(control_state, ehl7Equ.control_state) &&
        Objects.equals(alert_level, ehl7Equ.alert_level);
  }

  @Override
  public int hashCode() {

    return Objects.hash(instance_id, event_time, state, control_state, alert_level);
  }
}
