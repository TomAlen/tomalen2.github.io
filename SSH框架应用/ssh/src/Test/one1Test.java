package Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.one1.dom;
import pojo.one1.student;
import util.HibernateSessionFactory;

public class one1Test {
     public static void main(String[] args) {
		student stu1 = new student();
		stu1.setName("����");
		stu1.setAge(18);
    	stu1.setStuId("��ϢA1552");
    	 
    	student stu2 = new student();
		stu2.setName("����");
		stu2.setAge(20);
    	stu2.setStuId("��ϢA1632"); 
    	 
    	dom dom = new dom();
    	dom.setDomName("31#611");
    	dom.getStudent().add(stu1);
    	dom.getStudent().add(stu2);
    	
    	
    	
    	
    	Session session = HibernateSessionFactory.getSessionFactory();
    	
    	Transaction trans = session.beginTransaction();
    	
    	try{
    		//���һ�Զ��ȱ���һ���Ǹ�
    		session.save(dom);
    		//Ȼ�󱣴���
    		session.save(stu1);  
    		session.save(stu2);
            trans.commit();
            System.out.println("����ɹ�����");
    	}catch(Exception e){
    		trans.rollback();
    		e.printStackTrace();
    	}finally{
    		session.close();
    		
    	}
	}
}
