package com.shixun.springboot.dao;

import java.util.List;

import com.shixun.springboot.model.User;

public interface AdminDao {

	public User findUser(String u_teacherId);
	public List<User> findUser();
	
	public boolean insert(User user);
	
	public boolean delete(String u_teacherId);
	
	public boolean change(String u_teacherId,String u_password);
	

	
}
