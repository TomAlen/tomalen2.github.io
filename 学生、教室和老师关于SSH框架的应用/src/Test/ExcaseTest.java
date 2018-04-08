package Test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Excase.classz;
import pojo.Excase.student;
import pojo.Excase.teacher;
import util.HibernateSessionFactory;

public class ExcaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        student stu1 = new student();
        stu1.setName("张三");
        stu1.setStuId("信息A156508");
        stu1.getFamilyPhone().add("789");
        stu1.getFamilyPhone().add("456");
        
        student stu2 =new student();
        stu2.setName("李四");
        stu2.setStuId("信息A156501");    
		
		teacher t1 = new teacher();
		t1.setName("刘老师");
		t1.setTeacherNo("九江学院05");
	    
		teacher t2 = new teacher();
		t2.setName("王老师");
		t2.setTeacherNo("九江学院04");
		
		classz cla1 = new classz();
		cla1.setName("信息A1561");
		cla1.getMembers().add(stu1);
		cla1.getMembers().add(stu2);
		cla1.setMoniter(stu1);
		cla1.getTeachers().add(t1);
		cla1.getTeachers().add(t2);
		cla1.setClaManage(t1);
		
		
		Session session = HibernateSessionFactory.getSessionFactory();
		Transaction trans = session.beginTransaction();
		
		try{
			session.save(stu1);
			session.save(stu2);
			session.save(t1);
			session.save(t2);
			session.save(cla1);
			trans.commit();
		}catch(Exception e){
			trans.rollback();
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.close();
		}
		
	}

}
