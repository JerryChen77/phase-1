package com.qf.poly;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 动物 小动物 = 火蝾螈实体;
		 * 	小动物.eat()====>  小鱼小虾
		 * 	小动物.sleep() ==> 飘着睡
		 */
		/**
		 * 父类引用指向子类对象--多态
		 * 	把蝾螈当做动物看待
		 */
		Animal animal;
		animal = new Salamander();
		animal.eat();
		
		/**
		 *  把蝾螈当做捕猎者看待
		 */
		Hunter hunter = new Salamander();
		hunter.hunt();
	}
}

class Animal extends Hunter{
	String type = "动物";
	String name;
	int age;
	
	public void eat() {
		System.out.println("动物需要进食");
	}
	
	public void sleep() {
		System.out.println("动物需要休息");
	}
}

class Salamander extends Animal{
	@Override
	public void eat() {
		System.out.println("火蝾螈喜欢吃小鱼小虾");
	}
	
	@Override
	public void sleep() {
		System.out.println("火蝾螈睡觉的姿势的飘着睡");
	}
	
	@Override
	public void hunt() {
		System.out.println("蝾螈可以捕食一些小的动物");
	}
}

class Hunter{
	String type;
	
	public void hunt() {
		System.out.println("猎手可以捕获猎物");
	}
	
}
