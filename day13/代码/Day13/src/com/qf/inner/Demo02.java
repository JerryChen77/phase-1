package com.qf.inner;

public class Demo02 {
	public static void main(String[] args) {

		System.out.println("HelloWorld001");
		System.out.println("HelloWorld002");
		
		int num = 110;

		class Inner {
			String name;
			int age;

			public Inner() {
				super();
			}

			public Inner(String name, int age) {
				super();
				this.name = name;
				this.age = age;
			}

			public void show() {
				System.out.println("我是" + name + ",今年" + age);
				System.out.println("num = " + num);
			}
		}

		Inner inner = new Inner("张三", 23);
		inner.show();
		
		// num = 220;

		System.out.println("HelloWorld003");
		System.out.println("HelloWorld004");
		System.out.println("HelloWorld005");

	}
}
