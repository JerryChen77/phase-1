package com.qf.str;

import java.util.Arrays;

public class Demo05 {
	public static void main(String[] args) {
		/**
		 * 	查
		 *   char charAt(int index) 
			          返回指定索引处的 char 值。 
			 int codePointAt(int index) 
			          返回指定索引处的字符（Unicode 代码点）。 
			 int compareTo(String anotherString) 
			          按字典顺序比较两个字符串。 
			 int compareToIgnoreCase(String str) 
			          按字典顺序比较两个字符串，不考虑大小写。 
			 boolean contains(CharSequence s) 
			          当且仅当此字符串包含指定的 char 值序列时，返回 true。 
			 boolean endsWith(String suffix) 
			          测试此字符串是否以指定的后缀结束。 
			 boolean equals(Object anObject) 
			          将此字符串与指定的对象比较。 
			 boolean equalsIgnoreCase(String anotherString) 
			          将此 String 与另一个 String 比较，不考虑大小写。 
			 byte[] getBytes() 
			          使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。 
			 void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) 
			          将字符从此字符串复制到目标字符数组。 
			 int indexOf(int ch) 
			          返回指定字符在此字符串中第一次出现处的索引。 
			 int indexOf(int ch, int fromIndex) 
			          返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。 
			 String intern() 
			          返回字符串对象的规范化表示形式。 
			 int lastIndexOf(int ch) 
			          返回指定字符在此字符串中最后一次出现处的索引。 
			 int lastIndexOf(int ch, int fromIndex) 
			          返回指定字符在此字符串中最后一次出现处的索引，从指定的索引处开始进行反向搜索。 
			 int length() 
			          返回此字符串的长度。 
			 boolean startsWith(String prefix) 
			          测试此字符串是否以指定的前缀开始。 
			 boolean startsWith(String prefix, int toffset) 
			          测试此字符串从指定索引开始的子字符串是否以指定前缀开始。 
			 CharSequence subSequence(int beginIndex, int endIndex) 
			          返回一个新的字符序列，它是此序列的一个子序列。 
			 String substring(int beginIndex) 
			          返回一个新的字符串，它是此字符串的一个子字符串。 
			 String substring(int beginIndex, int endIndex) 
			          返回一个新字符串，它是此字符串的一个子字符串。 
		 * 
		 * 	其他
			static String valueOf(boolean b) 
			          返回 boolean 参数的字符串表示形式。 
			static String valueOf(char c) 
			          返回 char 参数的字符串表示形式。 
			static String valueOf(char[] data) 
			          返回 char 数组参数的字符串表示形式。 
			static String valueOf(char[] data, int offset, int count) 
			          返回 char 数组参数的特定子数组的字符串表示形式。 
			static String valueOf(double d) 
			          返回 double 参数的字符串表示形式。 
			static String valueOf(float f) 
			          返回 float 参数的字符串表示形式。 
			static String valueOf(int i) 
			          返回 int 参数的字符串表示形式。 
			static String valueOf(long l) 
			          返回 long 参数的字符串表示形式。 
			static String valueOf(Object obj) 
			          返回 Object 参数的字符串表示形式。 
		 */
		
		String s01 = "abcdefghijklmn";
		// 查指定索引位置的字符
		System.out.println(s01.charAt(6));
		// 查字符对应的Unicode编码
		System.out.println(s01.codePointAt(0));
		
		// 比较首字母的Unicode编码差值
		System.out.println("Hello".compareTo("j"));
		
		// 是否包含字符序列
		System.out.println(s01.contains("abc"));
		System.out.println(s01.contains("abd"));
		
		// 判断是否以XXX结尾
		System.out.println("勒布朗詹姆斯".endsWith("詹姆斯"));
		System.out.println("勒布朗詹姆斯".endsWith("勒布朗"));
		
		System.out.println("诸葛孔明".startsWith("诸葛"));
		
		System.out.println("Hello".equals("HELLO"));
		// 忽略大小写比较
		System.out.println("Hello".equalsIgnoreCase("HELLO"));
		
		byte[] bytes = s01.getBytes();
		System.out.println(Arrays.toString(bytes));
		System.out.println(Arrays.toString("床前明月光".getBytes()));
		
		// 从字符串取出字符放入数组
		char[] chars = new char[10];
		s01.getChars(0, 5, chars, 0);
		System.out.println(Arrays.toString(chars));
		
		System.out.println(s01.indexOf(99));
		System.out.println(s01.indexOf("c"));
		System.out.println(s01.indexOf("c",3));
		
		String intern = s01.intern();
		System.out.println(intern);
		
		// 从右侧向左侧查询
		System.out.println(s01.lastIndexOf(99));
		System.out.println(s01.lastIndexOf("c"));
		System.out.println(s01.lastIndexOf("c",0));
		
		System.out.println(s01.length());
		for (int i = 0; i < s01.length(); i++) {
			System.out.println(s01.charAt(i));
		}
		
		System.out.println(s01.substring(3));
		System.out.println(s01.substring(3,10));
		
		String valueOf = String.valueOf(true);
		System.out.println(valueOf);
		System.out.println(valueOf.getClass());
		
	}
}
