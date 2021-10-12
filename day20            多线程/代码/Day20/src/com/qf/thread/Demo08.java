package com.qf.thread;

public class Demo08 {
	public static void main(String[] args) {
		/**
		 *  static void yield() 
		          	暂停当前正在执行的线程对象，并执行其他线程。 
		 */
		
		MyThread003 t = new MyThread003();
		t.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "输出：" + i);
			
			if (i % 10 == 0) {
				// 礼让线程--暂停一下下---马上再次进入争抢CPU的状态
				Thread.yield();
			}
		}
	}
}

class MyThread003 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "输出：" + i);
		}
	}
}