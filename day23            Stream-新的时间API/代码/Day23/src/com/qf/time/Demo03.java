package com.qf.time;

import java.time.LocalTime;

public class Demo03 {
	public static void main(String[] args) {
		// ����LocalTime����
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		// ��ȡʱ����
		System.out.println(localTime.getHour());
		System.out.println(localTime.getMinute());
		System.out.println(localTime.getSecond());
		
		// ����ʱ����
		LocalTime localTime2 = localTime.plusHours(-2).plusMinutes(-20).plusSeconds(-20);
		System.out.println(localTime2);
		
	}
}
