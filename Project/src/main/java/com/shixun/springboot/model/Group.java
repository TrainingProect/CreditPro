package com.shixun.springboot.model;

import java.io.Serializable;

import com.mysql.fabric.xmlrpc.base.Data;

public class Group implements Serializable{

	/**
	 * g_name,g_leader,g_leaderId,g_members,g_membersNumber,g_explain,g_class,g_count,data
	 */
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


	
	
	
	
}
