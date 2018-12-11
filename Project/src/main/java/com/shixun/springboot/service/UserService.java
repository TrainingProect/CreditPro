package com.shixun.springboot.service;



import java.util.List;

import com.shixun.springboot.model.User;
public interface UserService {
	
	public User personal(String u_teacherId);//显示个人信息
	
	public boolean change(User user , Object...objects);
}
