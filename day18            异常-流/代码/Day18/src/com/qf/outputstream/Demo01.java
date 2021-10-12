package com.qf.outputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	FileOutputStream(File file) 
			          ����һ����ָ�� File �����ʾ���ļ���д�����ݵ��ļ�������� 
			FileOutputStream(File file, boolean append) 
			          ����һ����ָ�� File �����ʾ���ļ���д�����ݵ��ļ�������� 
			
			FileOutputStream(String name) 
			          ����һ�������ָ�����Ƶ��ļ���д�����ݵ�����ļ����� 
			FileOutputStream(String name, boolean append) 
			          ����һ�������ָ�� name ���ļ���д�����ݵ�����ļ����� 
		 */
		
		
		/**
			 void write(int b) 
			          ��ָ���ֽ�д����ļ�������� 
		  	 void write(byte[] b) 
			          �� b.length ���ֽڴ�ָ�� byte ����д����ļ�������С� 
			 void write(byte[] b, int off, int len) 
			          ��ָ�� byte �����д�ƫ���� off ��ʼ�� len ���ֽ�д����ļ�������� 
		 */
		
		FileOutputStream fos = null;
		try {
			// �������������,����������true,��ʾ��֮ǰ���ļ���׷������
			fos = new FileOutputStream(new File("ccc.txt"),true);
			
			// д������
			fos.write(65);
			fos.write(66);
			fos.write(67);
			fos.write(68);
			fos.write(69);
			
			fos.write(new byte[] {97,98,99,100,101});
			
			fos.write("��ǰ���¹�".getBytes());
			
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
