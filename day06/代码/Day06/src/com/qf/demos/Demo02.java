package com.qf.demos;

import java.util.Scanner;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 3���Ӽ���¼������, �����1 ,��ӡ "ѧϰjava" , �����2, ��ӡ"˯��" , �����3,��ֹ����, �����������, ����ѭ��
		 */
		Scanner sc = new Scanner(System.in);
		
		
		out:while (true) {
			System.out.println("������һ������(1 ,��ӡ \"ѧϰjava\" , �����2, ��ӡ\"˯��\" , �����3,��ֹ����):");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.println("ѧϰJava");
				break out;
				
			case 2:
				System.out.println("˯��");
				break out;
				
			case 3:
				System.out.println("��ֹ����...");
				break out;

			default:
				break;
			}
		}
		System.out.println("OVER");
	}
}
