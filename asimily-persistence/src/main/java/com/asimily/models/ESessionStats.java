package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "session_stats", schema = "raw_on_prem")
public class ESessionStats extends ETenantBase {
  private static final long serialVersionUID = 1L;
  
  @Column(name = "session_id")
  private Integer sessionId;
  
  @Column(name = "rtt")
  private Integer rrt;

  @Column(name = "protocol")
  private String protocol;

  @Column(name = "duration")
  private Integer duration;

  @Column(name = "src_duration")
  private Integer srcDuraion;

  @Column(name = "dst_duration")
  private Integer dstDuration;

  @Column(name = "src_pkts_agg")
  private Integer srcPktsAgg;

  @Column(name = "dst_pkts_agg")
  private Integer dstPktsAgg;

  @Column(name = "src_bytes_agg")
  private Integer srcBytesAgg;

  @Column(name = "dst_bytes_agg")
  private Integer dstBytesAgg;

  @Column(name = "src_ttl")
  private Integer srcTtl;

  @Column(name = "dst_ttl")
  private Integer dstTtl;
  
  @Column(name = "src_bit_rate_avg")
  private Integer srcBitRateAvg;
  
  @Column(name = "dst_bit_rate_avg")
  private Integer dstBitRateAvg;
  
  @Column(name = "src_pkt_rate_avg")
  private Integer srcPktRateAvg;
  
  @Column(name = "dst_pkt_rate_avg")
  private Integer dstPktRateAvg;
  
  @Column(name = "src_inter_pkt_dur_avg")
  private Integer srcInterPktDurAvg;
  
  @Column(name = "dst_inter_pkt_dur_avg")
  private Integer dstInterPktDurAvg;
  
  @Column(name = "src_jitter_avg")
  private Integer srcJitterAvg;
  
  @Column(name = "dst_jitter_avg")
  private Integer dstJitterAvg;
  
  @Column(name = "src_tcp_win_avg")
  private Integer srcTcpWinAvg;
  
  @Column(name = "dst_tcp_win_avg")
  private Integer dstTcpWinAvg;
  
  @Column(name = "src_tcp_base_seq_num")
  private Integer srcTcpBaseSeqNum;
  
  @Column(name = "dst_tcp_base_seq_num")
  private Integer dstTcpBaseSeqNum;
  
  @Column(name = "ct_src_nr")
  private Integer ctSrcNr;
  
  @Column(name = "ct_src_dr")
  private Integer ctSrcDr;
  
  @Column(name = "ct_dst_nr")
  private Integer ctDstNr;
  
  @Column(name = "ct_dst_dr")
  private Integer ctDstDr;
  
  @Column(name = "ct_src_dport_nr")
  private Integer ctSrcDportNr;
  
  @Column(name = "ct_src_dport_dr")
  private Integer ctSrcDportDr;
  
  @Column(name = "ct_dst_sport_nr")
  private Integer ctDstSportNr;
  
  @Column(name = "ct_dst_sport_dr")
  private Integer ctDstSportDr;
  
  @Column(name = "ct_sport_dport_nr")
  private Integer ctSportDportNr;
  
  @Column(name = "ct_sport_dport_dr")
  private Integer ctSportDportDr;
  
  @Column(name = "ct_src_srv_nr")
  private Integer ctSrcSrvNr;
  
  @Column(name = "ct_src_srv_dr")
  private Integer ctSrcSrvDr;
  
  @Column(name = "ct_dst_srv_nr")
  private Integer ctDstSrvNr;
  
  @Column(name = "ct_dst_srv_dr")
  private Integer ctDstSrvDr;
  
}
