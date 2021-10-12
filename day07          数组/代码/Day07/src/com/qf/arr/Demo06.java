package com.qf.arr;

public class Demo06 {
	public static void main(String[] args) {
		
		/**
		 * 	����һ���ַ�����--char[]
		 * 		��дһ����������������д��a--z
		 */
		
		char[] chars = new char[26];
		
		addChar(chars);
		
		for (char c : chars) {
			System.out.println(c);
		}
		
		System.out.println("=============");
		
		// �����������Z--A
		addUpChars(chars);
		
		for (char c : chars) {
			System.out.println(c);
		}
		
	}

	/**
	 * 	���������Z--A
	 * @param chars
	 */
	public static void addUpChars(char[] chars) {
		for (int i = 0; i < chars.length; i++) {
			chars[i] = (char) (90-i);
		}
	}

	/**
	 * 	���ַ����������a--z
	 * @param chars
	 */
	public static void addChar(char[] chars) {
		for (int i = 0; i < chars.length; i++) {
			chars[i] = (char) (i+97);
		}
	}
}
