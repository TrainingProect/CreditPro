package com.shixun.springboot.model;

import java.util.Date;

public class Law {

    private int Registration;//登记号
    private int ID;//著作权编号
    private Date StartTime;//出版日期
    private String Name;//著作权名称
    private String Unit;//所属单位
    private String Type;//著作权类型
    private String StudyType;//学科门类
    private String OneStudy;//一级学科

    public int getRegistration() {
        return Registration;
    }

    public void setRegistration(int registration) {
        Registration = registration;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getStartTime() {
        return StartTime;
    }

    public void setStartTime(Date startTime) {
        StartTime = startTime;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
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

    @Override
    public String toString() {
        return "Law{" +
                "Registration=" + Registration +
                ", ID=" + ID +
                ", StartTime=" + StartTime +
                ", Name='" + Name + '\'' +
                ", Unit='" + Unit + '\'' +
                ", Type='" + Type + '\'' +
                ", StudyType='" + StudyType + '\'' +
                ", OneStudy='" + OneStudy + '\'' +
                '}';
    }

}
