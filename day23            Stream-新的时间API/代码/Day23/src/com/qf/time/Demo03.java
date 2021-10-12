package com.qf.time;

import java.time.LocalTime;

public class Demo03 {
	public static void main(String[] args) {
		// 创建LocalTime对象
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		// 获取时分秒
		System.out.println(localTime.getHour());
		System.out.println(localTime.getMinute());
		System.out.println(localTime.getSecond());
		
		// 设置时分秒
		LocalTime localTime2 = localTime.plusHours(-2).plusMinutes(-20).plusSeconds(-20);
		System.out.println(localTime2);
		
	}
}
