package com.qf.exam;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * ��������Car���Զ�����ɫ���ͺš��۸����ԣ���������������ʻ��չʾ��
			����Car���󣬵�����Щ����
		 */
		// ������������Ը�ֵ--3��
		Car car = new Car();
		car.type = "�µ�TT";
		car.color = "��ɫ";
		car.price = 49.68;
		
		// ���÷���--1��
		car.show();
	}
}

/**
 * Car��
 * 	���췽����д�ɲ�д
 * @author Dushine2008
 *
 */
class Car{
	// ����--3��
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

	// ����--3��
	public void show() {
		System.out.println("Car [type=" + type + ", color=" + color + ", price=" + price + "]");
	}

}