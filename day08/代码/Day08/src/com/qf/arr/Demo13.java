package com.qf.arr;

import java.util.Random;
import java.util.Scanner;

public class Demo13 {
	public static void main(String[] args) {
		/**
		 * 	���������0--100֮���һ������
		 * 	��7�λ���£�������
		 */
		Random r = new Random();
		int num = r.nextInt(100);
		
		Scanner sc = new Scanner(System.in);
		
		int count = 7;
		while (count > 0) {
			count--;
			System.out.println("���һ������(0--100):");
			int i = sc.nextInt();
			// �ж�����������ֺ��������
			if (i == num) {
				System.out.println("�¶���,��ʣ�»������:" + count);
				break;
			} else if (i > num) {
				System.out.println("���ֲ´���������");
			} else {
				System.out.println("���ֲ�С��������");
			}
			System.out.println("��ʣ�»���:" + count);
		}
	}
}
