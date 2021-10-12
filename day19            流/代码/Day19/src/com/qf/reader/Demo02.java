package com.qf.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 	FileReader(File file) 
			          在给定从中读取数据的 File 的情况下创建一个新 FileReader。 
			FileReader(String fileName) 
			          在给定从中读取数据的文件名的情况下创建一个新 FileReader。 
			          
			          
			 int read() 
			          读取单个字符。 
			 int read(char[] cbuf) 
			          将字符读入数组。 
			 int read(char[] cbuf, int off, int len) 
			          将字符读入数组的某一部分。 
		 */
		
		FileReader reader = null;
		try {
			reader = new FileReader(new File("hehe.txt"));
			
			int i = reader.read();
			System.out.println(i);
			
			i = reader.read();
			System.out.println(i);
			
			i = reader.read();
			System.out.println(i);
			
			i = reader.read();
			System.out.println(i);
			
			i = reader.read();
			System.out.println(i);
			
			char[] c = new char[2];
			reader.read(c);
			System.out.println(Arrays.toString(c));
			
			reader.read(c);
			System.out.println(Arrays.toString(c));
			
			reader.read(c);
			System.out.println(Arrays.toString(c));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("OVER");
	}
}
