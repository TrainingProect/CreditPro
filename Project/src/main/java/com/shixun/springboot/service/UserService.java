package com.shixun.springboot.service;



import com.shixun.springboot.model.User;
public interface UserService {
	
	public void insert(User user);

	public void delete(String u_teacherId);
	
	public User findUser(String u_teacherId);
	
	public void change(User user);
}
