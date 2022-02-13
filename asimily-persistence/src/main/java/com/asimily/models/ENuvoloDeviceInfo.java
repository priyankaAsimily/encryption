package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "nuvolo_device_info", schema = "raw_third_party")
public class ENuvoloDeviceInfo extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "host_name")
  private String hostname;
  
  @Column(name = "mac_addr")
  private String macAddr;
  
  private String location;
  
  @Column(name = "serial_number")
  private String serialNumber;
  
  @Column(name = "software_version")
  private String softwareVersion;

  private String floor;
  
  private String building;
  
  private String campus;
  
  @Column(name = "phi_creates")
  private String phiCreates;
  
  @Column(name = "phi_transmit")
  private String phiTransmit;
  
  @Column(name = "phi_store")
  private String phiStore;
  
  private String department;
  
  private String ipv4;
  
  private String ipv6;

  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public String getMacAddr() {
    return macAddr;
  }

  public void setMacAddr(String macAddr) {
    this.macAddr = macAddr;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public String getSoftwareVersion() {
    return softwareVersion;
  }

  public void setSoftwareVersion(String softwareVersion) {
    this.softwareVersion = softwareVersion;
  }

  public String getFloor() {
    return floor;
  }

  public void setFloor(String floor) {
    this.floor = floor;
  }

  public String getBuilding() {
    return building;
  }

  public void setBuilding(String building) {
    this.building = building;
  }

  public String getCampus() {
    return campus;
  }

  public void setCampus(String campus) {
    this.campus = campus;
  }

  public String getPhiCreates() {
    return phiCreates;
  }

  public void setPhiCreates(String phiCreates) {
    this.phiCreates = phiCreates;
  }

  public String getPhiTransmit() {
    return phiTransmit;
  }

  public void setPhiTransmit(String phiTransmit) {
    this.phiTransmit = phiTransmit;
  }

  public String getPhiStore() {
    return phiStore;
  }

  public void setPhiStore(String phiStore) {
    this.phiStore = phiStore;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getIpv4() {
    return ipv4;
  }

  public void setIpv4(String ipv4) {
    this.ipv4 = ipv4;
  }

  public String getIpv6() {
    return ipv6;
  }

  public void setIpv6(String ipv6) {
    this.ipv6 = ipv6;
  }

}
