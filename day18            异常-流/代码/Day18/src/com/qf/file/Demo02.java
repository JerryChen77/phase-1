package com.qf.file;

import java.io.File;
import java.io.IOException;

public class Demo02 {
	public static void main(String[] args) throws IOException {
		/**
		 * 	��
			 boolean createNewFile() 
			          ���ҽ��������ھ��д˳���·����ָ�����Ƶ��ļ�ʱ�����ɷֵش���һ���µĿ��ļ��� 
			 boolean mkdir() 
			          �����˳���·����ָ����Ŀ¼�� 
			 boolean mkdirs() 
			          �����˳���·����ָ����Ŀ¼���������б��赫�����ڵĸ�Ŀ¼�� 
			          
		 * 	ɾ
			 boolean delete() 
			          ɾ���˳���·������ʾ���ļ���Ŀ¼�� 
			 void deleteOnExit() 
			          ���������ֹʱ������ɾ���˳���·������ʾ���ļ���Ŀ¼�� 
			          
		 * 	��
			 boolean renameTo(File dest) 
			          ���������˳���·������ʾ���ļ��� 
			 boolean setExecutable(boolean executable) 
			          ���ô˳���·����������ִ��Ȩ�޵�һ����ݷ����� 
			 boolean setExecutable(boolean executable, boolean ownerOnly) 
			          ���ô˳���·�����������߻������û���ִ��Ȩ�ޡ� 
			 boolean setLastModified(long time) 
			          ���ô˳���·����ָ�����ļ���Ŀ¼�����һ���޸�ʱ�䡣 
			 boolean setReadable(boolean readable) 
			          ���ô˳���·���������߶�Ȩ�޵�һ����ݷ����� 
			 boolean setReadable(boolean readable, boolean ownerOnly) 
			          ���ô˳���·�����������߻������û��Ķ�Ȩ�ޡ� 
			 boolean setReadOnly() 
			          ��Ǵ˳���·����ָ�����ļ���Ŀ¼���Ӷ�ֻ�ܶ�����ж������� 
			 boolean setWritable(boolean writable) 
			          ���ô˳���·����������дȨ�޵�һ����ݷ����� 
			 boolean setWritable(boolean writable, boolean ownerOnly) 
			          ���ô˳���·�����������߻������û���дȨ�ޡ� 
		 */
		
		File file = new File("D:/aa.txt");
		
		boolean b = file.createNewFile();
		System.out.println(b);
		
		File file02 = new File("D:/bb");
		b = file02.mkdir();
		System.out.println(b);
		
		File file03 = new File("D:/bb/cc/dd");
		b = file03.mkdirs();
		System.out.println(b);
		
		File file04 = new File("D:/bb/cc/dd");
		b = file04.delete();
		System.out.println(b);
		
		File file05 = new File("D:/bb");
		b = file05.delete();
		System.out.println(b);
		
		File file06 = new File("D:/bb/cc");
		file06.deleteOnExit();
		
		File file07 = new File("D:/aa.txt");
		b = file07.renameTo(new File("D:/aaa.txt"));
		System.out.println(b);
		
		File file08 = new File("D:/aaa.txt");
		b = file08.setLastModified(System.currentTimeMillis());
		System.out.println(b);
		
		b = file08.setReadOnly();
		System.out.println(b);
		
		
	}
}
