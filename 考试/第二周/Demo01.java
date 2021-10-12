package com.qf.exam;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 1、创建数组长度为10，键盘录入数字, 排序，遍历输出排序后的结果
		 */
		// 2分
		int[] arr = new int[10];
		// 1分
		Scanner sc = new Scanner(System.in);
		
		// 2分
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入第" + (i+1) + "个数字:");
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		// 排序3分
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		// 2分
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}
}
