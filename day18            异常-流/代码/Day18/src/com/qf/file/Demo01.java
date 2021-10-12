package com.qf.file;

import java.io.File;

public class Demo01 {
	public static void main(String[] args) {
		/**
			File(String pathname) 
			          ͨ��������·�����ַ���ת��Ϊ����·����������һ���� File ʵ���� 
			File(String parent, String child) 
			          ���� parent ·�����ַ����� child ·�����ַ�������һ���� File ʵ���� 
		  	File(File parent, String child) 
			          ���� parent ����·������ child ·�����ַ�������һ���� File ʵ���� 
		 */
		// �ļ�·���ַ�����ʽ
		String path = "D:\\files\\JavaFiles";
		
		// ����ɶ���,���Ե��÷���������
		
		File file = new File("D:\\files\\JavaFiles");
		System.out.println(file);
		System.out.println(file.getClass());
		
		File file2 = new File("D:\\files\\JavaFiles", "Java2103");
		System.out.println(file2);
		
		File file3 = new File(file, "Java2103");
		System.out.println(file3);
		
	}
}
