package com.qf.exam;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 1���������鳤��Ϊ10������¼������, ���򣬱�����������Ľ��
		 */
		// 2��
		int[] arr = new int[10];
		// 1��
		Scanner sc = new Scanner(System.in);
		
		// 2��
		for (int i = 0; i < arr.length; i++) {
			System.out.println("�������" + (i+1) + "������:");
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		// ����3��
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		// 2��
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}
}
