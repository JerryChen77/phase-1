package com.qf.comm;

import java.util.Date;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 *  Date() 
			          分配 Date 对象并初始化此对象，以表示分配它的时间（精确到毫秒）。 
			Date(int year, int month, int date) 
			          已过时。 从 JDK 1.1 开始，由 Calendar.set(year + 1900, month, date) 或 GregorianCalendar(year + 1900, month, date) 取代。 
			Date(int year, int month, int date, int hrs, int min) 
			          已过时。 从 JDK 1.1 开始，由 Calendar.set(year + 1900, month, date, hrs, min) 或 GregorianCalendar(year + 1900, month, date, hrs, min) 取代。 
			Date(int year, int month, int date, int hrs, int min, int sec) 
			          已过时。 从 JDK 1.1 开始，由 Calendar.set(year + 1900, month, date, hrs, min, sec) 或 GregorianCalendar(year + 1900, month, date, hrs, min, sec) 取代。 
			Date(long date) 
			          分配 Date 对象并初始化此对象，以表示自从标准基准时间（称为“历元（epoch）”，即 1970 年 1 月 1 日 00:00:00 GMT）以来的指定毫秒数。 
			Date(String s) 
			          已过时。 从 JDK 1.1 开始，由 DateFormat.parse(String s) 取代。 
		 */
		Date date = new Date();
		System.out.println(date);
		
		Date date2 = new Date(121, 5, 11);
		System.out.println(date2);
		
		Date date3 = new Date(System.currentTimeMillis());
		System.out.println(date3);
	}
}
