package com.shixun.springboot.model;

public class PBook {
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

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
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

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    @Override
    public String toString() {
        return "PBook{" +
                "ID=" + ID +
                ", Sex=" + Sex +
                ", Contribution=" + Contribution +
                ", Count=" + Count +
                ", Type='" + Type + '\'' +
                ", Name='" + Name + '\'' +
                ", Education='" + Education + '\'' +
                ", Job='" + Job + '\'' +
                ", Unit='" + Unit + '\'' +
                ", Role='" + Role + '\'' +
                '}';
    }

    private int ID;   //署名顺序
    private int Sex;   //性别
    private int Contribution; //贡献率
    private int Count; //参编字数
    private String Type; //作者类型
    private String Name; //作者姓名
    private String Education; //学历
    private String Job; //职称
    private String Unit; //工作单位
    private String Role; //承担角色

}
