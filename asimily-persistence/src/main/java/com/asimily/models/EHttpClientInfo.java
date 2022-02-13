package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the http_client_info database table.
 * 
 */
@Entity
@Table(name = "http_client_info", schema = "raw_on_prem")
public class EHttpClientInfo extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "host_type_id")
  private Integer hostTypeId;

  @Column(name = "os_id")
  private Integer osId;

  @Column(name = "platform_id")
  private Integer platformId;

  @Column(name = "ip_addr_id")
  private Integer ipAddrId;

  @Column(name = "mac_addr_id")
  private Integer macAddrId;
  
  @Column(name = "browser_id")
  private String browserId;

  @Column(name = "processing_priority")
  private Integer processingPriority;

  @Column(name = "processing_state")
  private Integer processingState;

  @Column(name = "auth_realm")
  private String authRealm;

  @Column(name = "x_flash")
  private String xflash;

  @Column(name = "office_suite_name")
  private String officeSuiteName;

  @Column(name = "office_suite_version")
  private String officeSuiteVersion;

  @Column(name = "word_proc_name")
  private String wordProcName;

  @Column(name = "word_proc_version")
  private String wordProcVersion;

  @Column(name = "mail_name")
  private String mailName;

  @Column(name = "mail_version")
  private String mailVersion;

  @Column(name = "server_name")
  private String serverName;

  @Column(name = "server_version")
  private String serverVersion;

  @Column(name = "user_agent")
  private String userAgent;

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

  @Column(name = "pkt_capture_id")
  private Integer pktCaptureId;

  public EHttpClientInfo() {
  }

  public Integer getHostTypeId() {
    return this.hostTypeId;
  }

  public void setHostTypeId(Integer hostTypeId) {
    this.hostTypeId = hostTypeId;
  }

  public Integer getProcessingPriority() {
    return this.processingPriority;
  }

  public void setProcessingPriority(Integer processingPriority) {
    this.processingPriority = processingPriority;
  }

  public Integer getProcessingState() {
    return this.processingState;
  }

  public void setProcessingState(Integer processingState) {
    this.processingState = processingState;
  }

  public Integer getOsId() {
    return osId;
  }

  public void setOsId(Integer osId) {
    this.osId = osId;
  }

  public Integer getPlatformId() {
    return platformId;
  }

  public void setPlatformId(Integer platformId) {
    this.platformId = platformId;
  }

  public Integer getIpAddrId() {
    return ipAddrId;
  }

  public void setIpAddrId(Integer ipAddrId) {
    this.ipAddrId = ipAddrId;
  }

  public Integer getMacAddrId() {
    return macAddrId;
  }

  public void setMacAddrId(Integer macAddrId) {
    this.macAddrId = macAddrId;
  }

  public String getBrowserId() {
    return browserId;
  }

  public void setBrowserId(String browserId) {
    this.browserId = browserId;
  }

  public String getAuthRealm() {
    return authRealm;
  }

  public void setAuthRealm(String authRealm) {
    this.authRealm = authRealm;
  }

  public String getXflash() {
    return xflash;
  }

  public void setXflash(String xflash) {
    this.xflash = xflash;
  }

  public String getOfficeSuiteName() {
    return officeSuiteName;
  }

  public void setOfficeSuiteName(String officeSuiteName) {
    this.officeSuiteName = officeSuiteName;
  }

  public String getOfficeSuiteVersion() {
    return officeSuiteVersion;
  }

  public void setOfficeSuiteVersion(String officeSuiteVersion) {
    this.officeSuiteVersion = officeSuiteVersion;
  }

  public String getWordProcName() {
    return wordProcName;
  }

  public void setWordProcName(String wordProcName) {
    this.wordProcName = wordProcName;
  }

  public String getWordProcVersion() {
    return wordProcVersion;
  }

  public void setWordProcVersion(String wordProcVersion) {
    this.wordProcVersion = wordProcVersion;
  }

  public String getMailName() {
    return mailName;
  }

  public void setMailName(String mailName) {
    this.mailName = mailName;
  }

  public String getMailVersion() {
    return mailVersion;
  }

  public void setMailVersion(String mailVersion) {
    this.mailVersion = mailVersion;
  }

  public String getServerName() {
    return serverName;
  }

  public void setServerName(String serverName) {
    this.serverName = serverName;
  }

  public String getServerVersion() {
    return serverVersion;
  }

  public void setServerVersion(String serverVersion) {
    this.serverVersion = serverVersion;
  }

  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
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

  public String getNttlmsspMsg() {
    return nttlmsspMsg;
  }

  public void setNttlmsspMsg(String nttlmsspMsg) {
    this.nttlmsspMsg = nttlmsspMsg;
  }

  public byte[] getCertAlgId() {
    return this.certAlgId;
  }

  public byte[] getXmlPayload() {
    return this.xmlPayload;
  }

  public void setXmlPayload(byte[] xmlPayload) {
    this.xmlPayload = xmlPayload;
  }

  public void setCertAlgId(byte[] certAlgId) {
    this.certAlgId = certAlgId;
  }

  public Integer getPktCaptureId() {
    return pktCaptureId;
  }

  public void setPktCaptureId(Integer pktCaptureId) {
    this.pktCaptureId = pktCaptureId;
  }
}
