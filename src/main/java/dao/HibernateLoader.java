package dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateLoader  {

    private static SessionFactory sessionFactory = null;

    /**
     * Method return static field sessionFactory referenced on SessionFactory object created by configuration
     * @return SessionFactory object
     */
    static {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }
    /**
     * Method shutdown SessionFactory object
     */
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
