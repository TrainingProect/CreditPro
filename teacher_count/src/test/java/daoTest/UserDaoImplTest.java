package daoTest;


import Impl.UserImpl;
import dao.UserDao;
import model.User;
import org.junit.Test;

public class UserDaoImplTest {
    UserDao userDao = new UserImpl();

    @Test
    public void personal() {          //显示个人信息
        String teacherId = "1";
        userDao.personal(teacherId);
    }

    @Test
    public void changePWD() {        //修改密码
        String teacherId = "1";
        String password = "one cat";
        userDao.changePWD(teacherId, password);

    }

    @Test
    public void Count() {           //计算绩点

        String teacherId = "1";
        userDao.Count(teacherId);

    }

    @Test
    public void TeamData() {      //录入项目小组信息
        String teacherId = "201608040118";
        String name = "教师科研项目小组";
        String kind = "实训";
        String allNumber = "庞棣、王宏飞、蔡明";
        String num1 = "庞棣";
        String num2 = "王宏飞";
        String num3 = "蔡明";
        String num4 = null;
        String num5 = null;
        String num6 = null;
        String Atime1 = "看人";
        String Status1 = "1";
        userDao.TeamData(teacherId,name,kind,allNumber,num1,num2,num3,num4,num5,num6,Atime1,Status1);
    }
    @Test
    public void RRuleData(){
        String teacherId = "3";
        String Name = "教师科研项目小组";
        String unit = "实训";
        String kind= "庞棣、王宏飞、蔡明";
        String id = "1";
        String STime = "2019.1.12";
        String ETime = "2019.1.18";
        String Ifexist = "不";
        String Department = "计算机学院";
        String Industry = "IT";
        userDao.RRuleData(teacherId,Name,unit,kind,id,STime,ETime,Ifexist,Department,Industry);
    }
    @Test
    public void PRRuleData(){
        String teacherId = "1";
        int id = 1;
        String kind= "庞棣";
        String Name = "教师科研项目小组";
        String Sex = "男";
        String Education = "2019.1.18";
        String Job="学生";
        String unit = "实训";
        int Contribution = 100;
        userDao.PRRuleData(teacherId,id,kind,Name,Sex,Education,Job,unit,Contribution);
    }
    @Test
    public void findTeam(){
        String  name="赵";
        userDao.findTeam(name);
    }
    @Test
    public void changePersonal(){               //修改个人基本信息
        String teacherId = "201608040118";
        String name="庞棣";
        String phone="13140109160";
        int age=20;
        userDao.changePersonal(teacherId,age,name,phone);
    }

}

