package com.qf.func;

public class Demo15 {
	public static void main(String[] args) {
		/**
		 * 	5!
		 * 		5*4*3*2*1
		 * 	5!= 5 * 4!
		 * 	= 5 * 4 * 3!
		 * 	= 5 * 4 * 3 * 2!
		 * 	= 5 * 4 * 3 * 2 * 1!
		 * 
		 * getMul(5)==
		 * 5*getMul(4);
		 * 5*4*getMul(3);
		 * 5*4*3*getMul(2);
		 * 5*4*3*2*getMul(1);
		 * 5*4*3*2*1*getMul(0);	X
		 */
		
		int mul = getMul(10);
		System.out.println(mul);
		
	}

	/**
	 *	 计算阶乘的方法
	 * @param num
	 * @return
	 */
	public static int getMul(int num) {
		if (num == 1) {
			return 1;
		}else {
			return num * getMul(num-1);
		}
	}
}
