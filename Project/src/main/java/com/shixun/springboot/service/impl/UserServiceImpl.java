package com.shixun.springboot.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.shixun.springboot.mapper.UserMapper;
import com.shixun.springboot.model.User;
import com.shixun.springboot.service.UserService;

@ComponentScan({"com.shixun.springboot.mapper"})
@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Resource(name="userMapper")
	UserMapper userMapper;
	

	@Override
	public void insert(User user) {
		userMapper.insert(user);
	}

	@Override
	public void delete(String u_teacherId) {
		userMapper.delete(u_teacherId);
	}

	@Override
	public User findUser(String u_teacherId) {
		return userMapper.findUser(u_teacherId);
	}

	@Override
	public void change(User user) {
		userMapper.change(user);
	}

}
