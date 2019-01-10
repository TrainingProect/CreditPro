package com.shixun.springboot.dao;

import java.util.List;

import com.shixun.springboot.model.Admin;
import com.shixun.springboot.model.Group;
import com.shixun.springboot.model.User;

public interface AdminDao extends UserDao{
/*
    UserDao
	public boolean change(User user,Object... objects );//修改个人3项信息

	public User personal(String u_teacherId);//显示个人信息

	public boolean changePWD(User user,String u_password);  //修改密码

	public boolean addData(Object...objects);   //录入项目小组数据

	public boolean applyUpdate(Object...objects);  //申请修改项目小组数据

	public boolean gradeDis(User user, Group group);   //业绩分配
 */
	
	public User findUser(String u_teacherId,String u_post);   //根据职位和学号查询教师用户

	public List<User> findUsers(User user);   //显示所在学院所有教师名称
	
	public boolean insert(User user);        //添加用户
	
	public boolean delete(User user);        //删除用户
	
	public Group findGroup(String g_leaderId);      //查询小组数据功能

	public boolean alterData(User user,Group group,Object...objects);  //修改小组数据

	/*public boolean messagePush(User user);  //消息推送*/
	/*public a_reviewPersonal();   //人工审核*/
	
}
