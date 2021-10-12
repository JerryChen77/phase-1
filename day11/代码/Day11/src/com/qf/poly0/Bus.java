package com.qf.poly0;

/**
 * 巴士车
 */
public class Bus extends Auto {
	@Override
	public void start() {
		System.out.println("巴士车紧急情况下可以使用人推启动");
	}
	
	@Override
	public void stop() {
		System.out.println("公交车的刹车功能非常重要,使用鼓刹");
	}
	
	@Override
	public void func() {
		System.out.println("公交车用于城市通勤");
	}
}
