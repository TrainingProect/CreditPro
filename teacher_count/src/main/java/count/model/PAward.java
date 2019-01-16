package count.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class PAward implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5125110231726560098L;

	@Id
	@GeneratedValue
    private int shumingID;   //署名顺序
	@Column
    private String teacherId;
	@Column
    private String Name; //完成人姓名
	@Column
    private String Sex;   //性别
	@Column
    private String Kind; //作者类型
	@Column
    private String Education; //学历
	@Column
    private String Job; //职称
	@Column
    private String Unit; //工作单位
	@Column
    private int Contribution; //贡献率

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }




    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public int getContribution() {
        return Contribution;
    }

    public void setContribution(int contribution) {
        Contribution = contribution;
    }

    public String getKind() {
        return Kind;
    }

    public void setKind(String kind) {
        Kind = kind;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

	@Override
	public String toString() {
		return "PAward [shumingID=" + shumingID + ", teacherId=" + teacherId + ", Name=" + Name + ", Sex=" + Sex
				+ ", Kind=" + Kind + ", Education=" + Education + ", Job=" + Job + ", Unit=" + Unit + ", Contribution="
				+ Contribution + "]";
	}


}
