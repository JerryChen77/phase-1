package com.qf.lambda;

/**
 * 	简化创建线程
 * @author Dushine2008
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable();
		Thread t1 = new Thread(r1);
		t1.start();
		
		Runnable r2 = new Runnable() {
			public void run() {
				System.out.println("线程02启动....");
			}
		};
		Thread t2 = new Thread(r2);
		t2.start();
		
		Runnable r3 = () -> {
			System.out.println("线程03启动....");
		};
		Thread t3 = new Thread(r3);
		t3.start();
		
		Runnable r4 = () -> System.out.println("线程04启动....");
		Thread t4 = new Thread(r4);
		t4.start();
		
		Thread t5 = new Thread(() -> System.out.println("线程05启动...."));
		t5.start();
		
		new Thread(() -> System.out.println("线程06启动....")).start();
	}
}

class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("线程01启动...");
	}
}
