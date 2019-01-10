package com.shixun.springboot.dao.impl;

import com.shixun.springboot.dao.AdminDao;
import com.shixun.springboot.dao.SuperAdminDao;
import com.shixun.springboot.dao.UserDao;
import com.shixun.springboot.model.Group;
import com.shixun.springboot.model.User;
import com.shixun.springboot.utils.DAOConnection;

public class SuperAdminDaoImpl extends AdminDaoImpl implements UserDao,AdminDao,SuperAdminDao{

    @Override
    public boolean addPermission(User user,String u_name,String u_teacherId){
        //赋予普通教师成为学院管理员的权限
        String sql = "update u_user set u_limit='1' where u_name= ?,u_teacherId= ?;";
        boolean isTrue = DAOConnection.dbDMLWithSQL(sql,user.getU_name(),user.getU_teacherId());
        return isTrue;
    }

    @Override
    public boolean deletePermission(User user,String u_name,String u_teacherId) {
        //去除学院管理员的权限
        String sql = "update u_user set u_limit='0' where u_name= ?,u_teacherId= ?;";
        boolean isTrue = DAOConnection.dbDMLWithSQL(sql,user.getU_name(),user.getU_teacherId());
        return isTrue;
    }

}
