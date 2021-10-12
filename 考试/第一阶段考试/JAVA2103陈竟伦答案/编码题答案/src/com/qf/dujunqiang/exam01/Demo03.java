package com.qf.dujunqiang.exam01;

import java.util.Arrays;
import java.util.Random;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * (��)	������ϰ��
				i.	��������Ϊ10��int���飬�������10�����ִ���(2��)
				ii.	������Щ���ֵ�ƽ��ֵ (2��)
				iii.��д�����㷨��������Ԫ�ص������(2��)
		 */
		// ��������
		int[] arr = new int[10];
		getArr(arr);
		getPer(arr);
		sortArr(arr);
	}
	
	/**
	 * �������10�����ִ���(2��)
	 * @param arr
	 */
	public static void getArr(int[] arr) {
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
		}
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * ������Щ���ֵ�ƽ��ֵ (2��)
	 * @param arr
	 */
	public static void getPer(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("����arr��ƽ��ֵ��:" + (1.0*sum/arr.length));
	}
	
	/**
	 * ��д�����㷨��������Ԫ�ص������(2��)
	 * @param arr
	 */
	public static void sortArr(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
