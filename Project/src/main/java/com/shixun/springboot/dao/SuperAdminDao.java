package com.shixun.springboot.dao;

import com.shixun.springboot.model.Group;
import com.shixun.springboot.model.User;

public interface SuperAdminDao extends AdminDao{
    /*
    *   继承Admin中的所有方法
    */
    public boolean addPermission(User user,String u_name,String u_teacherId);   //增添管理员权限
    public boolean deletePermission(User user,String u_name,String u_teacherId);   //去除管理员权限

}
