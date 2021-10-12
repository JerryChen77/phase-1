package com.qf.arr;

import java.util.Random;
import java.util.Scanner;

public class Demo05 {
	public static void main(String[] args) {
		/**
		 * 	键盘录入一个整数，返回整数长度的数组，数组中存储0--100之间的随机数字
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("你需要多长的数组:");
		int num = sc.nextInt();
		
		int[] arr = getArr(num);
		for (int i : arr) {
			System.out.print(i+",");
		}
		
	}
	
	/**
	 * 	返回num长度的数组
	 * @param num
	 * @return
	 */
	public static int[] getArr(int num) {
		int[] arr = new int[num];
		// 创建生成随机数的对象
		Random r = new Random();
		
		// 遍历arr数组
		for (int i = 0; i < arr.length; i++) {
			// 给数组中的每一个元素赋随机值
			arr[i] = r.nextInt(100);
		}
		
		// 返回随机数组
		return arr;
	}
}
