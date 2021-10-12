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
		Character c1 = f1.apply("����");
		System.out.println(c1);
		
		Function<String, Character> f2 = str -> str.charAt(0);
		System.out.println(f2.apply("����"));
		
		Character c3 = getFamilyName(f2, "����");
		System.out.println(c3);
	}
	
	/**
	 * 	�����ͽӿ�
	 * @param function	����������ݵĹ���
	 * @param name		������������
	 * @return			���صĽ��
	 */
	public static Character getFamilyName(Function<String, Character> function,String name) {
		return function.apply(name);
	}
	
}
