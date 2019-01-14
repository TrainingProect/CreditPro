package count.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Book {
    @Id
	@GeneratedValue
	private int Id;
    @Column
    private String teacherId;
    @Column
    private String Name;//著作名称
    @Column
    private String Unit;//所属单位
    @Column
    private String PublishUnit;//出版单位
    @Column
    private String StartTime;//出版时间
    @Column
    private String Sp;//出版地点
    @Column
    private String Kind;//著作类别
    @Column
    private String StudyType;//学科门类
    @Column
    private String OneStudy;//一级学科
    @Column
    private String ProjectSource;//项目来源
    @Column
    private int Count;//总字数
    @Column
    private String IfTranslation;//是否为译文
    @Column
    private String School;//学校署名
    @Column
    private String Language;//语种
    @Column
    private String ISBN;//ISBN号
    @Column
    private String  CIP;//CIP号
    @Column
    private String Level;//出版社级别
    @Column
    private String IfAid;//是否受资助
    @Column
    private String Introduction;//简介

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

    public String getIfTranslation() {
        return IfTranslation;
    }

    public void setIfTranslation(String ifTranslation) {
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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getCIP() {
        return CIP;
    }

    public void setCIP(String CIP) {
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
		return "Book [Id=" + Id + ", teacherId=" + teacherId + ", Name=" + Name + ", Unit=" + Unit + ", PublishUnit="
				+ PublishUnit + ", StartTime=" + StartTime + ", Sp=" + Sp + ", Kind=" + Kind + ", StudyType="
				+ StudyType + ", OneStudy=" + OneStudy + ", ProjectSource=" + ProjectSource + ", Count=" + Count
				+ ", IfTranslation=" + IfTranslation + ", School=" + School + ", Language=" + Language + ", ISBN="
				+ ISBN + ", CIP=" + CIP + ", Level=" + Level + ", IfAid=" + IfAid + ", Introduction=" + Introduction
				+ "]";
	}


}
