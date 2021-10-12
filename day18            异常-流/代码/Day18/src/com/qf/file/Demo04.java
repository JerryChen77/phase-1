package com.qf.file;

import java.io.File;
import java.util.Scanner;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 * 	����¼��һ���ļ���,��ȡ���ļ��������е��ļ����ļ���
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ���ļ���:");
		
		String pathName = sc.next();
		File file = new File(pathName);
		
		if (file.exists() && file.isDirectory()) {
			getAllFiles(file);
		} else {
			System.out.println("�����·������...");
			return;
		}
		
	}
	
	public static void getAllFiles(File file) {
		// ��ȡfile�����е��ļ��к��ļ�
		File[] files = file.listFiles();
		
		// ����files,������ļ�ֱ�����,������ļ���,���÷����������ڲ��ȡ
		for (File f : files) {
			if (f.isFile()) {
				System.out.println("\t�ļ���" + f);
			} else {
				System.out.println("�ļ��У�" + f);
				getAllFiles(f);
			}
		}
	}
}
