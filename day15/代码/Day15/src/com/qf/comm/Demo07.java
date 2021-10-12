package com.qf.comm;

import java.util.Calendar;

public class Demo07 {
	public static void main(String[] args) {
		/**
		 *   Date getTime() 
			          返回一个表示此 Calendar 时间值（从历元至现在的毫秒偏移量）的 Date 对象。 
			 long getTimeInMillis() 
			          返回此 Calendar 的时间值，以毫秒为单位。 
			 int get(int field) 
          		返回给定日历字段的值。 
          	 void set(int field, int value) 
			          将给定的日历字段设置为给定值。 
			 void set(int year, int month, int date) 
			          设置日历字段 YEAR、MONTH 和 DAY_OF_MONTH 的值。 
			 void set(int year, int month, int date, int hourOfDay, int minute) 
			          设置日历字段 YEAR、MONTH、DAY_OF_MONTH、HOUR_OF_DAY 和 MINUTE 的值。 
			 void set(int year, int month, int date, int hourOfDay, int minute, int second) 
			          设置字段 YEAR、MONTH、DAY_OF_MONTH、HOUR、MINUTE 和 SECOND 的值。 
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
		
		// 计算自己活了多少天
		System.out.println(System.currentTimeMillis() - calendar.getTimeInMillis());
	}
}
