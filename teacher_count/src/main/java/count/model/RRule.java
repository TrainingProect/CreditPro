package count.model;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class RRule implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4055490891447967927L;

	@Id
	@GeneratedValue
    private String biazhunId; //标准ID
	@Column
    private String teacherId;
	@Column
    private String Name;  //标准名称
	@Column
    private String Unit;  //单位
	@Column
    private String kind;  //标准类别
	@Column
    private String STime;  //开始时间
	@Column
    private String ETime;   //完成时间
	@Column
    private String IfExist;   //是否发布
	@Column
    private String Deparment;   //发布部门
	@Column
    private String Industry;  //所属行业
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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }



    public String getSTime() {
        return STime;
    }

    public void setSTime(String STime) {
        this.STime = STime;
    }

    public String getETime() {
        return ETime;
    }

    public void setETime(String ETime) {
        this.ETime = ETime;
    }

    public String getIfExist() {
        return IfExist;
    }

    public void setIfExist(String ifExist) {
        IfExist = ifExist;
    }

    public String getDeparment() {
        return Deparment;
    }

    public void setDeparment(String deparment) {
        Deparment = deparment;
    }

    public String getIndustry() {
        return Industry;
    }

    public void setIndustry(String industry) {
        Industry = industry;
    }

	public String getBiazhunId() {
		return biazhunId;
	}

	public void setBiazhunId(String biazhunId) {
		this.biazhunId = biazhunId;
	}

	@Override
	public String toString() {
		return "RRule [biazhunId=" + biazhunId + ", teacherId=" + teacherId + ", Name=" + Name + ", Unit=" + Unit
				+ ", kind=" + kind + ", STime=" + STime + ", ETime=" + ETime + ", IfExist=" + IfExist + ", Deparment="
				+ Deparment + ", Industry=" + Industry + "]";
	}

}

