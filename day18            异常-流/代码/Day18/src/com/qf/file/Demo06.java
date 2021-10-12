package com.qf.file;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Demo06 {
	public static void main(String[] args) {
		File file = new File("D:/bb");
		
		MdFileFilter filter = new MdFileFilter();
		File[] files = file.listFiles(filter);
		System.out.println(Arrays.toString(files));
		for (File f : files) {
			System.out.println(f);
		}
		System.out.println("==============");
		
		File[] listFiles = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.getAbsolutePath().endsWith(".txt");
			}
		});
		
		for (File f : listFiles) {
			System.out.println(f);
		}
		
	}
	
}

/**
 * 	�ļ�������
 * 	ֻ����md���͵��ļ�
 */
class MdFileFilter implements FileFilter{
	@Override
	public boolean accept(File file) {
		return file.getAbsolutePath().endsWith(".md");
	}
	
}
