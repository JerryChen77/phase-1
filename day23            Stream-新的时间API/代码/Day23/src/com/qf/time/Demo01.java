package com.qf.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * Date
		 * Calendar
		 * SimpleDateFormat
		 */
		
		Date date = new Date();
		System.out.println(date);
		Calendar calendar = Calendar.getInstance();
		int i = calendar.get(Calendar.YEAR);
		System.out.println(i);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
	}
}
