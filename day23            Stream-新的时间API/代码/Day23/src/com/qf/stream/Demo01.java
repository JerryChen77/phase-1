package com.qf.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo01 {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("����", 12000));
		list.add(new Employee("����", 11000));
		list.add(new Employee("����", 15000));
		list.add(new Employee("����", 19000));
		list.add(new Employee("����", 10000));
		System.out.println(list);
		
		// ʹ��Collection��������Stream
		Stream<Employee> s1 = list.stream();
		System.out.println(s1);
		s1.forEach(System.out::println);
		System.out.println("============================================");
		
		list.stream().forEach(System.out::println);
		System.out.println("============================================");
		
		// ʹ��Arrays�ķ�������Stream
		Arrays.stream(new int[] {111,222,333}).forEach(System.out::println);
		System.out.println("============================================");
		
		// ʹ��Stream�Դ��ķ�������Stream
		Stream.of("����","����","����").forEach(System.out::println);
		System.out.println("============================================");
		
		// ʹ��IntStream��LongStream��DoubleStream����
		IntStream.of(123,234,345).forEach(System.out::println);
		
	}
}
