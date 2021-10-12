package com.qf.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo08 {
	public static void main(String[] args) {
		Predicate<String> p1 = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.startsWith("张");
			}
		};
		boolean b1 = p1.test("张三");
		System.out.println(b1);
		
		Predicate<String> p2 = str -> str.startsWith("张");
		System.out.println(p2.test("李四"));
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("张三");
		names.add("李四");
		names.add("张武");
		names.add("赵柳");
		
		List<String> list = filterName(p2, names);
		System.out.println(list);
		
	}
	
	/**
	 * 	断言型接口
	 * @param predicate	判断的规则
	 * @param names		被判断的所有数据
	 * @return			符合规则的数据
	 */
	public static List<String> filterName(Predicate<String> predicate,List<String> names){
		ArrayList<String> list = new ArrayList<String>();
		// 判断
		for (String name : names) {
			if (predicate.test(name)) {
				list.add(name);
			}
		}
		return list;
	}
	
	
	
}
