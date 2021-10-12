package com.qf.arr;

public class Demo14 {
	public static void main(String[] args) {
		String[] name01 = {"司马懿","司马孚","司马进","司马朗","司马敏"};
		String[] name02 = {"孙策","孙权","孙坚","孙尚香"};
		
		String[] names = new String[name01.length + name02.length];
		
		// 使用arraycopy方法复制name01
		System.arraycopy(name01, 0, names, 0, name01.length);
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println("===========");
		
		// 使用arrayCopy方法复制name02
		System.arraycopy(name02, 0, names, name01.length, name02.length);
		for (String name : names) {
			System.out.println(name);
		}
		
	}
}
