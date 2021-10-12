package com.qf.lambda;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;

public class Demo06 {
	public static void main(String[] args) {
		Supplier<Integer> s1 = new Supplier<Integer>() {
			@Override
			public Integer get() {
				return new Random().nextInt(100);
			}
		};
		
		for (int i = 0; i < 10; i++) {
			System.out.println(s1.get());
		}
		
		System.out.println("=================");
		
		Supplier<Integer> s2 = () -> new Random().nextInt(100);
		for (int i = 0; i < 10; i++) {
			System.out.println(s2.get());
		}
		
		System.out.println("=================");
		
		int[] arr = getArr(() -> new Random().nextInt(100), 10);
		System.out.println(Arrays.toString(arr));
		
	}
	
	/**
	 * 	����ָ�����ȵ����������
	 * @param supplier	�ṩ�����
	 * @param num		ָ������
	 * @return			����
	 */
	public static int[] getArr(Supplier<Integer> supplier,int num) {
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = supplier.get();
		}
		return arr;
	}
}
