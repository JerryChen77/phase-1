package com.qf.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo02 {
	public static void main(String[] args) {
		// �����̳߳ض���
		ExecutorService es = Executors.newFixedThreadPool(4);
		System.out.println(es);
		
		// �ύ�߳�����
		for (int i = 0; i < 20; i++) {
			es.submit(new Runnable() {
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName());
				}
			});
		}
		System.out.println(es);
		// ����˳��ر�
		es.shutdown();
		for (int i = 0; i < 10; i++) {
			System.out.println(es);
		}
		
	}
}
