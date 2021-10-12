package com.qf.comm;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * Math 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。 
		    static double abs(double a) 
			          返回 double 值的绝对值。 
			static double cbrt(double a) 
			          返回 double 值的立方根。 
			static double ceil(double a) 
			          返回最小的（最接近负无穷大）double 值，该值大于等于参数，并等于某个整数。 
			static double floor(double a) 
			          返回最大的（最接近正无穷大）double 值，该值小于等于参数，并等于某个整数。 
			static double max(double a, double b) 
			          返回两个 double 值中较大的一个。 
			static double min(double a, double b) 
			          返回两个 double 值中较小的一个。 
			static double pow(double a, double b) 
			          返回第一个参数的第二个参数次幂的值。 
			static double random() 
			          返回带正号的 double 值，该值大于等于 0.0 且小于 1.0。 
			static long round(double a) 
			          返回最接近参数的 long。 
			static int round(float a) 
			          返回最接近参数的 int。 
			static double sqrt(double a) 
			          返回正确舍入的 double 值的正平方根。 
		 */
		
		System.out.println(Math.abs(3.3));
		System.out.println(Math.abs(-3.3));
		
		for (int i = 2; i <= 20; i++) {
			System.out.println(i + "的立方根是:" + Math.cbrt(i));
		}
		
		System.out.println(Math.ceil(3.3));
		System.out.println(Math.floor(3.3));
		
		System.out.println(Math.pow(2, 3));
		
		System.out.println(0.01*Math.pow(2, 30));
		
		for (int i = 0; i < 10; i++) {
			// 生成33--88之间的随机数
			System.out.println(Math.random());
		}
		
		System.out.println(Math.round(33.33));
		System.out.println(Math.round(33.55));
		
		for (int i = 2; i <= 20; i++) {
			System.out.println(i + "的平方根是:" + Math.sqrt(i));
		}
	}
}
