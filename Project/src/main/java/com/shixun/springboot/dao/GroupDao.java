package com.shixun.springboot.dao;

import com.shixun.springboot.model.Group;

public interface GroupDao {

	public void devide(Group group,Object... Objects);
	public boolean addData(Group group);//录入项目小组数据
	
}
