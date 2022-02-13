package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the dhcp_options_os_mapping database table.
 * 
 */

@Entity
@Table(name = "dhcp_options_os_mapping", schema = "raw_cloud")

public class EDhcpOptionsOsMapping extends EBase {
  private static final long serialVersionUID = 1L;

  @Column(name = "dhcp_option_code_sequence")
  private String dhcpOptionCodeSeq;

  @Column(name = "os_version_id")
  private String osVersionId;

  @Column(name = "insert_src")
  private String insertSrc;

  public EDhcpOptionsOsMapping() {
  }

  public String getDhcpOptionCodeSeq() {
    return dhcpOptionCodeSeq;
  }

  public void setDhcpOptionCodeSeq(String dhcpOptionCodeSeq) {
    this.dhcpOptionCodeSeq = dhcpOptionCodeSeq;
  }

  public String getOsVersionId() {
    return osVersionId;
  }

  public void setOsVersionId(String osVersionId) {
    this.osVersionId = osVersionId;
  }

  public String getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(String insertSrc) {
    this.insertSrc = insertSrc;
  }

  @Override
  public String toString() {
    return "EDhcpOptionsOsMapping{" +
        "dhcpOptionCodeSeq='" + dhcpOptionCodeSeq + '\'' +
        ", osVersionId='" + osVersionId + '\'' +
        ", insertSrc='" + insertSrc + '\'' +
        '}';
  }
}
