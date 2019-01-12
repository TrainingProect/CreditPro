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
    public void findRRule(String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(RRule.class, teacherId) == null)
            System.out.println("你并没有参与这个项目");
        else
            System.out.println(session.get(RRule.class, teacherId));
        transaction.commit();
    }


    @Override
    public void findAward(String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(Award.class, teacherId) == null)
            System.out.println("你并没有参与这个项目");
        else
            System.out.println(session.get(Award.class, teacherId));
        transaction.commit();
    }


    @Override
    public void findLunWen(String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(LunWen.class, teacherId) == null)
            System.out.println("你并没有参与这个项目");
        else
            System.out.println(session.get(LunWen.class, teacherId));
        transaction.commit();
    }

    @Override
    public void findIdentify(String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(Identify.class, teacherId) == null)
            System.out.println("你并没有参与这个项目");
        else
            System.out.println(session.get(Identify.class, teacherId));
        transaction.commit();
    }

    @Override
    public void findDProject(String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(DProject.class, teacherId) == null)
            System.out.println("你并没有参与这个项目");
        else
            System.out.println(session.get(DProject.class, teacherId));
        transaction.commit();
    }

    @Override
    public void findArt(String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(Art.class, teacherId) == null)
            System.out.println("你并没有参与这个项目");
        else
            System.out.println(session.get(Art.class, teacherId));
        transaction.commit();
    }

    @Override
    public void findBook(String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(Book.class, teacherId) == null)
            System.out.println("你并没有参与这个项目");
        else
            System.out.println(session.get(Book.class, teacherId));
        transaction.commit();
    }

    @Override
    public void findLaw(String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(Law.class, teacherId) == null)
            System.out.println("你并没有参与这个项目");
        else
            System.out.println(session.get(Law.class, teacherId));
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
            if (session.get(User.class, teacherId).getLimit1() == 1) {
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
            } else
                System.out.println("你无权修改,请联系管理员进行修改");

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
            if (session.get(User.class, teacherId).getLimit1() == 1) {
                Award award = session.get(Award.class, teacherId);
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
                System.out.println("你无权修改,请联系管理员进行修改");
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
            if (session.get(User.class, teacherId).getLimit1() == 1) {
                LunWen lunWen = session.get(LunWen.class, teacherId);
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
                System.out.println("你无权修改,请联系管理员进行修改");
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
            if (session.get(User.class, teacherId).getLimit1() == 1) {
                DProject dProject = session.get(DProject.class, teacherId);
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
                System.out.println("你无权修改,请联系管理员进行修改");
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
            if (session.get(User.class, teacherId).getLimit1() == 1) {
                Art art = session.get(Art.class, teacherId);
                art.setResultName(ResultName);
                art.setUnit(Unit);
                art.setSTime(STime);
                art.setPublicationName(PublicationName);
                art.setIfAward(IfAward);
                art.setKind(Kind);
                art.setSchool(School);
                session.update(art);
            } else
                System.out.println("你无权修改,请联系管理员进行修改");
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
            if (session.get(User.class, teacherId).getLimit1() == 1) {
                Book book = session.get(Book.class, teacherId);
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
                System.out.println("你无权修改,请联系管理员进行修改");
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
            if (session.get(User.class, teacherId).getLimit1() == 1) {
                Law law = session.get(Law.class, teacherId);
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
                System.out.println("你无权修改,请联系管理员进行修改");
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
