package com.qf.static0;

public class Demo01 {
	public static void main(String[] args) {
		D1 d1 = new D1();
		d1.name = "����";
		d1.age = 23;
		d1.show();
		
		System.out.println("=====================");
		
		D1 d01 = new D1();
		d01.name = "lisisi";
		d01.age = 24;
		d01.show();
	}
}

class D1{
	/**
	 * ʵ������
	 * 	���Ŷ���Ĵ���������
	 * 	ÿ�����󶼳���һ��
	 */
	String name;
	int age;
	
	public void show() {
		System.out.println("D1 [name=" + name + ", age=" + age + "]");
	}
	
}
