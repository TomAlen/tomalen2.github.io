package Test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Thread.amount;
import util.HibernateSessionFactory;

public class TheadTest {
  
	public static void main(String[] args) {
		amount amount = new amount();
		amount.setAmountNo("建设银行");
		amount.setMoney(1000);
		
		Session session = HibernateSessionFactory.getSessionFactory();
		Transaction trans = session.beginTransaction();
		
		try{
			session.save(amount);
			trans.commit();
		}catch(Exception e){
			
			trans.rollback();
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.close();
		}
		
	}
	
}
