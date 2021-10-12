package com.qf.time;

import java.time.LocalDate;

public class Demo02 {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		LocalDate localDate2 = LocalDate.of(2021, 5, 20);
		System.out.println(localDate2);
		
		// 获取年月日
		System.out.println(localDate.getYear());
		System.out.println(localDate.getMonth());
		System.out.println(localDate.getDayOfMonth());
		
		// 修改年月日
		LocalDate localDate3 = localDate.plusYears(-3).plusMonths(-3).plusDays(-3);
		System.out.println(localDate3);
		
	}
}
