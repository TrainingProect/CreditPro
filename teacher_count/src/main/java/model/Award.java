package model;

import java.util.Date;

public class Award {

    private String teacherId; //教师工号
    private String AwardName;  //获奖名称
    private String ResultName;  //获奖名称
    private String Unit;  //所属单位
    private String Department;  //发证机关
    private String AwardTime;  //获奖时间
    private String Level1;  //获奖级别
    private String Level2;  //获奖等级
    private String CompleteUnit;  //完成单位
    private String AwardID;  //获奖ID
    private String StudyType;  //学科门类
    private String OneStudy;  //一级学科
    private String ProjectSource;  //项目来源
    private String Kind1;  //成果形式1
    private String Kind2;  //成果形式2
    private String Award;  //奖励类别
    private int AwardNumber;  //获奖人数
    private int CompleteNumber;  //总参加单位数
    private int UnitLevel;  //单位排名

    @Override
    public String toString() {
        return "Award{" +
                "AwardName='" + AwardName + '\'' +
                ", ResultName='" + ResultName + '\'' +
                ", Unit='" + Unit + '\'' +
                ", Department='" + Department + '\'' +
                ", AwardTime='" + AwardTime + '\'' +
                ", Level1='" + Level1 + '\'' +
                ", Level2='" + Level2 + '\'' +
                ", CompleteUnit='" + CompleteUnit + '\'' +
                ", AwardID='" + AwardID + '\'' +
                ", StudyType='" + StudyType + '\'' +
                ", OneStudy='" + OneStudy + '\'' +
                ", ProjectSource='" + ProjectSource + '\'' +
                ", Kind1='" + Kind1 + '\'' +
                ", Kind2='" + Kind2 + '\'' +
                ", Award='" + Award + '\'' +
                ", AwardNumber=" + AwardNumber +
                ", CompleteNumber=" + CompleteNumber +
                ", UnitLevel=" + UnitLevel +
                '}';
    }

    public int getAwardNumber() {
        return AwardNumber;
    }

    public void setAwardNumber(int awardNumber) {
        AwardNumber = awardNumber;
    }

    public int getCompleteNumber() {
        return CompleteNumber;
    }

    public void setCompleteNumber(int completeNumber) {
        CompleteNumber = completeNumber;
    }

    public int getUnitLevel() {
        return UnitLevel;
    }

    public void setUnitLevel(int unitLevel) {
        UnitLevel = unitLevel;
    }
    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getAwardName() {
        return AwardName;
    }

    public void setAwardName(String awardName) {
        AwardName = awardName;
    }

    public String getResultName() {
        return ResultName;
    }

    public void setResultName(String resultName) {
        ResultName = resultName;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getAwardTime() {
        return AwardTime;
    }

    public void setAwardTime(String awardTime) {
        AwardTime = awardTime;
    }

    public String getLevel1() {
        return Level1;
    }

    public void setLevel1(String level1) {
        Level1 = level1;
    }

    public String getLevel2() {
        return Level2;
    }

    public void setLevel2(String level2) {
        Level2 = level2;
    }

    public String getCompleteUnit() {
        return CompleteUnit;
    }

    public void setCompleteUnit(String completeUnit) {
        CompleteUnit = completeUnit;
    }

    public String getAwardID() {
        return AwardID;
    }

    public void setAwardID(String awardID) {
        AwardID = awardID;
    }

    public String getStudyType() {
        return StudyType;
    }

    public void setStudyType(String studyType) {
        StudyType = studyType;
    }

    public String getOneStudy() {
        return OneStudy;
    }

    public void setOneStudy(String oneStudy) {
        OneStudy = oneStudy;
    }

    public String getProjectSource() {
        return ProjectSource;
    }

    public void setProjectSource(String projectSource) {
        ProjectSource = projectSource;
    }

    public String getKind1() {
        return Kind1;
    }

    public void setKind1(String kind1) {
        Kind1 = kind1;
    }

    public String getKind2() {
        return Kind2;
    }

    public void setKind2(String kind2) {
        Kind2 = kind2;
    }

    public String getAward() {
        return Award;
    }

    public void setAward(String award) {
        Award = award;
    }

}
