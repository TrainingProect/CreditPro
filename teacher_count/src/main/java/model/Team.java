package model;

import java.io.Serializable;

public class Team implements Serializable{


	private String teacherId;   //组长工号
	private String name;   //成果名称
	private String kind;   //成果类别
	private String allNumber;    //小组成员
	private String numb1;   //成员1
	private String numb2;   //成员2
	private String numb3;   //成员3
	private String numb4;   //成员4
	private String numb5;   //成员5
	private String numb6;   //成员6
	private String Atime1;   //完成日期
	private String Status1;   //审核状态

	public String getStatus1() {
		return Status1;
	}

	public void setStatus1(String status1) {
		Status1 = status1;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getAllNumber() {
		return allNumber;
	}

	public void setAllNumber(String allNumber) {
		this.allNumber = allNumber;
	}

	public String getNumb1() {
		return numb1;
	}

	public void setNumb1(String numb1) {
		this.numb1 = numb1;
	}

	public String getNumb2() {
		return numb2;
	}

	public void setNumb2(String numb2) {
		this.numb2 = numb2;
	}

	public String getNumb3() {
		return numb3;
	}

	public void setNumb3(String numb3) {
		this.numb3 = numb3;
	}

	public String getNumb4() {
		return numb4;
	}

	public void setNumb4(String numb4) {
		this.numb4 = numb4;
	}

	public String getNumb5() {
		return numb5;
	}

	public void setNumb5(String numb5) {
		this.numb5 = numb5;
	}

	public String getNumb6() {
		return numb6;
	}

	public void setNumb6(String numb6) {
		this.numb6 = numb6;
	}

	public String getAtime1() {
		return Atime1;
	}

	public void setAtime1(String atime1) {
		Atime1 = atime1;
	}

	@Override
	public String toString() {
		return "Team{" +
				"name='" + name + '\'' +
				", kind='" + kind + '\'' +
				", allNumber='" + allNumber + '\'' +
				", numb1='" + numb1 + '\'' +
				", numb2='" + numb2 + '\'' +
				", numb3='" + numb3 + '\'' +
				", numb4='" + numb4 + '\'' +
				", numb5='" + numb5 + '\'' +
				", numb6='" + numb6 + '\'' +
				", Atime1='" + Atime1 + '\'' +
				", Status1='" + Status1 + '\'' +
				'}';
	}
}
