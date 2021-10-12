package com.qf.comm;

import java.util.Date;

public class Demo05 {
	public static void main(String[] args) {
		/**
		 * long getTime() 
		 * 	返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。 
		 * void setTime(long time) 
		 * 	设置此 Date 对象，以表示 1970 年 1 月 1 日 00:00:00 GMT 以后 time 毫秒的时间点。 
		 */
		
		Date date = new Date();
		System.out.println(date.getYear());
		System.out.println(date.getTime());
		System.out.println(System.currentTimeMillis());
	}
}
