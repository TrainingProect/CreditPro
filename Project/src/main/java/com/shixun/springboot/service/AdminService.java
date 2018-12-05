package com.shixun.springboot.service;

import java.util.List;

import com.shixun.springboot.model.Admin;
import com.shixun.springboot.model.User;

public interface AdminService {
	public User findUser(String u_teacherId,String u_post);
	public List<User> findUsers(User user);
	
	public boolean insert(User user);
	
	public boolean delete(User user);
	
	public boolean change(User user,String u_password);
}
