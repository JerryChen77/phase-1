package com.qf.arr;

import java.util.Arrays;

public class Demo15 {
	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};
		/**
		 * newLength���������
		 * 	����arr.length
		 * 		���������飬����arr�е��������ݣ������Ĳ���ʹ��Ĭ��ֵ���
		 * 	����arr.length
		 * 		���������飬��arr����������ȫ��ͬ
		 * 	С��arr.length
		 * 		���������飬��ȡ�еĲ�������
		 */
		int[] newArr = Arrays.copyOf(arr, 3);
		
		System.out.println(newArr.length);
		for (int i : newArr) {
			System.out.println(i);
		}
	}
}
