package com.qf.str;

import java.util.Arrays;

public class Demo05 {
	public static void main(String[] args) {
		/**
		 * 	��
		 *   char charAt(int index) 
			          ����ָ���������� char ֵ�� 
			 int codePointAt(int index) 
			          ����ָ�����������ַ���Unicode ����㣩�� 
			 int compareTo(String anotherString) 
			          ���ֵ�˳��Ƚ������ַ����� 
			 int compareToIgnoreCase(String str) 
			          ���ֵ�˳��Ƚ������ַ����������Ǵ�Сд�� 
			 boolean contains(CharSequence s) 
			          ���ҽ������ַ�������ָ���� char ֵ����ʱ������ true�� 
			 boolean endsWith(String suffix) 
			          ���Դ��ַ����Ƿ���ָ���ĺ�׺������ 
			 boolean equals(Object anObject) 
			          �����ַ�����ָ���Ķ���Ƚϡ� 
			 boolean equalsIgnoreCase(String anotherString) 
			          ���� String ����һ�� String �Ƚϣ������Ǵ�Сд�� 
			 byte[] getBytes() 
			          ʹ��ƽ̨��Ĭ���ַ������� String ����Ϊ byte ���У���������洢��һ���µ� byte �����С� 
			 void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) 
			          ���ַ��Ӵ��ַ������Ƶ�Ŀ���ַ����顣 
			 int indexOf(int ch) 
			          ����ָ���ַ��ڴ��ַ����е�һ�γ��ִ��������� 
			 int indexOf(int ch, int fromIndex) 
			          �����ڴ��ַ����е�һ�γ���ָ���ַ�������������ָ����������ʼ������ 
			 String intern() 
			          �����ַ�������Ĺ淶����ʾ��ʽ�� 
			 int lastIndexOf(int ch) 
			          ����ָ���ַ��ڴ��ַ��������һ�γ��ִ��������� 
			 int lastIndexOf(int ch, int fromIndex) 
			          ����ָ���ַ��ڴ��ַ��������һ�γ��ִ�����������ָ������������ʼ���з��������� 
			 int length() 
			          ���ش��ַ����ĳ��ȡ� 
			 boolean startsWith(String prefix) 
			          ���Դ��ַ����Ƿ���ָ����ǰ׺��ʼ�� 
			 boolean startsWith(String prefix, int toffset) 
			          ���Դ��ַ�����ָ��������ʼ�����ַ����Ƿ���ָ��ǰ׺��ʼ�� 
			 CharSequence subSequence(int beginIndex, int endIndex) 
			          ����һ���µ��ַ����У����Ǵ����е�һ�������С� 
			 String substring(int beginIndex) 
			          ����һ���µ��ַ��������Ǵ��ַ�����һ�����ַ����� 
			 String substring(int beginIndex, int endIndex) 
			          ����һ�����ַ��������Ǵ��ַ�����һ�����ַ����� 
		 * 
		 * 	����
			static String valueOf(boolean b) 
			          ���� boolean �������ַ�����ʾ��ʽ�� 
			static String valueOf(char c) 
			          ���� char �������ַ�����ʾ��ʽ�� 
			static String valueOf(char[] data) 
			          ���� char ����������ַ�����ʾ��ʽ�� 
			static String valueOf(char[] data, int offset, int count) 
			          ���� char ����������ض���������ַ�����ʾ��ʽ�� 
			static String valueOf(double d) 
			          ���� double �������ַ�����ʾ��ʽ�� 
			static String valueOf(float f) 
			          ���� float �������ַ�����ʾ��ʽ�� 
			static String valueOf(int i) 
			          ���� int �������ַ�����ʾ��ʽ�� 
			static String valueOf(long l) 
			          ���� long �������ַ�����ʾ��ʽ�� 
			static String valueOf(Object obj) 
			          ���� Object �������ַ�����ʾ��ʽ�� 
		 */
		
		String s01 = "abcdefghijklmn";
		// ��ָ������λ�õ��ַ�
		System.out.println(s01.charAt(6));
		// ���ַ���Ӧ��Unicode����
		System.out.println(s01.codePointAt(0));
		
		// �Ƚ�����ĸ��Unicode�����ֵ
		System.out.println("Hello".compareTo("j"));
		
		// �Ƿ�����ַ�����
		System.out.println(s01.contains("abc"));
		System.out.println(s01.contains("abd"));
		
		// �ж��Ƿ���XXX��β
		System.out.println("�ղ���ղķ˹".endsWith("ղķ˹"));
		System.out.println("�ղ���ղķ˹".endsWith("�ղ���"));
		
		System.out.println("������".startsWith("���"));
		
		System.out.println("Hello".equals("HELLO"));
		// ���Դ�Сд�Ƚ�
		System.out.println("Hello".equalsIgnoreCase("HELLO"));
		
		byte[] bytes = s01.getBytes();
		System.out.println(Arrays.toString(bytes));
		System.out.println(Arrays.toString("��ǰ���¹�".getBytes()));
		
		// ���ַ���ȡ���ַ���������
		char[] chars = new char[10];
		s01.getChars(0, 5, chars, 0);
		System.out.println(Arrays.toString(chars));
		
		System.out.println(s01.indexOf(99));
		System.out.println(s01.indexOf("c"));
		System.out.println(s01.indexOf("c",3));
		
		String intern = s01.intern();
		System.out.println(intern);
		
		// ���Ҳ�������ѯ
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
