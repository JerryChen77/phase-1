package com.qf.thread;

public class Demo05 {
	public static void main(String[] args) {
		System.out.println("��ȫ��֮������...");
		
		System.out.println("��������...�������䳡...");
		
		System.out.println("׼������ʱ...");
		
		for (int i = 10; i >= 0; i--) {
			System.out.println("����ʱ:" + i);
			try {
				// �߳�����
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("����...");
	}
}
