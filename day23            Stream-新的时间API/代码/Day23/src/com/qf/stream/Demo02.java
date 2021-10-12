package com.qf.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo02 {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("张三", 12000));
		list.add(new Employee("李四", 11000));
		list.add(new Employee("王五", 15000));
		list.add(new Employee("赵柳", 19000));
		list.add(new Employee("田七", 10000));
		list.add(new Employee("田七", 10000));
		System.out.println(list);
		
		System.out.println("==================filter======================");
		Stream<Employee> s1 = list.stream();
		// Stream每次中间操作不产生结果，不结束，产生一个新的Stream
		Stream<Employee> s11 = s1.filter((e -> e.getSalary()>12000));
		// 终止操作
		s11.forEach(System.out::println);
		System.out.println("==================filter======================");
		list.stream().filter((e -> e.getSalary()>12000)).forEach(System.out::println);
		
		System.out.println("==================limit======================");
		list.stream().limit(3).forEach(System.out::println);
		
		System.out.println("==================skip======================");
		list.stream().skip(3).forEach(System.out::println);
		
		System.out.println("==================distinct======================");
		list.stream().distinct().forEach(System.out::println);
		
		System.out.println("==================sorted======================");
		list.stream().sorted((e1,e2) -> Double.compare(e1.getSalary(), e2.getSalary())).forEach(System.out::println);
		
		System.out.println("==================map======================");
		list.stream().map(e -> e.getName()).forEach(System.out::println);
		
	}
}
