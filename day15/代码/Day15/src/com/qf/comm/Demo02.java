package com.qf.comm;

import java.util.Random;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 	此类的实例用于生成伪随机数流。
		 * 
		 * 	Random() 
			          创建一个新的随机数生成器。 
			Random(long seed) 
			          使用单个 long 种子创建一个新的随机数生成器。 
		 */
		
		Random r = new Random();
		for (int i = 0; i < 20; i++) {
			// 33-88之间的随机数
			System.out.println(r.nextInt(100));
		}
		
	}
}
