package com.qf.sb;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	查
			 int capacity() 
			          返回当前容量。 
			 char charAt(int index) 
			          返回此序列中指定索引处的 char 值。 
			 int codePointAt(int index) 
			          返回指定索引处的字符（统一代码点）。 
			 int indexOf(String str) 
			          返回第一次出现的指定子字符串在该字符串中的索引。 
			 int indexOf(String str, int fromIndex) 
			          从指定的索引处开始，返回第一次出现的指定子字符串在该字符串中的索引。 
			 int lastIndexOf(String str) 
			          返回最右边出现的指定子字符串在此字符串中的索引。 
			 int lastIndexOf(String str, int fromIndex) 
			          返回最后一次出现的指定子字符串在此字符串中的索引。 
			 int length() 
			          返回长度（字符数）。 
			 String substring(int start) 
			          返回一个新的 String，它包含此字符序列当前所包含的字符子序列。 
			 String substring(int start, int end) 
			          返回一个新的 String，它包含此序列当前所包含的字符子序列。 
			 
		 * 	其他
			 void ensureCapacity(int minimumCapacity) 
			          确保容量至少等于指定的最小值。 
			 String toString() 
			          返回此序列中数据的字符串表示形式。 
		 */
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("abcdefgabcdefg");
		
		System.out.println(buffer.capacity());
		System.out.println(buffer.charAt(3));
		System.out.println(buffer.codePointAt(3));
		System.out.println(buffer.indexOf("d"));
		System.out.println(buffer.indexOf("dd"));
		System.out.println(buffer.lastIndexOf("d"));
		System.out.println(buffer.length());
		System.out.println(buffer.substring(5));
		System.out.println(buffer.substring(5,10));
		
		System.out.println(buffer.capacity());
		
		buffer.ensureCapacity(15);
		System.out.println(buffer);
		System.out.println(buffer.capacity());
		
		buffer.ensureCapacity(34);
		System.out.println(buffer);
		System.out.println(buffer.capacity());
		/**
		 * 10000
		 * 
		 * 16
		 * 34
		 * 70
		 * 142
		 * 286
		 */
		
	}
}
