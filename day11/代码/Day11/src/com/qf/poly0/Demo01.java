package com.qf.poly0;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * ��
		 * 	С�ͳ�
		 * 	��ʿ��
		 * 	Ħ�г�
		 * 	������
		 * 	... ...
		 * 
		 * ����������������
		 * 	���ָ���������
		 * 	���ݿͻ���������������
		 * 
		 * �������г��ӵĸ���--������
		 * 	�����������
		 * 		С�ͳ�
		 * 		��ʿ��
		 * 		Ħ�г�
		 * 		������
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����Ҫʲô���͵�����("
				+ "		 * 1��С�γ�\r\n" + 
				"		 * 2����ʿ��\r\n" + 
				"		 * 3��������\r\n" + 
				"		 * 4��Ħ�г�\r\n" + 
				"		 * �������ַ���null):");
		int num = sc.nextInt();
		
		AutoFactory autoFactory = new AutoFactory();
		Auto auto = autoFactory.getAuto(num);
		
		auto.start();
		
	}
}



