package daoTest;


import Impl.UserImpl;
import dao.UserDao;
import model.User;
import org.junit.Test;

public class UserDaoImplTest {
    UserDao userDao = new UserImpl();

    @Test
    public void personal(){
        String teacherId="1";
        userDao.personal(teacherId);
    }

    @Test
    public void changePWD(){
        String teacherId="1";
        String password="one cat";
        userDao.changePWD(teacherId,password);

    }
    @Test
    public void Count(){

        String  teacherId="1";
        userDao.Count(teacherId);

    }
}
