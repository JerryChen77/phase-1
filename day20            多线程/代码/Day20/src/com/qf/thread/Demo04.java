package com.qf.thread;

public class Demo04 {
	public static void main(String[] args) {
		// ����ʵ����ʵ��
		MyRunnable mr = new MyRunnable();
		// ����Threadʵ������ʵ����ʵ�������������Ĳ�������
		Thread t = new Thread(mr);
		// ����start���������߳�
		t.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("main�߳����World=============" + i);
		}
	}
}

/**
 * 	������ʵ��Runnable
 * 	��дrun����
 * @author Dushine2008
 *
 */
class MyRunnable implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("���߳�ִ��Hello" + i);
		}
	}
	
}
