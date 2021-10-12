package com.qf.poly0;

/**
 * 小汽车类
 */
public class Car extends Auto {
	@Override
	public void start() {
		System.out.println("小汽车使用电启动");
	}
	
	@Override
	public void stop() {
		System.out.println("小汽车使用刹车泵");
	}
	
	@Override
	public void func() {
		System.out.println("小汽车主要是家用,买菜、上下班...");
	}
}
