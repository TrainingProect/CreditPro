package com.shixun.springboot.model;

public class Book {

    private String Name;//著作名称
    private String Unit;//所属单位
    private String PublishUnit;//出版单位
    private String StartTime;//出版时间
    private String Sp;//出版地点
    private String Type;//著作类别
    private String StudyType;//学科门类
    private String OneStudy;//一级学科
    private String ProjectSource;//项目来源
    private int Count;//总字数
    private boolean IfTranslation;//是否为译文
    private String School;//学校署名
    private String Language;//语种
    private int ISBN;//ISBN号
    private int CIP;//CIP号
    private String Level;//出版社级别
    private String IfAid;//是否受资助
    private String Introduction;//简介


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

    public String getPublishUnit() {
        return PublishUnit;
    }

    public void setPublishUnit(String publishUnit) {
        PublishUnit = publishUnit;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getSp() {
        return Sp;
    }

    public void setSp(String sp) {
        Sp = sp;
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

    public String getProjectSource() {
        return ProjectSource;
    }

    public void setProjectSource(String projectSource) {
        ProjectSource = projectSource;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public boolean isIfTranslation() {
        return IfTranslation;
    }

    public void setIfTranslation(boolean ifTranslation) {
        IfTranslation = ifTranslation;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getCIP() {
        return CIP;
    }

    public void setCIP(int CIP) {
        this.CIP = CIP;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public String getIfAid() {
        return IfAid;
    }

    public void setIfAid(String ifAid) {
        IfAid = ifAid;
    }

    public String getIntroduction() {
        return Introduction;
    }

    public void setIntroduction(String introduction) {
        Introduction = introduction;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Name='" + Name + '\'' +
                ", Unit='" + Unit + '\'' +
                ", PublishUnit='" + PublishUnit + '\'' +
                ", StartTime='" + StartTime + '\'' +
                ", Sp='" + Sp + '\'' +
                ", Type='" + Type + '\'' +
                ", StudyType='" + StudyType + '\'' +
                ", OneStudy='" + OneStudy + '\'' +
                ", ProjectSource='" + ProjectSource + '\'' +
                ", Count=" + Count +
                ", IfTranslation=" + IfTranslation +
                ", School='" + School + '\'' +
                ", Language='" + Language + '\'' +
                ", ISBN=" + ISBN +
                ", CIP=" + CIP +
                ", Level='" + Level + '\'' +
                ", IfAid='" + IfAid + '\'' +
                ", Introduction='" + Introduction + '\'' +
                '}';
    }



}
