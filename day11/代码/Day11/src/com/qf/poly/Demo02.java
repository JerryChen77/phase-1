package com.qf.poly;

public class Demo02 {
	public static void main(String[] args) {
		// ������������
		Son s = new Son();
		
		Parent p = new Son();
		
	}
}



class Parent{
	public void show() {
		System.out.println("Parent�е�show");
	}
}

class Grandfather{
	
}

class Son extends Parent{
	@Override
	public void show() {
		super.show();
		System.out.println("Son�е�show");
	}
}