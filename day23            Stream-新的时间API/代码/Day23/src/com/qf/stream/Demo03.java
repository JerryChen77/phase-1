package com.qf.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo03 {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("张三", 12000));
		list.add(new Employee("李四", 11000));
		list.add(new Employee("王五", 15000));
		list.add(new Employee("赵柳", 19000));
		list.add(new Employee("田七", 10000));
		list.add(new Employee("田七", 10000));
		System.out.println(list);
		
		System.out.println("==================foreach===================");
		list.stream().forEach(System.out::println);
		
		System.out.println("==================min===================");
		Optional<Employee> min = list.stream().min((e1,e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
		System.out.println(min);
		
		System.out.println("==================max===================");
		Optional<Employee> max = list.stream().max((e1,e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
		System.out.println(max);
		
		System.out.println("==================count===================");
		long count = list.stream().filter((e -> e.getSalary()>12000)).count();
		System.out.println(count);
		
		System.out.println("==================reduce===================");
		Optional<Double> reduce = list.stream().map(e -> e.getSalary()).reduce((x,y) -> x+y);
		System.out.println(reduce);
		
		System.out.println("==================collect===================");
		List<String> collect = list.stream().map(e -> e.getName()).collect(Collectors.toList());
		System.out.println(collect);
		
	}
}
