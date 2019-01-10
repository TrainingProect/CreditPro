package Impl;


import dao.AdminDao;
import model.Admin;
import model.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import utils.hibernateutils;

import java.util.List;

public class AdminDaoImpl implements AdminDao {
    @Override
    public void display() {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();

        Criteria criteria = session.createCriteria(User.class);
        List<User> list = criteria.list();
        for (User user:list){
            System.out.println(user);
        }

        transaction.commit();
    }

    @Override
    public void InsertUser(User user,String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();

        if(session.get(User.class,teacherId)!=null){
            session.save(user);
        }
        else
            System.out.println("用户已经存在");
        transaction.commit();
    }

    @Override
    public void FindID(String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();

        Criteria criteria = session.createCriteria(User.class);
        criteria.add(Restrictions.like("teacherId",teacherId, MatchMode.ANYWHERE));
        List<User> list = criteria.list();
        for (User user:list){
            System.out.println(user);
        }
        transaction.commit();
    }

    @Override
    public void FindName(String name) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(User.class);
        criteria.add(Restrictions.like("name",name, MatchMode.ANYWHERE));
        List<User> list = criteria.list();
        for (User user:list){
            System.out.println(user);
        }
        transaction.commit();
    }

    @Override
    public void UpdateUser(int age,String teacherId,String name,String phone,String post,int limit,int count,String  password) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        Admin admin=session.get(Admin.class,teacherId);

        admin.setTeacherId(teacherId);
        admin.setName(name);
        admin.setPassword(password);
        admin.setAge(age);
        admin.setPhone(phone);
        admin.setPost(post);
        admin.setCount(count);
        admin.setLimit1(limit);

        session.update(admin);

        transaction.commit();
    }

    @Override
    public void DeleteUser(String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if(session.get(User.class,teacherId)!=null){
            User user=session.get(User.class,teacherId);
            session.delete(user);
        }
        else
            System.out.println("用户不存在");
        transaction.commit();
    }
}
