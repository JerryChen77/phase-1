package com.qf.dujunqiang.exam01;

import java.util.Arrays;
import java.util.Random;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * (三)	数组练习题
				i.	创建长度为10的int数组，随机生成10个数字存入(2分)
				ii.	计算这些数字的平均值 (2分)
				iii.手写排序算法，把数组元素倒序输出(2分)
		 */
		// 创建数组
		int[] arr = new int[10];
		getArr(arr);
		getPer(arr);
		sortArr(arr);
	}
	
	/**
	 * 随机生成10个数字存入(2分)
	 * @param arr
	 */
	public static void getArr(int[] arr) {
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
		}
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * 计算这些数字的平均值 (2分)
	 * @param arr
	 */
	public static void getPer(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("数组arr的平均值是:" + (1.0*sum/arr.length));
	}
	
	/**
	 * 手写排序算法，把数组元素倒序输出(2分)
	 * @param arr
	 */
	public static void sortArr(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
