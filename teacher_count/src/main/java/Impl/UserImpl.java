package Impl;


import dao.UserDao;
import model.*;
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

    @Override
    public void changePersonal(String teacherId, int age, String name, String phone) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        User user = session.get(User.class, teacherId);
        user.setName(name);
        user.setAge(age);
        user.setPhone(phone);
        session.update(user);
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
    public void findTeam(String name) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();

        Criteria criteria = session.createCriteria(Team.class);
        criteria.add(Restrictions.eq("numb1", name));
        criteria.add(Restrictions.or(Restrictions.eq("numb2", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb3", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb4", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb5", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb6", name)));
        List<Team> list = criteria.list();
        for (Team team : list)
            System.out.println(team);

        transaction.commit();
    }

    @Override
    public void TeamData(String teacherId, String name, String kind, String allNumber
            , String num1, String num2, String num3, String num4, String num5, String num6, String Atime1, String Status1) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(Team.class, teacherId) == null) {
            Team team = new Team();
            team.setTeacherId(teacherId);
            team.setName(name);
            team.setKind(kind);
            team.setAllNumber(allNumber);
            team.setNumb1(num1);
            team.setNumb2(num2);
            team.setNumb4(num3);
            team.setNumb4(num4);
            team.setNumb5(num5);
            team.setNumb6(num6);
            team.setAtime1(Atime1);
            team.setStatus1(Status1);
            session.save(team);
        } else {
            Team team = session.get(Team.class, teacherId);
            team.setName(name);
            team.setKind(kind);
            team.setAllNumber(allNumber);
            team.setNumb1(num1);
            team.setNumb2(num2);
            team.setNumb4(num3);
            team.setNumb4(num4);
            team.setNumb5(num5);
            team.setNumb6(num6);
            team.setAtime1(Atime1);
            session.update(team);
        }
        transaction.commit();

    }

    @Override
    public void RRuleData(String teacherId, String Name, String Unit, String kind, String Id, String STime, String ETime, String Ifexist, String Department, String Industry) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(RRule.class, teacherId) == null) {
            RRule rRule = new RRule();
            rRule.setTeacherId(teacherId);
            rRule.setName(Name);
            rRule.setUnit(Unit);
            rRule.setKind(kind);
            rRule.setId(Id);
            rRule.setSTime(STime);
            rRule.setETime(ETime);
            rRule.setIfExist(Ifexist);
            rRule.setDeparment(Department);
            rRule.setIndustry(Industry);
            session.save(rRule);
        } else {
            RRule rRule = session.get(RRule.class, teacherId);
            rRule.setName(Name);
            rRule.setUnit(Unit);
            rRule.setKind(kind);
            rRule.setId(Id);
            rRule.setSTime(STime);
            rRule.setETime(ETime);
            rRule.setIfExist(Ifexist);
            rRule.setDeparment(Department);
            rRule.setIndustry(Industry);
            session.update(rRule);
        }
        transaction.commit();

    }

    @Override
    public void PRRuleData(String teacherId, int ID, String Kind, String Name, String Sex, String Education, String Job, String Unit, int Contribution) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(PRRule.class, teacherId) == null) {
            PRRule prRule = new PRRule();
            prRule.setTeacherId(teacherId);
            prRule.setID(ID);
            prRule.setKind(Kind);
            prRule.setSex(Sex);
            prRule.setEducation(Education);
            prRule.setJob(Job);
            prRule.setUnit(Unit);
            prRule.setContribution(Contribution);
            session.save(prRule);
        } else {
            PRRule prRule = session.get(PRRule.class, teacherId);
            prRule.setTeacherId(teacherId);
            prRule.setID(ID);
            prRule.setKind(Kind);
            prRule.setSex(Sex);
            prRule.setEducation(Education);
            prRule.setJob(Job);
            prRule.setUnit(Unit);
            prRule.setContribution(Contribution);
            session.update(prRule);
        }

        transaction.commit();

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
