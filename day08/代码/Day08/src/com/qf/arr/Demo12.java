package com.qf.arr;

import java.util.Arrays;

public class Demo12 {
	public static void main(String[] args) {

		int[] arrInt = new int[] {11,22,33};
		for (int i : arrInt) {
			System.out.println(i);
		}
		
		System.out.println("==========");
		
		// ʹ��ָ��Ԫ�������������
		Arrays.fill(arrInt, 666);
		
		for (int i : arrInt) {
			System.out.println(i);
		}
		
		System.out.println("===========");
		
		int[] arr01 = {1,31,6546,123,165,489,51,321,654,651,0231,65,8512,3};
		for (int i : arr01) {
			System.out.print(i + ",");
		}
		System.out.println();
		
		// ����Ԫ�ص���Ȼ˳������
		Arrays.sort(arr01);
		for (int i : arr01) {
			System.out.print(i + ",");
		}
		System.out.println();
		
		// ������ת�����ַ���
		String str = Arrays.toString(arr01);
		System.out.println(str);
		System.out.println(str.getClass());
		System.out.println(Arrays.toString(arr01));
	}
}
