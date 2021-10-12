package com.qf.arr2d;

public class Demo02 {
	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		
		System.out.println("-------------");
		
		int[][] arrr = new int[3][];
		// 给每一个一维数组创建对象
		System.out.println(arrr[0]);
		System.out.println(arrr[1]);
		System.out.println(arrr[2]);
		
		arrr[0] = new int[] {11,22,33};
		arrr[1] = new int[] {22,33,44,55};
		arrr[2] = new int[] {33,44,55,66,77};
		
		System.out.println(arrr[0].length);
		System.out.println(arrr[1].length);
		System.out.println(arrr[2].length);
		
		System.out.println(arrr[1][1]);
	}
}
