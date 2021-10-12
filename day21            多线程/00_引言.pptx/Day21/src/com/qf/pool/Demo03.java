package com.qf.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo03 {
	public static void main(String[] args) {
		// �����̳߳�
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		// �ύ����:���0--5000
		es.submit(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5000; i++) {
					System.out.println(i);
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		// �ύ����:���5000--10000
		es.submit(new Runnable() {
			@Override
			public void run() {
				for (int i = 5000; i < 10000; i++) {
					System.out.println(i);
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		// ����˳��ر�
		es.shutdown();
	}
}
