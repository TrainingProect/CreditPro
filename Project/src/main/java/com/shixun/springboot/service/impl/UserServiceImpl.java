package com.shixun.springboot.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.shixun.springboot.dao.UserDao;
import com.shixun.springboot.dao.impl.UserDaoImpl;
import com.shixun.springboot.model.User;
import com.shixun.springboot.service.UserService;

@ComponentScan({"com.shixun.springboot.dao"})
@Service("userService")
public class UserServiceImpl implements UserService{
	
	
	UserDao userDao = new UserDaoImpl();

	@Override
	public boolean change(User user , Object...objects) {
		return userDao.change(user,objects);
	}



}
