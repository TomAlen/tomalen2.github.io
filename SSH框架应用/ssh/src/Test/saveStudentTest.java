package Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.student;

public class saveStudentTest {
   public static void main(String[] args) {
	
	   student stu = new student();
	   stu.setName("����");
	   stu.setAge(16);
	   stu.setStuId("��ľA19555");
//	   stu.getQqs().add("123");
//	   stu.getQqs().add("456");
//	   stu.getQqs().add("856");
	   
	   stu.getConcats().put("����","123456");
	   stu.getConcats().put("����","789456");
	   //����hibernate�������ļ�
	   Configuration config = new Configuration();
	   config.configure("hibernate.cfg.xml");
	   //sessionFatory�������������棬�����̰߳�ȫ
	   SessionFactory sessionfactory = config.buildSessionFactory();
	   //session,һ�����棬�������̰߳�ȫ
	   Session session = sessionfactory.openSession();
	   
	   Transaction trans = session.beginTransaction();
	   try{
		   session.save(stu);
		   trans.commit();
		   System.out.println("����ɹ�����");
	   }catch(Exception e){
		   trans.rollback();
	   }finally {
		session.close();
		sessionfactory.close();
	}
	     
}
}
