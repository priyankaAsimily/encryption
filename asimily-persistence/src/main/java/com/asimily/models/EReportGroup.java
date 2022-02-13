package com.asimily.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "report_page_group_map", schema = "raw_cloud")
public class EReportGroup extends EBase {

        private static final long serialVersionUID = 1L;

        @Column(name = "report_type")
        private String reportType;

        @Column(name = "group_name")
        private String groupName;

        public String getReportType() {
                return reportType;
        }

        public void setReportType(String reportType) {
                this.reportType = reportType;
        }

        public String getGroupName() {
                return groupName;
        }

        public void setGroupName(String groupName) {
                this.groupName = groupName;
        }
}
