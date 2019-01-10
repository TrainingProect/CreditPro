package Impl;


import dao.UserDao;
import model.PArt;
import model.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import utils.hibernateutils;

import java.util.List;

public class UserImpl implements UserDao {


    @Override
    public void personal(String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        User user = session.get(User.class, teacherId);
        System.out.println("工号:" + user.getTeacherId() + "  姓名" + user.getName() + "  年龄:" + user.getAge()
                + "  联系电话:" + user.getPhone() + "  院系:" + user.getPost() + "  绩点" + user.getCount());
        transaction.commit();
    }

    public void changePWD(String teacherId, String password) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        User user = session.get(User.class, teacherId);
        if (user.getPassword() == password) {
            System.out.println("密码重复,请设置新的密码");
        } else {
            user.setPassword(password);
            session.update(user);
        }

        transaction.commit();
    }

    @Override
    public void addData() {

    }


    @Override
    public void Count(String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();

        if ((session.get(User.class, teacherId)) != null && (session.get(PArt.class, teacherId)) != null) {
            User user = session.get(User.class, teacherId);
            PArt pArt = session.get(PArt.class, teacherId);
            int sum = user.getCount() + pArt.getContribution();
            System.out.println(sum);
        } else {
/*            User user = session.get(User.class, teacherId);
            user.setCount(0);
            session.save(user);*/
            System.out.println("无任何项目绩点");
        }
        transaction.commit();
    }
}
