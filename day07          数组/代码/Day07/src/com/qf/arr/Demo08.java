package com.qf.arr;

public class Demo08 {

	public static void main(String[] args) {
		/**
		 * 	统计所有数字的总和
		 * 	统计平均值
		 * 
		 * 	找指定元素的第一次出现的位置
		 * 	找指定元素最后一次出现的位置
		 * 	找元素出现的次数
		 * 	找是佛包含指定元素
		 * 
		 * 	翻转数组
		 * 	合并数组
		 */
		
		int[] arr = new int[] {456,41,3246,76121,64,94,32,135,798};
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("arr数组元素的总和是:" + sum);
		System.out.println("arr数组元素的额平均值是:" + (1.0*sum/arr.length));
		
		int sum2 = getSum(arr);
		System.out.println(sum2);
	}
	
	/**
	 * 	计算传入数组的元素总和
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
