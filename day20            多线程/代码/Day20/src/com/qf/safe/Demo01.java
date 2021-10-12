package com.qf.safe;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	卖票案例
		 * 	车站4个窗口卖票
		 * 		1）每个窗口卖出100张票
		 * 		2）四个窗口共同卖出100张票
		 */
		
		TicketThread t1 = new TicketThread();
		TicketThread t2 = new TicketThread();
		TicketThread t3 = new TicketThread();
		TicketThread t4 = new TicketThread();
		
		t1.setName("1号窗口");
		t2.setName("2号窗口");
		t3.setName("3号窗口");
		t4.setName("4号窗口");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}

class TicketThread extends Thread{
	static int ticket = 100;
	@Override
	public void run() {
		while (true) {
			// 如果没有票,终止循环
			if (ticket <= 0) {
				break;
			}
			
			ticket--;
			System.out.println(Thread.currentThread().getName() + "卖出了第" + (100-ticket) + "张票,还剩下" + ticket);
		}
	}
}
