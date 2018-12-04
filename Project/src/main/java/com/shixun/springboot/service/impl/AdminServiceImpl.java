package com.shixun.springboot.service.impl;

import java.util.List;

import com.shixun.springboot.dao.AdminDao;
import com.shixun.springboot.dao.impl.AdminDaoImpl;
import com.shixun.springboot.model.User;
import com.shixun.springboot.service.AdminService;

public class AdminServiceImpl implements AdminService {
	
	AdminDao adminDao = new AdminDaoImpl();

	@Override
	public User findUser(String u_teacherId) {
		return 	adminDao.findUser(u_teacherId);
	}

	@Override
	public List<User> findUser() {
		return adminDao.findUser();
	}

	@Override
	public boolean insert(User user) {
		return adminDao.insert(user);
	}

	@Override
	public boolean delete(String u_teacherId) {
		return adminDao.delete(u_teacherId);
	}

	@Override
	public boolean change(String u_teacherId, String u_password) {
		return adminDao.change(u_teacherId, u_password);
	}

}
