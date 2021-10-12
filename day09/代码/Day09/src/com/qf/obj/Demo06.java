package com.qf.obj;

public class Demo06 {
	public static void main(String[] args) {
		// 创建计算器对象
		Calculator cal = new Calculator();
		// 调用加法,获取计算结果
		int sum = cal.getSum(33,55,77,88,99);
		System.out.println(sum);
		
		// 调用乘法
		int mul = cal.getMul(2,3,5,8,9);
		System.out.println(mul);
		
	}
}

/**
 * 	计算器类
 */
class Calculator{
	// 常量PI圆周率
	public final double PI = 3.141592653589793;
	
	/**
	 *	 计算任意个数整数相加的结果
	 * @param is
	 * @return
	 */
	public int getSum(int...is) {
		int sum = 0;
		for (int i = 0; i < is.length; i++) {
			sum += is[i];
		}
		return sum;
	}
	
	/**
	 * 	计算任意个数字相乘的结果
	 * @param is
	 * @return
	 */
	public int getMul(int...is) {
		int mul = 1;
		for (int i = 0; i < is.length; i++) {
			mul *= is[i];
		}
		return mul;
	}
}