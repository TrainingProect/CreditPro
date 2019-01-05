package com.shixun.springboot.model;

import java.io.Serializable;

public class User implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5399490153823821767L;
	private String u_name;   //教师姓名
	private String u_password; //登录密码
	private int u_age; //教师年龄
	private String u_phone;//教师手机号
	private String u_teacherId;//教师工号
	private String u_post;//学院
	private int u_count;//教师绩点
	private int u_limit;//教师权限
	public User(String u_name, String u_password, int u_age, String u_phone, String u_teacherId, String u_post,int u_count) {
		super();
		this.u_name = u_name;
		this.u_password = u_password;
		this.u_age = u_age;
		this.u_phone = u_phone;
		this.u_teacherId = u_teacherId;
		this.u_post = u_post;
		this.u_count = u_count;
	}
	
	public User() {
		super();
	}

	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_password() {
		return u_password;
	}
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	public int getU_age() {
		return u_age;
	}
	public void setU_age(int u_age) {
		this.u_age = u_age;
	}
	public String getU_phone() {
		return u_phone;
	}
	public void setU_phone(String u_phone) {
		this.u_phone = u_phone;
	}
	public String getU_teacherId() {
		return u_teacherId;
	}
	public void setU_teacherId(String u_teacherId) {
		this.u_teacherId = u_teacherId;
	}
	public String getU_post() {
		return u_post;
	}
	public void setU_post(String u_post) {
		this.u_post = u_post;
	}
	
	public int getU_count() {
		return u_count;
	}

	public void setU_count(int u_count) {
		this.u_count = u_count;
	}
	

	public int getU_limit() {
		return u_limit;
	}

	public void setU_limit(int u_limit) {
		this.u_limit = u_limit;
	}

	@Override
	public String toString() {
		return "User [u_name=" + u_name + ", u_age=" + u_age + ", u_phone=" + u_phone
				+ ", u_teacherId=" + u_teacherId + ", u_post=" + u_post + ", u_count=" + u_count + ", u_limit="
				+ u_limit + "]";
	}


}
