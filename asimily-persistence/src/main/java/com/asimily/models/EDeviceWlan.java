package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.asimily.models.EBase;

@Entity
@Table(name = "device_wlan", schema = "portal")
public class EDeviceWlan extends EBase {

  @Id
  @Column(name = "customer_id")
  private Integer customerId;

  @Id
  @Column(name = "device_info_id")
  private Integer deviceInfoId;

  @Column(name = "is_sender")
  private boolean isSender;

  @Column(name = "ssid")
  private String ssid;

  @Column(name = "supported_rates")
  private String supportedRates;

  @Column(name = "min_tx_power")
  private Integer minTxPower;

  @Column(name = "max_tx_power")
  private Integer maxTxPower;

  @Column(name = "supported_channels")
  private String supportedChannels;

  @Column(name = "high_throughput_support")
  private boolean highThroughputSupport;

  @Column(name = "mhz40_support")
  private boolean mhz40Support;

  @Column(name = "tx_stbc_support")
  private boolean txStbcSupport;

  @Column(name = "rx_stbc_support")
  private boolean rxStbcSupport;

  @Column(name = "max_rx_data_rate")
  private Integer maxRxDataRate;

  @Column(name = "group_cipher_suite")
  private String groupCipherSuite;

  @Column(name = "pairwise_cipher_suite_list")
  private String pairwiseCipherSuiteList;

  @Column(name = "akm_suite_list")
  private String akmSuiteList;

  @Column(name = "rsn_capabilities")
  private String rsnCapabilities;

  @Column(name = "extended_supported_rates")
  private String extendedSupportedRates;

  @Column(name = "primary_channel")
  private Integer primaryChannel;

  @Column(name = "secondary_channel_offset")
  private String secondaryChannelOffset;

  @Column(name = "vendor_field_1")
  private String vendorField1;

  @Column(name = "metadata_id")
  private Integer metadataId;

  @Column(name = "record_id")
  private Integer recordId;

  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public Integer getDeviceInfoId() {
    return deviceInfoId;
  }

  public void setDeviceInfoId(Integer deviceInfoId) {
    this.deviceInfoId = deviceInfoId;
  }

  public boolean getIsSender() {
    return isSender;
  }

  public void setIsSender(boolean isSender) {
    this.isSender = isSender;
  }

  public String getSsid() {
    return ssid;
  }

  public void setSsid(String ssid) {
    this.ssid = ssid;
  }

  public String getSupportedRates() {
    return supportedRates;
  }

  public void setSupportedRates(String supportedRates) {
    this.supportedRates = supportedRates;
  }

  public Integer getMinTxPower() {
    return minTxPower;
  }

  public void setMinTxPower(Integer minTxPower) {
    this.minTxPower = minTxPower;
  }

  public Integer getMaxTxPower() {
    return maxTxPower;
  }

  public void setMaxTxPower(Integer maxTxPower) {
    this.maxTxPower = maxTxPower;
  }

  public String getSupportedChannels() {
    return supportedChannels;
  }

  public void setSupportedChannels(String supportedChannels) {
    this.supportedChannels = supportedChannels;
  }

  public String getGroupCipherSuite() {
    return groupCipherSuite;
  }

  public void setGroupCipherSuite(String groupCipherSuite) {
    this.groupCipherSuite = groupCipherSuite;
  }

  public String getPairwiseCipherSuiteList() {
    return pairwiseCipherSuiteList;
  }

  public void setPairwiseCipherSuiteList(String pairwiseCipherSuiteList) {
    this.pairwiseCipherSuiteList = pairwiseCipherSuiteList;
  }

  public String getAkmSuiteList() {
    return akmSuiteList;
  }

  public void setAkmSuiteList(String akmSuiteList) {
    this.akmSuiteList = akmSuiteList;
  }

  public String getRsnCapabilities() {
    return rsnCapabilities;
  }

  public void setRsnCapabilities(String rsnCapabilities) {
    this.rsnCapabilities = rsnCapabilities;
  }

  public String getExtendedSupportedRates() {
    return extendedSupportedRates;
  }

  public void setExtendedSupportedRates(String extendedSupportedRates) {
    this.extendedSupportedRates = extendedSupportedRates;
  }

  public String getSecondaryChannelOffset() {
    return secondaryChannelOffset;
  }

  public void setSecondaryChannelOffset(String secondaryChannelOffset) {
    this.secondaryChannelOffset = secondaryChannelOffset;
  }

  public String getVendorField1() {
    return vendorField1;
  }

  public void setVendorField1(String vendorField1) {
    this.vendorField1 = vendorField1;
  }

  public Integer getMaxRxDataRate() {
    return maxRxDataRate;
  }

  public void setMaxRxDataRate(Integer maxRxDataRate) {
    this.maxRxDataRate = maxRxDataRate;
  }

  public Integer getPrimaryChannel() {
    return primaryChannel;
  }

  public void setPrimaryChannel(Integer primaryChannel) {
    this.primaryChannel = primaryChannel;
  }

  public boolean getHighThroughputSupport() {
    return highThroughputSupport;
  }

  public void setHighThroughputSupport(boolean highThroughputSupport) {
    this.highThroughputSupport = highThroughputSupport;
  }

  public boolean getMhz40Support() {
    return mhz40Support;
  }

  public void setMhz40Support(boolean mhz40Support) {
    this.mhz40Support = mhz40Support;
  }

  public boolean getTxStbcSupport() {
    return txStbcSupport;
  }

  public void setTxStbcSupport(boolean txStbcSupport) {
    this.txStbcSupport = txStbcSupport;
  }

  public boolean getRxStbcSupport() {
    return rxStbcSupport;
  }

  public void setRxStbcSupport(boolean rxStbcSupport) {
    this.rxStbcSupport = rxStbcSupport;
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

  @Override
  public String toString() {
    return "EDeviceWlan{" +
    "isSender='" + isSender + '\'' +
    ", ssid='" + ssid + '\'' +
    ", supportedRates='" + supportedRates + '\'' +
    ", minTxPower='" + minTxPower + '\'' +
    ", maxTxPower='" + maxTxPower + '\'' +
    ", supportedChannels='" + supportedChannels + '\'' +
    ", groupCipherSuite='" + groupCipherSuite + '\'' +
    ", pairwiseCipherSuiteList='" + pairwiseCipherSuiteList + '\'' +
    ", akmSuiteList='" + akmSuiteList + '\'' +
    ", rsnCapabilities='" + rsnCapabilities + '\'' +
    ", extendedSupportedRates='" + extendedSupportedRates + '\'' +
    ", secondaryChannelOffset='" + secondaryChannelOffset + '\'' +
    ", vendorField1='" + vendorField1 + '\'' +
    ", maxRxDataRate='" + maxRxDataRate + '\'' +
    ", primaryChannel='" + primaryChannel + '\'' +
    ", highThroughputSupport='" + highThroughputSupport + '\'' +
    ", mhz40Support='" + mhz40Support + '\'' +
    ", txStbcSupport='" + txStbcSupport + '\'' +
    ", rxStbcSupport='" + rxStbcSupport + '\'' +
      '}';
  }

}
