package com.qf.thread;

public class Demo10 {
	public static void main(String[] args) {
		/**
		 * 	void setDaemon(boolean on) 
		          	�����̱߳��Ϊ�ػ��̻߳��û��̡߳� 
		 */
		
		MyThread005 t = new MyThread005();
		t.setName("�ػ��߳�");
		t.setDaemon(true);
		t.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "�����" + i);
		}
		
	}
}

class MyThread005 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "�����" + i);
		}
	}
}
