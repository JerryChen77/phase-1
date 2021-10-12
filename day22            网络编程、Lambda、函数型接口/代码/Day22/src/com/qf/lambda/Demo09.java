package com.qf.lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Demo09 {
	public static void main(String[] args) {
		Consumer<String> c1 = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println("输出:" + t);
			}
		};
		c1.accept("Hello");
		
		Consumer<String> c2 = str -> System.out.println("输出:" + str);
		c2.accept("World");
		
		// 实例::实例方法
		Consumer<String> c3 = System.out::println;
		c3.accept("HelloWorld");
		
		// 类::静态方法
		Consumer<String> c4 = Employee::showStatic;
		c4.accept("haha");
		
		// 实例::实例方法
		Consumer<String> c5 = new Employee()::show;
		c5.accept("hehe");
		
		Supplier<Employee> s = Employee::new;
		Employee e = s.get();
		System.out.println(e);
	}
}
