package com.qf.this0;

public class Demo02 {
	public static void main(String[] args) {
		Plane p1 = new Plane("", "", "", "");
		p1.fly();
	}
}

class Plane{
	String brand;
	String model;
	String country;
	String price;
	int speed;
	String color;
	
	public Plane() {
		System.out.println("����û�в����Ĺ�����");
	}
	
	public Plane(String brand,String model,String price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		System.out.println("�������������Ĺ�����");
	}
	
	public Plane(String brand,String model,String country,String price) {
		// ���������ñ�����ڵ�һ��
		this(brand, model, price);
		this.country = country;
		System.out.println("�����ĸ������Ĺ�����");
		// �������п��Ե���ʵ��������ʵ������
		fly();
	}
	
	public void fly() {
		// ���������ñ����ڹ�������
		// this(brand, model, price);
		System.out.println("�ɻ������ڵ���������ʻ");
		// ����ʵ������
		this.attack();
	}
	
	public void attack() {
		System.out.println("��Щ�ɻ�������ս����ʹ��");
	}
	
}
