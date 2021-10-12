package com.qf.str;

import java.util.Arrays;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 * 	��
			 String concat(String str) 
			          ��ָ���ַ������ӵ����ַ����Ľ�β�� 
		 * 
		 * 	ɾ
			 String trim() 
			          �����ַ����ĸ���������ǰ���հ׺�β���հס� 
		 * 
		 * 	��
			 String replace(char oldChar, char newChar) 
			          ����һ���µ��ַ���������ͨ���� newChar �滻���ַ����г��ֵ����� oldChar �õ��ġ� 
			 String replace(CharSequence target, CharSequence replacement) 
			          ʹ��ָ��������ֵ�滻�����滻���ַ�������ƥ������ֵĿ�����е����ַ����� 
			 String replaceAll(String regex, String replacement) 
			          ʹ�ø����� replacement �滻���ַ�������ƥ�������������ʽ�����ַ����� 
			 String replaceFirst(String regex, String replacement) 
			          ʹ�ø����� replacement �滻���ַ���ƥ�������������ʽ�ĵ�һ�����ַ����� 
			 String[] split(String regex) 
			          ���ݸ���������ʽ��ƥ���ִ��ַ����� 
			 String[] split(String regex, int limit) 
			          ����ƥ�������������ʽ����ִ��ַ����� 
			 char[] toCharArray() 
			          �����ַ���ת��Ϊһ���µ��ַ����顣 
			 String toLowerCase() 
			          ʹ��Ĭ�����Ի����Ĺ��򽫴� String �е������ַ���ת��ΪСд�� 
			 String toUpperCase() 
			          ʹ��Ĭ�����Ի����Ĺ��򽫴� String �е������ַ���ת��Ϊ��д�� 
		 */
		
		String str = "ABCDEFG";
		// ƴ���ַ���,�õ�ƴ��֮��Ľ��
		String concat = str.concat("hijklmn");
		System.out.println(concat);
		
		String str0 = "  He   llo   ";
		// ȥ���ַ������˵Ŀո�
		String trim = str0.trim();
		System.out.println(str0);
		System.out.println(trim);
		
		String str01 = "�й����Ӵ��˴�ʤ��";
		// ʹ�ú�����滻ǰ���
		String replaceAll = str01.replaceAll("����", "**");
		System.out.println(replaceAll);
		
		String str02 = "HelloWorldHello";
		String[] split = str02.split("l",2);
		System.out.println(Arrays.toString(split));
		
		char[] charArray = str02.toCharArray();
		System.out.println(Arrays.toString(charArray));
		
		// ȫ����ĸСд
		String lowerCase = str02.toLowerCase();
		System.out.println(lowerCase);
		
		String upperCase = str02.toUpperCase();
		System.out.println(upperCase);
		
	}
}
