package com.qf.inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo01 {
	public static void main(String[] args) throws IOException {
		/**
		 * 	FileInputStream(File file) 
			          通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定。 
			FileInputStream(String name) 
			          通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定。 
		 */
		
		FileInputStream fis = new FileInputStream(new File("bbb.txt"));
		System.out.println(fis);
		
		fis = new FileInputStream("bbb.txt");
		System.out.println(fis);
		
	}
}
