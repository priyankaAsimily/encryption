package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_dhcp_info", schema = "portal")
public class EDeviceDhcpInfo extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

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

  @Column(name = "s_i_addr")
  private String sIAddr;

  @Column(name = "g_i_addr")
  private String gIAddr;

  @Column(name = "subnet")
  private String subnet;

  //TODO:: Khushbu remove these 3 columns after merging perf_opt branch to main branch
  @Column(name = "g_i_addr_id")
  private Integer gIAddrId;

  @Column(name = "s_i_addr_id")
  private Integer sIAddrId;

  @Column(name = "subnet_id")
  private Integer subnetId;

  @Column(name = "hardware_type")
  private Integer hardwareType;

  @Column(name = "metadata_id")
  private Integer metadataId;
  
  @Column(name = "record_id")
  private Integer recordId; 
  
  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
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

  @Deprecated
  public Integer getgIAddrId() {
    return gIAddrId;
  }
  @Deprecated
  public void setgIAddrId(Integer gIAddrId) {
    this.gIAddrId = gIAddrId;
  }
  @Deprecated
  public Integer getsIAddrId() {
    return sIAddrId;
  }
  @Deprecated
  public void setsIAddrId(Integer sIAddrId) {
    this.sIAddrId = sIAddrId;
  }
  @Deprecated
  public Integer getSubnetId() {
    return subnetId;
  }
  @Deprecated
  public void setSubnetId(Integer subnetId) {
    this.subnetId = subnetId;
  }

  public String getsIAddr() {
    return sIAddr;
  }

  public void setsIAddr(String sIAddr) {
    this.sIAddr = sIAddr;
  }

  public String getgIAddr() {
    return gIAddr;
  }

  public void setgIAddr(String gIAddr) {
    this.gIAddr = gIAddr;
  }

  public String getSubnet() {
    return subnet;
  }

  public void setSubnet(String subnet) {
    this.subnet = subnet;
  }
  public Integer getHardwareType() {
    return this.hardwareType;
  }

  public void setHardwareType(Integer hardwareType) {
    this.hardwareType = hardwareType;
  }
  
  public Integer getMetadataId() {
    return metadataId;
  }

  public void setMetadataId(Integer metadataId) {
    this.metadataId = metadataId;
  }

  public Integer getRecordId() {
    return recordId;
  }

  public void setRecordId(Integer recordId) {
    this.recordId = recordId;
  }

}
