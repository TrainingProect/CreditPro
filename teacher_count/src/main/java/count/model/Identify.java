package count.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Identify {

    @Id
	@GeneratedValue
	private int Id;
    @Column
    private String teacherId;
    @Column
    private String ResultName;    //成果名称
    @Column
    private String Unit;            //所属单位
    @Column
    private String Department;  //鉴定部门
    @Column
    private String STime;   //鉴定时间
    @Column
    private String Level;  //鉴定级别
    @Column
    private String CompleteWay;// 完成形式
    @Column
    private String StudyType;// 学科门类
    @Column
    private String OneStudy;//一级学科
    @Column
    private String TwoStudy;//二级学科
    @Column
    private String ProjectSource;//项目来源
    @Column
    private String School;//学校署名
    @Column
    private String CompleteUnit;//完成单位
    @Column
    private String jiandingID;//鉴定号
    @Column
    private String Conclusion;//鉴定结论

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getResultName() {
        return ResultName;
    }


    public void setResultName(String resultName) {
        ResultName = resultName;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getSTime() {
        return STime;
    }

    public void setSTime(String STime) {
        this.STime = STime;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public String getCompleteWay() {
        return CompleteWay;
    }

    public void setCompleteWay(String completeWay) {
        CompleteWay = completeWay;
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

    public String getTwoStudy() {
        return TwoStudy;
    }

    public void setTwoStudy(String twoStudy) {
        TwoStudy = twoStudy;
    }

    public String getProjectSource() {
        return ProjectSource;
    }

    public void setProjectSource(String projectSource) {
        ProjectSource = projectSource;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public String getCompleteUnit() {
        return CompleteUnit;
    }

    public void setCompleteUnit(String completeUnit) {
        CompleteUnit = completeUnit;
    }



    public String getConclusion() {
        return Conclusion;
    }

    public void setConclusion(String conclusion) {
        Conclusion = conclusion;
    }

	public String getJiandingID() {
		return jiandingID;
	}

	public void setJiandingID(String jiandingID) {
		this.jiandingID = jiandingID;
	}

	@Override
	public String toString() {
		return "Identify [Id=" + Id + ", teacherId=" + teacherId + ", ResultName=" + ResultName + ", Unit=" + Unit
				+ ", Department=" + Department + ", STime=" + STime + ", Level=" + Level + ", CompleteWay="
				+ CompleteWay + ", StudyType=" + StudyType + ", OneStudy=" + OneStudy + ", TwoStudy=" + TwoStudy
				+ ", ProjectSource=" + ProjectSource + ", School=" + School + ", CompleteUnit=" + CompleteUnit
				+ ", jiandingID=" + jiandingID + ", Conclusion=" + Conclusion + "]";
	}


}
