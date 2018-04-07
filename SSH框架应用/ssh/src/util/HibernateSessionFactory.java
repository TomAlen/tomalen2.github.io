package util;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class HibernateSessionFactory {
    private static Configuration config = null;
    private static SessionFactory sessionfactory = null;
    private static Session session = null;
    static {
    	config = new Configuration();
    	config.configure("hibernate.cfg.xml"); 	
    }
    
    public static Session getSessionFactory() {
        sessionfactory = config.buildSessionFactory();
    	session = sessionfactory.openSession();
    	return session;
    }
    public static void close() {
		if (sessionfactory !=null) 
    		sessionfactory.close();
    	if (session != null)
    		session.close();
    }
}
