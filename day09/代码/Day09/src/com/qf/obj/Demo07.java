package com.qf.obj;

public class Demo07 {
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.show();
		
		Tiger tiger2 = new Tiger();
		tiger2.show();
		
		Tiger tiger3 = new Tiger("���ϻ�", 2, "ë�Ӹ�");
		tiger3.show();
		
	}
}

class Tiger{
	String type;
	String name;
	int age;
	double weight;
	double length;
	String color;
	
	/**
	 * 	������������е��õķ���
	 * 	��ɶ���ĳ�ʼ��
	 * 	���췽��
	 * 	������
	 */
	public Tiger() {
		System.out.println("��ʲô�õķ���????");
	}
	
	public Tiger(String t,int a,String n) {
		type = t;
		age = a;
		name = n;
	}
	
	public void show() {
		System.out.println("Tiger [type=" + type + ", name=" + name + ", age=" + age + ", weight=" + weight + ", length=" + length
				+ ", color=" + color + "]");
	}
	
}
