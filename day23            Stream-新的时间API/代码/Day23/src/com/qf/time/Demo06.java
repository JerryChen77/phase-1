package com.qf.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo06 {
	public static void main(String[] args) {
		// ������ʽ������
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		// �ַ���===��LocalDate����
		LocalDate date = LocalDate.parse("1990-12-30", formatter);
		System.out.println(date);
		
		// LocalDate����===���ַ���
		String time = formatter.format(LocalDate.now());
		System.out.println(time);
		
	}
}
