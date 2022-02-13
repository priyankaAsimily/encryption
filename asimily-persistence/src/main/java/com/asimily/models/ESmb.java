package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * This is persistent class for table smb_info database table
 * @author richa
 *
 */
@Entity
@Table(name = "smb", schema = "raw_on_prem")
public class ESmb extends ETenantBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "version")
  private String version;

  @Column(name = "browser_host_os_name")
  private String browserHostOsName;

  @Column(name = "browser_host_os_version")
  private String browserHostOsVersion;

  @Column(name = "browser_host_name")
  private String browserHostName;

  @Column(name = "browser_domain_name")
  private String browserDomainName;

  @Column(name = "native_os_name")
  private String nativeOsName;

  @Column(name = "native_os_version")
  private String nativeOsVersion;

  @Column(name = "ntlmssp_type")
  private Integer ntlmsspType;

  @Column(name = "ntlmssp_host_name")
  private String ntlmsspHostName;

  @Column(name = "ntlmssp_domain_name")
  private String ntlmsspDomainName;

  @Column(name = "ntlmssp_user_name")
  private String ntlmsspUserName;

  @Column(name = "ntlmssp_os_version")
  private String ntlmsspOsVersion;

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getBrowserHostOsName() {
    return browserHostOsName;
  }

  public void setBrowserHostOsName(String browser_host_os_name) {
    this.browserHostOsName = browser_host_os_name;
  }

  public String getBrowserHostOsVersion() {
    return browserHostOsVersion;
  }

  public void setBrowserHostOsVersion(String browser_host_os_version) { this.browserHostOsVersion = browser_host_os_version; }

  public String getBrowserHostName() {
    return browserHostName;
  }

  public void setBrowserHostName(String browser_host_name) {
    this.browserHostName = browser_host_name;
  }

  public String getBrowserDomainName() {
    return browserDomainName;
  }

  public void setBrowserDomainName(String browserDomainName) {
    this.browserDomainName = browserDomainName;
  }

  public String getNativeOsName() { return nativeOsName; }

  public void setNativeOsName(String nativeOsName) { this.nativeOsName = nativeOsName; }

  public String getNativeOsVersion() { return nativeOsVersion; }

  public void setNativeOsVersion(String nativeOsVersion) { this.nativeOsVersion = nativeOsVersion; }

  public Integer getNtlmsspType() {
    return ntlmsspType;
  }

  public void setNtlmsspType(Integer ntlmsspType) {
    this.ntlmsspType = ntlmsspType;
  }

  public String getNtlmsspHostName() {
    return ntlmsspHostName;
  }

  public void setNtlmsspHostName(String ntlmsspHostName) {
    this.ntlmsspHostName = ntlmsspHostName;
  }

  public String getNtlmsspDomainName() {
    return ntlmsspDomainName;
  }

  public void setNtlmsspDomainName(String ntlmsspDomainName) {
    this.ntlmsspDomainName = ntlmsspDomainName;
  }

  public String getNtlmsspUserName() {
    return ntlmsspUserName;
  }

  public void setNtlmsspUserName(String ntlmsspUserName) {
    this.ntlmsspUserName = ntlmsspUserName;
  }

  public String getNtlmsspOsVersion() {
    return ntlmsspOsVersion;
  }

  public void setNtlmsspOsVersion(String ntlmsspOsVersion) {
    this.ntlmsspOsVersion = ntlmsspOsVersion;
  }
}
