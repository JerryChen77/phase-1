package com.qf.outputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	FileOutputStream(File file) 
			          创建一个向指定 File 对象表示的文件中写入数据的文件输出流。 
			FileOutputStream(File file, boolean append) 
			          创建一个向指定 File 对象表示的文件中写入数据的文件输出流。 
			
			FileOutputStream(String name) 
			          创建一个向具有指定名称的文件中写入数据的输出文件流。 
			FileOutputStream(String name, boolean append) 
			          创建一个向具有指定 name 的文件中写入数据的输出文件流。 
		 */
		
		
		/**
			 void write(int b) 
			          将指定字节写入此文件输出流。 
		  	 void write(byte[] b) 
			          将 b.length 个字节从指定 byte 数组写入此文件输出流中。 
			 void write(byte[] b, int off, int len) 
			          将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流。 
		 */
		
		FileOutputStream fos = null;
		try {
			// 创建输出流对象,如果后面加上true,表示向之前的文件中追加数据
			fos = new FileOutputStream(new File("ccc.txt"),true);
			
			// 写入数据
			fos.write(65);
			fos.write(66);
			fos.write(67);
			fos.write(68);
			fos.write(69);
			
			fos.write(new byte[] {97,98,99,100,101});
			
			fos.write("床前明月光".getBytes());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("OVER");
	}
}
