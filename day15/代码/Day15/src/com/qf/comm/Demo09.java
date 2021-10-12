package com.qf.comm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo09 {
	public static void main(String[] args) throws ParseException {
		/**
		 * SimpleDateFormat(String pattern) 
          		�ø�����ģʽ��Ĭ�����Ի��������ڸ�ʽ���Ź��� SimpleDateFormat��
		 */
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		Date date = new Date();
		// ��ʽ�����ڶ���,�õ��ַ���
		String format = sdf.format(date);
		System.out.println(format);
		System.out.println(date);
		
		/**
		 * 	2021��05��11�� 15:09:25
			Tue May 11 15:09:25 CST 2021
		 */
		
		// ���ַ������������ڶ���
		Date date2 = sdf.parse("2021��05��11�� 15:09:25");
		System.out.println(date2);
		
	}
}
