package com.qf.demos;

public class Demo02 {
	public static void main(String[] args) {
		// 4����д�����������1��ĳ�������������ܱ�3����17���������ĺͲ������
		int sum = getSum(100);
		System.out.println(sum);
	}
	
	/**
	 * 4����д�����������1��ĳ�������������ܱ�3����17���������ĺͲ������
	 * @param num
	 * @return
	 */
	public static int getSum(int num) {
		int sum = 0;
		// ����1--���������������ֵĺ�
		
		for (int i = 1; i <= num; i++) {
			if ((i%3==0) || (i%17==0)) {
				sum += i;
			}
		}
		return sum;
	}
}
