package com.qf.arr;

public class Demo09 {

	public static void main(String[] args) {
		/**
		 * 	ͳ���������ֵ��ܺ�
		 * 	ͳ��ƽ��ֵ
		 */
		
		int[] arr = new int[] {456,41,3246,76121,64,94,32,135,798};
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("arr����Ԫ�ص��ܺ���:" + sum);
		System.out.println("arr����Ԫ�صĶ�ƽ��ֵ��:" + (1.0*sum/arr.length));
	}
	
	/**
	 * 	��������Ԫ�ص��ܺ�
	 * @param arr
	 * @return
	 */
	public static int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
