package com.qf.static0;

public class Demo05 {
	public static void main(String[] args) {
		Japanese j1 = new Japanese();
		System.out.println(j1.location);
		Japanese.show();
		Asian.show();
	}
}

class Asian{
	String name;
	int age;
	static String location = "北半球东半球";
	
	public void eat() {
		System.out.println("亚洲人事物以稻子和麦子为主");
	}
	
	public static void show() {
		System.out.println("亚洲人以黄种人为主,没有身高优势...");
	}
}

class Japanese extends Asian{
	
	public static void show() {
		System.out.println("日本人以黄种人为主,以前身高很低...");
	}
}

// private class DD{}