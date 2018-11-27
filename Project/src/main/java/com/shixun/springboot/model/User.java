package com.shixun.springboot.model;

public class User {

	
	private String u_name;
	private String u_password;
	private int u_age;
	private String u_phone;
	private String u_teacherId;
	private String u_post;//职位
	public User(String u_name, String u_password, int u_age, String u_phone, String u_teacherId, String u_post) {
		super();
		this.u_name = u_name;
		this.u_password = u_password;
		this.u_age = u_age;
		this.u_phone = u_phone;
		this.u_teacherId = u_teacherId;
		this.u_post = u_post;
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
	@Override
	public String toString() {
		return "User [u_name=" + u_name + ", u_password=" + u_password + ", u_age=" + u_age + ", u_phone=" + u_phone
				+ ", u_teacherId=" + u_teacherId + ", u_post=" + u_post + "]";
	}
	
	
}
