package com.qf.obj;

/**
 * 	����
 *		Car
 *	����
 *		brand
 *		color		
 *		model
 *		price
 *	����
 *		start
 *		stop
 *		run
 */
public class Car {
	// ����
	String brand;
	String color;
	String model;	// �ͺ�
	int price;
	
	// ����
	public void start(String func) {
		System.out.println("������������ķ�ʽ�ǣ�" + func);
	}
	
	public void stop(String func) {
		System.out.println("���Ǽҳ���ɲ���ķ�ʽ�ǣ�" + func);
	}
	
	public void run(int speed) {
		System.out.println("�������ʱ���ܴﵽ:" + speed);
	}
	
	public void show() {
		System.out.println("Car [brand=" + brand + ", color=" + color + ", model=" + model + ", price=" + price + "]");
	}
	
}
