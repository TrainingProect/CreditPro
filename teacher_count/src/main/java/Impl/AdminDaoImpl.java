package Impl;


import dao.AdminDao;
import model.*;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import utils.hibernateutils;

import javax.persistence.Id;
import java.util.List;

public class AdminDaoImpl extends UserImpl implements AdminDao {
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
    public void FindID(String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();

        Criteria criteria = session.createCriteria(User.class);
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
        criteria.add(Restrictions.like("name", name, MatchMode.ANYWHERE));
        List<User> list = criteria.list();
        for (User user : list) {
            System.out.println(user);
        }
        transaction.commit();
    }

    @Override
    public void UpdateUser(int age, String teacherId, String name, String phone, String post, int limit, int count, String password) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        Admin admin = session.get(Admin.class, teacherId);

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
            User user = session.get(User.class, teacherId);
            session.delete(user);
        } else
            System.out.println("用户不存在");
        transaction.commit();
    }


    @Override
    public void findPAward(String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(PAward.class, teacherId) == null)
            System.out.println("你并没有参与这个项目");
        else
            System.out.println(session.get(PAward.class, teacherId));
        transaction.commit();
    }

    @Override
    public void findPRRule(String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(PRRule.class, teacherId) == null)
            System.out.println("你并没有参与这个项目");
        else
            System.out.println(session.get(PRRule.class, teacherId));
        transaction.commit();
    }

    @Override
    public void findPLunWen(String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(PLunWen.class, teacherId) == null)
            System.out.println("你并没有参与这个项目");
        else
            System.out.println(session.get(PLunWen.class, teacherId));
        transaction.commit();

    }

    @Override
    public void findPIdentify(String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(PIdentify.class, teacherId) == null)
            System.out.println("你并没有参与这个项目");
        else
            System.out.println(session.get(PIdentify.class, teacherId));
        transaction.commit();
    }

    @Override
    public void findPDProject(String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(PDProject.class, teacherId) == null)
            System.out.println("你并没有参与这个项目");
        else
            System.out.println(session.get(PDProject.class, teacherId));
        transaction.commit();
    }

    @Override
    public void findPArt(String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(PArt.class, teacherId) == null)
            System.out.println("你并没有参与这个项目");
        else
            System.out.println(session.get(PArt.class, teacherId));
        transaction.commit();
    }

    @Override
    public void findPBook(String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(PBook.class, teacherId) == null)
            System.out.println("你并没有参与这个项目");
        else
            System.out.println(session.get(PBook.class, teacherId));
        transaction.commit();
    }

    @Override
    public void findPLaw(String teacherId) {
        Session session = hibernateutils.openSession();
        Transaction transaction = session.beginTransaction();
        if (session.get(PLaw.class, teacherId) == null)
            System.out.println("你并没有参与这个项目");
        else
            System.out.println(session.get(PLaw.class, teacherId));
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
            if (session.get(User.class, teacherId).getLimit1() == 1) {
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
            } else
                System.out.println("你无权修改,请联系管理员进行修改");
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
            if (session.get(User.class, teacherId).getLimit1() == 1) {
                PAward pAward = session.get(PAward.class, teacherId);
                pAward.setID(ID);
                pAward.setKind(Kind);
                pAward.setSex(Sex);
                pAward.setEducation(Education);
                pAward.setJob(Job);
                pAward.setUnit(Unit);
                pAward.setContribution(Contribution);
                session.update(pAward);
            } else
                System.out.println("你无权修改,请联系管理员进行修改");
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
            if (session.get(User.class, teacherId).getLimit1() == 1) {
                Identify identify = session.get(Identify.class, teacherId);
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
                session.update(identify);
            } else
                System.out.println("你无权修改,请联系管理员进行修改");
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
            if (session.get(User.class, teacherId).getLimit1() == 1) {
                PIdentify pIdentify = session.get(PIdentify.class, teacherId);
                pIdentify.setID(ID);
                pIdentify.setKind(Kind);
                pIdentify.setSex(Sex);
                pIdentify.setEducation(Education);
                pIdentify.setJob(Job);
                pIdentify.setUnit(Unit);
                pIdentify.setContribution(Contribution);
                session.update(pIdentify);
            } else
                System.out.println("你无权修改,请联系管理员进行修改");
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
            if (session.get(User.class, teacherId).getLimit1() == 1) {
                PDProject pdProject = session.get(PDProject.class, teacherId);
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
                System.out.println("你无权修改,请联系管理员进行修改");
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
            if (session.get(User.class, teacherId).getLimit1() == 1) {
                PArt pArt = session.get(PArt.class, teacherId);
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
                System.out.println("你无权修改,请联系管理员进行修改");
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
            if (session.get(User.class, teacherId).getLimit1() == 1) {
                PBook pBook = session.get(PBook.class, teacherId);
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
                System.out.println("你无权修改,请联系管理员进行修改");
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
            if (session.get(User.class, teacherId).getLimit1() == 1) {
                PLaw pLaw = session.get(PLaw.class, teacherId);
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
                System.out.println("你无权修改,请联系管理员进行修改");
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
            if (session.get(User.class, teacherId).getLimit1() == 1) {
                PLunWen pLunWen = session.get(PLunWen.class, teacherId);
                pLunWen.setID(ID);
                pLunWen.setKind(Kind);
                pLunWen.setSex(Sex);
                pLunWen.setEducation(Education);
                pLunWen.setJob(Job);
                pLunWen.setUnit(Unit);
                pLunWen.setContribution(Contribution);
                pLunWen.setIfTell(IfTell);
                session.update(pLunWen);
            } else
                System.out.println("你无权修改,请联系管理员进行修改");
        }

        transaction.commit();
    }
}
