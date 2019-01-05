package com.shixun.springboot.model;

public class Project {
    private String ID;//项目编号
    private String ResultName;//验收项目名称
    private String Unit;//所属单位
    private String ProjectUnit;//结题单位
    private String EndTime;//结题时间
    private boolean IfApply;//是否被应用
    private String StudyType;//学科门类
    private String ApplyObject;//应用对象
    private String OneStudy;//一级学科
    private String ProjectSource;//项目来源
    private String School;//学校署名
    private String Evaluate;//结题评价
    private String Money1;//入院经费
    private String Money2;//配套经费


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public String getProjectUnit() {
        return ProjectUnit;
    }

    public void setProjectUnit(String projectUnit) {
        ProjectUnit = projectUnit;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public boolean isIfApply() {
        return IfApply;
    }

    public void setIfApply(boolean ifApply) {
        IfApply = ifApply;
    }

    public String getStudyType() {
        return StudyType;
    }

    public void setStudyType(String studyType) {
        StudyType = studyType;
    }

    public String getApplyObject() {
        return ApplyObject;
    }

    public void setApplyObject(String applyObject) {
        ApplyObject = applyObject;
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

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public String getEvaluate() {
        return Evaluate;
    }

    public void setEvaluate(String evaluate) {
        Evaluate = evaluate;
    }

    public String getMoney1() {
        return Money1;
    }

    public void setMoney1(String money1) {
        Money1 = money1;
    }

    public String getMoney2() {
        return Money2;
    }

    public void setMoney2(String money2) {
        Money2 = money2;
    }

    @Override
    public String toString() {
        return "Project{" +
                "ID='" + ID + '\'' +
                ", ResultName='" + ResultName + '\'' +
                ", Unit='" + Unit + '\'' +
                ", ProjectUnit='" + ProjectUnit + '\'' +
                ", EndTime='" + EndTime + '\'' +
                ", IfApply=" + IfApply +
                ", StudyType='" + StudyType + '\'' +
                ", ApplyObject='" + ApplyObject + '\'' +
                ", OneStudy='" + OneStudy + '\'' +
                ", ProjectSource='" + ProjectSource + '\'' +
                ", School='" + School + '\'' +
                ", Evaluate='" + Evaluate + '\'' +
                ", Money1='" + Money1 + '\'' +
                ", Money2='" + Money2 + '\'' +
                '}';
    }


}
