package com.shixun.springboot.dao;

import java.util.List;

import com.shixun.springboot.model.Group;
import org.apache.ibatis.annotations.Mapper;

import com.shixun.springboot.model.User;

public interface UserDao {
	
	public boolean change(User user,Object... objects );//修改个人3项信息

	public User personal(String u_teacherId);//显示个人信息
	
	public boolean changePWD(User user,String u_password);  //修改密码

	public boolean addData(Group group,Object...objects);   //录入项目小组数据

	public boolean applyUpdate(Group group,Object...objects);  //申请修改项目小组数据

	public boolean gradeDis(User user, Group group);   //业绩分配

	/*public message();  //消息接收*/
}
