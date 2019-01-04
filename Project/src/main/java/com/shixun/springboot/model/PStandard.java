package com.shixun.springboot.model;

public class PStandard {
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSex() {
        return Sex;
    }

    public void setSex(int sex) {
        Sex = sex;
    }

    public int getContribution() {
        return Contribution;
    }

    public void setContribution(int contribution) {
        Contribution = contribution;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    @Override
    public String toString() {
        return "PStandard{" +
                "ID=" + ID +
                ", Sex=" + Sex +
                ", Contribution=" + Contribution +
                ", Type='" + Type + '\'' +
                ", Name='" + Name + '\'' +
                ", Education='" + Education + '\'' +
                ", Job='" + Job + '\'' +
                ", Unit='" + Unit + '\'' +
                '}';
    }

    private int ID;   //署名顺序
    private int Sex;   //性别
    private int Contribution; //贡献率
    private String Type; //作者类别
    private String Name; //制定人姓名
    private String Education; //学历
    private String Job; //职称
    private String Unit; //工作单位


}
