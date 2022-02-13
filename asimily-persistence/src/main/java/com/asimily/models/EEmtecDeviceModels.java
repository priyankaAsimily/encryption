package com.asimily.models;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;


@Entity
@Table(name = "emtec_device_models", schema = "raw_cloud")
public class EEmtecDeviceModels extends EUUIDBase{
    private static final long serialVersionUID = 1L;

@Column(name = "device_code")
private String deviceCode;

@Column(name = "device_name")
private String deviceName;

@Column(name = "device_model_id")
private Integer deviceModelId;

@Column(name = "device_model_code")
private String deviceModelCode;

@Column(name = "device_model_code8")
private String deviceModelCode8;

@Column(name = "device_model")
private String deviceModel;

@Column(name = "device_model_unique")
private String deviceModelUnique;

@Column(name = "mpbetrv")
private String mpbetrv;

@Column(name = "umdns_code")
private String umdnsCode;

@Column(name = "umdns_term")
private String umdnsTerm;

@Column(name = "manufacturer_code")
private Integer manufacturerCode;

@Column(name = "manufacturer")
private String manufacturer;

@Column(name = "manufacturer_addition")
private String manufacturerAddition;

@Column(name = "manufacturer_unique")
private String manufacturerUnique;

@Column(name = "ce_mark")
private String ceMark;

@Column(name = "has_ce_mark")
private Boolean hasCeMark;

@Column(name = "wast_heat")
private BigDecimal wastHeat;

@Column(name = "wast_heat_unit")
private String wastHeatUnit;

@Column(name = "voltage")
private BigDecimal voltage;

@Column(name = "voltage_unit")
private String voltageUnit;

@Column(name = "voltage_to")
private BigDecimal voltageTo;

@Column(name = "voltage_to_unit")
private String voltageToUnit;

@Column(name = "electrical_power")
private BigDecimal electricalPower;

@Column(name = "electrical_power_unit")
private String electricalPowerUnit;

@Column(name = "electrical_power_to")
private BigDecimal electricalPowerTo;

@Column(name = "electrical_power_to_unit")
private String electricalPowerToUnit;

@Column(name = "max_current_consumption")
private BigDecimal maxCurrentConsumption;

@Column(name = "max_current_consumption_unit")
private String maxCurrentConsumptionUnit;

@Column(name = "max_current_consumption_to")
private BigDecimal maxCurrentConsumptionTo;

@Column(name = "max_current_consumption_to_unit")
private String maxCurrentConsumptionToUnit;

@Column(name = "stk")
private String stk;

@Column(name = "stk_mpbetreibv")
private String stkMpbetreibv;

@Column(name = "stk_mpbetreibv_interval")
private String stkMpbetreibvInterval;

@Column(name = "stk_mpbetreibv_unit")
private String stkMpbetreibvUnit;

@Column(name = "stk_interval")
private BigDecimal stkInterval;

@Column(name = "stk_unit")
private String stkUnit;

@Column(name = "mtk")
private String mtk;

@Column(name = "mtk_interval")
private BigDecimal mtkInterval;

@Column(name = "mtk_unit")
private String mtkUnit;

@Column(name = "calibration_class")
private String calibrationClass;

@Column(name = "calibration")
private String calibration;

@Column(name = "calibration_interval")
private String calibrationInterval;

@Column(name = "calibration_unit")
private String calibrationUnit;

@Column(name = "appraisers_check")
private String appraisersCheck;

@Column(name = "appraisers_check_interval")
private BigDecimal appraisersCheckInterval;

@Column(name = "appraisers_check_unit")
private String appraisersCheckUnit;

@Column(name = "radiation_protection_report")
private String radiationProtectionReport;

@Column(name = "radiation_protection_report_interval")
private BigDecimal radiationProtectionReportInterval;

@Column(name = "radiation_protection_report_unit")
private String radiationProtectionReportUnit;

@Column(name = "bgva3")
private String bgva3;

@Column(name = "bgr500")
private String bgr500;

@Column(name = "maintenance")
private String maintenance;

@Column(name = "maintenance_interval1")
private BigDecimal maintenanceInterval1;

@Column(name = "maintenance_unit1")
private String maintenanceUnit1;

@Column(name = "maintenance_interval2")
private BigDecimal maintenanceInterval2;

@Column(name = "maintenance_unit2")
private String maintenanceUnit2;

@Column(name = "inspection")
private String inspection;

@Column(name = "inspection_interval")
private BigDecimal inspectionInterval;

@Column(name = "inspection_unit")
private String inspectionUnit;

@Column(name = "mpg_class")
private String mpgClass;

@Column(name = "year_of_construction")
private String yearOfConstruction;

@Column(name = "service_info_from")
private String serviceInfoFrom;

@Column(name = "end_of_service")
private String endOfService;

@Column(name = "end_of_service_date")
private String endOfServiceDate;

@Column(name = "end_of_service_comment")
private String endOfServiceComment;

@Column(name = "end_of_service2")
private String endOfService2;

@Column(name = "protection_class")
private String protectionClass;

@Column(name = "application_type")
private String applicationType;

@Column(name = "alert_link")
private String alert_link;

@Column(name = "abandoned")
private String abandoned;

@Column(name = "create_date")
private Timestamp createDate;

@Column(name = "last_edit_date")
private Timestamp lastEditDate;

public EEmtecDeviceModels() {

}

public String getDeviceModel(){
    return deviceModel;
}

public void setDeviceModel(String devicemodel){
    this.deviceModel = devicemodel;
}

public String getManufacturer() {
    return manufacturer;
}

public void setManufacturer(String manufacturer){
    this.manufacturer = manufacturer;
}

public String getDeviceName() {
    return deviceName;
}

public void setDeviceName(String devicename){
    this.deviceName = devicename;
}
}
