package com.shixun.springboot.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.shixun.springboot.dao.AdminDao;
import com.shixun.springboot.model.User;

public class AdminDaoImplTest {


	AdminDao adminDao = new AdminDaoImpl();

	@Test
	public void test() {

		List<User> users = adminDao.findUser();
		for(User user : users) {
			System.out.println(user.toString());
		}
	}
	

	
	@Test
	public void findUserTest(){
		User user = adminDao.findUser("111");
		System.out.println(user.toString());
	}
	
	@Test
	public void insertTest() {
		User user = new User("李龙飞","huida2018",25,"13674937997","333","学生",0);
		adminDao.insert(user);
	}
	@Test
	public void changeTest() {
		adminDao.change("111", "123");
	}

}
