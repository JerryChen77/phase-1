package com.qf.comm;

import java.util.Calendar;

public class Demo07 {
	public static void main(String[] args) {
		/**
		 *   Date getTime() 
			          ����һ����ʾ�� Calendar ʱ��ֵ������Ԫ�����ڵĺ���ƫ�������� Date ���� 
			 long getTimeInMillis() 
			          ���ش� Calendar ��ʱ��ֵ���Ժ���Ϊ��λ�� 
			 int get(int field) 
          		���ظ��������ֶε�ֵ�� 
          	 void set(int field, int value) 
			          �������������ֶ�����Ϊ����ֵ�� 
			 void set(int year, int month, int date) 
			          ���������ֶ� YEAR��MONTH �� DAY_OF_MONTH ��ֵ�� 
			 void set(int year, int month, int date, int hourOfDay, int minute) 
			          ���������ֶ� YEAR��MONTH��DAY_OF_MONTH��HOUR_OF_DAY �� MINUTE ��ֵ�� 
			 void set(int year, int month, int date, int hourOfDay, int minute, int second) 
			          �����ֶ� YEAR��MONTH��DAY_OF_MONTH��HOUR��MINUTE �� SECOND ��ֵ�� 
		 */
		
		Calendar calendar =	Calendar.getInstance();
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(Calendar.MINUTE));
		System.out.println(calendar.get(Calendar.SECOND));
		
		System.out.println(System.currentTimeMillis());
		
		calendar.set(Calendar.YEAR, 1990);
		calendar.set(Calendar.MONTH, 11);
		calendar.set(Calendar.DAY_OF_MONTH, 30);
		
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		
		// �����Լ����˶�����
		System.out.println(System.currentTimeMillis() - calendar.getTimeInMillis());
	}
}
