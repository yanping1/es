package com.dkha.es.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * <p>
 * 劳动力表--存放全区的劳动力信息
 * </p>
 *
 * @author Spring
 * @since 2019-09-12
 */

public class Labor {

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getIdLabor() {
        return idLabor;
    }

    public void setIdLabor(String idLabor) {
        this.idLabor = idLabor;
    }

    public String getIdDictEducation() {
        return idDictEducation;
    }

    public void setIdDictEducation(String idDictEducation) {
        this.idDictEducation = idDictEducation;
    }

    public String getIdDictNation() {
        return idDictNation;
    }

    public void setIdDictNation(String idDictNation) {
        this.idDictNation = idDictNation;
    }

    public String getIdDictFamilyNature() {
        return idDictFamilyNature;
    }

    public void setIdDictFamilyNature(String idDictFamilyNature) {
        this.idDictFamilyNature = idDictFamilyNature;
    }

    public String getIdDictMarriageStatus() {
        return idDictMarriageStatus;
    }

    public void setIdDictMarriageStatus(String idDictMarriageStatus) {
        this.idDictMarriageStatus = idDictMarriageStatus;
    }

    public String getIdDictPolitical() {
        return idDictPolitical;
    }

    public void setIdDictPolitical(String idDictPolitical) {
        this.idDictPolitical = idDictPolitical;
    }

    public String getIdDictAreaCity() {
        return idDictAreaCity;
    }

    public void setIdDictAreaCity(String idDictAreaCity) {
        this.idDictAreaCity = idDictAreaCity;
    }

    public String getIdDictAreaCounty() {
        return idDictAreaCounty;
    }

    public void setIdDictAreaCounty(String idDictAreaCounty) {
        this.idDictAreaCounty = idDictAreaCounty;
    }

    public String getIdDictAreaTown() {
        return idDictAreaTown;
    }

    public void setIdDictAreaTown(String idDictAreaTown) {
        this.idDictAreaTown = idDictAreaTown;
    }

    public String getIdDictAreaStreet() {
        return idDictAreaStreet;
    }

    public void setIdDictAreaStreet(String idDictAreaStreet) {
        this.idDictAreaStreet = idDictAreaStreet;
    }

    public String getIdDictAreaProvince() {
        return idDictAreaProvince;
    }

    public void setIdDictAreaProvince(String idDictAreaProvince) {
        this.idDictAreaProvince = idDictAreaProvince;
    }

    public String getID_BATCH_WORK() {
        return ID_BATCH_WORK;
    }

    public void setID_BATCH_WORK(String ID_BATCH_WORK) {
        this.ID_BATCH_WORK = ID_BATCH_WORK;
    }

    public String getIdBatchWork() {
        return idBatchWork;
    }

    public void setIdBatchWork(String idBatchWork) {
        this.idBatchWork = idBatchWork;
    }

    public String getEducationBackUp() {
        return educationBackUp;
    }

    public void setEducationBackUp(String educationBackUp) {
        this.educationBackUp = educationBackUp;
    }

    public String getNationBackUp() {
        return nationBackUp;
    }

    public void setNationBackUp(String nationBackUp) {
        this.nationBackUp = nationBackUp;
    }

    public String getFamilyNatureBackUp() {
        return familyNatureBackUp;
    }

    public void setFamilyNatureBackUp(String familyNatureBackUp) {
        this.familyNatureBackUp = familyNatureBackUp;
    }

    public String getMarriageStatusBackUp() {
        return marriageStatusBackUp;
    }

    public void setMarriageStatusBackUp(String marriageStatusBackUp) {
        this.marriageStatusBackUp = marriageStatusBackUp;
    }

    public String getPoliticalBackUp() {
        return politicalBackUp;
    }

    public void setPoliticalBackUp(String politicalBackUp) {
        this.politicalBackUp = politicalBackUp;
    }

    public String getAreaBackUp() {
        return areaBackUp;
    }

    public void setAreaBackUp(String areaBackUp) {
        this.areaBackUp = areaBackUp;
    }

    public static String getLoginAccount() {
        return LOGIN_ACCOUNT;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public String getFamilyNo() {
        return familyNo;
    }

    public void setFamilyNo(String familyNo) {
        this.familyNo = familyNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public static String getIdCard() {
        return ID_CARD;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public static String getContactPhone() {
        return CONTACT_PHONE;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public String getIsSignContract() {
        return isSignContract;
    }

    public void setIsSignContract(String isSignContract) {
        this.isSignContract = isSignContract;
    }

    public String getIsOnWorking() {
        return isOnWorking;
    }

    public void setIsOnWorking(String isOnWorking) {
        this.isOnWorking = isOnWorking;
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public String getIsPoor() {
        return isPoor;
    }

    public void setIsPoor(String isPoor) {
        this.isPoor = isPoor;
    }

    public String getSocialSecurityStatus() {
        return socialSecurityStatus;
    }

    public void setSocialSecurityStatus(String socialSecurityStatus) {
        this.socialSecurityStatus = socialSecurityStatus;
    }

    public static String getAlarmType() {
        return ALARM_TYPE;
    }

    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }

    public String getIsIncome() {
        return isIncome;
    }

    public void setIsIncome(String isIncome) {
        this.isIncome = isIncome;
    }

    public String getIsDailyTimeStatistics() {
        return isDailyTimeStatistics;
    }

    public void setIsDailyTimeStatistics(String isDailyTimeStatistics) {
        this.isDailyTimeStatistics = isDailyTimeStatistics;
    }

    private String isValid;

    private String createBy;

    private String updateBy;

    private Date createTime;

    private Date updateTime;
    private String idLabor;

    private String idDictEducation;

    private String idDictNation;

    private String idDictFamilyNature;

    private String idDictMarriageStatus;

    private String idDictPolitical;

    private String idDictAreaCity;

    private String idDictAreaCounty;

    private String idDictAreaTown;

    private String idDictAreaStreet;

    private String idDictAreaProvince;

    public String ID_BATCH_WORK = "id_batch_work";
    private String idBatchWork;

    private String educationBackUp;

    private String nationBackUp;

    private String familyNatureBackUp;

    private String marriageStatusBackUp;

    private String politicalBackUp;

    private String areaBackUp;

    public static final String LOGIN_ACCOUNT = "login_account";
    private String loginAccount;

    private String familyNo;

    private String name;

    private String sex;

    @JsonFormat(pattern = "yy-MM-dd")
    private Date birthDate;

    public static final String ID_CARD = "id_card_no";
    private String idCardNo;

    private String permanentAddress;

    public static final String CONTACT_PHONE = "contact_phone";
    private String contactPhone;

    private String healthStatus;

    private String isSignContract;

    private String isOnWorking;

    private Date inputTime;

    private String isPoor;

    private String socialSecurityStatus;


    public static final String ALARM_TYPE = "alarm_type";
    private String alarmType;

    private String isIncome;

    private String isDailyTimeStatistics;

}
