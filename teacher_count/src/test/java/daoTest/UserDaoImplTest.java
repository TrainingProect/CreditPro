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
        userDao.TeamData(teacherId, name, kind, allNumber, num1, num2, num3, num4, num5, num6, Atime1, Status1);
    }

    @Test
    public void AwardData() {
        String teacherId = "1";
        String AwardName = "1";
        String ResultName = "1";
        String Unit = "1";
        int AwardNumber = 1;
        String Department = "1";
        String AwardTime = "1";
        String Level1 = "1";
        String Level2 = "1";
        String CompleteUnit = "中原工学院";
        int CompleteNumber = 3;
        int UnitLevel = 1;
        String AwardID = "1";
        String StudyType = "1";
        String OneStudy = "1";
        String ProjectSource = "1";
        String Kind1 = "1";
        String Kind2 = "1";
        String Award = "1";
        userDao.AwardData(teacherId, AwardName, ResultName, Unit, AwardNumber, Department, AwardTime, Level1, Level2,
                CompleteUnit, CompleteNumber, UnitLevel, AwardID, StudyType, OneStudy, ProjectSource, Kind1, Kind2, Award);
    }

    @Test
    public void LunWenData() {
        String teacherId = "1";
        String Title = "jiashi ";
        String Kind = "编写";
        String STime = "2019.1.12";
        String PublicationName = "持久层";
        String Collection = "无";
        String Unit = "无";
        String StudyType = "无";
        String OneStud = "无";
        String ProjectSource = "无";
        int Count = 12;
        String School = "无";
        String PublicationLevel = "无";
        String IfTranslation = "无";
        String CN = "无";
        String PublicationRange = "无";
        userDao.LunWenData(teacherId, Title, Kind, STime, PublicationName, Collection, Unit, StudyType, OneStud, ProjectSource, Count, School, PublicationLevel, IfTranslation, CN, PublicationRange);
    }

    @Test
    public void findTeam() {
        String name = "赵";
        userDao.findTeam(name);
    }

    @Test
    public void findRRule() {
        String teacherId = "1";
        userDao.findTeam(teacherId);
    }



    @Test
    public void findLunWen() {
        String teacherId = "1";
        userDao.findLunWen(teacherId);
    }


    @Test
    public void changePersonal() {               //修改个人基本信息
        String teacherId = "201608040118";
        String name = "庞棣";
        String phone = "13140109160";
        int age = 20;
        userDao.changePersonal(teacherId, age, name, phone);
    }

}

