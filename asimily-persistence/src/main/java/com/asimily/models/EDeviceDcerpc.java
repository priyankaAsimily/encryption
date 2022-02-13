package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.asimily.models.EBase;

@Entity
@Table(name = "device_dcerpc", schema = "portal")
public class EDeviceDcerpc extends ETenantBase {

  @Id
  @Column(name = "device_info_id")
  private Integer deviceInfoId;

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
