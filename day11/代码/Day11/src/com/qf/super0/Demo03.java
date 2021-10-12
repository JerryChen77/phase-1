package com.qf.super0;

public class Demo03 {
	public static void main(String[] args) {
		// BB bb = new BB();
		
	}
}

class AA{
	String strAA = "AA";

	public AA(String strAA) {
		super();
		System.out.println("AA类中的构造器");
	}
	
}

class BB extends AA{
	public BB(String strAA) {
		super(strAA);
	}

	String strBB = "BB";
}