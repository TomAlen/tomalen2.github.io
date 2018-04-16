package util;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class HibernateSessionFactory {
    private static SessionFactory sessionfactory;		
    private static ThreadLocal<Session> sessions = new ThreadLocal<Session>();//Session容器
    
    static {
    	synchronized (HibernateSessionFactory.class) {
	    if(HibernateSessionFactory.class != null){
    	 Configuration config = new Configuration();
    	 config.configure("hibernate.cfg.xml");
    	 sessionfactory = config.buildSessionFactory();
	    }
    	}
    }
    
    public static Session getSessionFactory() {
    	 Session session = sessions.get();//查找与当前线程相绑定的session
    	if(session == null){//如果当前未找到与之对应的session，就产生一个新的session对象
    	   session = sessionfactory.openSession();//实例化一个新的session
    	   sessions.set(session);
    	}
    	return session;
    }
    public static void close() {
	    Session session = sessions.get();
	    if(session != null){
	    	sessions.remove();//清除当前的线程绑定的session对象
	    	session.close();
	    }}
}
