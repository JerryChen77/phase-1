package com.qf.sort;

import java.util.Arrays;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 	选择排序
		 */
		int[] arr = new int[] {465,1654,12,38,45};
		
		for (int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			// 判断minIndex的值是否发生改变
			if (minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
