package com.qf.arr;

public class Demo09 {
	public static void main(String[] args) {
		getSum(11);
		int[] arr = new int[] {};
		System.out.println(arr);
		double[] d = new double[] {};
		System.out.println(d);
	}
	
	public static int getSum(int a) {
		System.out.println("===========");
		return a;
	}
	
	public static int getSum(int a,int b) {
		return a+b;
	}
	
	public static int getSum(int a,int b,int c) {
		return a+b+c;
	}
	
	public static int getSum(int a,int b,int c,int d) {
		return a+b+c+d;
	}
	
	public static int getSum(int a,int b,int c,int d,int e) {
		return a+b+c+d+e;
	}
	
	public static int getSum(int a,int b,int c,int d,int e,int f) {
		return a+b+c+d+e+f;
	}

	// 张三说:我们班里有20同学,他们的名字是:zhangsi,zhangwu,zhangliu...
	/**
	 * 	不定长参数--不确定长度,使用省略号
	 * @param is
	 * @return
	 */
	public static int getSum(int...is) {
		System.out.println(is);
		int sum = 0;
		for (int i = 0; i < is.length; i++) {
			sum += is[i];
		}
		return sum;
	}
}
