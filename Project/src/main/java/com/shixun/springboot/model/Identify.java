package com.shixun.springboot.model;

import java.util.Date;

public class Identify {
    private String ResultName;    //成果名称
    private String Unit;            //所属单位
    private String Department;  //鉴定部门
    private Date StartTime;   //鉴定时间
    private String Level;  //鉴定级别
    private String CompleteWay;// 完成形式
    private String StudyType;// 学科门类
    private String OneStudy;//一级学科
    private String TwoStudy;//二级学科
    private String ProjectSource;//项目来源
    private String School;//学校署名
    private String CompleteUnit;//完成单位
    private int ID;//鉴定号
    private String Conclusion;//鉴定结论

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

    public Date getStartTime() {
        return StartTime;
    }

    public void setStartTime(Date startTime) {
        StartTime = startTime;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public String getCompleteWay() {
        return CompleteWay;
    }

    public void setCompleteWay(String completeWay) {
        CompleteWay = completeWay;
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

    public String getTwoStudy() {
        return TwoStudy;
    }

    public void setTwoStudy(String twoStudy) {
        TwoStudy = twoStudy;
    }

    public String getProjectSource() {
        return ProjectSource;
    }

    public void setProjectSource(String projectSource) {
        ProjectSource = projectSource;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public String getCompleteUnit() {
        return CompleteUnit;
    }

    public void setCompleteUnit(String completeUnit) {
        CompleteUnit = completeUnit;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getConclusion() {
        return Conclusion;
    }

    public void setConclusion(String conclusion) {
        Conclusion = conclusion;
    }

    @Override
    public String toString() {
        return "Identify{" +
                "ResultName='" + ResultName + '\'' +
                ", Unit='" + Unit + '\'' +
                ", Department='" + Department + '\'' +
                ", StartTime=" + StartTime +
                ", Level='" + Level + '\'' +
                ", CompleteWay='" + CompleteWay + '\'' +
                ", StudyType='" + StudyType + '\'' +
                ", OneStudy='" + OneStudy + '\'' +
                ", TwoStudy='" + TwoStudy + '\'' +
                ", ProjectSource='" + ProjectSource + '\'' +
                ", School='" + School + '\'' +
                ", CompleteUnit='" + CompleteUnit + '\'' +
                ", ID=" + ID +
                ", Conclusion='" + Conclusion + '\'' +
                '}';
    }


}