package count.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Law {
    @Id
	@GeneratedValue
	private int Id;
	@Column
    private String zhuzuoquanID;//著作权编号
    @Column
    private String teacherId;
    @Column
    private String Registration;//登记号
    @Column
    private String STime;//出版日期
    @Column
    private String Name;//著作权名称
    @Column
    private String Unit;//所属单位
    @Column
    private String Kind;//著作权类型
    @Column
    private String StudyType;//学科门类
    @Column
    private String OneStudy;//一级学科

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getRegistration() {
        return Registration;
    }

    public void setRegistration(String registration) {
        Registration = registration;
    }



    public String getSTime() {
        return STime;
    }

    public void setSTime(String STime) {
        this.STime = STime;
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

	public int getId() {
		return Id;
	}



	public String getZhuzuoquanID() {
		return zhuzuoquanID;
	}

	public void setZhuzuoquanID(String zhuzuoquanID) {
		this.zhuzuoquanID = zhuzuoquanID;
	}

	@Override
	public String toString() {
		return "Law [Id=" + Id + ", zhuzuoquanID=" + zhuzuoquanID + ", teacherId=" + teacherId + ", Registration="
				+ Registration + ", STime=" + STime + ", Name=" + Name + ", Unit=" + Unit + ", Kind=" + Kind
				+ ", StudyType=" + StudyType + ", OneStudy=" + OneStudy + "]";
	}


}
