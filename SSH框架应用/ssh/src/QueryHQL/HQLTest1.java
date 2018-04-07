package QueryHQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import pojo.one1.student;
import util.HibernateSessionFactory;

public class HQLTest1 {
    public static void main(String[] args) {
		//1����ȡsession����
    	Session session = HibernateSessionFactory.getSessionFactory();
    	//2����дHQL��ѯ���,�����в�ѯ
    	String strHQL = "from student";
    	//3������һ��Query�ӿ�
    	Query query = session.createQuery(strHQL);
    	//4��ִ��query�ӿ�
    	List<student>  stu = query.list();
    	//5���ر�����
    	HibernateSessionFactory.close();
    	
    	//��������
    	for(student s : stu) {
    		
    		System.out.println("ѧ�����֣�"+s.getName());
    	}
	}
    //��ҳ����
    public static List<student> getList(int pageIndex,int pageSize) {
    	Session session = HibernateSessionFactory.getSessionFactory();
    	String strHQL = "from student";
    	Query query = session.createQuery(strHQL);
    	//ʵ�ַ�ҳ�������ݵĹ��ܵķ�ҳ(��ҳ�����ݴ�С����ҳ��С)
    	//�����ҳ����Ϊ1�����ݴ�СΪ10
    	int startIndex = (pageIndex-1) * pageSize+1;
    	//����ÿҳ���������
    	query.setMaxResults(pageSize);
    	//������ʼ������
    	query.setFirstResult(startIndex);
    	//ִ��query�ӿ�
    	List<student> li = query.list();
    	//�ر�����
    	HibernateSessionFactory.close();
    	return li;
    	
    }
    
}
