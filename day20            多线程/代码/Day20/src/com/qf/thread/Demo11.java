package com.qf.thread;

public class Demo11 {
	public static void main(String[] args) {
		/**
		 * 	��Ʊ����
		 * 	��վ4��������Ʊ
		 * 		1��ÿ����������100��Ʊ
		 * 		2���ĸ����ڹ�ͬ����100��Ʊ
		 */
		
		TicketRunnable r1 = new TicketRunnable();
		TicketRunnable r2 = new TicketRunnable();
		TicketRunnable r3 = new TicketRunnable();
		TicketRunnable r4 = new TicketRunnable();
		Thread t1 = new Thread(r1, "1�Ŵ���");
		Thread t2 = new Thread(r2, "222�Ŵ���");
		Thread t3 = new Thread(r3, "33333�Ŵ���");
		Thread t4 = new Thread(r4, "44444444�Ŵ���");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}


class TicketRunnable implements Runnable{
	int ticket = 100;
	@Override
	public void run() {
		while (true) {
			if (ticket <= 0) {
				break;
			}
			// 222��ִ��--��ticket=99,��33333�����߳�ִ��--��ticket=98
			// 1�������̣߳�ִ��--��ticket=97��4�������̣߳�ִ��--��ticket=96
			ticket--;
			// 222�����߳�ִ�����
			System.out.println(Thread.currentThread().getName() + "�����˵�" + (100-ticket) + "��Ʊ,��ʣ��" + ticket);
		}
	}
}