package com.qf.sys;

import java.util.Map;
import java.util.Properties;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 *  static long currentTimeMillis() 
			          返回以毫秒为单位的当前时间。 
			static Map<String,String> getenv() 
			          返回一个不能修改的当前系统环境的字符串映射视图。 
			static String getenv(String name) 
			          获取指定的环境变量值。 
			static Properties getProperties() 
			          确定当前的系统属性。 
			static String getProperty(String key) 
			          获取指定键指示的系统属性。 
			static void exit(int status) 
			          终止当前正在运行的 Java 虚拟机。 
			static void gc() 
			          运行垃圾回收器。 
		 */
		// 从1970年1月1日到当前的毫秒值
		System.out.println(System.currentTimeMillis());
		// 获取系统环境信息
		Map<String, String> map = System.getenv();
		System.out.println(map);
		
		// 获取java相关属性
		Properties properties = System.getProperties();
		System.out.println(properties);
		
		String property = System.getProperty("os.name");
		System.out.println(property);
	}
}
