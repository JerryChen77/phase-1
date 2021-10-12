package com.qf.lambda;

import java.util.function.Function;

public class Demo07 {
	public static void main(String[] args) {
		Function<String, Character> f1 = new Function<String, Character>() {
			@Override
			public Character apply(String str) {
				return str.charAt(0);
			}
		};
		Character c1 = f1.apply("张三");
		System.out.println(c1);
		
		Function<String, Character> f2 = str -> str.charAt(0);
		System.out.println(f2.apply("李四"));
		
		Character c3 = getFamilyName(f2, "王五");
		System.out.println(c3);
	}
	
	/**
	 * 	函数型接口
	 * @param function	定义操作数据的规则
	 * @param name		被操作的数据
	 * @return			返回的结果
	 */
	public static Character getFamilyName(Function<String, Character> function,String name) {
		return function.apply(name);
	}
	
}
