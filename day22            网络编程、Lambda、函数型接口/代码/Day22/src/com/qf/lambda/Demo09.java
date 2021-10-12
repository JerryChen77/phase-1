package com.qf.lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Demo09 {
	public static void main(String[] args) {
		Consumer<String> c1 = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println("���:" + t);
			}
		};
		c1.accept("Hello");
		
		Consumer<String> c2 = str -> System.out.println("���:" + str);
		c2.accept("World");
		
		// ʵ��::ʵ������
		Consumer<String> c3 = System.out::println;
		c3.accept("HelloWorld");
		
		// ��::��̬����
		Consumer<String> c4 = Employee::showStatic;
		c4.accept("haha");
		
		// ʵ��::ʵ������
		Consumer<String> c5 = new Employee()::show;
		c5.accept("hehe");
		
		Supplier<Employee> s = Employee::new;
		Employee e = s.get();
		System.out.println(e);
	}
}
