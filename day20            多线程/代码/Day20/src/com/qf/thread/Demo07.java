package com.qf.thread;

public class Demo07 {
	public static void main(String[] args) {
		/**
		 * 	void join() 
		          	�ȴ����߳���ֹ��
		 */
		
		MyThread002 t = new MyThread002();
		t.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "���:" + i);
			if (i == 36) {
				try {
					// �����,֪����ӵ��߳�ִ�н���,���߳��ٴ�ִ��
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
			System.out.println(Thread.currentThread().getName() + "���:" + i);
		}
	}
}
