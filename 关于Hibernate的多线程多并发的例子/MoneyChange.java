package pojo.Thread;

public class MoneyChange {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        //ʵ����һ��ȡǮ���̣߳�ȡ��300���߳�˯��ʱ��Ϊ8��
		changeMoney thread1 = new changeMoney("ȡǮ", 2, -300, 8);
		//ʵ����һ����Ǯ���̣߳���500.�߳�˯��ʱ��Ϊ4��
		changeMoney thread2 = new changeMoney("��Ǯ", 2, 500, 4);
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		
	} 

}
