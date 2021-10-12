package com.qf.outputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 	复制文件到桌面
		 * 
		 * 	读取数据
		 * 		字节输入流
		 * 		创建对象
		 * 		读数据
		 * 
		 * 	写出数据
		 * 		字节输出流
		 * 		创建对象
		 * 		写数据
		 */
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// 创建输入流和输出流
			fis = new FileInputStream(new File("D:/img001.jpg"));
			fos = new FileOutputStream(new File("C:\\Users\\Dushine2008\\Desktop\\img001.jpg"));
			
			// 每次读取数据的内容容器
			byte[] b = new byte[1024*1024];
			// 每次读取数据的长度
			int len = -1;
			
			while ((len=fis.read(b)) != -1) {
				fos.write(b, 0, len);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("复制文件结束...");
	}
}
