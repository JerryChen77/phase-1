package com.qf.arr;

import java.util.Scanner;

public class Demo10 {
	public static void main(String[] args) {
		/**
		 * 	查找最大值
		 * 	翻转数组
		 * 	合并数组
		 * 
		 * 	找元素出现的次数
		 * 	找指定元素最后一次出现的位置
		 * 	查找最小值
		 * 	找是否包含指定元素
		 */
		
		/**
		 * 	键盘录入一个数字，查找出现第一次的位置，如果没有返回-1
		 * 1、创建Scanner对象
		 * 2、提示输入数字
		 * 3、获取输入的数字
		 * 4、查找
		 * 5、输出结果
		 */
		int[] arr = new int[] {456,156,46,132,16,7,6132,1,687,91,7,6132,1,687,9132,13,98,4,132};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入要查找的数字：");
		int num = sc.nextInt();
		
		// 假设没有这个数字,位置是-1
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				index = i;
				break;
			}
		}
		System.out.println(num + "的索引是:" + index);
	}
}
