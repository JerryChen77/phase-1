package com.qf.str;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 *  String() 
			          ��ʼ��һ���´����� String ����ʹ���ʾһ�����ַ����С� 
			          
			String(String original) 
			          ��ʼ��һ���´����� String ����ʹ���ʾһ���������ͬ���ַ����У����仰˵���´������ַ����Ǹò����ַ����ĸ����� 
			          
			String(byte[] bytes) 
			          ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ���� byte ���飬����һ���µ� String�� 
			String(byte[] bytes, int offset, int length) 
			          ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ���� byte �����飬����һ���µ� String�� 
			          
			String(char[] value) 
			          ����һ���µ� String��ʹ���ʾ�ַ���������е�ǰ�������ַ����С� 
			String(char[] value, int offset, int count) 
			          ����һ���µ� String��������ȡ���ַ��������һ����������ַ��� 
			          
			String(int[] codePoints, int offset, int count) 
			          ����һ���µ� String�������� Unicode ������������һ����������ַ��� 
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
		
		System.out.println('��' + 1);
		int[] arr = {24352,24353,24354,24355,24356};
		String s05 = new String(arr, 0, arr.length);
		System.out.println(s05);
	}
}
