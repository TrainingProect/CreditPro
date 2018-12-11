package com.shixun.springboot.dao.impl;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;

import com.shixun.springboot.dao.UserDao;
import com.shixun.springboot.model.User;

public class UserDaoImplTest {
	UserDao userDao = new UserDaoImpl();


	@Test
	public void changeTest(User user) {
		userDao.change(user, "","","","");
	}
}


