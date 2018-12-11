package com.shixun.springboot.service.impl;

import java.util.List;

import com.shixun.springboot.dao.AdminDao;
import com.shixun.springboot.dao.impl.AdminDaoImpl;
import com.shixun.springboot.model.Admin;
import com.shixun.springboot.model.User;
import com.shixun.springboot.service.AdminService;

public class AdminServiceImpl implements AdminService {
	
	AdminDao adminDao = new AdminDaoImpl();

	@Override
	public User findUser(String u_teacherId,String u_post) {
		return 	adminDao.findUser(u_teacherId,u_post);
	}

	@Override
	public List<User> findUsers(User user) {
		return adminDao.findUsers(user);
	}

	@Override
	public boolean insert(User user) {
		return adminDao.insert(user);
	}

	@Override
	public boolean delete(User user) {
		return adminDao.delete(user);
	}

	@Override
	public boolean change(User user, String u_password) {
		return adminDao.change(user, u_password);
	}

}
