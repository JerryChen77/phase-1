package com.qf.arr;

import java.util.Scanner;

public class Demo10 {
	public static void main(String[] args) {
		/**
		 * 	�������ֵ
		 * 	��ת����
		 * 	�ϲ�����
		 * 
		 * 	��Ԫ�س��ֵĴ���
		 * 	��ָ��Ԫ�����һ�γ��ֵ�λ��
		 * 	������Сֵ
		 * 	���Ƿ����ָ��Ԫ��
		 */
		
		/**
		 * 	����¼��һ�����֣����ҳ��ֵ�һ�ε�λ�ã����û�з���-1
		 * 1������Scanner����
		 * 2����ʾ��������
		 * 3����ȡ���������
		 * 4������
		 * 5��������
		 */
		int[] arr = new int[] {456,156,46,132,16,7,6132,1,687,91,7,6132,1,687,9132,13,98,4,132};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������Ҫ���ҵ����֣�");
		int num = sc.nextInt();
		
		// ����û���������,λ����-1
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				index = i;
				break;
			}
		}
		System.out.println(num + "��������:" + index);
	}
}
