package com.qf.arr;

import java.util.Random;
import java.util.Scanner;

public class Demo05 {
	public static void main(String[] args) {
		/**
		 * 	����¼��һ�������������������ȵ����飬�����д洢0--100֮����������
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����Ҫ�೤������:");
		int num = sc.nextInt();
		
		int[] arr = getArr(num);
		for (int i : arr) {
			System.out.print(i+",");
		}
		
	}
	
	/**
	 * 	����num���ȵ�����
	 * @param num
	 * @return
	 */
	public static int[] getArr(int num) {
		int[] arr = new int[num];
		// ��������������Ķ���
		Random r = new Random();
		
		// ����arr����
		for (int i = 0; i < arr.length; i++) {
			// �������е�ÿһ��Ԫ�ظ����ֵ
			arr[i] = r.nextInt(100);
		}
		
		// �����������
		return arr;
	}
}
