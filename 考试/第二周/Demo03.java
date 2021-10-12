package com.qf.exam;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * 创建车类Car，自定义颜色、型号、价格属性，方法有启动，行驶、展示。
			创建Car对象，调用这些方法
		 */
		// 创建对象和属性赋值--3分
		Car car = new Car();
		car.type = "奥迪TT";
		car.color = "白色";
		car.price = 49.68;
		
		// 调用方法--1分
		car.show();
	}
}

/**
 * Car类
 * 	构造方法可写可不写
 * @author Dushine2008
 *
 */
class Car{
	// 属性--3分
	String type;
	String color;
	double price;
	
	public Car() {
		super();
	}

	public Car(String type, String color, double price) {
		super();
		this.type = type;
		this.color = color;
		this.price = price;
	}

	// 方法--3分
	public void show() {
		System.out.println("Car [type=" + type + ", color=" + color + ", price=" + price + "]");
	}

}