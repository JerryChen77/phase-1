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
		System.out.println("��A�еĹ�����....");
	}

	public void showA() {
		System.out.println("A���е�showA");
	}
}

class B extends A{
	String strB = "BBB";
	
	public B() {
		System.out.println("��B�еĹ�����....");
	}

	public void showB() {
		System.out.println("B���е�showB");
	}
	
}

class C extends B{
	String strC = "CCC";
	
	public C() {
		System.out.println("��C�еĹ�����....");
	}

	public C(String strC) {
		super();
		this.strC = strC;
	}

	public void showC() {
		System.out.println("C���е�showC");
	}
	
}