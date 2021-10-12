package com.qf.inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 *   int read() 
			          �Ӵ��������ж�ȡһ�������ֽڡ� 
			 int read(byte[] b) 
			          �Ӵ��������н���� b.length ���ֽڵ����ݶ���һ�� byte �����С� 
			 int read(byte[] b, int off, int len) 
			          �Ӵ��������н���� len ���ֽڵ����ݶ���һ�� byte �����С� 
		 */
		
		FileInputStream fis = null;
		
		try {
			// ʵ��������
			fis = new FileInputStream(new File("bbb.txt"));
			// ��ȡ�ֽ�����,����ƶ��α�
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
