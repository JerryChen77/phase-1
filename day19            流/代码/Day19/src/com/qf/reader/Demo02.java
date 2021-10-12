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
			          �ڸ������ж�ȡ���ݵ� File ������´���һ���� FileReader�� 
			FileReader(String fileName) 
			          �ڸ������ж�ȡ���ݵ��ļ���������´���һ���� FileReader�� 
			          
			          
			 int read() 
			          ��ȡ�����ַ��� 
			 int read(char[] cbuf) 
			          ���ַ��������顣 
			 int read(char[] cbuf, int off, int len) 
			          ���ַ����������ĳһ���֡� 
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
