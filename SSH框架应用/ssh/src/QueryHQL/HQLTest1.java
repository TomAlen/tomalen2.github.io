package QueryHQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import pojo.one1.student;
import util.HibernateSessionFactory;

public class HQLTest1 {
    public static void main(String[] args) {
		//1、获取session对象
    	Session session = HibernateSessionFactory.getSessionFactory();
    	//2、编写HQL查询语句,在类中查询
    	String strHQL = "from student";
    	//3、创建一个Query接口
    	Query query = session.createQuery(strHQL);
    	//4、执行query接口
    	List<student>  stu = query.list();
    	//5、关闭连接
    	HibernateSessionFactory.close();
    	
    	//访问数据
    	for(student s : stu) {
    		
    		System.out.println("学生名字："+s.getName());
    	}
	}
    //分页功能
    public static List<student> getList(int pageIndex,int pageSize) {
    	Session session = HibernateSessionFactory.getSessionFactory();
    	String strHQL = "from student";
    	Query query = session.createQuery(strHQL);
    	//实现分页，对数据的功能的分页(分页的数据大小，分页大小)
    	//比如分页索引为1，数据大小为10
    	int startIndex = (pageIndex-1) * pageSize+1;
    	//设置每页的最大数据
    	query.setMaxResults(pageSize);
    	//设置起始的数据
    	query.setFirstResult(startIndex);
    	//执行query接口
    	List<student> li = query.list();
    	//关闭连接
    	HibernateSessionFactory.close();
    	return li;
    	
    }
    
}
