package com.qf.arr;

public class Demo11 {
	public static void main(String[] args) {
		/**
		 * 	查找数组中的最大值
		 */
		int[] arr = new int[] {456,156,46,132,16,7,6132,1,687,91,7,6132,1,687,9132,13,98,4,132};
		
		// 假设第一个元素是最大的
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			// 挨个向后比较,如果发现更大的,记录之
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("arr数组中的最大的元素是:" + max);
	}
}
