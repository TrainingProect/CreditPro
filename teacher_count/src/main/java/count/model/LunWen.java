package count.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class LunWen {

	@Id
	@GeneratedValue
	private int id;
	@Column
    private String teacherId;
	@Column
    private String Title;   //论文题目
	@Column
    private String Kind;   //刊物类型
	@Column
    private String STime;   //发表/出版时间
	@Column
    private String PublicationName;  //期刊名称
	@Column
    private String Collection;   //收录转载
	@Column
    private String Unit;      //所属单位
	@Column
    private String StudyType;  //学科门类
	@Column
    private String OneStudy;   //一级学科
	@Column
    private String ProjectSource;  //项目来源
	@Column
    private int Count;  //字数(万)
	@Column
    private String School;    //学校署名
	@Column
    private String PublicationLevel;  //版面
	@Column
    private String IfTranslation;  //是否为译文
	@Column
    private String CN;  //CN/ISN号
	@Column
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
		return "LunWen [id=" + id + ", teacherId=" + teacherId + ", Title=" + Title + ", Kind=" + Kind + ", STime="
				+ STime + ", PublicationName=" + PublicationName + ", Collection=" + Collection + ", Unit=" + Unit
				+ ", StudyType=" + StudyType + ", OneStudy=" + OneStudy + ", ProjectSource=" + ProjectSource
				+ ", Count=" + Count + ", School=" + School + ", PublicationLevel=" + PublicationLevel
				+ ", IfTranslation=" + IfTranslation + ", CN=" + CN + ", PublicationRange=" + PublicationRange + "]";
	}



}