package com.qf.writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 	�����ı��ļ�������
		 * 	1������������������
		 * 	2����д�ļ�
		 * 	3���ر���
		 */
		
		FileReader reader = null;
		FileWriter writer = null;
		
		try {
			// ��������
			reader = new FileReader(new File("D:/threeCountry.txt"));
			writer = new FileWriter(new File("C:\\Users\\Dushine2008\\Desktop\\threeCountry.txt"));
			
			// ��д����
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
				// �ر���
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
