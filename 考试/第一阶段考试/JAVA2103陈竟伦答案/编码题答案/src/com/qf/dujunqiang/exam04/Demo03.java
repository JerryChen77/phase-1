package com.qf.dujunqiang.exam04;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * (��)	(5��)���߳�ʵ����Ʊ����
				a)	�ĸ����ڹ�ͬ����100��Ʊ
				b)	��֤�̰߳�ȫ
				i.	ʹ��ͬ�������ʵ��
				ii.	ʹ��ͬ������ʵ��
		 */
		// ʹ��ͬ�������ʵ��
		// threadBlock();
		
		// ʹ��ͬ��������ʵ��
		threadMethod();
		
	}
	
	/**
	 * ʹ��ͬ�������ʵ��
	 * @param args
	 */
	public static void threadBlock() {
		TicketRunnableBlock tr = new TicketRunnableBlock();
		
		Thread t1 = new Thread(tr, "1�Ŵ���");
		Thread t2 = new Thread(tr, "222�Ŵ���");
		Thread t3 = new Thread(tr, "33333�Ŵ���");
		Thread t4 = new Thread(tr, "4444444�Ŵ���");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	
	/**
	 * ʹ��ͬ��������ʵ��
	 * @param args
	 */
	public static void threadMethod() {
		TicketRunnableMethod tr = new TicketRunnableMethod();
		
		Thread t1 = new Thread(tr, "1�Ŵ���");
		Thread t2 = new Thread(tr, "222�Ŵ���");
		Thread t3 = new Thread(tr, "33333�Ŵ���");
		Thread t4 = new Thread(tr, "4444444�Ŵ���");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

/**
 * ��Ʊ���߳���
 * ʹ��ͬ����������̲߳���ȫ������
 * @author Dushine2008
 *
 */
class TicketRunnableBlock implements Runnable {
	static Object lock = new Object();
	int ticket = 100;
	@Override
	public void run() {
		
		while (true) {
			synchronized (lock) {
				if (ticket <= 0) {
					break;
				}
				
				ticket--;
				System.out.println(Thread.currentThread().getName() + "�����˵�" + (100-ticket) + "��Ʊ");
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

/**
 * ��Ʊ���߳�
 * ʹ��ͬ����������̲߳���ȫ������
 * @author Dushine2008
 *
 */
class TicketRunnableMethod implements Runnable{
	int ticket = 100;
	@Override
	public void run() {
		
		while (true) {
			boolean b = saleTicket();
			if (b==false) {
				break;
			}
		}
	}
	
	/**
	 * ��Ʊ�ķ���
	 * @return ��Ʊ����Ϊ�Ƿ�ɹ�
	 */
	public synchronized boolean saleTicket() {
		if (ticket <= 0) {
			return false;
		}
		
		ticket--;
		System.out.println(Thread.currentThread().getName() + "�����˵�" + (100-ticket) + "��Ʊ");
		
		return true;
	}
}
