package com.qf.obj;

/**
 * 	类名
 *		Car
 *	属性
 *		brand
 *		color		
 *		model
 *		price
 *	方法
 *		start
 *		stop
 *		run
 */
public class Car {
	// 属性
	String brand;
	String color;
	String model;	// 型号
	int price;
	
	// 方法
	public void start(String func) {
		System.out.println("这个车子启动的方式是：" + func);
	}
	
	public void stop(String func) {
		System.out.println("我们家车子刹车的方式是：" + func);
	}
	
	public void run(int speed) {
		System.out.println("车子最高时速能达到:" + speed);
	}
	
	public void show() {
		System.out.println("Car [brand=" + brand + ", color=" + color + ", model=" + model + ", price=" + price + "]");
	}
	
}
