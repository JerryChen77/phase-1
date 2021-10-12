package com.qf.demos;

public class Demo02 {
	public static void main(String[] args) {
		// 4、编写方法，计算从1到某个数以内所有能被3或者17整除的数的和并输出。
		int sum = getSum(100);
		System.out.println(sum);
	}
	
	/**
	 * 4、编写方法，计算从1到某个数以内所有能被3或者17整除的数的和并输出。
	 * @param num
	 * @return
	 */
	public static int getSum(int num) {
		int sum = 0;
		// 计算1--任意满足条件数字的和
		
		for (int i = 1; i <= num; i++) {
			if ((i%3==0) || (i%17==0)) {
				sum += i;
			}
		}
		return sum;
	}
}
