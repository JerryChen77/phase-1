package com.qf.dujunqiang.exam04;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * (三)	(5分)多线程实现卖票案例
				a)	四个窗口共同卖出100张票
				b)	保证线程安全
				i.	使用同步代码块实现
				ii.	使用同步方法实现
		 */
		// 使用同步代码块实现
		// threadBlock();
		
		// 使用同步方法块实现
		threadMethod();
		
	}
	
	/**
	 * 使用同步代码块实现
	 * @param args
	 */
	public static void threadBlock() {
		TicketRunnableBlock tr = new TicketRunnableBlock();
		
		Thread t1 = new Thread(tr, "1号窗口");
		Thread t2 = new Thread(tr, "222号窗口");
		Thread t3 = new Thread(tr, "33333号窗口");
		Thread t4 = new Thread(tr, "4444444号窗口");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	
	/**
	 * 使用同步方法块实现
	 * @param args
	 */
	public static void threadMethod() {
		TicketRunnableMethod tr = new TicketRunnableMethod();
		
		Thread t1 = new Thread(tr, "1号窗口");
		Thread t2 = new Thread(tr, "222号窗口");
		Thread t3 = new Thread(tr, "33333号窗口");
		Thread t4 = new Thread(tr, "4444444号窗口");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

/**
 * 卖票的线程类
 * 使用同步代码块解决线程不安全的问题
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
				System.out.println(Thread.currentThread().getName() + "卖出了第" + (100-ticket) + "张票");
				
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
 * 卖票的线程
 * 使用同步方法解决线程不安全的问题
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
	 * 卖票的方法
	 * @return 卖票的行为是否成功
	 */
	public synchronized boolean saleTicket() {
		if (ticket <= 0) {
			return false;
		}
		
		ticket--;
		System.out.println(Thread.currentThread().getName() + "卖出了第" + (100-ticket) + "张票");
		
		return true;
	}
}
