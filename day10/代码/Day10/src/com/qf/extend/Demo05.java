package com.qf.extend;

public class Demo05 {
	public static void main(String[] args) {
		S s = new S();
		System.out.println(s.name);
		System.out.println(s.age);
		// 私有的属性子类无法访问
		// System.out.println(s.secret);
		
		s.show();
		// 子类无法访问父类中私有的方法
		// s.showSecret();
		
		/**
		 * 	子类有没有继承到父类中私有的数据
		 */
	}
}


class F{
	String name = "F";
	int age = 70;
	private String secret = "我有很多小秘密";
	
	public void show() {
		System.out.println("我是F中的show方法");
	}
	
	private void showSecret() {
		System.out.println("我有很多小秘密就不告诉你");
	}
	
}

class S extends F{
	
}