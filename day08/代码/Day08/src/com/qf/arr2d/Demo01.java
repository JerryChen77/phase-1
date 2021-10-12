package com.qf.arr2d;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	二维数组--数组的嵌套--数组中存储的数据还是数组
		 */
		
		// 声明一个二维数组
		int[][] arr01;
		
		// 创建二维数组,二维数组中有两个一维数组int[一维数组的数量][一维数组中元素的个数]
		/**
		 * 	创建二维数组
		 * 		二维数组存2个一维数组
		 * 		每个一维数组存3个int元素
		 */
		arr01 = new int[2][3];
		System.out.println(arr01);
		
		// 声明的同时创建数组,分配空间
		int[][] arr02 = new int[3][5];
		
		int[][] arr03 = {{11,22,33},{44,55,66}};
		
		int[][] arr04 = new int[][] {{},{}};
		
	}
}
