package com.qf.extend;

public class Demo02 {
	public static void main(String[] args) {
		C c = new C();
	}
}

class A{
	String nameA = "A";
	
	public void showA() {
		
	}
	
}

class B extends A{
	String nameB = "B";
	
	public void showB() {
		
	}
}

class C extends B{
	String nameC = "C";
	
	public void showC() {
		
	}
}
