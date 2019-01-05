package com.shixun.springboot.model;

public class Paper {
    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublicationType() {
        return PublicationType;
    }

    public void setPublicationType(String publicationType) {
        PublicationType = publicationType;
    }

    public String getCollection() {
        return Collection;
    }

    public void setCollection(String collection) {
        Collection = collection;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
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

    public String getCount() {
        return Count;
    }

    public void setCount(String count) {
        Count = count;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public String getPublicationLevel() {
        return PublicationLevel;
    }

    public void setPublicationLevel(String publicationLevel) {
        PublicationLevel = publicationLevel;
    }

    public boolean isIfTranslation() {
        return IfTranslation;
    }

    public void setIfTranslation(boolean ifTranslation) {
        IfTranslation = ifTranslation;
    }

    public int getCN() {
        return CN;
    }

    public void setCN(int CN) {
        this.CN = CN;
    }

    public String getPublicationRange() {
        return PublicationRange;
    }

    public void setPublicationRange(String publicationRange) {
        PublicationRange = publicationRange;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "Title='" + Title + '\'' +
                ", PublicationType='" + PublicationType + '\'' +
                ", Collection='" + Collection + '\'' +
                ", Unit='" + Unit + '\'' +
                ", StudyType='" + StudyType + '\'' +
                ", OneStudy='" + OneStudy + '\'' +
                ", ProjectSource='" + ProjectSource + '\'' +
                ", Count='" + Count + '\'' +
                ", School='" + School + '\'' +
                ", PublicationLevel='" + PublicationLevel + '\'' +
                ", IfTranslation=" + IfTranslation +
                ", CN=" + CN +
                ", PublicationRange='" + PublicationRange + '\'' +
                '}';
    }

    private String Title;   //论文题目
    private String PublicationType;   //刊物类型
    private String Collection;   //收录转载
    private String Unit;      //所属单位
    private String StudyType;  //学科门类
    private String OneStudy;   //一级学科
    private String ProjectSource;  //项目来源
    private String Count;  //字数(万)
    private String School;    //学校署名
    private String PublicationLevel;  //版面
    private boolean IfTranslation;  //是否为译文
    private int CN;  //CN/ISN号
    private String PublicationRange;  //发表范围

}