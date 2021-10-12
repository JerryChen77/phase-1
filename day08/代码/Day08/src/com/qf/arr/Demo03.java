package com.qf.arr;

public class Demo03 {
	public static void main(String[] args) {
		int[] arr = new int[] {11,22,33};
		System.out.println(arr[0]);
		
		changeArr(arr);
		System.out.println(arr[0]);
		
	}
	
	public static void changeArr(int[] a) {
		a[0] = 110;
	}
}
