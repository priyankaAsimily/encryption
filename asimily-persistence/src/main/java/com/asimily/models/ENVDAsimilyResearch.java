package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "nvd_asimily_research", schema = "raw_cloud")
public class ENVDAsimilyResearch extends EUUIDBase {

  private static final long serialVersionUID = 1L;

  @Column(name = "nvd_cve_product_id")
  private Integer nvdCveProductId;

  @Column(name = "mfg_severity")
  private String mfgSeverity;

  @Column(name = "seen_in_wild")
  private Boolean seenInWild;

  @Column(name = "exploit_available")
  private Boolean exploitAvailable;

  @Column(name = "exploit_code_maturity")
  private String exploitCodeMaturity;

  @Column(name = "additional_info")
  private String additionalInfo;

  @Column(name = "mfg_link")
  private String mfgLink;

  @Column(name = "patch_available")
  private Boolean patchAvailable;

  @Column(name = "insert_src")
  private Integer insertSrc;

  public Integer getNvdCveProductId() {
    return nvdCveProductId;
  }

  public void setNvdCveProductId(Integer nvdCveProductId) {
    this.nvdCveProductId = nvdCveProductId;
  }

  public String getMfgSeverity() {
    return mfgSeverity;
  }

  public void setMfgSeverity(String mfgSeverity) {
    this.mfgSeverity = mfgSeverity;
  }

  public Boolean getSeenInWild() {
    return seenInWild;
  }

  public void setSeenInWild(Boolean seenInWild) {
    this.seenInWild = seenInWild;
  }

  public Boolean getExploitAvailable() {
    return exploitAvailable;
  }

  public void setExploitAvailable(Boolean exploitAvailable) {
    this.exploitAvailable = exploitAvailable;
  }

  public String getExploitCodeMaturity() {
    return exploitCodeMaturity;
  }

  public void setExploitCodeMaturity(String exploitCodeMaturity) {
    this.exploitCodeMaturity = exploitCodeMaturity;
  }

  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public String getMfgLink() {
    return mfgLink;
  }

  public void setMfgLink(String mfgLink) {
    this.mfgLink = mfgLink;
  }

  public Boolean getPatchAvailable() {
    return patchAvailable;
  }

  public void setPatchAvailable(Boolean patchAvailable) {
    this.patchAvailable = patchAvailable;
  }

  public Integer getInsertSrc() {
    return insertSrc;
  }

  public void setInsertSrc(Integer insertSrc) {
    this.insertSrc = insertSrc;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    String uniqueOn = this.getNvdCveProductId().toString();
    uuid = UUIDType5.nameUUIDFromNamespaceAndString(UUIDType5.NAMESPACE_URL, uniqueOn).toString();
  }

}
