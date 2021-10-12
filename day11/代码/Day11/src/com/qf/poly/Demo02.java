package com.qf.poly;

public class Demo02 {
	public static void main(String[] args) {
		// 正常创建对象
		Son s = new Son();
		
		Parent p = new Son();
		
	}
}



class Parent{
	public void show() {
		System.out.println("Parent中的show");
	}
}

class Grandfather{
	
}

class Son extends Parent{
	@Override
	public void show() {
		super.show();
		System.out.println("Son中的show");
	}
}