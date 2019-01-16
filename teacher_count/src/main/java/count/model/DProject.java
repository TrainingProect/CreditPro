package count.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class DProject implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 347110314972032589L;
	@Id
	@GeneratedValue
	private int Id;
	@Column
    private String ProjectID;//项目编号
    @Column
    private String teacherId;
    @Column
    private String ResultName;//验收项目名称
    @Column
    private String Unit;//所属单位
    @Column
    private String ProjectUnit;//结题单位
    @Column
    private String ETime;//结题时间
    @Column
    private String IfApply;//是否被应用
    @Column
    private String StudyType;//学科门类
    @Column
    private String ApplyObject;//应用对象
    @Column
    private String OneStudy;//一级学科
    @Column
    private String ProjectSource;//项目来源
    @Column
    private String School;//学校署名
    @Column
    private String Evaluate;//结题评价
    @Column
    private int Money1;//入院经费
    @Column
    private int Money2;//配套经费
   


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

    public String getProjectUnit() {
        return ProjectUnit;
    }

    public void setProjectUnit(String projectUnit) {
        ProjectUnit = projectUnit;
    }

    public String getETime() {
        return ETime;
    }

    public void setETime(String ETime) {
        this.ETime = ETime;
    }

    public String getIfApply() {
        return IfApply;
    }

    public void setIfApply(String ifApply) {
        IfApply = ifApply;
    }

    public String getStudyType() {
        return StudyType;
    }

    public void setStudyType(String studyType) {
        StudyType = studyType;
    }

    public String getApplyObject() {
        return ApplyObject;
    }

    public void setApplyObject(String applyObject) {
        ApplyObject = applyObject;
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

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public String getEvaluate() {
        return Evaluate;
    }

    public void setEvaluate(String evaluate) {
        Evaluate = evaluate;
    }

    public int getMoney1() {
        return Money1;
    }

    public void setMoney1(int money1) {
        Money1 = money1;
    }

    public int getMoney2() {
        return Money2;
    }

    public void setMoney2(int money2) {
        Money2 = money2;
    }

	public int getId() {
		return Id;
	}



	public String getProjectID() {
		return ProjectID;
	}

	public void setProjectID(String projectID) {
		ProjectID = projectID;
	}

	@Override
	public String toString() {
		return "DProject [Id=" + Id + ", ProjectID=" + ProjectID + ", teacherId=" + teacherId + ", ResultName="
				+ ResultName + ", Unit=" + Unit + ", ProjectUnit=" + ProjectUnit + ", ETime=" + ETime + ", IfApply="
				+ IfApply + ", StudyType=" + StudyType + ", ApplyObject=" + ApplyObject + ", OneStudy=" + OneStudy
				+ ", ProjectSource=" + ProjectSource + ", School=" + School + ", Evaluate=" + Evaluate + ", Money1="
				+ Money1 + ", Money2=" + Money2 + "]";
	}


}
