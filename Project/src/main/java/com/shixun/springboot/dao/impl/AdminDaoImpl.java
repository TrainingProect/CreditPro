package com.shixun.springboot.dao.impl;

import java.util.List;

import com.shixun.springboot.dao.AdminDao;
import com.shixun.springboot.dao.UserDao;
import com.shixun.springboot.model.Admin;
import com.shixun.springboot.model.Group;
import com.shixun.springboot.model.User;
import com.shixun.springboot.utils.DAOConnection;

public class AdminDaoImpl implements AdminDao , UserDao {

	@Override
	public User findUser(String u_teacherId,String u_post) {
			String sql = "select * from u_teacher where u_teacherId = ? and u_post=?;";
			List<User> users = DAOConnection.dbDQLWithSQL(sql, User.class, u_teacherId,u_post);
			return users.get(0);

	}
	@Override
	public List<User> findUsers(User user) {
		
		String sql = "select * from u_teacher where u_post = ?";
		List<User> users = DAOConnection.dbDQLWithSQL(sql, User.class,user.getU_post());
		return users;
	}

	@Override
	public boolean insert(User user) {
		int limit = user.getU_limit();
		if(limit==1) {
			String sql = "insert into u_teacher(u_name,u_password,u_age,u_phone,u_teacherId,u_post) values(?,?,?,?,?,?);";
			boolean isTrue = DAOConnection.dbDMLWithSQL(sql, user.getU_name(),user.getU_password(),user.getU_age(),user.getU_phone(),user.getU_teacherId(),user.getU_post());
			return isTrue;
		}
		return false;

	}

	@Override
	public boolean delete(User user) {
		int limit = user.getU_limit();
		if(limit==1) {
			String sql = "delete from u_teacher where u_teacherId=? and u_post=?;";
			boolean isTrue = DAOConnection.dbDMLWithSQL(sql, user.getU_teacherId(),user.getU_post());
			return isTrue;
		}
		return false;

	}

	@Override
	public boolean change(User user,String u_password) {
		String sql = "update u_teacher set u_password=? where u_teacherId=?;";
		boolean isTrue = DAOConnection.dbDMLWithSQL(sql,u_password,user.getU_teacherId());
		return isTrue;
	}




	@Override
	public boolean addData(Group group) {
		String sql = "insert into u_group(g_name,g_leader,g_members,g_expain,g_class,g_membersNumber,g_count) values(?,?,?,?,?,?,?);";
		boolean isTrue = DAOConnection.dbDMLWithSQL(sql, group.getG_name(),group.getG_leader(),group.getG_members(),group.getG_explain(),group.getG_class(),group.getG_membersNumber(),group.getG_count());
		return isTrue;
	}


	@Override
	public boolean applyUpdate(Group group,Object...objects) {
		String sql = "update u_group set g_name=?,g_leader=?,g_members=?,g_expain=?,g_class=?,g_membersNumber=?,g_count=? where g_leaderId = ?;";
		boolean isTrue = DAOConnection.dbDMLWithSQL(sql, objects,group.getG_leaderId());
		return isTrue;
	}


	@Override
	public Group findGroup(Group group) {
		String sql = "select * from u_group where g_leaderId=?;";
		List<Group> groups = DAOConnection.dbDQLWithSQL(sql, Group.class, group.getG_leaderId());
		return groups.get(0);
	}
	
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
	public boolean alterData(User user, Group group, Object... objects) {
		int limit = user.getU_limit();
		if(limit!=1||limit!=2) {
			return false;
		}
		
		String sql = "update u_group set g_name=?,g_leader=?,g_members=?,g_expain=?,g_class=?,g_membersNumber=?,g_count=? where g_leaderId = ?;";
		boolean isTrue = DAOConnection.dbDMLWithSQL(sql, objects,group.getG_leaderId());
		return isTrue;
	}
	@Override
	public boolean changePWD(User user, String u_password) {
		// TODO Auto-generated method stub
		return false;
	}



}
