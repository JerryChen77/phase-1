package com.qf.safe.ticket;

/**
 * 	卖票的Runnable实现类
 * @author Dushine2008
 *
 */
public class TicketRunnable implements Runnable {
	int ticket = 100;
	@Override
	public void run() {
		while (true) {
			// 把原子操作放入同步代码块
			synchronized (Object.class) {
				if (ticket <= 0) {
					break;
				}
				
				ticket--;
				System.out.println(Thread.currentThread().getName() + "卖出了第" + (100-ticket) + "张票,还剩下" + ticket);
			}
		}
	}
}
