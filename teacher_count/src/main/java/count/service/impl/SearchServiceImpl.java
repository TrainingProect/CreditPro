package count.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import com.mysql.fabric.xmlrpc.base.Array;

import count.model.Art;
import count.model.Award;
import count.model.Book;
import count.model.DProject;
import count.model.Identify;
import count.model.Law;
import count.model.LunWen;
import count.model.PArt;
import count.model.PAward;
import count.model.PBook;
import count.model.PDProject;
import count.model.PIdentify;
import count.model.PLaw;
import count.model.PLunWen;
import count.model.PRRule;
import count.model.RRule;
import count.model.Team;
import count.model.User;
import count.service.SearchService;
import count.utils.hibernateutils;
@Service
public class SearchServiceImpl implements SearchService{
	
	@Override
	public User personal(String teacherId) {
	    Session session = hibernateutils.openSession();
	    Transaction transaction = session.beginTransaction();
//	    User user = session.get(User.class, teacherId);
	    User user = (User)session.get(User.class,teacherId);
	    transaction.commit();
	    return user;

	}
	@Override
	public List<Team> findTeam(String name) {
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
	    return list;
	}

	
	
	
	@Override
	public List<RRule> findRRule(String name) {
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
	    List<RRule> list1 = new ArrayList<RRule>();
	    for (Team team : list) {
	        //根据小组组长Id来查看本组的相关表信息
	        String id = team.getZuzhangId();
	        Criteria criteria1 = session.createCriteria(RRule.class);
	        criteria1.add(Restrictions.eq("zuzhangId", id));
	        list1 = criteria1.list();
//	        for (RRule rRule : list1)
//	            System.out.println(rRule);
	    }
	    transaction.commit();
	    return list1;
	}
	
	
	@Override
	public List<Award> findAward(String name) {
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
	    List<Award> list1 = new ArrayList<Award>();
	    for (Team team : list) {
	        //根据小组组长Id来查看本组的相关表信息
	        String id = team.getZuzhangId();
	        Criteria criteria1 = session.createCriteria(Award.class);
	        criteria1.add(Restrictions.eq("zuzhangId", id));
	        list1 = criteria1.list();
//	        for (Award award : list1)
//	            System.out.println(award);
	    }
	    transaction.commit();
	    return list1;
	}
	
	
	@Override
	public List<LunWen> findLunWen(String name) {
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
	    List<LunWen> list1 = new ArrayList<LunWen>();
	    for (Team team : list) {
	        //根据小组组长Id来查看本组的相关表信息
	        String id = team.getZuzhangId();
	        Criteria criteria1 = session.createCriteria(LunWen.class);
	        criteria1.add(Restrictions.eq("zuzhangId", id));
	        list1 = criteria1.list();
//	        for (LunWen lunWen : list1)
//	            System.out.println(lunWen);
	    }
	    transaction.commit();
	    return list1;
	}

