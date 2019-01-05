package com.shixun.springboot.dao.impl;

import java.util.List;
import java.util.Scanner;

import com.shixun.springboot.model.Group;
import org.springframework.stereotype.Repository;

import com.shixun.springboot.dao.UserDao;
import com.shixun.springboot.model.User;
import com.shixun.springboot.utils.DAOConnection;
@Repository
/*
* 未完成功能
* 'addData、applyData、gradeDis、message*/
public class UserDaoImpl  implements UserDao {

	@Override
	public boolean change(User user , Object...objects) {//只能修改3项
		String sql = "update u_teacher set u_name=?,u_age=?,u_phone=? where u_teacherId=?;";
//		boolean isTrue = DAOConnection.dbDMLWithSQL(sql,u_password,u_teacherId);
		Object[] objects2 = new Object[objects.length+1];
		for(int i=0;i<objects.length;i++) {
			objects2[i] = objects[i];
		}
		objects2[objects.length] = user.getU_teacherId();
		boolean isTrue = DAOConnection.dbDMLWithSQL(sql, objects2);
		return isTrue;
	}

	@Override
	public User personal(String u_teacherId) {
		String sql = "select * from u_teacher where u_teacherId=?;";
		List<User> users = DAOConnection.dbDQLWithSQL(sql, User.class, u_teacherId);
		User user = users.get(0);
		return user;
	}

	@Override
	public boolean changePWD(User user, String u_password) {
		String sql = "update u_teacher set u_password=? where u_teacherId=?;";
		boolean isTrue = DAOConnection.dbDMLWithSQL(sql,u_password,user.getU_teacherId());
		return isTrue;

	}

	@Override
	public boolean applyUpdate(Group group,Object... objects) {
		return false;
	}

	@Override
	public boolean gradeDis(User user, Group group) {
		return false;
	}

}
