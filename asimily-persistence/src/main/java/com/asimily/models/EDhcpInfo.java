package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the dhcp_info database table.
 * 
 */
@Entity
@Table(name = "dhcp_info", schema = "raw_on_prem")
public class EDhcpInfo extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "client_identifier_type")
  private String clientIdentifierType;

  @Column(name = "client_identifier_value")
  private String clientIdentifierValue;

  @Column(name = "domain_name")
  private String domainName;

  @Column(name = "host_name")
  private String hostName;

  @Column(name = "option_code_sequence")
  private String optionCodeSequence;

  @Column(name = "option55_sequence")
  private String option55Sequence;

  @Column(name = "pkt_type_id")
  private Integer pktTypeId;

  @Column(name = "vendor_class_identifier")
  private String vendorClassIdentifier;

  @Column(name = "vendor_specific_information")
  private String vendorSpecificInformation;

  @Column(name = "c_i_addr")
  private String cIAddr;

  @Column(name = "y_i_addr")
  private String yIAddr;

  @Column(name = "g_i_addr_id")
  private Integer gIAddrId;

  @Column(name = "s_i_addr_id")
  private Integer sIAddrId;

  @Column(name = "subnet_id")
  private Integer subnetId;

  @Column(name = "hardware_type")
  private Integer hardwareType;

  public EDhcpInfo() {
  }

  public String getClientIdentifierType() {
    return this.clientIdentifierType;
  }

  public void setClientIdentifierType(String clientIdentifierType) {
    this.clientIdentifierType = clientIdentifierType;
  }

  public String getClientIdentifierValue() {
    return this.clientIdentifierValue;
  }

  public void setClientIdentifierValue(String clientIdentifierValue) {
    this.clientIdentifierValue = clientIdentifierValue;
  }

  public String getDomainName() {
    return this.domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  public String getHostName() {
    return this.hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public String getOptionCodeSequence() {
    return this.optionCodeSequence;
  }

  public void setOptionCodeSequence(String optionCodeSequence) {
    this.optionCodeSequence = optionCodeSequence;
  }

  public String getOption55Sequence() {
    return this.option55Sequence;
  }

  public void setOption55Sequence(String option55Sequence) {
    this.option55Sequence = option55Sequence;
  }

  public Integer getPktTypeId() {
    return this.pktTypeId;
  }

  public void setPktTypeId(Integer pktTypeId) {
    this.pktTypeId = pktTypeId;
  }

  public String getVendorClassIdentifier() {
    return this.vendorClassIdentifier;
  }

  public void setVendorClassIdentifier(String vendorClassIdentifier) {
    this.vendorClassIdentifier = vendorClassIdentifier;
  }

  public String getVendorSpecificInformation() {
    return this.vendorSpecificInformation;
  }

  public void setVendorSpecificInformation(String vendorSpecificInformation) {
    this.vendorSpecificInformation = vendorSpecificInformation;
  }

  public String getcIAddr() {
    return cIAddr;
  }

  public void setcIAddr(String cIAddr) {
    this.cIAddr = cIAddr;
  }

  public String getyIAddr() {
    return yIAddr;
  }

  public void setyIAddr(String yIAddr) {
    this.yIAddr = yIAddr;
  }

  public Integer getgIAddrId() {
    return gIAddrId;
  }

  public void setgIAddrId(Integer gIAddrId) {
    this.gIAddrId = gIAddrId;
  }

  public Integer getsIAddrId() {
    return sIAddrId;
  }

  public void setsIAddrId(Integer sIAddrId) {
    this.sIAddrId = sIAddrId;
  }

  public Integer getSubnetId() {
    return subnetId;
  }

  public void setSubnetId(Integer subnetId) {
    this.subnetId = subnetId;
  }

  public Integer getHardwareType() {
    return this.hardwareType;
  }

  public void setHardwareType(Integer hardwareType) {
    this.hardwareType = hardwareType;
  }

}
