package com.qf.abstract0;

public class Demo01 {
	public static void main(String[] args) {
//		Animal a = new Animal();
//		a.eat();
//		a.sleep();
		
		Animal aa = new Dog();
		Dog dog = new Dog();
		dog.eat();
		dog.sleep();
	}
}

/**
 * ������
 * 	�ſ���������Ժͷ���
 * ʹ��abstract����
 * 	��ɳ�����
 * 	�޷�ֱ�Ӵ�������
 * 	���Ա��̳�
 */
abstract class Animal{
	String type;
	String name;
	int age;
	
	public void eat() {
		System.out.println("������Ҫ�Է�");
	}
	
	public void sleep() {
		System.out.println("������Ҫ˯��");
	}
}

class Dog extends Animal{
	
}
