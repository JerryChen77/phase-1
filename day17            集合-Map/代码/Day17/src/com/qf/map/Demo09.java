package com.qf.map;

import java.util.Properties;

public class Demo09 {
	public static void main(String[] args) {
		Properties properties = System.getProperties();
		System.out.println(properties);
		
		/**
		 * 	Properties() 
			          创建一个无默认值的空属性列表。 
			Properties(Properties defaults) 
			          创建一个带有指定默认值的空属性列表。 
		 */
		
		Properties p = new Properties();
		System.out.println(p);
		
		p.setProperty("username", "zhangsan");
		p.setProperty("password", "sanzhang");
		
		System.out.println(p);
		
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
		System.out.println(p.getProperty("password00","123456"));
		p.setProperty("username", "zhangsansan");
		System.out.println(p);
		
	}
}
