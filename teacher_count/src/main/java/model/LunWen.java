package model;

public class LunWen {


    private String teacherId;
    private String Title;   //论文题目
    private String Kind;   //刊物类型
    private String STime;   //发表/出版时间
    private String PublicationName;  //期刊名称
    private String Collection;   //收录转载
    private String Unit;      //所属单位
    private String StudyType;  //学科门类
    private String OneStudy;   //一级学科
    private String ProjectSource;  //项目来源
    private int Count;  //字数(万)
    private String School;    //学校署名
    private String PublicationLevel;  //版面
    private String IfTranslation;  //是否为译文
    private String CN;  //CN/ISN号
    private String PublicationRange;  //发表范围
    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getKind() {
        return Kind;
    }

    public void setKind(String kind) {
        Kind = kind;
    }

    public String getSTime() {
        return STime;
    }

    public void setSTime(String STime) {
        this.STime = STime;
    }

    public String getPublicationName() {
        return PublicationName;
    }

    public void setPublicationName(String publicationName) {
        PublicationName = publicationName;
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

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
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

    public String getIfTranslation() {
        return IfTranslation;
    }

    public void setIfTranslation(String ifTranslation) {
        IfTranslation = ifTranslation;
    }

    public String getCN() {
        return CN;
    }

    public void setCN(String CN) {
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
        return "LunWen{" +
                "Title='" + Title + '\'' +
                ", Kind='" + Kind + '\'' +
                ", STime='" + STime + '\'' +
                ", PublicationName='" + PublicationName + '\'' +
                ", Collection='" + Collection + '\'' +
                ", Unit='" + Unit + '\'' +
                ", StudyType='" + StudyType + '\'' +
                ", OneStudy='" + OneStudy + '\'' +
                ", ProjectSource='" + ProjectSource + '\'' +
                ", Count=" + Count +
                ", School='" + School + '\'' +
                ", PublicationLevel='" + PublicationLevel + '\'' +
                ", IfTranslation='" + IfTranslation + '\'' +
                ", CN='" + CN + '\'' +
                ", PublicationRange='" + PublicationRange + '\'' +
                '}';
    }
}