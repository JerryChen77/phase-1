package com.qf.super0;

public class Demo02 {
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.strA);
		System.out.println(c.strB);
		System.out.println(c.strC);
		
		c.showA();
		c.showB();
		c.showC();
	}
}

class A{
	String strA = "AAA";
	
	public A() {
		System.out.println("类A中的构造器....");
	}

	public void showA() {
		System.out.println("A类中的showA");
	}
}

class B extends A{
	String strB = "BBB";
	
	public B() {
		System.out.println("类B中的构造器....");
	}

	public void showB() {
		System.out.println("B类中的showB");
	}
	
}

class C extends B{
	String strC = "CCC";
	
	public C() {
		System.out.println("类C中的构造器....");
	}

	public C(String strC) {
		super();
		this.strC = strC;
	}

	public void showC() {
		System.out.println("C类中的showC");
	}
	
}