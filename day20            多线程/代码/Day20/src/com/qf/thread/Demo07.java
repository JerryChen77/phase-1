package com.qf.thread;

public class Demo07 {
	public static void main(String[] args) {
		/**
		 * 	void join() 
		          	等待该线程终止。
		 */
		
		MyThread002 t = new MyThread002();
		t.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "输出:" + i);
			if (i == 36) {
				try {
					// 被插队,知道插队的线程执行结束,本线程再次执行
					t.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class MyThread002 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "输出:" + i);
		}
	}
}
