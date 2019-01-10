package model;

import java.util.Date;

public class RRule {


    @Override
    public String toString() {
        return "RRule{" +
                "teacherId='" + teacherId + '\'' +
                ", Name='" + Name + '\'' +
                ", Unit='" + Unit + '\'' +
                ", kind='" + kind + '\'' +
                ", Id='" + Id + '\'' +
                ", STime=" + STime +
                ", ETime=" + ETime +
                ", IfExist='" + IfExist + '\'' +
                ", Deparment='" + Deparment + '\'' +
                ", Industry='" + Industry + '\'' +
                '}';
    }

    private String teacherId;
    private String Name;  //标准名称
    private String Unit;  //单位
    private String kind;  //标准类别
    private String Id; //标准ID
    private Date STime;  //开始时间
    private Date ETime;   //完成时间
    private String IfExist;   //是否发布
    private String Deparment;   //发布部门
    private String Industry;  //所属行业

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Date getSTime() {
        return STime;
    }

    public void setSTime(Date STime) {
        this.STime = STime;
    }

    public Date getETime() {
        return ETime;
    }

    public void setETime(Date ETime) {
        this.ETime = ETime;
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
}

