package com.qf.arr;

public class Demo13 {
	public static void main(String[] args) {
		String[] name01 = {"司马懿","司马孚","司马进","司马朗","司马敏"};
		String[] name02 = {"孙策","孙权","孙坚","孙尚香"};
		
		// 合并两个数组
		String[] names = new String[name01.length + name02.length];
		
		// 取出name01数组中的元素放入names
		for (int i = 0; i < name01.length; i++) {
			names[i] = name01[i];
		}
		
		// 把name02中的元素放入names
		for (int i = 0; i < name02.length; i++) {
			names[name01.length + i] = name02[i];
		}
		
		System.out.println(names.length);
		for (String name : names) {
			System.out.println(name);
		}
	}
}
