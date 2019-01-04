package com.shixun.springboot.model;

import java.util.Date;

public class Standard {
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

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Date getStartTime() {
        return StartTime;
    }

    public void setStartTime(Date startTime) {
        StartTime = startTime;
    }

    public Date getEndTime() {
        return EndTime;
    }

    public void setEndTime(Date endTime) {
        EndTime = endTime;
    }

    public String getIfExist() {
        return IfExist;
    }

    public void setIfExist(String ifExist) {
        IfExist = ifExist;
    }

    public String getDeparment() {
        return Deparment;
    }

    public void setDeparment(String deparment) {
        Deparment = deparment;
    }

    public String getIndustry() {
        return Industry;
    }

    public void setIndustry(String industry) {
        Industry = industry;
    }

    @Override
    public String toString() {
        return "Standard{" +
                "Name='" + Name + '\'' +
                ", Unit='" + Unit + '\'' +
                ", Type='" + Type + '\'' +
                ", ID='" + ID + '\'' +
                ", StartTime=" + StartTime +
                ", EndTime=" + EndTime +
                ", IfExist='" + IfExist + '\'' +
                ", Deparment='" + Deparment + '\'' +
                ", Industry='" + Industry + '\'' +
                '}';
    }

    private String Name;  //标准名称
    private String Unit;  //单位
    private String Type;  //标准类别
    private String ID; //标准ID
    private Date StartTime;  //开始时间
    private Date EndTime;   //完成时间
    private String IfExist;   //是否发布
    private String Deparment;   //发布部门
    private String Industry;  //所属行业
}
