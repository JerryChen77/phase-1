package com.qf.sb;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 *  StringBuffer() 
			          构造一个其中不带字符的字符串缓冲区，其初始容量为 16 个字符。 
			StringBuffer(int capacity) 
			          构造一个不带字符，但具有指定初始容量的字符串缓冲区。 
			StringBuffer(String str) 
			          构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容。 
		 */
		
		StringBuffer buffer = new StringBuffer();
		System.out.println(buffer);
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		
		StringBuffer buffer2 = new StringBuffer(32);
		System.out.println(buffer2);
		System.out.println(buffer2.length());
		System.out.println(buffer2.capacity());
		
		StringBuffer buffer3 = new StringBuffer("床前明月光");
		System.out.println(buffer3);
		System.out.println(buffer3.length());
		System.out.println(buffer3.capacity());
		
		
	}
}
