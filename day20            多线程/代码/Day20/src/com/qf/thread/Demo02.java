package com.qf.thread;

public class Demo02 {
	public static void main(String[] args) {
		// �����߳�ʵ��
		MyThread mt = new MyThread();
		// ���÷��������߳�
		mt.start();
	}
}

/**
 * 	����̳�Thread����дrun����
 * @author Dushine2008
 */
class MyThread extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("���߳�--------------------------------");
		}
	}
}
