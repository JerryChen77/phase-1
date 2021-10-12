package com.qf.inter3;

public class Demo01 {
	public static void main(String[] args) {
		// 把狗子对象看成会跳的对象
		Jumpable jumpable = new Dog();
		jumpable.jump();
		
		System.out.println("===================");
		
		// 把狗子对象看成会游泳的对象
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
