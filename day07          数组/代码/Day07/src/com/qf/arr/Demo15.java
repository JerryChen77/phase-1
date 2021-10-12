package com.qf.arr;

import java.util.Arrays;

public class Demo15 {
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};
		/**
		 * newLength的三种情况
		 * 	大于arr.length
		 * 		返回新数组，包含arr中的所有数据，超出的部分使用默认值填充
		 * 	等于arr.length
		 * 		返回新数组，和arr数组数据完全相同
		 * 	小于arr.length
		 * 		返回新数组，截取中的部分数据
		 */
		int[] newArr = Arrays.copyOf(arr, 3);
		
		System.out.println(newArr.length);
		for (int i : newArr) {
			System.out.println(i);
		}
	}
}
