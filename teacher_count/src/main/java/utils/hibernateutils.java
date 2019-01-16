package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibernateutils {
    private static final Configuration cfg;
    private static final SessionFactory sf;
    static {
        cfg=new Configuration().configure();
        sf=cfg.buildSessionFactory();
    }
    public static Session openSession(){
        return sf.openSession();
    }
    //本地线程绑定事务
    public static Session getCurrentSession(){
        return sf.getCurrentSession();
    }


}
