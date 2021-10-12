package com.qf.arr;

public class Demo12 {
	public static void main(String[] args) {
		/**
		 * 	翻转数组
		 * 		遍历数组的前面一半
		 * 		把前面一半的数据和后面的交换
		 */
		int[] arr = new int[] {456,156,46,13,4,132};
		for (int i : arr) {
			System.out.print(i + ",");
		}
		System.out.println();
		
		for (int i = 0; i < arr.length/2; i++) {
			// 交换
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		
		for (int i : arr) {
			System.out.print(i + ",");
		}
		System.out.println();
	}
}
