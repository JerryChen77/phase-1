package com.qf.str;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 *  String() 
			          初始化一个新创建的 String 对象，使其表示一个空字符序列。 
			          
			String(String original) 
			          初始化一个新创建的 String 对象，使其表示一个与参数相同的字符序列；换句话说，新创建的字符串是该参数字符串的副本。 
			          
			String(byte[] bytes) 
			          通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String。 
			String(byte[] bytes, int offset, int length) 
			          通过使用平台的默认字符集解码指定的 byte 子数组，构造一个新的 String。 
			          
			String(char[] value) 
			          分配一个新的 String，使其表示字符数组参数中当前包含的字符序列。 
			String(char[] value, int offset, int count) 
			          分配一个新的 String，它包含取自字符数组参数一个子数组的字符。 
			          
			String(int[] codePoints, int offset, int count) 
			          分配一个新的 String，它包含 Unicode 代码点数组参数一个子数组的字符。 
		 */
		
		String s01 = new String();
		System.out.println(s01);
		
		String s02 = new String("HelloWorld");
		System.out.println(s02);
		System.out.println(s02.equals("HelloWorld"));
		System.out.println(s02 == ("HelloWorld"));
		
		byte[] bytes = {65,66,67,68,69,70,71};
		String s03 = new String(bytes);
		System.out.println(s03);
		
		s03 = new String(bytes, 2, 3);
		System.out.println(s03);
		
		char[] chars = {'a','b','c','d','e','f','g'};
		String s04 = new String(chars);
		System.out.println(s04);
		s04 = new String(chars, 2, 3);
		System.out.println(s04);
		
		System.out.println('张' + 1);
		int[] arr = {24352,24353,24354,24355,24356};
		String s05 = new String(arr, 0, arr.length);
		System.out.println(s05);
	}
}
