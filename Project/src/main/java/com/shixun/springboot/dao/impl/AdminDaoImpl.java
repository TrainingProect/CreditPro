package com.shixun.springboot.dao.impl;

import java.util.List;

import com.shixun.springboot.dao.AdminDao;
import com.shixun.springboot.model.User;
import com.shixun.springboot.utils.DAOConnection;

public class AdminDaoImpl implements AdminDao {

	@Override
	public User findUser(String u_teacherId) {
		String sql = "select * from u_teacher where u_teacherId = ?;";
		List<User> users = DAOConnection.dbDQLWithSQL(sql, User.class, u_teacherId);
		User user = users.get(0);
		return user;
	}


	@Override
	public boolean insert(User user) {
		String sql = "insert into u_teacher(u_name,u_password,u_age,u_phone,u_teacherId,u_post) values(?,?,?,?,?,?);";
		boolean isTrue = DAOConnection.dbDMLWithSQL(sql, user.getU_name(),user.getU_password(),user.getU_age(),user.getU_phone(),user.getU_teacherId(),user.getU_post());
		return isTrue;
	}

	@Override
	public boolean delete(String u_teacherId) {
		String sql = "delete from u_teacher where u_teacherId=?;";
		boolean isTrue = DAOConnection.dbDMLWithSQL(sql, u_teacherId);
		return isTrue;
	}

	@Override
	public boolean change(String u_teacherId, String u_password) {
		String sql = "update u_teacher set u_password=? where u_teacherId=?;";
		boolean isTrue = DAOConnection.dbDMLWithSQL(sql,u_password,u_teacherId);
		return isTrue;
	}


	@Override
	public List<User> findUser() {
		
		String sql = "select * from u_teacher";
		List<User> users = DAOConnection.dbDQLWithSQL(sql, User.class);
		return users;
	}




}
