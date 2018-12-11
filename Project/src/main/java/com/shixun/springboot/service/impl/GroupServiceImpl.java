package com.shixun.springboot.service.impl;

import com.shixun.springboot.dao.GroupDao;
import com.shixun.springboot.dao.impl.GroupDaoImpl;
import com.shixun.springboot.model.Group;
import com.shixun.springboot.service.GroupService;

public class GroupServiceImpl implements GroupService {

	
	GroupDao groupDao = new GroupDaoImpl();
	
	@Override
	public void devide(Group group, Object... Objects) {
		groupDao.devide(group, Objects);
	}

}
