package Test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateSessionFactory;

public class RongqiTest {
     
	public static void main(String[] args) {
		
		Session session = HibernateSessionFactory.getSessionFactory();
		Transaction trans = session.beginTransaction();
//		
		try{
			Session session1 = HibernateSessionFactory.getSessionFactory();//获得当前的线程session1
			
			Session session2 = HibernateSessionFactory.getSessionFactory();//获得当前线程session2
	
			
		}catch(Exception e){
			trans.rollback();
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.close();
		}
		
		
		
		
		
	}	
	
	
	
	
}
