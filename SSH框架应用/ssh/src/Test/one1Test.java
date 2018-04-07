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
		stu1.setName("张三");
		stu1.setAge(18);
    	stu1.setStuId("信息A1552");
    	 
    	student stu2 = new student();
		stu2.setName("李四");
		stu2.setAge(20);
    	stu2.setStuId("信息A1632"); 
    	 
    	dom dom = new dom();
    	dom.setDomName("31#611");
    	dom.getStudent().add(stu1);
    	dom.getStudent().add(stu2);
    	
    	
    	
    	
    	Session session = HibernateSessionFactory.getSessionFactory();
    	
    	Transaction trans = session.beginTransaction();
    	
    	try{
    		//如果一对多先保存一的那个
    		session.save(dom);
    		//然后保存多的
    		session.save(stu1);  
    		session.save(stu2);
            trans.commit();
            System.out.println("保存成功！！");
    	}catch(Exception e){
    		trans.rollback();
    		e.printStackTrace();
    	}finally{
    		session.close();
    		
    	}
	}
}
