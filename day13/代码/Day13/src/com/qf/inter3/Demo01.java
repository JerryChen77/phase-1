package com.qf.inter3;

public class Demo01 {
	public static void main(String[] args) {
		// �ѹ��Ӷ��󿴳ɻ����Ķ���
		Jumpable jumpable = new Dog();
		jumpable.jump();
		
		System.out.println("===================");
		
		// �ѹ��Ӷ��󿴳ɻ���Ӿ�Ķ���
		Swimable swimable = new Dog();
		swimable.swim();

		System.out.println("===================");
		
		Dog dog01 = (Dog) jumpable;
		dog01.jump();
		dog01.swim();
		
		System.out.println("===================");
		
		Dog dog02 = (Dog) swimable;
		dog02.swim();
		dog02.jump();
	}
}
