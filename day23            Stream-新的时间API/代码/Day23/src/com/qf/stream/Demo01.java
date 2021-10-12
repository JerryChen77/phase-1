package com.qf.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo01 {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("张三", 12000));
		list.add(new Employee("李四", 11000));
		list.add(new Employee("王五", 15000));
		list.add(new Employee("赵柳", 19000));
		list.add(new Employee("田七", 10000));
		System.out.println(list);
		
		// 使用Collection对象生成Stream
		Stream<Employee> s1 = list.stream();
		System.out.println(s1);
		s1.forEach(System.out::println);
		System.out.println("============================================");
		
		list.stream().forEach(System.out::println);
		System.out.println("============================================");
		
		// 使用Arrays的方法生成Stream
		Arrays.stream(new int[] {111,222,333}).forEach(System.out::println);
		System.out.println("============================================");
		
		// 使用Stream自带的方法生成Stream
		Stream.of("张三","李四","王五").forEach(System.out::println);
		System.out.println("============================================");
		
		// 使用IntStream、LongStream、DoubleStream生成
		IntStream.of(123,234,345).forEach(System.out::println);
		
	}
}
