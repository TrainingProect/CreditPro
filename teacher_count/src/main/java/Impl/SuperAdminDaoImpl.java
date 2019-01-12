package Impl;

import dao.SuperAdminDao;
import model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.hibernateutils;

import javax.swing.*;

public class SuperAdminDaoImpl extends AdminDaoImpl implements SuperAdminDao {
    @Override
    public void addPermission(String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(User.class, teacherId) != null) {
            if (session.get(User.class, teacherId).getLimit1() != 1) {
                User user = session.get(User.class, teacherId);
                user.setLimit1(1);
                session.update(user);
                System.out.println("添加成功");
            } else
                System.out.println("该用户已经是管理员了,请勿重复添加");
        } else
            System.out.println("查无此人,请重新输入");
        transaction.commit();
    }

    @Override
    public void deletePermission(String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(User.class, teacherId) != null) {
            if (session.get(User.class, teacherId).getLimit1() == 1) {
                User user = session.get(User.class, teacherId);
                user.setLimit1(0);
                session.update(user);
                System.out.println("删除成功");
            } else
                System.out.println("该用户已经是管理员了,请勿重复添加");
        } else
            System.out.println("查无此人,请重新输入");
        transaction.commit();

    }
}
