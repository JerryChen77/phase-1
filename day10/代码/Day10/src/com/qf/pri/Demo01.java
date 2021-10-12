package com.qf.pri;

public class Demo01 {
	public static void main(String[] args) {
		Stu s1 = new Stu();
		s1.name = "张三";
		s1.age = 23;
		s1.show();
		
		System.out.println("===============");
		
		Stu s2 = new Stu();
		s2.name = "李四";
		// 原因是可以被任意读取和修改,相办法藏起来,只有特定的方式能修改
		s2.age = 2;
		s2.show();
		
	}
}

class Stu{
	// 属性
	String name;
	int age;
	
	public void show() {
		System.out.println("我是" + name + ",今年" + age);
	}
}
