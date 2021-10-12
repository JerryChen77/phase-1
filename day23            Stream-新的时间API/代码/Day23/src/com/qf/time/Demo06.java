package com.qf.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo06 {
	public static void main(String[] args) {
		// 创建格式化工具
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		// 字符串===》LocalDate对象
		LocalDate date = LocalDate.parse("1990-12-30", formatter);
		System.out.println(date);
		
		// LocalDate对象===》字符串
		String time = formatter.format(LocalDate.now());
		System.out.println(time);
		
	}
}
