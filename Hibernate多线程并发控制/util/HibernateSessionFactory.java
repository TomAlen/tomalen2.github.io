package util;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class HibernateSessionFactory {
    private static SessionFactory sessionfactory;		
    private static ThreadLocal<Session> sessions = new ThreadLocal<Session>();//Session����
    
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
    	 Session session = sessions.get();//�����뵱ǰ�߳���󶨵�session
    	if(session == null){//�����ǰδ�ҵ���֮��Ӧ��session���Ͳ���һ���µ�session����
    	   session = sessionfactory.openSession();//ʵ����һ���µ�session
    	   sessions.set(session);
    	}
    	return session;
    }
    public static void close() {
	    Session session = sessions.get();
	    if(session != null){
	    	sessions.remove();//�����ǰ���̰߳󶨵�session����
	    	session.close();
	    }}
}
