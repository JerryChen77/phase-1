package com.qf.arr;

public class Demo08 {

	public static void main(String[] args) {
		/**
		 * 	ͳ���������ֵ��ܺ�
		 * 	ͳ��ƽ��ֵ
		 * 
		 * 	��ָ��Ԫ�صĵ�һ�γ��ֵ�λ��
		 * 	��ָ��Ԫ�����һ�γ��ֵ�λ��
		 * 	��Ԫ�س��ֵĴ���
		 * 	���Ƿ����ָ��Ԫ��
		 * 
		 * 	��ת����
		 * 	�ϲ�����
		 */
		
		int[] arr = new int[] {456,41,3246,76121,64,94,32,135,798};
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("arr����Ԫ�ص��ܺ���:" + sum);
		System.out.println("arr����Ԫ�صĶ�ƽ��ֵ��:" + (1.0*sum/arr.length));
		
		int sum2 = getSum(arr);
		System.out.println(sum2);
	}
	
	/**
	 * 	���㴫�������Ԫ���ܺ�
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
