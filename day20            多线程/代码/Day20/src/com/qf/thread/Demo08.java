package com.qf.thread;

public class Demo08 {
	public static void main(String[] args) {
		/**
		 *  static void yield() 
		          	��ͣ��ǰ����ִ�е��̶߳��󣬲�ִ�������̡߳� 
		 */
		
		MyThread003 t = new MyThread003();
		t.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "�����" + i);
			
			if (i % 10 == 0) {
				// �����߳�--��ͣһ����---�����ٴν�������CPU��״̬
				Thread.yield();
			}
		}
	}
}

class MyThread003 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "�����" + i);
		}
	}
}