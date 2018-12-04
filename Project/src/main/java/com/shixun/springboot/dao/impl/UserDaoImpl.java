package com.shixun.springboot.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shixun.springboot.dao.UserDao;
import com.shixun.springboot.model.User;
import com.shixun.springboot.utils.DAOConnection;
@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public boolean change(User user , Object...objects) {//只能修改4项
		String sql = "update u_teacher set u_name=?,u_age=?,u_phone=?,u_post=? where u_teacherId=?;";
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
	public void personal(User user) {
		System.out.println(user.toString());
	}





}
