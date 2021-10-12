package com.qf.writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 	复制文本文件到桌面
		 * 	1、创建输出流、输出流
		 * 	2、读写文件
		 * 	3、关闭流
		 */
		
		FileReader reader = null;
		FileWriter writer = null;
		
		try {
			// 创建对象
			reader = new FileReader(new File("D:/threeCountry.txt"));
			writer = new FileWriter(new File("C:\\Users\\Dushine2008\\Desktop\\threeCountry.txt"));
			
			// 读写数据
			char[] c = new char[1024];
			int len = -1;
			
			while ((len=reader.read(c)) != -1) {
				writer.write(c, 0, len);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 关闭流
				if (writer != null) {
					writer.close();
				}
				
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("OVER");
	}
}
