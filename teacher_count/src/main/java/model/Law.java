package model;

import java.util.Date;

public class Law {
    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getRegistration() {
        return Registration;
    }

    public void setRegistration(String registration) {
        Registration = registration;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSTime() {
        return STime;
    }

    public void setSTime(String STime) {
        this.STime = STime;
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
        return Kind;
    }

    public void setKind(String kind) {
        Kind = kind;
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

    private String teacherId;
    private String Registration;//登记号
    private String ID;//著作权编号
    private String STime;//出版日期
    private String Name;//著作权名称
    private String Unit;//所属单位
    private String Kind;//著作权类型
    private String StudyType;//学科门类
    private String OneStudy;//一级学科

    @Override
    public String toString() {
        return "Law{" +
                "teacherId='" + teacherId + '\'' +
                ", Registration='" + Registration + '\'' +
                ", ID='" + ID + '\'' +
                ", STime='" + STime + '\'' +
                ", Name='" + Name + '\'' +
                ", Unit='" + Unit + '\'' +
                ", Kind='" + Kind + '\'' +
                ", StudyType='" + StudyType + '\'' +
                ", OneStudy='" + OneStudy + '\'' +
                '}';
    }
}
