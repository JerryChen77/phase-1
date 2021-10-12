package com.qf.poly0;
/**
 * 摩托车
 */
public class MOTOBicycle extends Auto {
	@Override
	public void start() {
		System.out.println("摩托车使用脚启动");
	}
	
	@Override
	public void stop() {
		System.out.println("摩托车可以实现脚刹");
	}
	
	@Override
	public void func() {
		System.out.println("摩托车是最拉风的交通工具");
	}
}
