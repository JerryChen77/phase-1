package com.qf.obj;

public class Demo01 {
	public static void main(String[] args) {
		// 创建对象
		Dog dog = new Dog();
		// 调用dog对象的方法
		dog.eat("骨头和肉");
		
		String type = dog.type;
		System.out.println(type);
		
		dog.type = "中华田园犬";
		System.out.println(dog.type);
	}
}
