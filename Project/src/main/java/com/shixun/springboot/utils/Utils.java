package com.shixun.springboot.utils;

import java.util.List;

import com.shixun.springboot.model.User;

public class Utils {
	
	public User reserve(String u_teacherId) {
		
		String sql = "select * from u_teacher where u_teacherId=?;";
		List<User> users = DAOConnection.dbDQLWithSQL(sql, User.class, u_teacherId);

		return users.get(0);
	}

}
