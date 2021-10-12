package com.qf.comm;

import java.util.Date;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 *  Date() 
			          ���� Date ���󲢳�ʼ���˶����Ա�ʾ��������ʱ�䣨��ȷ�����룩�� 
			Date(int year, int month, int date) 
			          �ѹ�ʱ�� �� JDK 1.1 ��ʼ���� Calendar.set(year + 1900, month, date) �� GregorianCalendar(year + 1900, month, date) ȡ���� 
			Date(int year, int month, int date, int hrs, int min) 
			          �ѹ�ʱ�� �� JDK 1.1 ��ʼ���� Calendar.set(year + 1900, month, date, hrs, min) �� GregorianCalendar(year + 1900, month, date, hrs, min) ȡ���� 
			Date(int year, int month, int date, int hrs, int min, int sec) 
			          �ѹ�ʱ�� �� JDK 1.1 ��ʼ���� Calendar.set(year + 1900, month, date, hrs, min, sec) �� GregorianCalendar(year + 1900, month, date, hrs, min, sec) ȡ���� 
			Date(long date) 
			          ���� Date ���󲢳�ʼ���˶����Ա�ʾ�Դӱ�׼��׼ʱ�䣨��Ϊ����Ԫ��epoch�������� 1970 �� 1 �� 1 �� 00:00:00 GMT��������ָ���������� 
			Date(String s) 
			          �ѹ�ʱ�� �� JDK 1.1 ��ʼ���� DateFormat.parse(String s) ȡ���� 
		 */
		Date date = new Date();
		System.out.println(date);
		
		Date date2 = new Date(121, 5, 11);
		System.out.println(date2);
		
		Date date3 = new Date(System.currentTimeMillis());
		System.out.println(date3);
	}
}
