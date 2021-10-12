package com.qf.time;

import java.time.LocalDateTime;

public class Demo04 {
	public static void main(String[] args) {
		// 创建对象
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		// 获取年月日时分秒
		System.out.println(localDateTime.getYear());
		System.out.println(localDateTime.getMonth());
		System.out.println(localDateTime.getDayOfMonth());
		System.out.println(localDateTime.getHour());
		System.out.println(localDateTime.getMinute());
		System.out.println(localDateTime.getSecond());
		
		// 设置年月日时分秒
		LocalDateTime plusDays = localDateTime.plusYears(-2).plusMonths(-2).plusDays(-2);
		System.out.println(plusDays);
	}
}
