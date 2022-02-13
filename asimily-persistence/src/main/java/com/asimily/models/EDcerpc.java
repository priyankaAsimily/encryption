package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dcerpc", schema = "raw_on_prem")
public class EDcerpc extends ETenantBase {

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
