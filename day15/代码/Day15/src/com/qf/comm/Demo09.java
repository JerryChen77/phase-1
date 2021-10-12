package com.qf.comm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo09 {
	public static void main(String[] args) throws ParseException {
		/**
		 * SimpleDateFormat(String pattern) 
          		用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat。
		 */
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		Date date = new Date();
		// 格式化日期对象,得到字符串
		String format = sdf.format(date);
		System.out.println(format);
		System.out.println(date);
		
		/**
		 * 	2021年05月11日 15:09:25
			Tue May 11 15:09:25 CST 2021
		 */
		
		// 把字符串解析成日期对象
		Date date2 = sdf.parse("2021年05月11日 15:09:25");
		System.out.println(date2);
		
	}
}
