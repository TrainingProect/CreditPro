package com.shixun.springboot.dao.impl;

import java.util.List;

import com.shixun.springboot.dao.AdminDao;
import com.shixun.springboot.dao.UserDao;
import com.shixun.springboot.model.Admin;
import com.shixun.springboot.model.Group;
import com.shixun.springboot.model.User;
import com.shixun.springboot.utils.DAOConnection;

public class AdminDaoImpl extends UserDaoImpl implements AdminDao , UserDao {

	@Override
	public User findUser(String u_teacherId,String u_post) {
		//根据职位和学号查询教师用户
			String sql = "select * from u_teacher where u_teacherId = ? and u_post=?;";
			List<User> users = DAOConnection.dbDQLWithSQL(sql, User.class, u_teacherId,u_post);
		return users.get(0);

	}

	@Override
	public List<User> findUsers(User user) {

		//显示所属学院的全部教师名称
		String sql = "select * from u_teacher where u_post = ?";
		List<User> users = DAOConnection.dbDQLWithSQL(sql, User.class,user.getU_post());
		return users;
	}

	@Override
	public boolean insert(User user) {
		int limit = user.getU_limit();
		if(limit==1) {  //是否为管理员
			String sql = "insert into u_teacher(u_name,u_password,u_age,u_phone,u_teacherId,u_post) values(?,?,?,?,?,?);";
			boolean isTrue = DAOConnection.dbDMLWithSQL(sql, user.getU_name(),user.getU_password(),user.getU_age(),user.getU_phone(),user.getU_teacherId(),user.getU_post());
			return isTrue;
		}
		return false;

	}

	@Override
	public boolean delete(User user) {
		int limit = user.getU_limit();
		if(limit==1) {       //是否为管理员
			String sql = "delete from u_teacher where u_teacherId=? and u_post=?;";
			boolean isTrue = DAOConnection.dbDMLWithSQL(sql, user.getU_teacherId(),user.getU_post());
			return isTrue;
	}
		return false;

	}

	@Override
	public Group findGroup(String g_leaderId) {
		String sql = "select * from u_group where g_leaderId=?;";            //查找小组组长所有项目小组信息
		List<Group> groups = DAOConnection.dbDQLWithSQL(sql, Group.class, g_leaderId);
		return groups.get(0);
	}

	@Override
	public boolean alterData(User user, Group group, Object... objects) {
		int limit = user.getU_limit();
		if(limit!=1||limit!=2) {            //判别是否是管理员
			return false;
		}
		//根据ID修改项目小组数据
		String sql = "update u_group set g_name=?,g_leader=?,g_members=?,g_expain=?,g_class=?,g_membersNumber=?,g_count=? where g_leaderId = ?;";
		boolean isTrue = DAOConnection.dbDMLWithSQL(sql, objects,group.getG_leaderId());
		return isTrue;
	}

}
