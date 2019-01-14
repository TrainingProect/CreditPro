package count.dao.impl;


import count.dao.AdminDao;
import count.model.*;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import count.utils.hibernateutils;

import javax.persistence.Id;
import java.util.List;

public class AdminDaoImpl implements AdminDao {
    @Override
    public void display() {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();

        Criteria criteria = session.createCriteria(User.class);
        List<User> list = criteria.list();
        for (User user : list) {
            System.out.println(user);
        }

        transaction.commit();
    }

/*
    @Override
    public void reviewPersonal(String teacherId,boolean iftrue1,) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(Art.class, teacherId) != null)
            System.out.println(session.get(Art.class, teacherId));
        else if (session.get(PArt.class, teacherId) != null)
            System.out.println(session.get(PArt.class, teacherId));
        else if (session.get(Award.class, teacherId) != null)
            System.out.println(session.get(Award.class, teacherId));
        else if (session.get(PAward.class, teacherId) != null)
            System.out.println(session.get(PAward.class, teacherId));
        else if (session.get(Book.class, teacherId) != null)
            System.out.println(session.get(Book.class, teacherId));
        else if (session.get(PBook.class, teacherId) != null)
            System.out.println(session.get(PBook.class, teacherId));
        else if (session.get(DProject.class, teacherId) != null)
            System.out.println(session.get(DProject.class, teacherId));
        else if (session.get(PDProject.class, teacherId) != null)
            System.out.println(session.get(PDProject.class, teacherId));
        else if (session.get(Identify.class, teacherId) != null)
            System.out.println(session.get(Identify.class, teacherId));
        else if (session.get(PIdentify.class, teacherId) != null)
            System.out.println(session.get(PIdentify.class, teacherId));
        else if (session.get(Law.class, teacherId) != null)
            System.out.println(session.get(Law.class, teacherId));
        else if (session.get(PLaw.class, teacherId) != null)
            System.out.println(session.get(PLaw.class, teacherId));
        else if (session.get(LunWen.class, teacherId) != null)
            System.out.println(session.get(LunWen.class, teacherId));
        else if (session.get(PLunWen.class, teacherId) != null)
            System.out.println(session.get(PLunWen.class, teacherId));
        else if (session.get(RRule.class, teacherId) != null)
            System.out.println(session.get(RRule.class, teacherId));
        else if (session.get(PRRule.class, teacherId) != null)
            System.out.println(session.get(PRRule.class, teacherId));
        else if (session.get(Team.class, teacherId) != null)
            System.out.println(session.get(Team.class, teacherId));

        transaction.commit();
    }
*/

    @Override
    public void InsertUser(User user, String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();

        if (session.get(User.class, teacherId) != null) {
            session.save(user);
        } else
            System.out.println("用户已经存在");
        transaction.commit();
    }



    @Override
    public void UpdateUser(int age, String teacherId, String name, String phone, String post, int limit, int count, String password) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();

        Admin admin = (Admin) session.get(Admin.class, teacherId);
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
        if (session.get(User.class, teacherId) != null) {
            User user = (User) session.get(User.class, teacherId);
            session.delete(user);
        } else
            System.out.println("用户不存在");
        transaction.commit();
    }

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> List<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends User> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<User> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<User> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends User> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends User> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}


}
