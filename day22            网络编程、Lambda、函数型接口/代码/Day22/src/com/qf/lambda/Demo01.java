package com.qf.lambda;

/**
 * 	�򻯴����߳�
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
				System.out.println("�߳�02����....");
			}
		};
		Thread t2 = new Thread(r2);
		t2.start();
		
		Runnable r3 = () -> {
			System.out.println("�߳�03����....");
		};
		Thread t3 = new Thread(r3);
		t3.start();
		
		Runnable r4 = () -> System.out.println("�߳�04����....");
		Thread t4 = new Thread(r4);
		t4.start();
		
		Thread t5 = new Thread(() -> System.out.println("�߳�05����...."));
		t5.start();
		
		new Thread(() -> System.out.println("�߳�06����....")).start();
	}
}

class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("�߳�01����...");
	}
}
