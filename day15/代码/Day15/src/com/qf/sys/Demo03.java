package com.qf.sys;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * break
		 * 	��ֹswitch����ѭ��
		 * return
		 * 	�������������ؽ��
		 * exit
		 * 	��ֹ�����
		 */
		
		System.out.println("main������ʼ...");
		
		show();
		
		System.out.println("main��������...");
		
	}
	
	public static void show() {
		System.out.println("show������ʼ...");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 6) {
				// break;
				// return;
				System.exit(0);
			}
		}
		
		System.out.println("show��������...");
	}
	
}
