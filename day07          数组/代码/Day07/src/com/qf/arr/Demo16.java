package com.qf.arr;

public class Demo16 {
	public static void main(String[] args) {
		int[] arr01 = new int[]{11,22,33,44,55};
		int[] arr02 = new int[]{11,22,33,44,55};
		
		int num01 = 66;
		int num02 = 66;
		
		System.out.println(num01 == num02);
		System.out.println(arr01 == arr02);
		
		int[] arr03 = arr01;
		
		for (int i : arr01) {
			System.out.println(i);
		}
		
		arr03[0] = 1111;
		
		for (int i : arr01) {
			System.out.println(i);
		}
		
	}
}
