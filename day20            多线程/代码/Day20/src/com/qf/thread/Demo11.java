package com.qf.thread;

public class Demo11 {
	public static void main(String[] args) {
		/**
		 * 	卖票案例
		 * 	车站4个窗口卖票
		 * 		1）每个窗口卖出100张票
		 * 		2）四个窗口共同卖出100张票
		 */
		
		TicketRunnable r1 = new TicketRunnable();
		TicketRunnable r2 = new TicketRunnable();
		TicketRunnable r3 = new TicketRunnable();
		TicketRunnable r4 = new TicketRunnable();
		Thread t1 = new Thread(r1, "1号窗口");
		Thread t2 = new Thread(r2, "222号窗口");
		Thread t3 = new Thread(r3, "33333号窗口");
		Thread t4 = new Thread(r4, "44444444号窗口");
		
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
			// 222先执行--，ticket=99,；33333抢走线程执行--，ticket=98
			// 1号抢走线程，执行--；ticket=97；4号抢走线程，执行--；ticket=96
			ticket--;
			// 222抢走线程执行输出
			System.out.println(Thread.currentThread().getName() + "卖出了第" + (100-ticket) + "张票,还剩下" + ticket);
		}
	}
}