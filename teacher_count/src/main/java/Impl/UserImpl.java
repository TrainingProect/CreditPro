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
        System.out.println(user);
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

        //根据姓名在表中查询相关实体信息
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
    public void findRRule(String name) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();

        //确认是否为小组成员
        Criteria criteria = session.createCriteria(Team.class);
        criteria.add(Restrictions.eq("numb1", name));
        criteria.add(Restrictions.or(Restrictions.eq("numb2", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb3", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb4", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb5", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb6", name)));
        List<Team> list = criteria.list();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getTeacherId();
            Criteria criteria1 = session.createCriteria(RRule.class);
            criteria1.add(Restrictions.eq("teacherId", id));
            List<RRule> list1 = criteria1.list();
            for (RRule rRule : list1)
                System.out.println(rRule);
        }

        transaction.commit();
    }


    @Override
    public void findAward(String name) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        //确认是否为小组成员
        Criteria criteria = session.createCriteria(Team.class);
        criteria.add(Restrictions.eq("numb1", name));
        criteria.add(Restrictions.or(Restrictions.eq("numb2", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb3", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb4", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb5", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb6", name)));
        List<Team> list = criteria.list();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getTeacherId();
            Criteria criteria1 = session.createCriteria(Award.class);
            criteria1.add(Restrictions.eq("teacherId", id));
            List<Award> list1 = criteria1.list();
            for (Award award : list1)
                System.out.println(award);
        }
        transaction.commit();
    }


    @Override
    public void findLunWen(String name) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        //确认是否为小组成员
        Criteria criteria = session.createCriteria(Team.class);
        criteria.add(Restrictions.eq("numb1", name));
        criteria.add(Restrictions.or(Restrictions.eq("numb2", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb3", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb4", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb5", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb6", name)));
        List<Team> list = criteria.list();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getTeacherId();
            Criteria criteria1 = session.createCriteria(LunWen.class);
            criteria1.add(Restrictions.eq("teacherId", id));
            List<LunWen> list1 = criteria.list();
            for (LunWen lunWen : list1)
                System.out.println(lunWen);
        }
        transaction.commit();
    }

    @Override
    public void findIdentify(String name) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        //确认是否为小组成员
        Criteria criteria = session.createCriteria(Team.class);
        criteria.add(Restrictions.eq("numb1", name));
        criteria.add(Restrictions.or(Restrictions.eq("numb2", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb3", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb4", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb5", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb6", name)));
        List<Team> list = criteria.list();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getTeacherId();
            Criteria criteria1 = session.createCriteria(Identify.class);
            criteria1.add(Restrictions.eq("teacherId", id));
            List<Identify> list1 = criteria.list();
            for (Identify identify : list1)
                System.out.println(identify);
        }
        transaction.commit();
    }

    @Override
    public void findDProject(String name) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        //确认是否为小组成员
        Criteria criteria = session.createCriteria(Team.class);
        criteria.add(Restrictions.eq("numb1", name));
        criteria.add(Restrictions.or(Restrictions.eq("numb2", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb3", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb4", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb5", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb6", name)));
        List<Team> list = criteria.list();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getTeacherId();
            Criteria criteria1 = session.createCriteria(DProject.class);
            criteria1.add(Restrictions.eq("teacherId", id));
            List<DProject> list1 = criteria.list();
            for (DProject dProject : list1)
                System.out.println(dProject);
        }
        transaction.commit();
    }

    @Override
    public void findArt(String name) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        //确认是否为小组成员
        Criteria criteria = session.createCriteria(Team.class);
        criteria.add(Restrictions.eq("numb1", name));
        criteria.add(Restrictions.or(Restrictions.eq("numb2", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb3", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb4", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb5", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb6", name)));
        List<Team> list = criteria.list();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getTeacherId();
            Criteria criteria1 = session.createCriteria(Art.class);
            criteria1.add(Restrictions.eq("teacherId", id));
            List<Art> list1 = criteria.list();
            for (Art art : list1)
                System.out.println(art);
        }
        transaction.commit();
    }

    @Override
    public void findBook(String name) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        //确认是否为小组成员
        Criteria criteria = session.createCriteria(Team.class);
        criteria.add(Restrictions.eq("numb1", name));
        criteria.add(Restrictions.or(Restrictions.eq("numb2", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb3", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb4", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb5", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb6", name)));
        List<Team> list = criteria.list();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getTeacherId();
            Criteria criteria1 = session.createCriteria(Book.class);
            criteria1.add(Restrictions.eq("teacherId", id));
            List<Book> list1 = criteria.list();
            for (Book book : list1)
                System.out.println(book);
        }
        transaction.commit();
    }

    @Override
    public void findLaw(String name) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        //确认是否为小组成员
        Criteria criteria = session.createCriteria(Team.class);
        criteria.add(Restrictions.eq("numb1", name));
        criteria.add(Restrictions.or(Restrictions.eq("numb2", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb3", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb4", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb5", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb6", name)));
        List<Team> list = criteria.list();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getTeacherId();
            Criteria criteria1 = session.createCriteria(Law.class);
            criteria1.add(Restrictions.eq("teacherId", id));
            List<Law> list1 = criteria.list();
            for (Law law : list1)
                System.out.println(law);
        }
        transaction.commit();
    }


    @Override
    public void findPAward(String name) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        //确认是否为小组成员
        Criteria criteria = session.createCriteria(Team.class);
        criteria.add(Restrictions.eq("numb1", name));
        criteria.add(Restrictions.or(Restrictions.eq("numb2", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb3", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb4", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb5", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb6", name)));
        List<Team> list = criteria.list();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getTeacherId();
            Criteria criteria1 = session.createCriteria(PAward.class);
            criteria1.add(Restrictions.eq("teacherId", id));
            List<PAward> list1 = criteria.list();
            for (PAward pAward : list1)
                System.out.println(pAward);
        }
        transaction.commit();
    }

    @Override
    public void findPRRule(String name) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        //确认是否为小组成员
        Criteria criteria = session.createCriteria(Team.class);
        criteria.add(Restrictions.eq("numb1", name));
        criteria.add(Restrictions.or(Restrictions.eq("numb2", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb3", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb4", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb5", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb6", name)));
        List<Team> list = criteria.list();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getTeacherId();
            Criteria criteria1 = session.createCriteria(PRRule.class);
            criteria1.add(Restrictions.eq("teacherId", id));
            List<PRRule> list1 = criteria.list();
            for (PRRule prRule : list1)
                System.out.println(prRule);
        }
        transaction.commit();
    }

    @Override
    public void findPLunWen(String name) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        //确认是否为小组成员
        Criteria criteria = session.createCriteria(Team.class);
        criteria.add(Restrictions.eq("numb1", name));
        criteria.add(Restrictions.or(Restrictions.eq("numb2", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb3", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb4", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb5", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb6", name)));
        List<Team> list = criteria.list();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getTeacherId();
            Criteria criteria1 = session.createCriteria(PLunWen.class);
            criteria1.add(Restrictions.eq("teacherId", id));
            List<PLunWen> list1 = criteria.list();
            for (PLunWen pLunWen : list1)
                System.out.println(pLunWen);
        }
        transaction.commit();

    }

    @Override
    public void findPIdentify(String name) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        //确认是否为小组成员
        Criteria criteria = session.createCriteria(Team.class);
        criteria.add(Restrictions.eq("numb1", name));
        criteria.add(Restrictions.or(Restrictions.eq("numb2", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb3", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb4", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb5", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb6", name)));
        List<Team> list = criteria.list();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getTeacherId();
            Criteria criteria1 = session.createCriteria(PIdentify.class);
            criteria1.add(Restrictions.eq("teacherId", id));
            List<PIdentify> list1 = criteria.list();
            for (PIdentify pIdentify : list1)
                System.out.println(pIdentify);
        }
        transaction.commit();
    }

    @Override
    public void findPDProject(String name) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        //确认是否为小组成员
        Criteria criteria = session.createCriteria(Team.class);
        criteria.add(Restrictions.eq("numb1", name));
        criteria.add(Restrictions.or(Restrictions.eq("numb2", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb3", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb4", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb5", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb6", name)));
        List<Team> list = criteria.list();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getTeacherId();
            Criteria criteria1 = session.createCriteria(PDProject.class);
            criteria1.add(Restrictions.eq("teacherId", id));
            List<PDProject> list1 = criteria.list();
            for (PDProject pdProject : list1)
                System.out.println(pdProject);
        }
        transaction.commit();
    }

    @Override
    public void findPArt(String name) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        //确认是否为小组成员
        Criteria criteria = session.createCriteria(Team.class);
        criteria.add(Restrictions.eq("numb1", name));
        criteria.add(Restrictions.or(Restrictions.eq("numb2", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb3", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb4", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb5", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb6", name)));
        List<Team> list = criteria.list();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getTeacherId();
            Criteria criteria1 = session.createCriteria(PArt.class);
            criteria1.add(Restrictions.eq("teacherId", id));
            List<PArt> list1 = criteria.list();
            for (PArt pArt : list1)
                System.out.println(pArt);
        }
        transaction.commit();
    }

    @Override
    public void findPBook(String name) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        //确认是否为小组成员
        Criteria criteria = session.createCriteria(Team.class);
        criteria.add(Restrictions.eq("numb1", name));
        criteria.add(Restrictions.or(Restrictions.eq("numb2", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb3", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb4", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb5", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb6", name)));
        List<Team> list = criteria.list();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getTeacherId();
            Criteria criteria1 = session.createCriteria(PBook.class);
            criteria1.add(Restrictions.eq("teacherId", id));
            List<PBook> list1 = criteria.list();
            for (PBook pBook : list1)
                System.out.println(pBook);
        }
        transaction.commit();
    }

    @Override
    public void findPLaw(String name) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        //确认是否为小组成员
        Criteria criteria = session.createCriteria(Team.class);
        criteria.add(Restrictions.eq("numb1", name));
        criteria.add(Restrictions.or(Restrictions.eq("numb2", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb3", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb4", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb5", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb6", name)));
        List<Team> list = criteria.list();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getTeacherId();
            Criteria criteria1 = session.createCriteria(PLaw.class);
            criteria1.add(Restrictions.eq("teacherId", id));
            List<PLaw> list1 = criteria.list();
            for (PLaw pLaw : list1)
                System.out.println(pLaw);
        }
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
            session.save(team);
        } else {
            if ((session.get(Team.class, teacherId).getTeacherId() == teacherId)
                    || (session.get(User.class, teacherId).getLimit1() == 1)
                    || (session.get(User.class, teacherId).getLimit1() == 2)) {

                Team team = session.get(Team.class, teacherId);
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
                session.update(team);
            } else
                System.out.println("你无权修改,请联系项目组长或管理员进行修改");
        }
        transaction.commit();

    }


    @Override
    public void AwardData(String teacherId, String AwardName, String ResultName, String Unit, int AwardNumber, String Department, String AwardTime, String Level1, String Level2, String CompleteUnit, int CompleteNumber, int UnitLevel, String AwardID, String StudyType, String OneStudy, String ProjectSource, String Kind1, String Kind2, String Award) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(Award.class, teacherId) == null) {
            Award award = new Award();
            award.setTeacherId(teacherId);
            award.setAwardName(AwardName);
            award.setResultName(ResultName);
            award.setUnit(Unit);
            award.setAwardNumber(AwardNumber);
            award.setDepartment(Department);
            award.setAwardTime(AwardTime);
            award.setLevel1(Level1);
            award.setLevel2(Level2);
            award.setCompleteUnit(CompleteUnit);
            award.setCompleteNumber(CompleteNumber);
            award.setUnitLevel(UnitLevel);
            award.setAwardID(AwardID);
            award.setStudyType(StudyType);
            award.setOneStudy(OneStudy);
            award.setProjectSource(ProjectSource);
            award.setKind1(Kind1);
            award.setKind2(Kind2);
            award.setAward(Award);
            session.save(award);
        } else {
            if ((session.get(Award.class, teacherId).getTeacherId() == teacherId)
                    || (session.get(User.class, teacherId).getLimit1() == 1)
                    || (session.get(User.class, teacherId).getLimit1() == 2)) {

                Award award = session.get(Award.class, teacherId);
                award.setTeacherId(teacherId);
                award.setAwardName(AwardName);
                award.setResultName(ResultName);
                award.setUnit(Unit);
                award.setAwardNumber(AwardNumber);
                award.setDepartment(Department);
                award.setAwardTime(AwardTime);
                award.setLevel1(Level1);
                award.setLevel2(Level2);
                award.setCompleteUnit(CompleteUnit);
                award.setCompleteNumber(CompleteNumber);
                award.setUnitLevel(UnitLevel);
                award.setAwardID(AwardID);
                award.setStudyType(StudyType);
                award.setOneStudy(OneStudy);
                award.setProjectSource(ProjectSource);
                award.setKind1(Kind1);
                award.setKind2(Kind2);
                award.setAward(Award);
                session.update(award);
            } else
                System.out.println("你无权修改,请联系项目组长或管理员进行修改");


        }
        transaction.commit();
    }


    @Override
    public void LunWenData(String teacherId, String Title, String Kind, String STime, String PublicationName, String Collection, String Unit, String StudyType, String OneStudy, String ProjectSource, int Count, String School, String PublicationLevel, String IfTranslation, String CN, String PublicationRange) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(LunWen.class, teacherId) == null) {
            LunWen lunWen = new LunWen();
            lunWen.setTeacherId(teacherId);
            lunWen.setTitle(Title);
            lunWen.setKind(Kind);
            lunWen.setSTime(STime);
            lunWen.setPublicationName(PublicationName);
            lunWen.setCollection(Collection);
            lunWen.setUnit(Unit);
            lunWen.setStudyType(StudyType);
            lunWen.setOneStudy(OneStudy);
            lunWen.setProjectSource(ProjectSource);
            lunWen.setCount(Count);
            lunWen.setSchool(School);
            lunWen.setPublicationLevel(PublicationLevel);
            lunWen.setIfTranslation(IfTranslation);
            lunWen.setCN(CN);
            lunWen.setPublicationRange(PublicationRange);
            session.save(lunWen);
        } else {
            if ((session.get(LunWen.class, teacherId).getTeacherId() == teacherId)
                    || (session.get(User.class, teacherId).getLimit1() == 1)
                    || (session.get(User.class, teacherId).getLimit1() == 2)) {

                LunWen lunWen = session.get(LunWen.class, teacherId);
                lunWen.setTeacherId(teacherId);
                lunWen.setTitle(Title);
                lunWen.setKind(Kind);
                lunWen.setSTime(STime);
                lunWen.setPublicationName(PublicationName);
                lunWen.setCollection(Collection);
                lunWen.setUnit(Unit);
                lunWen.setStudyType(StudyType);
                lunWen.setOneStudy(OneStudy);
                lunWen.setProjectSource(ProjectSource);
                lunWen.setCount(Count);
                lunWen.setSchool(School);
                lunWen.setPublicationLevel(PublicationLevel);
                lunWen.setIfTranslation(IfTranslation);
                lunWen.setCN(CN);
                lunWen.setPublicationRange(PublicationRange);
                session.update(lunWen);
            } else
                System.out.println("你无权修改,请联系项目组长或管理员进行修改");


        }
        transaction.commit();
    }


    @Override
    public void DProjectData(String teacherId, String ID, String ResultName, String Unit, String ProjectUnit, String ETime, String IfApply, String StudyType, String ApplyObject, String OneStudy, String ProjectSource, String School, String Evaluate, int Money1, int Money2) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(DProject.class, teacherId) == null) {
            DProject dProject = new DProject();
            dProject.setTeacherId(teacherId);
            dProject.setID(ID);
            dProject.setResultName(ResultName);
            dProject.setUnit(Unit);
            dProject.setProjectSource(ProjectSource);
            dProject.setETime(ETime);
            dProject.setIfApply(IfApply);
            dProject.setStudyType(StudyType);
            dProject.setApplyObject(ApplyObject);
            dProject.setOneStudy(OneStudy);
            dProject.setProjectUnit(ProjectUnit);
            dProject.setSchool(School);
            dProject.setEvaluate(Evaluate);
            dProject.setMoney1(Money1);
            dProject.setMoney2(Money2);
            session.save(dProject);
        } else {
            if ((session.get(DProject.class, teacherId).getTeacherId() == teacherId)
                    || (session.get(User.class, teacherId).getLimit1() == 1)
                    || (session.get(User.class, teacherId).getLimit1() == 2)) {
                DProject dProject = session.get(DProject.class, teacherId);
                dProject.setTeacherId(teacherId);
                dProject.setID(ID);
                dProject.setResultName(ResultName);
                dProject.setUnit(Unit);
                dProject.setProjectSource(ProjectSource);
                dProject.setETime(ETime);
                dProject.setIfApply(IfApply);
                dProject.setStudyType(StudyType);
                dProject.setApplyObject(ApplyObject);
                dProject.setOneStudy(OneStudy);
                dProject.setProjectUnit(ProjectUnit);
                dProject.setSchool(School);
                dProject.setEvaluate(Evaluate);
                dProject.setMoney1(Money1);
                dProject.setMoney2(Money2);
                session.update(dProject);
            } else
                System.out.println("你无权修改,请联系项目组长或管理员进行修改");
        }

        transaction.commit();
    }

    @Override
    public void ArtData(String teacherId, String ResultName, String Unit, String STime, String PublicationName, String IfAward, String Kind, String School) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(Art.class, teacherId) == null) {
            Art art = new Art();
            art.setTeacherId(teacherId);
            art.setResultName(ResultName);
            art.setUnit(Unit);
            art.setSTime(STime);
            art.setPublicationName(PublicationName);
            art.setIfAward(IfAward);
            art.setKind(Kind);
            art.setSchool(School);
            session.save(art);
        } else {
            if ((session.get(Art.class, teacherId).getTeacherId() == teacherId)
                    || (session.get(User.class, teacherId).getLimit1() == 1)
                    || (session.get(User.class, teacherId).getLimit1() == 2)) {

                Art art = session.get(Art.class, teacherId);
                art.setTeacherId(teacherId);
                art.setResultName(ResultName);
                art.setUnit(Unit);
                art.setSTime(STime);
                art.setPublicationName(PublicationName);
                art.setIfAward(IfAward);
                art.setKind(Kind);
                art.setSchool(School);
                session.update(art);
            } else
                System.out.println("你无权修改,请联系项目组长或管理员进行修改");


        }

        transaction.commit();
    }

    @Override
    public void BookData(String teacherId, String Name, String Unit, String PublishUnit, String StartTime, String Sp, String Kind, String StudyType, String OneStudy, String ProjectSource, int Count, String IfTranslation, String School, String Language, String ISBN, String CIP, String Level, String IfAid, String Introduction) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(Book.class, teacherId) == null) {
            Book book = new Book();
            book.setTeacherId(teacherId);
            book.setName(Name);
            book.setUnit(Unit);
            book.setPublishUnit(PublishUnit);
            book.setStartTime(StartTime);
            book.setSp(Sp);
            book.setKind(Kind);
            book.setStudyType(StudyType);
            book.setProjectSource(ProjectSource);
            book.setCount(Count);
            book.setIfTranslation(IfTranslation);
            book.setSchool(School);
            book.setLanguage(Language);
            book.setISBN(ISBN);
            book.setCIP(CIP);
            book.setLevel(Level);
            book.setIfAid(IfAid);
            book.setIntroduction(Introduction);
            session.save(book);
        } else {
            if ((session.get(Book.class, teacherId).getTeacherId() == teacherId)
                    || (session.get(User.class, teacherId).getLimit1() == 1)
                    || (session.get(User.class, teacherId).getLimit1() == 2)) {
                Book book = session.get(Book.class, teacherId);
                book.setTeacherId(teacherId);
                book.setName(Name);
                book.setUnit(Unit);
                book.setPublishUnit(PublishUnit);
                book.setStartTime(StartTime);
                book.setSp(Sp);
                book.setKind(Kind);
                book.setStudyType(StudyType);
                book.setProjectSource(ProjectSource);
                book.setCount(Count);
                book.setIfTranslation(IfTranslation);
                book.setSchool(School);
                book.setLanguage(Language);
                book.setISBN(ISBN);
                book.setCIP(CIP);
                book.setLevel(Level);
                book.setIfAid(IfAid);
                book.setIntroduction(Introduction);
                session.update(book);
            } else
                System.out.println("你无权修改,请联系项目组长或管理员进行修改");

        }

        transaction.commit();
    }

    @Override
    public void LawData(String teacherId, String Name, String ID, String Unit, String Registration, String Kind, String STime, String StudyType, String OneStudy) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(Law.class, teacherId) == null) {
            Law law = new Law();
            law.setTeacherId(teacherId);
            law.setName(Name);
            law.setID(ID);
            law.setUnit(Unit);
            law.setRegistration(Registration);
            law.setKind(Kind);
            law.setSTime(STime);
            law.setStudyType(StudyType);
            law.setOneStudy(OneStudy);
            session.save(law);
        } else {
            if ((session.get(Law.class, teacherId).getTeacherId() == teacherId)
                    || (session.get(User.class, teacherId).getLimit1() == 1)
                    || (session.get(User.class, teacherId).getLimit1() == 2)) {
                Law law = session.get(Law.class, teacherId);
                law.setTeacherId(teacherId);
                law.setName(Name);
                law.setID(ID);
                law.setUnit(Unit);
                law.setRegistration(Registration);
                law.setKind(Kind);
                law.setSTime(STime);
                law.setStudyType(StudyType);
                law.setOneStudy(OneStudy);
                session.update(law);
            } else
                System.out.println("你无权修改,请联系项目组长或管理员进行修改");
        }

        transaction.commit();
    }
