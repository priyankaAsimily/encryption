package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * This is persistent class for table session_info database table
 *
 * @author richa
 */
@Entity
@Table(name = "session_info", schema = "raw_on_prem")
public class ESessionInfo extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "src_device_id")
  private Integer srcDeviceId;

  @Column(name = "dst_device_id")
  private Integer dstDeviceId;

  @Column(name = "src_ip")
  private String srcIp;

  @Column(name = "dst_ip")
  private String dstIp;

  @Column(name = "src_port")
  private Integer srcPort;

  @Column(name = "dst_port")
  private Integer dstPort;

  @Column(name = "transport")
  private Integer transport;

  @Column(name = "start_time")
  private Timestamp startTime;

  @Column(name = "end_time")
  private Timestamp endTime;

  @Column(name = "flow_count")
  private Integer flowCount;

  @Column(name = "duration")
  private Integer duration;

  @Column(name = "rtt")
  private Integer rtt;

  @Column(name = "service_id")
  private Integer serviceId;

  @Column(name = "private_data")
  private Boolean privateData;

  @Column(name = "anomaly")
  private Boolean anomaly;

  @Column(name = "anomaly_id")
  private Integer anomalyId;

  @Column(name = "src_mac_addr1")
  private String srcMacAddr1;

  @Column(name = "src_mac_addr2")
  private String srcMacAddr2;

  @Column(name = "dst_mac_addr1")
  private String dstMacAddr1;

  @Column(name = "dst_mac_addr2")
  private String dstMacAddr2;

  @Column(name = "service_name")
  private String serviceName;

  @Column(name = "src_vlan_id")
  private Integer srcVlanId;

  @Column(name = "dst_vlan_id")
  private Integer dstVlanId;

  @Column(name = "pkt_capture_id")
  private Integer pktCaptureId;

  @Column(name = "ip_reuse_zone")
  private Integer ipReuseZone;

  public Integer getSrcDeviceId() {
    return srcDeviceId;
  }

  public void setSrcDeviceId(Integer srcDeviceId) {
    this.srcDeviceId = srcDeviceId;
  }

  public Integer getDstDeviceId() {
    return dstDeviceId;
  }

  public void setDstDeviceId(Integer dstDeviceId) {
    this.dstDeviceId = dstDeviceId;
  }

  public String getSrcIp() {
    return srcIp;
  }

  public void setSrcIp(String srcIp) {
    this.srcIp = srcIp;
  }

  public String getDstIp() {
    return dstIp;
  }

  public void setDstIp(String dstIp) {
    this.dstIp = dstIp;
  }

  public Integer getSrcPort() {
    return srcPort;
  }

  public void setSrcPort(Integer srcPort) {
    this.srcPort = srcPort;
  }

  public Integer getDstPort() {
    return dstPort;
  }

  public void setDstPort(Integer dstPort) {
    this.dstPort = dstPort;
  }

  public Integer getTransport() {
    return transport;
  }

  public void setTransport(Integer transport) {
    this.transport = transport;
  }

  public Timestamp getStartTime() {
    return startTime;
  }

  public void setStartTime(Timestamp startTime) {
    this.startTime = startTime;
  }

  public Timestamp getEndTime() {
    return endTime;
  }

  public void setEndTime(Timestamp endTime) {
    this.endTime = endTime;
  }

  public Integer getFlowCount() {
    return flowCount;
  }

  public void setFlowCount(Integer flowCount) {
    this.flowCount = flowCount;
  }

  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public Integer getRtt() {
    return rtt;
  }

  public void setRtt(Integer rtt) {
    this.rtt = rtt;
  }

  public Integer getServiceId() {
    return serviceId;
  }

  public void setServiceId(Integer serviceId) {
    this.serviceId = serviceId;
  }

  public Boolean getPrivateData() {
    return privateData;
  }

  public void setPrivateData(Boolean privateData) {
    this.privateData = privateData;
  }

  public Boolean getAnomaly() {
    return anomaly;
  }

  public void setAnomaly(Boolean anomaly) {
    this.anomaly = anomaly;
  }

  public Integer getAnomalyId() {
    return anomalyId;
  }

  public void setAnomalyId(Integer anomalyId) {
    this.anomalyId = anomalyId;
  }

  public String getSrcMacAddr1() {
    return srcMacAddr1;
  }

  public void setSrcMacAddr1(String srcMacAddr1) {
    this.srcMacAddr1 = srcMacAddr1;
  }

  public String getSrcMacAddr2() {
    return srcMacAddr2;
  }

  public void setSrcMacAddr2(String srcMacAddr2) {
    this.srcMacAddr2 = srcMacAddr2;
  }

  public String getDstMacAddr1() {
    return dstMacAddr1;
  }

  public void setDstMacAddr1(String dstMacAddr1) {
    this.dstMacAddr1 = dstMacAddr1;
  }

  public String getDstMacAddr2() {
    return dstMacAddr2;
  }

  public void setDstMacAddr2(String dstMacAddr2) {
    this.dstMacAddr2 = dstMacAddr2;
  }

  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public Integer getSrcVlanId() {
    return srcVlanId;
  }

  public void setSrcVlanId(Integer srcVlanId) {
    this.srcVlanId = srcVlanId;
  }

  public Integer getDstVlanId() {
    return dstVlanId;
  }

  public void setDstVlanId(Integer dstVlanId) {
    this.dstVlanId = dstVlanId;
  }

  public Integer getPktCaptureId() {
    return pktCaptureId;
  }

  public void setPktCaptureId(Integer pktCaptureId) {
    this.pktCaptureId = pktCaptureId;
  }

  public Integer getIpReuseZone() {
    return ipReuseZone;
  }

  public void setIpReuseZone(Integer ipReuseZone) {
    this.ipReuseZone = ipReuseZone;
  }

  @Override
  public String toString() {
    return "ESessionInfo {srcDeviceId=" + srcDeviceId + ", dstDeviceId="
        + dstDeviceId + ", srcIp=" + srcIp + ", dstIp=" + dstIp + ", srcPort="
        + srcPort + ", dstPort=" + dstPort + ", transport=" + transport
        + ", startTime=" + startTime + ", endTime=" + endTime + ", flowCount="
        + flowCount + ", duration=" + duration + ", rtt=" + rtt + ", serviceId="
        + serviceId + ", privateData=" + privateData + ", anomaly=" + anomaly
        + ", anomalyId=" + anomalyId + "}";
  }

}
