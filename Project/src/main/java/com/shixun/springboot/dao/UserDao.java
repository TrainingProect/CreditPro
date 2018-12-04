package com.shixun.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.shixun.springboot.model.User;

public interface UserDao {
	
	public boolean change(User user,Object... objects );//修改个人信息

	public void personal(User user);//显示个人信息
	

}
