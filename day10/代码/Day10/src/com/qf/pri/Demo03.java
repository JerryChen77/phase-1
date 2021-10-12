package com.qf.pri;

public class Demo03 {
	public static void main(String[] args) {
		Car car = new Car();
		car.brand = "长城";
		car.model = "炮";
		car.info = "在皮卡解禁的十里春风之下，引领中国皮卡乘用化时代的长城炮显得愈发耀眼";
		car.setPrice(120000);
		
		car.show();
		
		// 绕过了私有的设定规则
		car = new Car("长城", "初恋", -20000, "不得不说,长城汽车的设计师真的是“脑洞大开”,竟然能够直接给新车命名为哈弗初恋,这款车自从亮相就获得了很高的曝光度,基于全新柠檬平台打造,名字有这么“新鲜”,");
		car.show();
	}
}

class Car{
	String brand;
	String model;
	private int price;
	String info;
	
	public Car() {}
	
	public Car(String brand, String model, int price, String info) {
		super();
		this.brand = brand;
		this.model = model;
		this.setPrice(price);
		this.info = info;
	}

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		if (price >= 100000 && price < 170000) {
			this.price = price;
		}else {
			this.price = -1;
			System.err.println("价格不在合法范围");
		}
	}
	
	public void show() {
		System.out.println("这是一台" + brand + "牌的" + model + "车,价格是:" + price + "," + info); 
	}
	
}
