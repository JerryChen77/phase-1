package com.qf.obj;

public class Demo02 {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.brand = "BYD";
		car.model = "��";
		car.price = 25;
		car.color = "��ɫ";
		
		car.show();
		
		car.start("������");
		car.stop("��ɲ");
		
		car.run(220);
		
	}
}