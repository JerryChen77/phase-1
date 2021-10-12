package com.qf.lambda;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo02 {
	public static void main(String[] args) {
		// 创建比较器对象,字符长的放后面
		Comparator<String> c1 = new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		};
		TreeSet<String> s1 = new TreeSet<String>(c1);
		s1.add("hello");
		s1.add("haha");
		s1.add("hi");
		s1.add("heiheihei");
		s1.add("houhou");
		s1.add("xixixixi");
		System.out.println(s1);
		
		/**
		 * 	方法的参数列表 -> 方法体
		 */
		Comparator<String> c2 = (String s01, String s02) -> {
			return s01.length() - s02.length();
		};
		TreeSet<String> s2 = new TreeSet<String>(c2);
		s2.add("hello");
		s2.add("haha");
		s2.add("hi");
		s2.add("heiheihei");
		s2.add("houhou");
		s2.add("xixixixi");
		System.out.println(s2);
		
		Comparator<String> c3 = (s01, s02) -> {
			return s01.length() - s02.length();
		};
		TreeSet<String> s3 = new TreeSet<String>(c3);
		s3.add("hello");
		s3.add("haha");
		s3.add("hi");
		s3.add("heiheihei");
		s3.add("houhou");
		s3.add("xixixixi");
		System.out.println(s3);
		
		Comparator<String> c4 = (s01, s02) -> s01.length() - s02.length();
		TreeSet<String> s4 = new TreeSet<String>(c4);
		s4.add("hello");
		s4.add("haha");
		s4.add("hi");
		s4.add("heiheihei");
		s4.add("houhou");
		s4.add("xixixixi");
		System.out.println(s4);
		
		TreeSet<String> s5 = new TreeSet<String>((s01, s02) -> s01.length() - s02.length());
		s5.add("hello");
		s5.add("haha");
		s5.add("hi");
		s5.add("heiheihei");
		s5.add("houhou");
		s5.add("xixixixi");
		System.out.println(s5);
		
		TreeSet<String> s6 = new TreeSet<String>(String::compareTo);
		s6.add("hello");
		s6.add("haha");
		s6.add("hi");
		s6.add("heiheihei");
		s6.add("houhou");
		s6.add("xixixixi");
		System.out.println(s6);
	}
}
