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
			Session session1 = HibernateSessionFactory.getSessionFactory();//��õ�ǰ���߳�session1
			
			Session session2 = HibernateSessionFactory.getSessionFactory();//��õ�ǰ�߳�session2
	
			
		}catch(Exception e){
			trans.rollback();
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.close();
		}
		
		
		
		
		
	}	
	
	
	
	
}
