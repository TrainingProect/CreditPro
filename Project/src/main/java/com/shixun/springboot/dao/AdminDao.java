package com.shixun.springboot.dao;

import java.util.List;

import com.shixun.springboot.model.Admin;
import com.shixun.springboot.model.Group;
import com.shixun.springboot.model.User;

public interface AdminDao {

	
	public User findUser(String u_teacherId,String u_post);
	public List<User> findUsers(User user);
	
	public boolean insert(User user);
	
	public boolean delete(User user);
	
	public boolean change(User user,String u_password);
	
	public boolean applyUpdate(Group group,Object...objects);//申请修改项目小组数据
	
	public boolean addData(Group group);//录入项目小组数据
	
	public Group findGroup(Group group);//查询小组数据功能
	
	public boolean alterData(User user,Group group,Object...objects);//修改小组数据
	
}
