package pojo.Thread;

import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateSessionFactory;

public class changeMoney extends Thread{

	private String ThreadName;
	private Integer amountId;
	private Integer changeMoney;
	private Integer sleepThread;
	
	public void run() {
		Session session = HibernateSessionFactory.getSessionFactory();
		Transaction trans = session.beginTransaction();
		
		try{
			amount amount = (amount)session.get(amount.class, 2);//LockMode.UPGRADE，悲观锁：查询语句也要加锁。
			amount.setMoney(amount.getMoney()+changeMoney);
			session.update(amount);
			Thread.sleep(sleepThread*1000);//把线程的睡眠时间设为秒
			trans.commit();
			System.out.println(ThreadName+"["+changeMoney+"]"+"完成");
		}catch(Exception e){
			trans.rollback();
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.close();
		}
	}
	public String getThreadName() {
		return ThreadName;
	}
	public void setThreadName(String threadName) {
		ThreadName = threadName;
	}
	public Integer getAmountId() {
		return amountId;
	}
	public void setAmountId(Integer amountId) {
		this.amountId = amountId;
	}
	public Integer getChangeMoney() {
		return changeMoney;
	}
	public void setChangeMoney(Integer changeMoney) {
		this.changeMoney = changeMoney;
	}
	public Integer getSleepThread() {
		return sleepThread;
	}
	public void setSleepThread(Integer sleepThread) {
		this.sleepThread = sleepThread;
	}
	public changeMoney(String threadName, Integer amountId, Integer changeMoney, Integer sleepThread) {
		super();
		ThreadName = threadName;
		this.amountId = amountId;
		this.changeMoney = changeMoney;
		this.sleepThread = sleepThread;
	}	
}