//----------------------

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
            if ((session.get(PRRule.class, teacherId).getTeacherId() == teacherId)
                    || (session.get(User.class, teacherId).getLimit1() == 1)
                    || (session.get(User.class, teacherId).getLimit1() == 2)) {
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
            } else
                System.out.println("你无权修改,请联系项目组长或管理员进行修改");

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
            if ((session.get(RRule.class, teacherId).getTeacherId() == teacherId)
                    || (session.get(User.class, teacherId).getLimit1() == 1)
                    || (session.get(User.class, teacherId).getLimit1() == 2)) {
                RRule rRule = session.get(RRule.class, teacherId);
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
                session.update(rRule);
            } else
                System.out.println("你无权修改,请联系项目组长或管理员进行修改");
        }
        transaction.commit();

    }

    @Override
    public void PAwardData(String teacherId, int ID, String Kind, String Name, String Sex, String Education, String Job, String Unit, int Contribution) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(PAward.class, teacherId) == null) {
            PAward pAward = new PAward();
            pAward.setTeacherId(teacherId);
            pAward.setID(ID);
            pAward.setKind(Kind);
            pAward.setSex(Sex);
            pAward.setEducation(Education);
            pAward.setJob(Job);
            pAward.setUnit(Unit);
            pAward.setContribution(Contribution);
            session.save(pAward);
        } else {
            if ((session.get(PAward.class, teacherId).getTeacherId() == teacherId)
                    || (session.get(User.class, teacherId).getLimit1() == 1)
                    || (session.get(User.class, teacherId).getLimit1() == 2)) {
                PAward pAward = session.get(PAward.class, teacherId);
                pAward.setTeacherId(teacherId);
                pAward.setID(ID);
                pAward.setKind(Kind);
                pAward.setSex(Sex);
                pAward.setEducation(Education);
                pAward.setJob(Job);
                pAward.setUnit(Unit);
                pAward.setContribution(Contribution);
                session.update(pAward);
            } else
                System.out.println("你无权修改,请联系项目组长或管理员进行修改");
        }

        transaction.commit();
    }

    @Override
    public void IdentifyData(String teacherId, String ResultName, String Unit, String Department, String STime, String Level, String CompleteWay, String StudyType, String OneStudy, String TwoStudy, String ProjectSource, String School, String CompleteUnit, String ID, String Conclusion) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(Identify.class, teacherId) == null) {
            Identify identify = new Identify();
            identify.setTeacherId(teacherId);
            identify.setResultName(ResultName);
            identify.setUnit(Unit);
            identify.setDepartment(Department);
            identify.setSTime(STime);
            identify.setLevel(Level);
            identify.setCompleteWay(CompleteWay);
            identify.setStudyType(StudyType);
            identify.setOneStudy(OneStudy);
            identify.setTwoStudy(TwoStudy);
            identify.setProjectSource(ProjectSource);
            identify.setSchool(School);
            identify.setCompleteUnit(CompleteUnit);
            identify.setID(ID);
            identify.setConclusion(Conclusion);
            session.save(identify);
        } else {
            if ((session.get(Identify.class, teacherId).getTeacherId() == teacherId)
                    || (session.get(User.class, teacherId).getLimit1() == 1)
                    || (session.get(User.class, teacherId).getLimit1() == 2)) {
                Identify identify = session.get(Identify.class, teacherId);
                identify.setResultName(ResultName);
                identify.setTeacherId(teacherId);
                identify.setUnit(Unit);
                identify.setDepartment(Department);
                identify.setSTime(STime);
                identify.setLevel(Level);
                identify.setCompleteWay(CompleteWay);
                identify.setStudyType(StudyType);
                identify.setOneStudy(OneStudy);
                identify.setTwoStudy(TwoStudy);
                identify.setProjectSource(ProjectSource);
                identify.setSchool(School);
                identify.setCompleteUnit(CompleteUnit);
                identify.setID(ID);
                identify.setConclusion(Conclusion);
                session.update(identify);

            } else
                System.out.println("你无权修改,请联系项目组长或管理员进行修改");
        }
        transaction.commit();
    }

    @Override
    public void PIdentifyData(String teacherId, int ID, String Kind, String Name, String Sex, String Education, String Job, String Unit, int Contribution) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(PIdentify.class, teacherId) == null) {
            PIdentify pIdentify = new PIdentify();
            pIdentify.setTeacherId(teacherId);
            pIdentify.setID(ID);
            pIdentify.setKind(Kind);
            pIdentify.setSex(Sex);
            pIdentify.setEducation(Education);
            pIdentify.setJob(Job);
            pIdentify.setUnit(Unit);
            pIdentify.setContribution(Contribution);
            session.save(pIdentify);
        } else {
            if ((session.get(PIdentify.class, teacherId).getTeacherId() == teacherId)
                    || (session.get(User.class, teacherId).getLimit1() == 1)
                    || (session.get(User.class, teacherId).getLimit1() == 2)) {
                PIdentify pIdentify = session.get(PIdentify.class, teacherId);
                pIdentify.setTeacherId(teacherId);
                pIdentify.setID(ID);
                pIdentify.setKind(Kind);
                pIdentify.setSex(Sex);
                pIdentify.setEducation(Education);
                pIdentify.setJob(Job);
                pIdentify.setUnit(Unit);
                pIdentify.setContribution(Contribution);
                session.update(pIdentify);
            } else
                System.out.println("你无权修改,请联系项目组长或管理员进行修改");
        }

        transaction.commit();
    }

    @Override
    public void PDProjectData(String teacherId, int ID, String Kind, String Name, String Sex, String Education, String Job, String Unit, int Contribution) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(PDProject.class, teacherId) == null) {
            PDProject pdProject = new PDProject();
            pdProject.setTeacherId(teacherId);
            pdProject.setID(ID);
            pdProject.setKind(Kind);
            pdProject.setName(Name);
            pdProject.setSex(Sex);
            pdProject.setEducation(Education);
            pdProject.setJob(Job);
            pdProject.setUnit(Unit);
            pdProject.setContribution(Contribution);
            session.save(pdProject);
        } else {
            if ((session.get(PDProject.class, teacherId).getTeacherId() == teacherId)
                    || (session.get(User.class, teacherId).getLimit1() == 1)
                    || (session.get(User.class, teacherId).getLimit1() == 2)) {
                PDProject pdProject = session.get(PDProject.class, teacherId);
                pdProject.setTeacherId(teacherId);
                pdProject.setID(ID);
                pdProject.setKind(Kind);
                pdProject.setName(Name);
                pdProject.setSex(Sex);
                pdProject.setEducation(Education);
                pdProject.setJob(Job);
                pdProject.setUnit(Unit);
                pdProject.setContribution(Contribution);
                session.update(pdProject);
            } else
                System.out.println("你无权修改,请联系项目组长或管理员进行修改");
        }

        transaction.commit();
    }

    @Override
    public void PArtData(String teacherId, int ID, String Kind, String Name, String Sex, String Education, String Job, String Unit, int Contribution) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(PArt.class, teacherId) == null) {
            PArt pArt = new PArt();
            pArt.setTeacherId(teacherId);
            pArt.setID(ID);
            pArt.setKind(Kind);
            pArt.setName(Name);
            pArt.setSex(Sex);
            pArt.setEducation(Education);
            pArt.setJob(Job);
            pArt.setUnit(Unit);
            pArt.setContribution(Contribution);
            session.save(pArt);
        } else {
            if ((session.get(PArt.class, teacherId).getTeacherId() == teacherId)
                    || (session.get(User.class, teacherId).getLimit1() == 1)
                    || (session.get(User.class, teacherId).getLimit1() == 2)) {
                PArt pArt = session.get(PArt.class, teacherId);
                pArt.setTeacherId(teacherId);
                pArt.setID(ID);
                pArt.setKind(Kind);
                pArt.setName(Name);
                pArt.setSex(Sex);
                pArt.setEducation(Education);
                pArt.setJob(Job);
                pArt.setUnit(Unit);
                pArt.setContribution(Contribution);
                session.update(pArt);
            } else
                System.out.println("你无权修改,请联系项目组长或管理员进行修改");
        }

        transaction.commit();
    }

    @Override
    public void PBookData(String teacherId, int ID, String Kind, String Name, String Sex, String Education, String Job, String Unit, int Contribution, String Role, int Count) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(PBook.class, teacherId) == null) {
            PBook pBook = new PBook();
            pBook.setTeacherId(teacherId);
            pBook.setID(ID);
            pBook.setKind(Kind);
            pBook.setName(Name);
            pBook.setSex(Sex);
            pBook.setEducation(Education);
            pBook.setJob(Job);
            pBook.setUnit(Unit);
            pBook.setContribution(Contribution);
            pBook.setWRole(Role);
            pBook.setCount(Count);
            session.save(pBook);
        } else {
            if ((session.get(PBook.class, teacherId).getTeacherId() == teacherId)
                    || (session.get(User.class, teacherId).getLimit1() == 1)
                    || (session.get(User.class, teacherId).getLimit1() == 2)) {
                PBook pBook = session.get(PBook.class, teacherId);
                pBook.setTeacherId(teacherId);
                pBook.setID(ID);
                pBook.setKind(Kind);
                pBook.setName(Name);
                pBook.setSex(Sex);
                pBook.setEducation(Education);
                pBook.setJob(Job);
                pBook.setUnit(Unit);
                pBook.setContribution(Contribution);
                pBook.setWRole(Role);
                pBook.setCount(Count);
                session.update(pBook);
            } else
                System.out.println("你无权修改,请联系项目组长或管理员进行修改");

        }

        transaction.commit();
    }

    @Override
    public void PLawData(String teacherId, int ID, String Kind, String Name, String Sex, String Education, String Job, String Unit, int Contribution) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(PLaw.class, teacherId) == null) {
            PLaw pLaw = new PLaw();
            pLaw.setTeacherId(teacherId);
            pLaw.setID(ID);
            pLaw.setKind(Kind);
            pLaw.setName(Name);
            pLaw.setSex(Sex);
            pLaw.setEducation(Education);
            pLaw.setJob(Job);
            pLaw.setUnit(Unit);
            pLaw.setContribution(Contribution);
            session.save(pLaw);
        } else {
            if ((session.get(PLaw.class, teacherId).getTeacherId() == teacherId)
                    || (session.get(User.class, teacherId).getLimit1() == 1)
                    || (session.get(User.class, teacherId).getLimit1() == 2)) {
                PLaw pLaw = session.get(PLaw.class, teacherId);
                pLaw.setTeacherId(teacherId);
                pLaw.setID(ID);
                pLaw.setKind(Kind);
                pLaw.setName(Name);
                pLaw.setSex(Sex);
                pLaw.setEducation(Education);
                pLaw.setJob(Job);
                pLaw.setUnit(Unit);
                pLaw.setContribution(Contribution);
                session.update(pLaw);
            } else
                System.out.println("你无权修改,请联系项目组长或管理员进行修改");

        }

        transaction.commit();
    }

    @Override
    public void PLunWenData(String teacherId, int ID, String Kind, String Name, String Sex, String Education, String Job, String Unit, int Contribution, String IfTell) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(PLunWen.class, teacherId) == null) {
            PLunWen pLunWen = new PLunWen();
            pLunWen.setTeacherId(teacherId);
            pLunWen.setID(ID);
            pLunWen.setKind(Kind);
            pLunWen.setSex(Sex);
            pLunWen.setEducation(Education);
            pLunWen.setJob(Job);
            pLunWen.setUnit(Unit);
            pLunWen.setContribution(Contribution);
            pLunWen.setIfTell(IfTell);
            session.save(pLunWen);
        } else {
            if ((session.get(User.class, teacherId).getTeacherId() == teacherId)
                    || (session.get(User.class, teacherId).getLimit1() == 1)
                    || (session.get(User.class, teacherId).getLimit1() == 2)) {
                PLunWen pLunWen = session.get(PLunWen.class, teacherId);
                pLunWen.setTeacherId(teacherId);
                pLunWen.setID(ID);
                pLunWen.setKind(Kind);
                pLunWen.setSex(Sex);
                pLunWen.setEducation(Education);
                pLunWen.setJob(Job);
                pLunWen.setUnit(Unit);
                pLunWen.setIfTell(IfTell);
                pLunWen.setContribution(Contribution);
                session.update(pLunWen);
            } else
                System.out.println("你无权修改,请联系项目组长或管理员进行修改");

            transaction.commit();
        }
    }

    @Override
    public void Count(String name) {
       /* Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        //教研和教材业绩量化
        //找到参与项目
        Criteria criteria = session.createCriteria(Team.class);
        criteria.add(Restrictions.eq("numb1", name));
        criteria.add(Restrictions.or(Restrictions.eq("numb2", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb3", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb4", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb5", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb6", name)));
        List<Team> list = criteria.list();
        double sumart = 0;
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getTeacherId();
            //艺术作品类
            Criteria criteria1 = session.createCriteria(Art.class);
            criteria1.add(Restrictions.eq("teacherId", id));
            List<Art> list1 = criteria.list();
            for (Art art : list1) {
                if (session.get(Art.class, id).getPublicationName() == "新华文摘（全文转载）"
                        || session.get(Art.class, id).getPublicationName() == "中国社会科学") {
                    if (session.get(Art.class, id).getSchool() == "第一单位") {
                        int i = session.get(PArt.class, name).getContribution();
                        int i = session.get(PArt.class, name).getContribution();
                        sumart = sumart + 800 * i;
                    } else if (session.get(Art.class, id).getSchool() == "非第一单位") {
                        int i = session.get(PArt.class, name).getContribution();
                        sumart = sumart + 800 * 0.3 * i;
                    }
                }
                //一级期刊
                else if (session.get(Art.class, id).getPublicationName() == "人文社会科学引文索引(SSCI)"
                        || session.get(Art.class, id).getPublicationName() == "艺术与人文科学引文索引(A&HCI)"
                        || session.get(Art.class, id).getPublicationName() == "三报专论"
                        || session.get(Art.class, id).getPublicationName() == "人民日报"
                        || session.get(Art.class, id).getPublicationName() == "光明日报"
                        || session.get(Art.class, id).getPublicationName() == "经济日报"
                        || session.get(Art.class, id).getPublicationName() == "求是杂志"
                        || session.get(Art.class, id).getPublicationName() == "中国教育报理论文章") {
                    if (session.get(Art.class, id).getSchool() == "第一单位") {
                        int i = session.get(PArt.class, name).getContribution();
                        sumart = sumart + 600;
                    } else if (session.get(Art.class, id).getSchool() == "非第一单位") {
                        int i = session.get(PArt.class, name).getContribution();
                        sumart = sumart + 600 * 0.3 * i;
                    }
                }
                //二级期刊
                else if (session.get(Art.class, id).getPublicationName() == "文艺研究"
                        || session.get(Art.class, id).getPublicationName() == "中央音乐学院学报"
                        || session.get(Art.class, id).getPublicationName() == "装饰"
                        || session.get(Art.class, id).getPublicationName() == "中国社会科学文摘(全文转载)"
                        || session.get(Art.class, id).getPublicationName() == "高校文科学报文摘(全文转载)"
                        || session.get(Art.class, id).getPublicationName() == "新华文摘(转载1/2以上)") {
                    if (session.get(Art.class, id).getSchool() == "第一单位") {
                        int i = session.get(PArt.class, name).getContribution();
                        sumart = sumart + 400;
                    } else if (session.get(Art.class, id).getSchool() == "非第一单位") {
                        int i = session.get(PArt.class, name).getContribution();
                        sumart = sumart + 400 * 0.3 * i;
                    }
                }
                //三级期刊
                else if (session.get(Art.class, id).getPublicationName() == "美术观察"
                        || session.get(Art.class, id).getPublicationName() == " 艺术百家"
                        || session.get(Art.class, id).getPublicationName() == "电影艺术") {
                    if (session.get(Art.class, id).getSchool() == "第一单位") {
                        int i = session.get(PArt.class, name).getContribution();
                        sumart = sumart + 200;
                    } else if (session.get(Art.class, id).getSchool() == "非第一单位") {
                        int i = session.get(PArt.class, name).getContribution();
                        sumart = sumart + 200 * 0.3 * i;
                    }
                }
                //四级期刊
                else if (session.get(Art.class, id).getPublicationName() == "其他CSSCI来源期刊"
                        || session.get(Art.class, id).getPublicationName() == "中国社会科学文摘(转摘1/2以上)"
                        || session.get(Art.class, id).getPublicationName() == "高校文科学报文摘(转摘1/2以上)"
                        || session.get(Art.class, id).getPublicationName() == "河南日报"
                        || session.get(Art.class, id).getPublicationName() == "中国教育报（2500字以上）"
                        || session.get(Art.class, id).getPublicationName() == "人大复印资料(全文转载)") {
                    if (session.get(Art.class, id).getSchool() == "第一单位") {
                        int i = session.get(PArt.class, name).getContribution();
                        sumart = sumart + 120;
                    } else if (session.get(Art.class, id).getSchool() == "非第一单位") {
                        int i = session.get(PArt.class, name).getContribution();
                        sumart = sumart + 120 * 0.3 * i;
                    }
                }
                //五级期刊
                else if (session.get(Art.class, id).getPublicationName() == "CSSCI扩展版期刊"
                        || session.get(Art.class, id).getPublicationName() == "CSSCI集刊"
                        || session.get(Art.class, id).getPublicationName() == "一般外文期刊"
                        || session.get(Art.class, id).getPublicationName() == "SCD数据库来源期刊") {
                    if (session.get(Art.class, id).getSchool() == "第一单位") {
                        int i = session.get(PArt.class, name).getContribution();
                        sumart = sumart + 60;
                    } else if (session.get(Art.class, id).getSchool() == "非第一单位") {
                        int i = session.get(PArt.class, name).getContribution();
                        sumart = sumart + 60 * 0.3 * i;
                    }
                }
                //六级期刊
                else if (session.get(Art.class, id).getPublicationName() == "北大中文核心期刊"
                        || session.get(Art.class, id).getPublicationName() == "新华文摘(要点摘编)"
                        || session.get(Art.class, id).getPublicationName() == "SCD数据库来源期刊") {
                    if (session.get(Art.class, id).getSchool() == "第一单位") {
                        int i = session.get(PArt.class, name).getContribution();
                        sumart = sumart + 30;
                    } else if (session.get(Art.class, id).getSchool() == "非第一单位") {
                        int i = session.get(PArt.class, name).getContribution();
                        sumart = sumart + 30 * 0.3 * i;
                    }
                }
                //七级
                else if (session.get(Art.class, id).getPublicationName() == "CPCI-SSH(ISSHP)收录"
                        || session.get(Art.class, id).getPublicationName() == "中原工学院学报") {
                    if (session.get(Art.class, id).getSchool() == "第一单位") {
                        int i = session.get(PArt.class, name).getContribution();
                        sumart = sumart + 6;
                    } else if (session.get(Art.class, id).getSchool() == "非第一单位") {
                        int i = session.get(PArt.class, name).getContribution();
                        sumart = sumart + 6 * 0.3 * i;
                    }
                }


            }
            //获奖类
            Criteria criteria3 = session.createCriteria(Award.class);
            criteria1.add(Restrictions.eq("teacherId", id));
            List<Award> list3 = criteria.list();
            for (Award award : list3) {

            }
        }

        transaction.commit();
    }*/
    }

    @Override
    public void SCount(String name) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        //教研和教材业绩量化
        //找到参与项目
        Criteria criteria = session.createCriteria(Team.class);
        criteria.add(Restrictions.eq("numb1", name));
        criteria.add(Restrictions.or(Restrictions.eq("numb2", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb3", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb4", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb5", name)));
        criteria.add(Restrictions.or(Restrictions.eq("numb6", name)));
        List<Team> list = criteria.list();
        double sumart = 0;
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getTeacherId();
            //科研项目绩点
            if (session.get(Team.class, id).getKind() == "国家级重大")
                sumart += 800 * 1.7;
            else if (session.get(Team.class, id).getKind() == "国家级重点项目")
                sumart += 400 * 1.6;
            else if (session.get(Team.class, id).getKind() == "国家级一般项目")
                sumart += 200 * 1.5;
            else if (session.get(Team.class, id).getKind() == "省部级重大")
                sumart += 60 * 1.5;
            else if (session.get(Team.class, id).getKind() == "省部级重点项目")
                sumart += 60 * 1.4;
            else if (session.get(Team.class, id).getKind() == "省部级一般项目")
                sumart += 30 * 1.2;
            else if (session.get(Team.class, id).getKind() == "市厅级重大项目")
                sumart += 10 * 1.1;
            else if (session.get(Team.class, id).getKind() == "市厅级重点项目")
                sumart += 10 * 1.1;
            else if (session.get(Team.class, id).getKind() == "市厅级一般项目")
                sumart += 10 * 1.1;
            else if (session.get(Team.class, id).getKind() == "横向项目")
                sumart += 0;
            //科研成果业绩量化
            //论文
            if (session.get(PLunWen.class, id).getIfTell() == "是"
                    && session.get(LunWen.class, id).getSchool() == "第一单位") {
                if (session.get(LunWen.class, id).getCollection() == "EI")
                    if (session.get(LunWen.class, id).getKind() == "中文普通期刊"
                            || session.get(LunWen.class, id).getKind() == "中文核心期刊"
                            || session.get(LunWen.class, id).getKind() == "外文期刊")
                        sumart += 60 * 1;
            } else if (session.get(PLunWen.class, id).getIfTell() == "是"
                    && session.get(LunWen.class, id).getSchool() == "非第一单位") {
                if (session.get(LunWen.class, id).getCollection() == "EI")
                    if (session.get(LunWen.class, id).getKind() == "会议论文")
                        sumart += 8 * 0.3;
            }
            //知识产权
           /*
           *
           *
           * */
            //著作
            if (session.get(Book.class, id).getLevel() == "一级"
                    && (session.get(Book.class, id).getLanguage() == "外文"
                    || session.get(Book.class, id).getLanguage() == "少数名族文字图书"
                    || session.get(Book.class, id).getLanguage() == "拼音图书")
                    && (session.get(PBook.class, id).getWRole() == "著")) {
                sumart += (session.get(PBook.class, id).getCount() * 6 * 1.3 * 1 * 1.3) * (session.get(PBook.class, id).getContribution() / 100);
            } else if (session.get(Book.class, id).getLevel() == "一级"
                    && (session.get(Book.class, id).getLanguage() == "外文"
                    || session.get(Book.class, id).getLanguage() == "少数名族文字图书"
                    || session.get(Book.class, id).getLanguage() == "拼音图书")
                    && (session.get(PBook.class, id).getWRole() == "编著、译著")) {
                sumart += (session.get(PBook.class, id).getCount() * 3.5 * 1.3 * 1 * 1.3) * (session.get(PBook.class, id).getContribution() / 100);
            } else if (session.get(Book.class, id).getLevel() == "一级"
                    && (session.get(Book.class, id).getLanguage() == "外文"
                    || session.get(Book.class, id).getLanguage() == "少数名族文字图书"
                    || session.get(Book.class, id).getLanguage() == "拼音图书")
                    && (session.get(PBook.class, id).getWRole() == "编")) {
                sumart += (session.get(PBook.class, id).getCount() * 1.5 * 1.3 * 1 * 1.3) * (session.get(PBook.class, id).getContribution() / 100);
            } else if (session.get(Book.class, id).getLevel() == "二级"
                    && (session.get(Book.class, id).getLanguage() == "外文"
                    || session.get(Book.class, id).getLanguage() == "少数名族文字图书"
                    || session.get(Book.class, id).getLanguage() == "拼音图书")
                    && (session.get(PBook.class, id).getWRole() == "著")) {
                sumart += (session.get(PBook.class, id).getCount() * 6 * 1 * 1 * 1.3) * (session.get(PBook.class, id).getContribution() / 100);
            } else if (session.get(Book.class, id).getLevel() == "二级"
                    && (session.get(Book.class, id).getLanguage() == "外文"
                    || session.get(Book.class, id).getLanguage() == "少数名族文字图书"
                    || session.get(Book.class, id).getLanguage() == "拼音图书")
                    && (session.get(PBook.class, id).getWRole() == "编著、译著")) {
                sumart += (session.get(PBook.class, id).getCount() * 3.5 * 1 * 1 * 1.3) * (session.get(PBook.class, id).getContribution() / 100);
            } else if (session.get(Book.class, id).getLevel() == "二级"
                    && (session.get(Book.class, id).getLanguage() == "外文"
                    || session.get(Book.class, id).getLanguage() == "少数名族文字图书"
                    || session.get(Book.class, id).getLanguage() == "拼音图书")
                    && (session.get(PBook.class, id).getWRole() == "编")) {
                sumart += (session.get(PBook.class, id).getCount() * 1.5 * 1 * 1 * 1.3) * (session.get(PBook.class, id).getContribution() / 100);
            } else if (session.get(Book.class, id).getLevel() == "三级"
                    && (session.get(Book.class, id).getLanguage() == "外文"
                    || session.get(Book.class, id).getLanguage() == "少数名族文字图书"
                    || session.get(Book.class, id).getLanguage() == "拼音图书")
                    && (session.get(PBook.class, id).getWRole() == "著")) {
                sumart += (session.get(PBook.class, id).getCount() * 6 * 0.8 * 1 * 1.3) * (session.get(PBook.class, id).getContribution() / 100);
            } else if (session.get(Book.class, id).getLevel() == "三级"
                    && (session.get(Book.class, id).getLanguage() == "外文"
                    || session.get(Book.class, id).getLanguage() == "少数名族文字图书"
                    || session.get(Book.class, id).getLanguage() == "拼音图书")
                    && (session.get(PBook.class, id).getWRole() == "编著、译著")) {
                sumart += (session.get(PBook.class, id).getCount() * 3.5 * 0.8 * 1 * 1.3) * (session.get(PBook.class, id).getContribution() / 100);
            } else if (session.get(Book.class, id).getLevel() == "三级"
                    && (session.get(Book.class, id).getLanguage() == "外文"
                    || session.get(Book.class, id).getLanguage() == "少数名族文字图书"
                    || session.get(Book.class, id).getLanguage() == "拼音图书")
                    && (session.get(PBook.class, id).getWRole() == "编")) {
                sumart += (session.get(PBook.class, id).getCount() * 1.5 * 0.8 * 1 * 1.3) * (session.get(PBook.class, id).getContribution() / 100);
            } else if (session.get(Book.class, id).getLevel() == "四级"
                    && (session.get(Book.class, id).getLanguage() == "外文"
                    || session.get(Book.class, id).getLanguage() == "少数名族文字图书"
                    || session.get(Book.class, id).getLanguage() == "拼音图书")
                    && (session.get(PBook.class, id).getWRole() == "著")) {
                sumart += (session.get(PBook.class, id).getCount() * 6 * 0.5 * 1 * 1.3) * (session.get(PBook.class, id).getContribution() / 100);
            } else if (session.get(Book.class, id).getLevel() == "四级"
                    && (session.get(Book.class, id).getLanguage() == "外文"
                    || session.get(Book.class, id).getLanguage() == "少数名族文字图书"
                    || session.get(Book.class, id).getLanguage() == "拼音图书")
                    && (session.get(PBook.class, id).getWRole() == "编著、译著")) {
                sumart += (session.get(PBook.class, id).getCount() * 3.5 * 0.5 * 1 * 1.3) * (session.get(PBook.class, id).getContribution() / 100);
            } else if (session.get(Book.class, id).getLevel() == "四级"
                    && (session.get(Book.class, id).getLanguage() == "外文"
                    || session.get(Book.class, id).getLanguage() == "少数名族文字图书"
                    || session.get(Book.class, id).getLanguage() == "拼音图书")
                    && (session.get(PBook.class, id).getWRole() == "编")) {
                sumart += (session.get(PBook.class, id).getCount() * 1.5 * 0.5 * 1 * 1.3) * (session.get(PBook.class, id).getContribution() / 100);
            } else if (session.get(Book.class, id).getLevel() == "一级"
                    && session.get(PBook.class, id).getWRole() == "著"
                    && (session.get(Book.class, id).getLanguage() != "外文"
                    || session.get(Book.class, id).getLanguage() != "少数名族文字图书"
                    || session.get(Book.class, id).getLanguage() != "拼音图书")) {
                sumart += (session.get(PBook.class, id).getCount() * 6 * 1.3 * 1) * (session.get(PBook.class, id).getContribution() / 100);
            } else if (session.get(Book.class, id).getLevel() == "一级"
                    && (session.get(Book.class, id).getLanguage() == "外文"
                    || session.get(Book.class, id).getLanguage() != "少数名族文字图书"
                    || session.get(Book.class, id).getLanguage() != "拼音图书")
                    && (session.get(PBook.class, id).getWRole() != "编著、译著")) {
                sumart += (session.get(PBook.class, id).getCount() * 3.5 * 1.3 * 1) * (session.get(PBook.class, id).getContribution() / 100);
            } else if (session.get(Book.class, id).getLevel() == "一级"
                    && (session.get(Book.class, id).getLanguage() != "外文"
                    || session.get(Book.class, id).getLanguage() != "少数名族文字图书"
                    || session.get(Book.class, id).getLanguage() != "拼音图书")
                    && (session.get(PBook.class, id).getWRole() == "编")) {
                sumart += (session.get(PBook.class, id).getCount() * 1.5 * 1.3 * 1) * (session.get(PBook.class, id).getContribution() / 100);
            } else if (session.get(Book.class, id).getLevel() == "二级"
                    && (session.get(Book.class, id).getLanguage() != "外文"
                    || session.get(Book.class, id).getLanguage() != "少数名族文字图书"
                    || session.get(Book.class, id).getLanguage() != "拼音图书")
                    && (session.get(PBook.class, id).getWRole() == "著")) {
                sumart += (session.get(PBook.class, id).getCount() * 6 * 1 * 1) * (session.get(PBook.class, id).getContribution() / 100);
            } else if (session.get(Book.class, id).getLevel() == "二级"
                    && (session.get(Book.class, id).getLanguage() != "外文"
                    || session.get(Book.class, id).getLanguage() != "少数名族文字图书"
                    || session.get(Book.class, id).getLanguage() != "拼音图书")
                    && (session.get(PBook.class, id).getWRole() == "编著、译著")) {
                sumart += (session.get(PBook.class, id).getCount() * 3.5 * 1 * 1) * (session.get(PBook.class, id).getContribution() / 100);
            } else if (session.get(Book.class, id).getLevel() == "二级"
                    && (session.get(Book.class, id).getLanguage() != "外文"
                    || session.get(Book.class, id).getLanguage() != "少数名族文字图书"
                    || session.get(Book.class, id).getLanguage() != "拼音图书")
                    && (session.get(PBook.class, id).getWRole() == "编")) {
                sumart += (session.get(PBook.class, id).getCount() * 1.5 * 1 * 1) * (session.get(PBook.class, id).getContribution() / 100);
            } else if (session.get(Book.class, id).getLevel() == "三级"
                    && (session.get(Book.class, id).getLanguage() != "外文"
                    || session.get(Book.class, id).getLanguage() != "少数名族文字图书"
                    || session.get(Book.class, id).getLanguage() != "拼音图书")
                    && (session.get(PBook.class, id).getWRole() == "著")) {
                sumart += (session.get(PBook.class, id).getCount() * 6 * 0.8 * 1) * (session.get(PBook.class, id).getContribution() / 100);
            } else if (session.get(Book.class, id).getLevel() == "三级"
                    && (session.get(Book.class, id).getLanguage() != "外文"
                    || session.get(Book.class, id).getLanguage() != "少数名族文字图书"
                    || session.get(Book.class, id).getLanguage() != "拼音图书")
                    && (session.get(PBook.class, id).getWRole() == "编著、译著")) {
                sumart += (session.get(PBook.class, id).getCount() * 3.5 * 0.8 * 1) * (session.get(PBook.class, id).getContribution() / 100);
            } else if (session.get(Book.class, id).getLevel() == "三级"
                    && (session.get(Book.class, id).getLanguage() != "外文"
                    || session.get(Book.class, id).getLanguage() != "少数名族文字图书"
                    || session.get(Book.class, id).getLanguage() != "拼音图书")
                    && (session.get(PBook.class, id).getWRole() == "编")) {
                sumart += (session.get(PBook.class, id).getCount() * 1.5 * 0.8 * 1) * (session.get(PBook.class, id).getContribution() / 100);
            } else if (session.get(Book.class, id).getLevel() == "四级"
                    && (session.get(Book.class, id).getLanguage() != "外文"
                    || session.get(Book.class, id).getLanguage() != "少数名族文字图书"
                    || session.get(Book.class, id).getLanguage() != "拼音图书")
                    && (session.get(PBook.class, id).getWRole() == "著")) {
                sumart += (session.get(PBook.class, id).getCount() * 6 * 0.5 * 1) * (session.get(PBook.class, id).getContribution() / 100);
            } else if (session.get(Book.class, id).getLevel() == "四级"
                    && (session.get(Book.class, id).getLanguage() != "外文"
                    || session.get(Book.class, id).getLanguage() != "少数名族文字图书"
                    || session.get(Book.class, id).getLanguage() != "拼音图书")
                    && (session.get(PBook.class, id).getWRole() == "编著、译著")) {
                sumart += (session.get(PBook.class, id).getCount() * 3.5 * 0.5 * 1) * (session.get(PBook.class, id).getContribution() / 100);
            } else if (session.get(Book.class, id).getLevel() == "四级"
                    && (session.get(Book.class, id).getLanguage() != "外文"
                    || session.get(Book.class, id).getLanguage() != "少数名族文字图书"
                    || session.get(Book.class, id).getLanguage() != "拼音图书")
                    && (session.get(PBook.class, id).getWRole() == "编")) {
                sumart += (session.get(PBook.class, id).getCount() * 1.5 * 0.5 * 1) * (session.get(PBook.class, id).getContribution() / 100);
            }
            //项目结项（评价没有）
            if (session.get(DProject.class, id).getApplyObject() == "国家"
                    && session.get(DProject.class, id).getEvaluate() == "合格") {
                if (session.get(DProject.class, id).getMoney1() >= 10)
                    sumart += 20 + 3;
                sumart += 20;
            } else if (session.get(DProject.class, id).getApplyObject() == "国家"
                    && session.get(DProject.class, id).getEvaluate() == "良好") {
                if (session.get(DProject.class, id).getMoney1() >= 10)
                    sumart += 50 + 3;
                sumart += 50;
            } else if (session.get(DProject.class, id).getApplyObject() == "国家"
                    && session.get(DProject.class, id).getEvaluate() == "优秀") {
                if (session.get(DProject.class, id).getMoney1() >= 10)
                    sumart += 120 + 3;
                sumart += 120;
            }
            if (session.get(DProject.class, id).getApplyObject() == "省部"
                    && session.get(DProject.class, id).getEvaluate() == "合格") {
                if (session.get(DProject.class, id).getMoney1() >= 10)
                    sumart += 50 + 3;
                sumart += 5;
            } else if (session.get(DProject.class, id).getApplyObject() == "省部"
                    && session.get(DProject.class, id).getEvaluate() == "良好") {
                if (session.get(DProject.class, id).getMoney1() >= 10)
                    sumart += 20 + 3;
                sumart += 20;
            } else if (session.get(DProject.class, id).getApplyObject() == "省部"
                    && session.get(DProject.class, id).getEvaluate() == "优秀") {
                if (session.get(DProject.class, id).getMoney1() >= 10)
                    sumart += 50 + 3;
                sumart += 50;
            }
            if (session.get(DProject.class, id).getApplyObject() == "市厅"
                    && session.get(DProject.class, id).getEvaluate() == "合格") {
                if (session.get(DProject.class, id).getMoney1() >= 10)
                    sumart += 3 + 3;
                sumart += 3;
            } else if (session.get(DProject.class, id).getApplyObject() == "市厅"
                    && session.get(DProject.class, id).getEvaluate() == "良好") {
                if (session.get(DProject.class, id).getMoney1() >= 10)
                    sumart += 0 + 3;
                sumart += 0;
            } else if (session.get(DProject.class, id).getApplyObject() == "市厅"
                    && session.get(DProject.class, id).getEvaluate() == "优秀") {
                if (session.get(DProject.class, id).getMoney1() >= 10)
                    sumart += 5 + 3;
                sumart += 5;
            }
            //科研奖励


        }
    }
}
