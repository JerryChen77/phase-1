package com.qf.inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo01 {
	public static void main(String[] args) throws IOException {
		/**
		 * 	FileInputStream(File file) 
			          ͨ����һ����ʵ���ļ�������������һ�� FileInputStream�����ļ�ͨ���ļ�ϵͳ�е� File ���� file ָ���� 
			FileInputStream(String name) 
			          ͨ����һ����ʵ���ļ�������������һ�� FileInputStream�����ļ�ͨ���ļ�ϵͳ�е�·���� name ָ���� 
		 */
		
		FileInputStream fis = new FileInputStream(new File("bbb.txt"));
		System.out.println(fis);
		
		fis = new FileInputStream("bbb.txt");
		System.out.println(fis);
		
	}
}
