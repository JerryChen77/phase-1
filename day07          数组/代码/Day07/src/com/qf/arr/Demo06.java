package com.qf.arr;

public class Demo06 {
	public static void main(String[] args) {
		
		/**
		 * 	创建一个字符数组--char[]
		 * 		编写一个方法，向数组中写入a--z
		 */
		
		char[] chars = new char[26];
		
		addChar(chars);
		
		for (char c : chars) {
			System.out.println(c);
		}
		
		System.out.println("=============");
		
		// 向数组中添加Z--A
		addUpChars(chars);
		
		for (char c : chars) {
			System.out.println(c);
		}
		
	}

	/**
	 * 	向数组添加Z--A
	 * @param chars
	 */
	public static void addUpChars(char[] chars) {
		for (int i = 0; i < chars.length; i++) {
			chars[i] = (char) (90-i);
		}
	}

	/**
	 * 	向字符数组中添加a--z
	 * @param chars
	 */
	public static void addChar(char[] chars) {
		for (int i = 0; i < chars.length; i++) {
			chars[i] = (char) (i+97);
		}
	}
}
