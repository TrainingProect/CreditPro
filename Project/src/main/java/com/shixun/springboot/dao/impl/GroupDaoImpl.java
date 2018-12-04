package com.shixun.springboot.dao.impl;

import com.shixun.springboot.dao.GroupDao;
import com.shixun.springboot.model.Group;
import com.shixun.springboot.utils.DAOConnection;

public class GroupDaoImpl implements GroupDao {

	@Override
	public void devide(Group group,Object... Objects) {
		StringBuilder builder = new StringBuilder();
		String str = group.getG_leader();
		builder.append(str);
		String str0 = group.getG_members();
		builder.append(str0);
//		System.out.println(builder.toString());
		String[] members = builder.toString().split(" ",group.getG_membersNumber());
//		int [] counts = new int[group.getC_membersNumber()];
		String sql = "update u_teacher set u_count=? where u_name=?;";
		for(int i = 0;i < Objects.length;i++) {
			DAOConnection.dbDMLWithSQL(sql, Objects[i],members[i]);
		}
	}

	@Override
	public boolean addData(Group group) {
		String sql = "insert into u_group(g_name,g_leader,g_members,g_expain,g_class,g_membersNumber,g_count) values(?,?,?,?,?,?,?);";
		boolean isTrue = DAOConnection.dbDMLWithSQL(sql, group.getG_name(),group.getG_leader(),group.getG_members(),group.getG_explain(),group.getG_class(),group.getG_membersNumber(),group.getG_count());
		return isTrue;
	}

}
