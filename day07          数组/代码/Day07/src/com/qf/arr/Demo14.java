package com.qf.arr;

public class Demo14 {
	public static void main(String[] args) {
		String[] name01 = {"˾��ܲ","˾����","˾���","˾����","˾����"};
		String[] name02 = {"���","��Ȩ","���","������"};
		
		String[] names = new String[name01.length + name02.length];
		
		// ʹ��arraycopy��������name01
		System.arraycopy(name01, 0, names, 0, name01.length);
		for (String name : names) {
			System.out.println(name);
		}
		
		System.out.println("===========");
		
		// ʹ��arrayCopy��������name02
		System.arraycopy(name02, 0, names, name01.length, name02.length);
		for (String name : names) {
			System.out.println(name);
		}
		
	}
}
