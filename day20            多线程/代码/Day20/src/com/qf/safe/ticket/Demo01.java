package com.qf.safe.ticket;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	������߳���Ʊ�İ�ȫ����
		 */
		
		TicketRunnable r = new TicketRunnable();
		
		Thread t1 = new Thread(r, "1�Ŵ���");
		Thread t2 = new Thread(r, "2�Ŵ���");
		Thread t3 = new Thread(r, "3�Ŵ���");
		Thread t4 = new Thread(r, "4�Ŵ���");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}


