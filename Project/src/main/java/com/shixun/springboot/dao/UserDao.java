package com.shixun.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.shixun.springboot.model.User;

public interface UserDao {
	
	public boolean change(User user,Object... objects );//修改个人3项信息

	public User personal(String u_teacherId);//显示个人信息
	
	public boolean changePWD(User user,String u_password);
}
