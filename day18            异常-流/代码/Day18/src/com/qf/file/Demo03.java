package com.qf.file;

import java.io.File;
import java.util.Arrays;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * 	��
		    boolean canExecute() 
			          ����Ӧ�ó����Ƿ����ִ�д˳���·������ʾ���ļ��� 
			 boolean canRead() 
			          ����Ӧ�ó����Ƿ���Զ�ȡ�˳���·������ʾ���ļ��� 
			 boolean canWrite() 
			          ����Ӧ�ó����Ƿ�����޸Ĵ˳���·������ʾ���ļ��� 
			 boolean exists() 
			          ���Դ˳���·������ʾ���ļ���Ŀ¼�Ƿ���ڡ� 
			 File getAbsoluteFile() 
			          ���ش˳���·�����ľ���·������ʽ�� 
			 String getAbsolutePath() 
			          ���ش˳���·�����ľ���·�����ַ����� 
			 long getFreeSpace() 
			          ���ش˳���·����ָ���ķ�����δ������ֽ����� 
			 String getName() 
			          �����ɴ˳���·������ʾ���ļ���Ŀ¼�����ơ� 
			 String getParent() 
			          ���ش˳���·������Ŀ¼��·�����ַ����������·����û��ָ����Ŀ¼���򷵻� null�� 
			 File getParentFile() 
			          ���ش˳���·������Ŀ¼�ĳ���·�����������·����û��ָ����Ŀ¼���򷵻� null�� 
			 String getPath() 
			          ���˳���·����ת��Ϊһ��·�����ַ����� 
			 long getTotalSpace() 
			          ���ش˳���·����ָ���ķ�����С�� 
			 long getUsableSpace() 
			          ���ش˳���·����ָ���ķ����Ͽ����ڴ���������ֽ����� 
			 boolean isAbsolute() 
			          ���Դ˳���·�����Ƿ�Ϊ����·������ 
			 boolean isDirectory() 
			          ���Դ˳���·������ʾ���ļ��Ƿ���һ��Ŀ¼�� 
			 boolean isFile() 
			          ���Դ˳���·������ʾ���ļ��Ƿ���һ����׼�ļ��� 
			 boolean isHidden() 
			          ���Դ˳���·����ָ�����ļ��Ƿ���һ�������ļ��� 
			 long lastModified() 
			          ���ش˳���·������ʾ���ļ����һ�α��޸ĵ�ʱ�䡣 
			 long length() 
			          �����ɴ˳���·������ʾ���ļ��ĳ��ȡ� 
			 String[] list() 
			          ����һ���ַ������飬��Щ�ַ���ָ���˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼�� 
			 String[] list(FilenameFilter filter) 
			          ����һ���ַ������飬��Щ�ַ���ָ���˳���·������ʾ��Ŀ¼������ָ�����������ļ���Ŀ¼�� 
			 File[] listFiles() 
			          ����һ������·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼�е��ļ��� 
			 File[] listFiles(FileFilter filter) 
			          ���س���·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼������ָ�����������ļ���Ŀ¼�� 
			 File[] listFiles(FilenameFilter filter) 
			          ���س���·�������飬��Щ·������ʾ�˳���·������ʾ��Ŀ¼������ָ�����������ļ���Ŀ¼�� 
			 static File[] listRoots() 
			          �г����õ��ļ�ϵͳ���� 
		 */
		
		File file = new File("D:/aa.txt");
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		System.out.println(file.exists());
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getAbsoluteFile());
		
		System.out.println(file.getFreeSpace());
		
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getParentFile());
		
		System.out.println(file.getTotalSpace());
		
		System.out.println(file.isAbsolute());
		
		// ���·��--�൱�ڵ�ǰ����λ�ô���
		File file2 = new File("bbb.txt");
		System.out.println(file2.isAbsolute());
		System.out.println(file2.getPath());
		System.out.println(file2.getAbsolutePath());
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		System.out.println(file.length());
		// D:\files\JavaFiles\Java2103
		File file3 = new File("D:/files/JavaFiles/Java2103");
		System.out.println(file3.exists());
		String[] fileNames = file3.list();
		System.out.println(Arrays.toString(fileNames));
		File[] files = file3.listFiles();
		System.out.println(Arrays.toString(files));
		
		
	}
}
