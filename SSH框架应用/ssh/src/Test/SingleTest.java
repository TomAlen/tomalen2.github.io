package Test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.hql.HolderInstantiator;

import pojo.single.VipCard;
import pojo.single.person;
import util.HibernateSessionFactory;

public class SingleTest {
     public static void main(String[] args) {
		 person p1 = new person();
		 p1.setName("����");
    	 
		 person p2 = new person();
		 p2.setName("����");
		 
		 VipCard c1 = new VipCard();
		 c1.setNo("����");
		 c1.setLevel("����001");
		 
    	 
		 VipCard c2 = new VipCard();
		 c2.setNo("�ƽ�");
		 c2.setLevel("�ƽ�002");
		 
		 p1.setMycard(c1);
		 p2.setMycard(c2);
		 
		 Session session = HibernateSessionFactory.getSessionFactory();
		 Transaction trans = session.beginTransaction();
		 try{
			 session.save(p1);
			 session.save(c1);
			 session.save(p2);
			 session.save(c2);
			 trans.commit();
			 System.out.println("����ɹ���");
			 
		 }catch(Exception e){
			 
			 trans.rollback();
			 e.printStackTrace();
			 
		 }finally{
			HibernateSessionFactory.close();
		 }
		 
	}
}
