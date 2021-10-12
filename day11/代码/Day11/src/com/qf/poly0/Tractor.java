package com.qf.poly0;

/**
 * 拖拉机类
 */
public class Tractor extends Auto {
	@Override
	public void start() {
		System.out.println("中国的单杠柴油机使用摇把启动");
	}
	
	@Override
	public void stop() {
		System.out.println("拖拉机紧急时候可以撞树停车");
	}
	
	@Override
	public void func() {
		System.out.println("拖拉机可以拉货、拉人、发电、抽水、、、");
	}
}
