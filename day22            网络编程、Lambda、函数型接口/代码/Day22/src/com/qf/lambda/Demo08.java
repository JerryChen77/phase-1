package com.qf.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo08 {
	public static void main(String[] args) {
		Predicate<String> p1 = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.startsWith("��");
			}
		};
		boolean b1 = p1.test("����");
		System.out.println(b1);
		
		Predicate<String> p2 = str -> str.startsWith("��");
		System.out.println(p2.test("����"));
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("����");
		names.add("����");
		names.add("����");
		names.add("����");
		
		List<String> list = filterName(p2, names);
		System.out.println(list);
		
	}
	
	/**
	 * 	�����ͽӿ�
	 * @param predicate	�жϵĹ���
	 * @param names		���жϵ���������
	 * @return			���Ϲ��������
	 */
	public static List<String> filterName(Predicate<String> predicate,List<String> names){
		ArrayList<String> list = new ArrayList<String>();
		// �ж�
		for (String name : names) {
			if (predicate.test(name)) {
				list.add(name);
			}
		}
		return list;
	}
	
	
	
}
