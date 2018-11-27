package com.shixun.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.shixun.springboot.model.User;
@Mapper
public interface UserMapper {
	public User findUser(String u_teacherId);
	
	public List<User> findAll();
	
	public void insert(User user);
	
	public void delete(String u_teacherId);
	
	public void change(User user);
	
	
}
