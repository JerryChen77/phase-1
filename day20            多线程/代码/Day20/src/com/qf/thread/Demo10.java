package com.qf.thread;

public class Demo10 {
	public static void main(String[] args) {
		/**
		 * 	void setDaemon(boolean on) 
		          	将该线程标记为守护线程或用户线程。 
		 */
		
		MyThread005 t = new MyThread005();
		t.setName("守护线程");
		t.setDaemon(true);
		t.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "输出：" + i);
		}
		
	}
}

class MyThread005 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "输出：" + i);
		}
	}
}
