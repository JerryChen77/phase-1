package com.qf.outputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 	�����ļ�������
		 * 
		 * 	��ȡ����
		 * 		�ֽ�������
		 * 		��������
		 * 		������
		 * 
		 * 	д������
		 * 		�ֽ������
		 * 		��������
		 * 		д����
		 */
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// �����������������
			fis = new FileInputStream(new File("D:/img001.jpg"));
			fos = new FileOutputStream(new File("C:\\Users\\Dushine2008\\Desktop\\img001.jpg"));
			
			// ÿ�ζ�ȡ���ݵ���������
			byte[] b = new byte[1024*1024];
			// ÿ�ζ�ȡ���ݵĳ���
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
		System.out.println("�����ļ�����...");
	}
}
