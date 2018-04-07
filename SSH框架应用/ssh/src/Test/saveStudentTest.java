package Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.student;

public class saveStudentTest {
   public static void main(String[] args) {
	
	   student stu = new student();
	   stu.setName("张三");
	   stu.setAge(16);
	   stu.setStuId("土木A19555");
//	   stu.getQqs().add("123");
//	   stu.getQqs().add("456");
//	   stu.getQqs().add("856");
	   
	   stu.getConcats().put("海哥","123456");
	   stu.getConcats().put("生坑","789456");
	   //加载hibernate的配置文件
	   Configuration config = new Configuration();
	   config.configure("hibernate.cfg.xml");
	   //sessionFatory工厂，二级缓存，属于线程安全
	   SessionFactory sessionfactory = config.buildSessionFactory();
	   //session,一级缓存，不属于线程安全
	   Session session = sessionfactory.openSession();
	   
	   Transaction trans = session.beginTransaction();
	   try{
		   session.save(stu);
		   trans.commit();
		   System.out.println("保存成功！！");
	   }catch(Exception e){
		   trans.rollback();
	   }finally {
		session.close();
		sessionfactory.close();
	}
	     
}
}
