package com.qf.map;

import java.util.Properties;

public class Demo09 {
	public static void main(String[] args) {
		Properties properties = System.getProperties();
		System.out.println(properties);
		
		/**
		 * 	Properties() 
			          ����һ����Ĭ��ֵ�Ŀ������б� 
			Properties(Properties defaults) 
			          ����һ������ָ��Ĭ��ֵ�Ŀ������б� 
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
