package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "device_http", schema = "portal")
public class EDeviceHttp extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "mac_addr")
  private String macAddr;

  @Column(name = "ip_addr")
  private String ipAddr;

  @Column(name = "host_name")
  private String hostName;

  @Column(name = "request_target")
  private String requestTarget;

  @Column(name = "host_os_name")
  private String hostOsName;

  @Column(name = "host_os_version")
  private String hostOsVersion;

  @Column(name = "user_agent")
  private String userAgent;

  @Column(name = "auth_realm")
  private String authRealm;

  @Column(name = "x_flash")
  private String xFlash;

  @Column(name = "server_str")
  private String serverStr;

  @Column(name = "http_version")
  private String httpVersion;

  @Column(name = "missing_browser_name")
  private String missingBrowserName;

  @Column(name = "missing_browser_version")
  private String missingBrowserVersion;

  @Column(name = "x_powered_by")
  private String xPoweredBy;

  @Column(name = "x_asp_net_version")
  private String xAspNetVersion;

  @Column(name = "microsoft_share_point_team_services")
  private String microsoftSharePointTeamServices;

  @Column(name = "nttlmssp_msg")
  private String nttlmsspMsg;

  @Column(name = "cert_alg_id")
  private byte[] certAlgId;

  @Column(name = "xml_payload")
  private byte[] xmlPayload;

  @Column(name = "patterns")
  private String patterns;

  @Column(name = "metadata_id")
  private Integer metadataId;
  
  @Column(name = "record_id")
  private Integer recordId;
  
  @Column(name = "ip_reuse_zone")
  private Integer ipReuseZone;

  public static long getSerialVersionUID() {
    return serialVersionUID;
  }

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public String getRequestTarget() {
    return requestTarget;
  }

  public void setRequestTarget(String requestTarget) {
    this.requestTarget = requestTarget;
  }

  public String getHostOsName() {
    return hostOsName;
  }

  public void setHostOsName(String hostOsName) {
    this.hostOsName = hostOsName;
  }

  public String getHostOsVersion() {
    return hostOsVersion;
  }

  public void setHostOsVersion(String hostOsVersion) {
    this.hostOsVersion = hostOsVersion;
  }

  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public String getAuthRealm() {
    return authRealm;
  }

  public void setAuthRealm(String authRealm) {
    this.authRealm = authRealm;
  }

  public String getxFlash() {
    return xFlash;
  }

  public void setxFlash(String xFlash) {
    this.xFlash = xFlash;
  }

  public String getServerStr() {
    return serverStr;
  }

  public void setServerStr(String serverStr) {
    this.serverStr = serverStr;
  }

  public String getHttpVersion() {
    return httpVersion;
  }

  public void setHttpVersion(String httpVersion) {
    this.httpVersion = httpVersion;
  }

  public String getMissingBrowserName() {
    return missingBrowserName;
  }

  public void setMissingBrowserName(String missingBrowserName) {
    this.missingBrowserName = missingBrowserName;
  }

  public String getMissingBrowserVersion() {
    return missingBrowserVersion;
  }

  public void setMissingBrowserVersion(String missingBrowserVersion) {
    this.missingBrowserVersion = missingBrowserVersion;
  }

  public String getXPoweredBy() {
    return xPoweredBy;
  }

  public void setXPoweredBy(String xPoweredBy) {
    this.xPoweredBy = xPoweredBy;
  }

  public String getXAspNetVersion() {
    return xAspNetVersion;
  }

  public void setXAspNetVersion(String xAspNetVersion) {
    this.xAspNetVersion = xAspNetVersion;
  }

  public String getMicrosoftSharePointTeamServices() {
    return microsoftSharePointTeamServices;
  }

  public void setMicrosoftSharePointTeamServices(String microsoftSharePointTeamServices) {
    this.microsoftSharePointTeamServices = microsoftSharePointTeamServices;
  }

  public String getMacAddr() {
    return macAddr;
  }

  public void setMacAddr(String macAddr) {
    this.macAddr = macAddr;
  }

  public String getIpAddr() {
    return ipAddr;
  }

  public void setIpAddr(String ipAddr) {
    this.ipAddr = ipAddr;
  }

  public String getxPoweredBy() {
    return xPoweredBy;
  }

  public void setxPoweredBy(String xPoweredBy) {
    this.xPoweredBy = xPoweredBy;
  }

  public String getxAspNetVersion() {
    return xAspNetVersion;
  }

  public void setxAspNetVersion(String xAspNetVersion) {
    this.xAspNetVersion = xAspNetVersion;
  }

  public String getNttlmsspMsg() {
    return nttlmsspMsg;
  }

  public void setNttlmsspMsg(String nttlmsspMsg) {
    this.nttlmsspMsg = nttlmsspMsg;
  }

  public byte[] getCertAlgId() {
    return certAlgId;
  }

  public void setCertAlgId(byte[] certAlgId) {
    this.certAlgId = certAlgId;
  }

  public byte[] getXmlPayload() {
    return xmlPayload;
  }

  public void setXmlPayload(byte[] xmlPayload) {
    this.xmlPayload = xmlPayload;
  }

  public String getPatterns() {
    return patterns;
  }

  public void setPatterns(String patterns) {
    this.patterns = patterns;
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

  public Integer getIpReuseZone() {
    return ipReuseZone;
  }

  public void setIpReuseZone(Integer ipReuseZone) {
    this.ipReuseZone = ipReuseZone;
  }
}
