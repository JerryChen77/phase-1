package com.qf.inner;

public class Demo05 {
	public static void main(String[] args) {
		// Outer0 outer0 = new Outer0();
		System.out.println(Outer0.Inner0.strInnerStatic);
	}
}

class Outer0{
	static {
		System.out.println("我是外部类的静态代码块...");
	}
	
	
	static class Inner0{
		static String strInnerStatic = "静态内部类静态变量";
		static {
			System.out.println("我是内部类的静态代码块...");
		}
	}
}