    @Override
    public List<Identify> findIdentify(String name) {
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
        List<Identify> list1 = new ArrayList<Identify>();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getZuzhangId();
            Criteria criteria1 = session.createCriteria(Identify.class);
            criteria1.add(Restrictions.eq("zuzhangId", id));
            list1 = criteria1.list();
//            for (Identify identify : list1)
//                System.out.println(identify);
        }
        transaction.commit();
        return list1;
    }

    @Override
    public List<DProject> findDProject(String name) {
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
        List<DProject> list1 = new ArrayList<DProject>();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getZuzhangId();
            Criteria criteria1 = session.createCriteria(DProject.class);
            criteria1.add(Restrictions.eq("zuzhangId", id));
            list1 = criteria1.list();
//            for (DProject dProject : list1)
//                System.out.println(dProject);
        }
        transaction.commit();
        return list1;
    }

    @Override
    public List<Art> findArt(String name) {
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
        List<Art> list1 = new ArrayList<Art>();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getZuzhangId();
            Criteria criteria1 = session.createCriteria(Art.class);
            criteria1.add(Restrictions.eq("zuzhangId", id));
            list1 = criteria1.list();
//            for (Art art : list1)
//                System.out.println(art);
        }
        transaction.commit();
        return list1;
    }

    @Override
    public List<Book> findBook(String name) {
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
        List<Book> list1= new ArrayList<Book>();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getZuzhangId();
            Criteria criteria1 = session.createCriteria(Book.class);
            criteria1.add(Restrictions.eq("zuzhangId", id));
             list1 = criteria1.list();
//            for (Book book : list1)
//                System.out.println(book);
        }
        transaction.commit();
        return list1;
    }


    @Override
    public List<Law> findLaw(String name) {
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
        List<Law> list1 = new ArrayList<Law>();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getZuzhangId();
            Criteria criteria1 = session.createCriteria(Law.class);
            criteria1.add(Restrictions.eq("zuzhangId", id));
             list1 = criteria1.list();
//            for (Law law : list1)
//                System.out.println(law);
        }
        transaction.commit();
        return list1;
    }


    @Override
    public List<PAward> findPAward(String name) {
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
        List<PAward> list1 = new ArrayList<PAward>();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getZuzhangId();
            Criteria criteria1 = session.createCriteria(PAward.class);
            criteria1.add(Restrictions.eq("zuzhangId", id));
             list1 = criteria1.list();
//            for (PAward pAward : list1)
//                System.out.println(pAward);
        }
        transaction.commit();
        return list1;
    }

    @Override
    public List<PRRule> findPRRule(String name) {
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
        List<PRRule> list1 = new ArrayList<PRRule>();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getZuzhangId();
            Criteria criteria1 = session.createCriteria(PRRule.class);
            criteria1.add(Restrictions.eq("zuzhangId", id));
             list1 = criteria1.list();
//            for (PRRule prRule : list1)
//                System.out.println(prRule);
        }
        transaction.commit();
        return list1;
    }

    @Override
    public List<PLunWen> findPLunWen(String name) {
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
        List<PLunWen> list1 = new ArrayList<PLunWen>();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getZuzhangId();
            Criteria criteria1 = session.createCriteria(PLunWen.class);
            criteria1.add(Restrictions.eq("zuzhangId", id));
            list1 = criteria1.list();
//            for (PLunWen pLunWen : list1)
//                System.out.println(pLunWen);
        }
        transaction.commit();
        return list1;

    }

    @Override
    public List<PIdentify> findPIdentify(String name) {
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
        List<PIdentify> list1 = new ArrayList<PIdentify>();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getZuzhangId();
            Criteria criteria1 = session.createCriteria(PIdentify.class);
            criteria1.add(Restrictions.eq("zuzhangId", id));
             list1 = criteria1.list();
//            for (PIdentify pIdentify : list1)
//                System.out.println(pIdentify);
        }
        transaction.commit();
        return list1;
    }

    @Override
    public List<PDProject> findPDProject(String name) {
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
        List<PDProject> list1 = new ArrayList<PDProject>();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getZuzhangId();
            Criteria criteria1 = session.createCriteria(PDProject.class);
            criteria1.add(Restrictions.eq("zuzhangId", id));
            list1 = criteria1.list();
//            for (PDProject pdProject : list1)
//                System.out.println(pdProject);
        }
        transaction.commit();
        return list1;
    }

    @Override
    public List<PArt> findPArt(String name) {
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
        List<PArt> list1 = new ArrayList<PArt>();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getZuzhangId();
            Criteria criteria1 = session.createCriteria(PArt.class);
            criteria1.add(Restrictions.eq("zuzhangId", id));
             list1 = criteria1.list();
//            for (PArt pArt : list1)
//                System.out.println(pArt);
        }
        transaction.commit();
        return list1;
    }

    @Override
    public List<PBook> findPBook(String name) {
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
        List<PBook> list1 = new ArrayList<PBook>();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getZuzhangId();
            Criteria criteria1 = session.createCriteria(PBook.class);
            criteria1.add(Restrictions.eq("zuzhangId", id));
            list1 = criteria1.list();
//            for (PBook pBook : list1)
//                System.out.println(pBook);
        }
        transaction.commit();
        return list1;
    }

    @Override
    public List<PLaw> findPLaw(String name) {
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
        List<PLaw> list1 = new ArrayList<PLaw>();
        for (Team team : list) {
            //根据小组组长Id来查看本组的相关表信息
            String id = team.getZuzhangId();
            Criteria criteria1 = session.createCriteria(PLaw.class);
            criteria1.add(Restrictions.eq("zuzhangId", id));
            list1 = criteria1.list();
//            for (PLaw pLaw : list1)
//                System.out.println(pLaw);
        }
        transaction.commit();
        return list1;
    }
}

