package com.qf.file;

import java.io.File;
import java.util.Scanner;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 * 	键盘录入一个文件夹,获取此文件夹中所有的文件和文件夹
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个文件夹:");
		
		String pathName = sc.next();
		File file = new File(pathName);
		
		if (file.exists() && file.isDirectory()) {
			getAllFiles(file);
		} else {
			System.out.println("输入的路径有误...");
			return;
		}
		
	}
	
	public static void getAllFiles(File file) {
		// 获取file中所有的文件夹和文件
		File[] files = file.listFiles();
		
		// 变量files,如果是文件直接输出,如果是文件夹,调用方法继续向内层获取
		for (File f : files) {
			if (f.isFile()) {
				System.out.println("\t文件：" + f);
			} else {
				System.out.println("文件夹：" + f);
				getAllFiles(f);
			}
		}
	}
}
