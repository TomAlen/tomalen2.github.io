package Test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.manyToMany1.Good;
import pojo.manyToMany1.custom;
import util.HibernateSessionFactory;

public class manyToManyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Good g1 = new Good();
		g1.setName("ƻ��Ⱥ");
		
		Good g2 = new Good();
		g2.setName("��ʳȺ");
		
		custom c1 = new custom();
		c1.setName("����");
		c1.getTeams().add(g1);
		c1.getTeams().add(g2);
		
		
		custom c2 = new custom();
		c2.setName("����");
		c2.getTeams().add(g1);
		c2.getTeams().add(g2);
		
		Session session = HibernateSessionFactory.getSessionFactory();
		Transaction trans = session.beginTransaction();
		
		try{
			session.save(c1);
			
		
			
			
		}catch(Exception e){
			trans.rollback();
			e.printStackTrace();
		}finally{
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
