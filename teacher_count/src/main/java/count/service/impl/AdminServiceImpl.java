package count.service.impl;

import count.model.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import count.service.AdminService;
import count.utils.hibernateutils;

import java.util.List;

public class AdminServiceImpl implements AdminService{
    @Override
    public void FindID(String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();

        Criteria criteria = session.createCriteria(User.class);
        //输入部分学号即可查询
        criteria.add(Restrictions.like("teacherId", teacherId, MatchMode.ANYWHERE));
        List<User> list = criteria.list();
        for (User user : list) {
            System.out.println(user);
        }
        transaction.commit();
    }

    @Override
    public void FindName(String name) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(User.class);
        //输入部分名字即可查询
        criteria.add(Restrictions.like("name", name, MatchMode.ANYWHERE));
        List<User> list = criteria.list();
        for (User user : list) {
            System.out.println(user);
        }
        transaction.commit();
    }
}
