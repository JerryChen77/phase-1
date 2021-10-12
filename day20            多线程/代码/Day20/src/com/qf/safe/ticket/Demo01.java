package com.qf.safe.ticket;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	解决多线程卖票的安全问题
		 */
		
		TicketRunnable r = new TicketRunnable();
		
		Thread t1 = new Thread(r, "1号窗口");
		Thread t2 = new Thread(r, "2号窗口");
		Thread t3 = new Thread(r, "3号窗口");
		Thread t4 = new Thread(r, "4号窗口");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}


