package count.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Art {
    @Id
	@GeneratedValue
	private int Id;
    @Column
    private String teacherId;//教师号
    @Column
    private String ResultName;//成果名称
    @Column
    private String Unit;//所属单位
    @Column
    private String STime;//发表时间
    @Column
    private String PublicationName;//刊物、比赛、展览名称
    @Column
    private String IfAward;//是否获奖
    @Column
    private String Kind;//成果类型
    @Column
    private String School;//学校署名

  

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

    public String getIfAward() {
        return IfAward;
    }

    public void setIfAward(String ifAward) {
        IfAward = ifAward;
    }

    public String getKind() {
        return Kind;
    }

    public void setKind(String kind) {
        Kind = kind;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

	@Override
	public String toString() {
		return "Art [Id=" + Id + ", teacherId=" + teacherId + ", ResultName=" + ResultName + ", Unit=" + Unit
				+ ", STime=" + STime + ", PublicationName=" + PublicationName + ", IfAward=" + IfAward + ", Kind="
				+ Kind + ", School=" + School + "]";
	}
    
}
