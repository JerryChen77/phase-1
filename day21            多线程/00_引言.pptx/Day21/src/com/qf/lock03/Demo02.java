package com.qf.lock03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 	��д�࣬��������
		 * 	�����ж���set��get����
		 * 	�ֱ�ʹ��ReentrantLock��ReentrantReadWriteLock��PK���ǵ�Ч��
		 */
		// ��ʼ��ʱ��
		long startTime = System.currentTimeMillis();
		
		MyClass mc = new MyClass();
		
		// �����̳߳�
		ExecutorService es = Executors.newFixedThreadPool(20);
		
		// �ύ����18����ȡ�������2�����õ�����
		for (int i = 0; i < 2; i++) {
			es.submit(new Runnable() {
				@Override
				public void run() {
					mc.setValue(Math.random() + "===");
				}
			});
		}
		
		for (int i = 0; i < 18; i++) {
			es.submit(new Runnable() {
				@Override
				public void run() {
					mc.getValue();
				}
			});
		}
		
		// ����
		es.shutdown();
		
		// ͳ����ʱ��,���ִ�д��д���
		
		// ����߳�û����ȫ����,�˴�����
		while (!es.isTerminated()) {}
		
		System.out.println(System.currentTimeMillis() - startTime);
		
	}
}
