package com.qf.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Demo03 {
	public static void main(String[] args) {
		// show();
	}
	
	public static void show() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.parse("1990-12-30");
	}
}
