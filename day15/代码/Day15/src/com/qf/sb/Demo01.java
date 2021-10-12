package com.qf.sb;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	��
			 int capacity() 
			          ���ص�ǰ������ 
			 char charAt(int index) 
			          ���ش�������ָ���������� char ֵ�� 
			 int codePointAt(int index) 
			          ����ָ�����������ַ���ͳһ����㣩�� 
			 int indexOf(String str) 
			          ���ص�һ�γ��ֵ�ָ�����ַ����ڸ��ַ����е������� 
			 int indexOf(String str, int fromIndex) 
			          ��ָ������������ʼ�����ص�һ�γ��ֵ�ָ�����ַ����ڸ��ַ����е������� 
			 int lastIndexOf(String str) 
			          �������ұ߳��ֵ�ָ�����ַ����ڴ��ַ����е������� 
			 int lastIndexOf(String str, int fromIndex) 
			          �������һ�γ��ֵ�ָ�����ַ����ڴ��ַ����е������� 
			 int length() 
			          ���س��ȣ��ַ������� 
			 String substring(int start) 
			          ����һ���µ� String�����������ַ����е�ǰ���������ַ������С� 
			 String substring(int start, int end) 
			          ����һ���µ� String�������������е�ǰ���������ַ������С� 
			 
		 * 	����
			 void ensureCapacity(int minimumCapacity) 
			          ȷ���������ٵ���ָ������Сֵ�� 
			 String toString() 
			          ���ش����������ݵ��ַ�����ʾ��ʽ�� 
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
