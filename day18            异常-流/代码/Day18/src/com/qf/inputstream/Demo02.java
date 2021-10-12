package com.qf.inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 *   int read() 
			          从此输入流中读取一个数据字节。 
			 int read(byte[] b) 
			          从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。 
			 int read(byte[] b, int off, int len) 
			          从此输入流中将最多 len 个字节的数据读入一个 byte 数组中。 
		 */
		
		FileInputStream fis = null;
		
		try {
			// 实例化对象
			fis = new FileInputStream(new File("bbb.txt"));
			// 读取字节数据,向后移动游标
			int i01 = fis.read();
			System.out.println(i01);
			
			i01 = fis.read();
			System.out.println(i01);
			
			i01 = fis.read();
			System.out.println(i01);
			
			i01 = fis.read();
			System.out.println(i01);
			
			i01 = fis.read();
			System.out.println(i01);
			
			i01 = fis.read();
			System.out.println(i01);
			
			i01 = fis.read();
			System.out.println(i01);
			
			i01 = fis.read();
			System.out.println(i01);
			
			i01 = fis.read();
			System.out.println(i01);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("OVER");
	}
}
