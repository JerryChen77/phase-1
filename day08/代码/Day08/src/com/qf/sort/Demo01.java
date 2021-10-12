package com.qf.sort;

import java.util.Arrays;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	冒泡排序
		 */
		
		int[] arr = new int[] {465,1654,12,38,45};
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					// 如果前面的大于后面的,交换它们
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
