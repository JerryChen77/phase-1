package com.qf.demos;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * 	��д����,���2~~ĳ����֮�ڵ�����
		 * 	����--����
		 * 		ֻ�ܱ�1����������
		 * 
		 * 	10
		 * 	10/2
		 * 	10/3
		 *  10/4
		 *   
		 */
		printZhi(100);
	}
	
	public static void printZhi(int num) {
		for (int i = 2; i < num; i++) {
			// ����һ������������
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			
			// �ж�flag�Ƿ��޸�,���û�б��޸ģ�û�������������������
			if (flag == true) {
				System.out.println(i);
			}
		}
	}
}
