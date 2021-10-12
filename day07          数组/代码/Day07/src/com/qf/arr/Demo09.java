package com.qf.arr;

public class Demo09 {

	public static void main(String[] args) {
		/**
		 * 	统计所有数字的总和
		 * 	统计平均值
		 */
		
		int[] arr = new int[] {456,41,3246,76121,64,94,32,135,798};
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("arr数组元素的总和是:" + sum);
		System.out.println("arr数组元素的额平均值是:" + (1.0*sum/arr.length));
	}
	
	/**
	 * 	计算数组元素的总和
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
