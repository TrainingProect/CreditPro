package daoTest;

import Impl.AdminDaoImpl;
import dao.AdminDao;
import model.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import utils.hibernateutils;

import java.lang.reflect.Array;

public class AdminDaoImplTest {
    AdminDao adminDao = new AdminDaoImpl();

    @Test
    public void display() {
        adminDao.display();
    }

    @Test
    public void InsertUser() {
        String teacherId = "2018080401180";
        Admin admin = new Admin();
        admin.setTeacherId("2016080401180");
        admin.setName("庞棣");
        admin.setPassword("666");
        admin.setPost("计算机学院");
        admin.setAge(21);
        admin.setCount(100);
        admin.setLimit1(1);
        admin.setPhone("110");
        adminDao.InsertUser(admin, teacherId);
    }

    @Test
    public void Find() {
        String teacherId = "201608040118";
        adminDao.FindID(teacherId);
    }

    @Test
    public void FindName() {
        String name = "庞";
        adminDao.FindName(name);
    }

    @Test
    public void UpdateUser() {
        String name = "吴帆666";
        String password = "666";
        int age = 0;
        String phone = "111";
        String teacherId = "2016080401181";
        String post = "计算机学院";
        int count = 21;
        int limit = 0;
        adminDao.UpdateUser(age, teacherId, name, phone, post, limit, count, password);
    }

    @Test
    public void DeleteUser() {
        String teacherId = "2016080401180";
        adminDao.DeleteUser(teacherId);
    }

    @Test
    public void demo() {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();

        String teacherId = "2016080401181";
        /*Admin admin = session.get(Admin.class, teacherId);*/
        System.out.println(session.get(User.class, teacherId));
        /*admin.setName("成功");
        session.update(teacherId,admin);*/
        /*user.setName("成功");
        session.update(teacherId,user);*/
        transaction.commit();
    }
}
