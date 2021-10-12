package com.qf.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	FileWriter(File file) 
			          ���ݸ����� File ������һ�� FileWriter ���� 
			FileWriter(File file, boolean append) 
			          ���ݸ����� File ������һ�� FileWriter ����  
			          
			FileWriter(String fileName) 
			          ���ݸ������ļ�������һ�� FileWriter ���� 
			FileWriter(String fileName, boolean append) 
			          ���ݸ������ļ����Լ�ָʾ�Ƿ񸽼�д�����ݵ� boolean ֵ������ FileWriter ���� 
			          
			          
			 void write(int c) 
			          д�뵥���ַ��� 
			 void write(String str) 
			          д���ַ����� 
			 void write(String str, int off, int len) 
			          д���ַ�����ĳһ���֡� 
			 void write(char[] cbuf) 
			          д���ַ����顣 
			 void write(char[] cbuf, int off, int len) 
			          д���ַ������ĳһ���֡� 
		 */
		
		FileWriter writer = null;
		
		try {
			writer = new FileWriter(new File("hihi.txt"));
			
			// д������
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
			
			writer.write("����");
			writer.write("\r\nң���ٲ���ǰ��\r\n");
			
			char[] c = {'��','��','ֱ','��','��','ǧ','��'};
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
