package pojo.Thread;

public class MoneyChange {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        //实例化一个取钱的线程，取出300，线程睡眠时间为8秒
		changeMoney thread1 = new changeMoney("取钱", 2, -300, 8);
		//实例化一个存钱的线程，存500.线程睡眠时间为4秒
		changeMoney thread2 = new changeMoney("存钱", 2, 500, 4);
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		
	} 

}
