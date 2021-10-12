package com.qf.obj;

public class Demo02 {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.brand = "BYD";
		car.model = "汉";
		car.price = 25;
		car.color = "红色";
		
		car.show();
		
		car.start("电启动");
		car.stop("电刹");
		
		car.run(220);
		
	}
}