package Test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.single2.VipCard;
import util.HibernateSessionFactory;

public class getSessionTest {
     public static void main(String[] args) {
		 Session session = HibernateSessionFactory.getSessionFactory();
		 Transaction trans = session.beginTransaction();
		 try{
		   
			 VipCard card = (VipCard)session.get(VipCard.class, 2);
			 System.out.println(card.getMyself());
		 }catch(Exception e){ 
		     trans.rollback();
			 e.printStackTrace();	 
		 }finally{
			 if (session != null)
				 session.close();
		 } 
	}
}