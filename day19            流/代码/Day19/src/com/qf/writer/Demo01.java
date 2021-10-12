package com.qf.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	FileWriter(File file) 
			          根据给定的 File 对象构造一个 FileWriter 对象。 
			FileWriter(File file, boolean append) 
			          根据给定的 File 对象构造一个 FileWriter 对象。  
			          
			FileWriter(String fileName) 
			          根据给定的文件名构造一个 FileWriter 对象。 
			FileWriter(String fileName, boolean append) 
			          根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象。 
			          
			          
			 void write(int c) 
			          写入单个字符。 
			 void write(String str) 
			          写入字符串。 
			 void write(String str, int off, int len) 
			          写入字符串的某一部分。 
			 void write(char[] cbuf) 
			          写入字符数组。 
			 void write(char[] cbuf, int off, int len) 
			          写入字符数组的某一部分。 
		 */
		
		FileWriter writer = null;
		
		try {
			writer = new FileWriter(new File("hihi.txt"));
			
			// 写入数据
			/**
			 	26085
				29031
				39321
				28809
				29983
			 */
			writer.write(26085);
			writer.write(29031);
			writer.write(39321);
			writer.write(28809);
			writer.write(29983);
			
			writer.write("紫烟");
			writer.write("\r\n遥看瀑布挂前川\r\n");
			
			char[] c = {'飞','流','直','下','三','千','尺'};
			writer.write(c);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("OVER");
	}
}
