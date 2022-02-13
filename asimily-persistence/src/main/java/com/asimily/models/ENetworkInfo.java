package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Customizer;

import java.util.Objects;

/*
class MyCustomizer implements DescriptorCustomizer {
  public void customize(ClassDescriptor descriptor) {
    descriptor.getQueryManager().setDeleteSQLString("Update raw_on_prem.network_info set processing_state = 0 where id = #ID");
    // Optionally add a query key for status.
    //descriptor.addDirectQueryKey("status", "STATUS");
    
    //DirectToFieldMapping stateMapping = (DirectToFieldMapping)descriptor.getMappingForAttributeName("processingState");
    //ObjectTypeConverter converter = new ObjectTypeConverter();
    //stateMapping.setConverter(converter);
    //genderMapping.setConverter(converter);
  }
}
*/
/**
 * The persistent class for the network_info database table.
 * 
 */
@Entity
@Table(name = "network_info", schema = "raw_on_prem")
//@AdditionalCriteria("this.processingState = 1")
@Customizer(com.asimily.models.SoftDeleteCustomizer.class)
public class ENetworkInfo extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "mac_info_id")
  private Integer macInfo;

  @Column(name = "ip_info_id")
  private Integer ipInfo;

  @Column(name = "port_info_id")
  private Integer portInfoId;

  @Column(name = "service_id")
  private Integer serviceId;

  @Column(name = "service_record_id")
  private Integer serviceRecordId;

  @Column(name = "processing_state")
  private Integer processingState;

  @Column(name = "processing_priority")
  private Integer processingPriority;

  @Column(name = "pkt_capture_id")
  private Integer pktCaptureId;

  @Column(name = "vlan_id")
  private Integer vlanId;

  @Column(name = "l2_l3_proto")
  private String l2L3Proto;
  
  public ENetworkInfo() {
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getMacInfo() {
    return macInfo;
  }

  public void setMacInfo(Integer macInfo) {
    this.macInfo = macInfo;
  }

  public Integer getIpInfo() {
    return ipInfo;
  }

  public void setIpInfo(Integer ipInfo) {
    this.ipInfo = ipInfo;
  }

  public Integer getPortInfoId() {
    return portInfoId;
  }

  public void setPortInfoId(Integer portInfoId) {
    this.portInfoId = portInfoId;
  }

  public Integer getServiceId() {
    return serviceId;
  }

  public void setServiceId(Integer serviceId) {
    this.serviceId = serviceId;
  }

  public Integer getServiceRecordId() {
    return serviceRecordId;
  }

  public void setServiceRecordId(Integer serviceRecordId) {
    this.serviceRecordId = serviceRecordId;
  }

  public Integer getProcessingState() {
    return processingState;
  }

  public void setProcessingState(Integer processingState) {
    this.processingState = processingState;
  }

  public Integer getProcessingPriority() {
    return processingPriority;
  }

  public void setProcessingPriority(Integer processingPriority) {
    this.processingPriority = processingPriority;
  }

  public Integer getPktCaptureId() {
    return pktCaptureId;
  }

  public void setPktCaptureId(Integer pktCaptureId) {
    this.pktCaptureId = pktCaptureId;
  }


  public Integer getVlanId() { return vlanId; }

  public void setVlanId(Integer vlanId) { this.vlanId = vlanId; }

  public String getL2L3Proto() {
    return l2L3Proto;
  }

  public void setL2L3Proto(String l2L3Proto) {
    this.l2L3Proto = l2L3Proto;
  }

  @Override
  public String toString() {
    return "ENetworkInfo{" +
        "macInfo=" + macInfo +
        ", ipInfo=" + ipInfo +
        ", portInfoId=" + portInfoId +
        ", serviceId=" + serviceId +
        ", serviceRecordId=" + serviceRecordId +
        ", processingState=" + processingState +
        ", processingPriority=" + processingPriority +
        ", id=" + id +
        '}';
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ENetworkInfo that = (ENetworkInfo) o;
    return Objects.equals(macInfo, that.macInfo) &&
        Objects.equals(ipInfo, that.ipInfo) &&
        Objects.equals(portInfoId, that.portInfoId) &&
        Objects.equals(serviceId, that.serviceId) &&
        Objects.equals(serviceRecordId, that.serviceRecordId) &&
        Objects.equals(processingState, that.processingState) &&
        Objects.equals(processingPriority, that.processingPriority) &&
        Objects.equals(pktCaptureId, that.pktCaptureId);
  }

  @Override
  public int hashCode() {

    return Objects.hash(macInfo, ipInfo, portInfoId, serviceId, serviceRecordId, processingState, processingPriority, pktCaptureId);
  }
}