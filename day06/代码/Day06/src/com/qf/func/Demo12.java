package com.qf.func;

public class Demo12 {
	public static void main(String[] args) {
		/**
		 * 	根据参数列表和返回值
		 * 		无参数，无返回值
		 * 		无参数，有返回值
		 * 		
		 * 		有参数，无返回值
		 * 		有参数，有返回值
		 */
	}
	
	
	/**
	 * 	提示的作用
	 * 		方法体内容固定
	 * 		不要得到任何结果
	 */
	public static void notice() {
		System.out.println("请站稳扶好,注意脚下安全");
	}
	
	
	/**
	 * 	查询一些数据
	 * 		需要返回查询的结果
	 * @return
	 */
	public static String getInfo() {
		return "CPU:I5 9300H 内存:32GB 硬盘:128GB+1T";
	}
	
	/**
	 * 	传入参数，运行数据
	 * @param name
	 * @param age
	 * @param addr
	 */
	public static void show(String name,int age,String addr) {
		System.out.println("我是：" + name + ",今年" + age + ",来自:" + addr);
	}
	
	/**
	 * 	计算num的阶乘
	 * @param num
	 * @return
	 */
	public static int getMul(int num) {
		int mul = 1;
		for (int i = 1; i < num; i++) {
			mul *= i;
		}
		return mul;
	}
	
}
