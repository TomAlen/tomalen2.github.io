package Test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.single2.VipCard;
import pojo.single2.person;
import util.HibernateSessionFactory;

public class SingleTest2 {
     public static void main(String[] args) {
		 person p1 = new person();
		 p1.setName("张三");
    	 
		 person p2 = new person();
		 p2.setName("李四");
		 
		 VipCard c1 = new VipCard();
		 c1.setNo("白银");
		 c1.setLevel("白银001");
		 
    	 
		 VipCard c2 = new VipCard();
		 c2.setNo("黄金");
		 c2.setLevel("黄金002");
		 
		 p1.setMycard(c1);
		 p2.setMycard(c2);
		 
//		 c1.setMyself(p1);  不是外键一方可写可不写，但是在外键一方必须写上
//		 c2.setMyself(p2);
		 Session session = HibernateSessionFactory.getSessionFactory();
		 Transaction trans = session.beginTransaction();
		 try{
			 session.save(p1);
			 session.save(c1);
			 session.save(p2);
			 session.save(c2);
			 trans.commit();
			 System.out.println("保存成功！");
		 }catch(Exception e){ 
		     trans.rollback();
			 e.printStackTrace();	 
		 }finally{
			HibernateSessionFactory.close();
		 } 
	}
}
