package com.qf.comm;

import java.util.Date;

public class Demo05 {
	public static void main(String[] args) {
		/**
		 * long getTime() 
		 * 	������ 1970 �� 1 �� 1 �� 00:00:00 GMT ������ Date �����ʾ�ĺ������� 
		 * void setTime(long time) 
		 * 	���ô� Date �����Ա�ʾ 1970 �� 1 �� 1 �� 00:00:00 GMT �Ժ� time �����ʱ��㡣 
		 */
		
		Date date = new Date();
		System.out.println(date.getYear());
		System.out.println(date.getTime());
		System.out.println(System.currentTimeMillis());
	}
}
