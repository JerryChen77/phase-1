package com.qf.str;

import java.util.Arrays;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 * 	增
			 String concat(String str) 
			          将指定字符串连接到此字符串的结尾。 
		 * 
		 * 	删
			 String trim() 
			          返回字符串的副本，忽略前导空白和尾部空白。 
		 * 
		 * 	改
			 String replace(char oldChar, char newChar) 
			          返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。 
			 String replace(CharSequence target, CharSequence replacement) 
			          使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。 
			 String replaceAll(String regex, String replacement) 
			          使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。 
			 String replaceFirst(String regex, String replacement) 
			          使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。 
			 String[] split(String regex) 
			          根据给定正则表达式的匹配拆分此字符串。 
			 String[] split(String regex, int limit) 
			          根据匹配给定的正则表达式来拆分此字符串。 
			 char[] toCharArray() 
			          将此字符串转换为一个新的字符数组。 
			 String toLowerCase() 
			          使用默认语言环境的规则将此 String 中的所有字符都转换为小写。 
			 String toUpperCase() 
			          使用默认语言环境的规则将此 String 中的所有字符都转换为大写。 
		 */
		
		String str = "ABCDEFG";
		// 拼接字符串,得到拼接之后的结果
		String concat = str.concat("hijklmn");
		System.out.println(concat);
		
		String str0 = "  He   llo   ";
		// 去除字符串两端的空格
		String trim = str0.trim();
		System.out.println(str0);
		System.out.println(trim);
		
		String str01 = "中国军队打了打胜仗";
		// 使用后面的替换前面的
		String replaceAll = str01.replaceAll("国军", "**");
		System.out.println(replaceAll);
		
		String str02 = "HelloWorldHello";
		String[] split = str02.split("l",2);
		System.out.println(Arrays.toString(split));
		
		char[] charArray = str02.toCharArray();
		System.out.println(Arrays.toString(charArray));
		
		// 全部字母小写
		String lowerCase = str02.toLowerCase();
		System.out.println(lowerCase);
		
		String upperCase = str02.toUpperCase();
		System.out.println(upperCase);
		
	}
}
