package com.qf.file;

import java.io.File;

public class Demo01 {
	public static void main(String[] args) {
		/**
			File(String pathname) 
			          通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。 
			File(String parent, String child) 
			          根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。 
		  	File(File parent, String child) 
			          根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。 
		 */
		// 文件路径字符串形式
		String path = "D:\\files\\JavaFiles";
		
		// 抽象成对象,可以调用方法、属性
		
		File file = new File("D:\\files\\JavaFiles");
		System.out.println(file);
		System.out.println(file.getClass());
		
		File file2 = new File("D:\\files\\JavaFiles", "Java2103");
		System.out.println(file2);
		
		File file3 = new File(file, "Java2103");
		System.out.println(file3);
		
	}
}
