package com.qf.coll;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo07 {
	public static void main(String[] args) {
		ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(4);
		// �����ݵ��߳�
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					try {
						queue.put(Math.random() + "====");
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		// �����ݵ��߳�
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					try {
						System.out.println(queue.take());
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}
