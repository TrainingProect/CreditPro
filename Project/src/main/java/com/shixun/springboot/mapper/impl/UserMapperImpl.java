package com.shixun.springboot.mapper.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shixun.springboot.mapper.UserMapper;
import com.shixun.springboot.model.User;
@Repository
public class UserMapperImpl implements UserMapper {

	@Override
	public User findUser(String u_teacherId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String u_teacherId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void change(User user) {
		// TODO Auto-generated method stub

	}

}
