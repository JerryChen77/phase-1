package com.qf.arr;

public class Demo11 {
	public static void main(String[] args) {
		/**
		 * 	���������е����ֵ
		 */
		int[] arr = new int[] {456,156,46,132,16,7,6132,1,687,91,7,6132,1,687,9132,13,98,4,132};
		
		// �����һ��Ԫ��������
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			// �������Ƚ�,������ָ����,��¼֮
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("arr�����е�����Ԫ����:" + max);
	}
}
