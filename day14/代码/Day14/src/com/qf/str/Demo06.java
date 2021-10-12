package com.qf.str;

public class Demo06 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		
		String str3 = new String("abc");
		
		System.out.println(str1 == str2);//true
		System.out.println(str1 == str3);//false
		System.out.println(str1.equals(str3));//true
		
		String str5 = "a" + "bc";
		System.out.println(str1 == str5);//true
		
		String str6 = "ab";
		String str7 = "c";
		
		String str8 = str6 + str7;	// abc
		System.out.println(str1 == str8);	// false
		System.out.println(str1.equals(str8));	// true
		
	}
}
