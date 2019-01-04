package com.shixun.springboot.model;

import java.io.Serializable;

import com.mysql.fabric.xmlrpc.base.Data;
import net.bytebuddy.implementation.bind.annotation.Super;

public class Group implements Serializable{
	@Override
	public String toString() {
		return "Group{" +
				"ResultName='" + ResultName + '\'' +
				", ResultType='" + ResultType + '\'' +
				", GroupNumber='" + GroupNumber + '\'' +
				", Number1='" + Number1 + '\'' +
				", Number2='" + Number2 + '\'' +
				", Number3='" + Number3 + '\'' +
				", Number4='" + Number4 + '\'' +
				", Number5='" + Number5 + '\'' +
				", Number6='" + Number6 + '\'' +
				", CompleteDate='" + CompleteDate + '\'' +
				'}';
	}

    private String ResultName;   //成果名称
	private String ResultType;   //成果类别
	private String GroupNumber;    //小组成员
	private String Number1;   //成员
	private String Number2;
	private String Number3;
	private String Number4;
	private String Number5;
	private String Number6;
	private String CompleteDate;   //完成日期
	public String getResultName() {
		return ResultName;
	}

	public void setResultName(String resultName) {
		ResultName = resultName;
	}

	public String getResultType() {
		return ResultType;
	}

	public void setResultType(String resultType) {
		ResultType = resultType;
	}

	public String getGroupNumber() {
		return GroupNumber;
	}

	public void setGroupNumber(String groupNumber) {
		GroupNumber = groupNumber;
	}

	public String getNumber1() {
		return Number1;
	}

	public void setNumber1(String number1) {
		Number1 = number1;
	}

	public String getNumber2() {
		return Number2;
	}

	public void setNumber2(String number2) {
		Number2 = number2;
	}

	public String getNumber3() {
		return Number3;
	}

	public void setNumber3(String number3) {
		Number3 = number3;
	}

	public String getNumber4() {
		return Number4;
	}

	public void setNumber4(String number4) {
		Number4 = number4;
	}

	public String getNumber5() {
		return Number5;
	}

	public void setNumber5(String number5) {
		Number5 = number5;
	}

	public String getNumber6() {
		return Number6;
	}

	public void setNumber6(String number6) {
		Number6 = number6;
	}

	public String getCompleteDate() {
		return CompleteDate;
	}

	public void setCompleteDate(String completeDate) {
		CompleteDate = completeDate;
	}

	/**
	 * g_name,g_leader,g_leaderId,g_members,g_membersNumber,g_explain,g_class,g_count,data
	 *//*
	private static final long serialVersionUID = 1384764682815006003L;
	private String g_name;       //项目名称
	private String g_leader;    //项目组长
	private String g_members;    //项目成员
	private String g_explain;    //项目解释
	private String g_class;     //项目类别
	private int g_membersNumber;  //项目成员数量
	private int g_count;      //项目绩点
	private String g_leaderId;   //组长学工号
	private Data data;      //?
	public Group() {
		super();
	}
	
	public Group(String g_name, String g_leader, String g_members, String g_explain, String g_class,
			int g_membersNumber, int g_count,String g_leaderId) {
		super();
		this.g_name = g_name;
		this.g_leader = g_leader;
		this.g_members = g_members;
		this.g_explain = g_explain;
		this.g_class = g_class;
		this.g_membersNumber = g_membersNumber;
		this.g_count = g_count;
		this.g_leaderId = g_leaderId;
	}
	public String getG_name() {
		return g_name;
	}
	public void setG_name(String g_name) {
		this.g_name = g_name;
	}
	public String getG_leader() {
		return g_leader;
	}
	public void setG_leader(String g_leader) {
		this.g_leader = g_leader;
	}
	public String getG_members() {
		return g_members;
	}
	public void setG_members(String g_members) {
		this.g_members = g_members;
	}
	public String getG_explain() {
		return g_explain;
	}
	public void setG_explain(String g_explain) {
		this.g_explain = g_explain;
	}
	public String getG_class() {
		return g_class;
	}
	public void setG_class(String g_class) {
		this.g_class = g_class;
	}
	public int getG_membersNumber() {
		return g_membersNumber;
	}
	public void setG_membersNumber(int g_membersNumber) {
		this.g_membersNumber = g_membersNumber;
	}
	public int getG_count() {
		return g_count;
	}
	public void setG_count(int g_count) {
		this.g_count = g_count;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getG_leaderId() {
		return g_leaderId;
	}

	public void setG_leaderId(String g_leaderId) {
		this.g_leaderId = g_leaderId;
	}

	@Override
	public String toString() {
		return "Group [g_name=" + g_name + ", g_leader=" + g_leader + ", g_members=" + g_members + ", g_explain="
				+ g_explain + ", g_class=" + g_class + ", g_membersNumber=" + g_membersNumber + ", g_count=" + g_count
				+ ", g_leaderId=" + g_leaderId + "]";
	}


	*/

}
