package com.qf.file;

import java.io.File;
import java.io.IOException;

public class Demo02 {
	public static void main(String[] args) throws IOException {
		/**
		 * 	增
			 boolean createNewFile() 
			          当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。 
			 boolean mkdir() 
			          创建此抽象路径名指定的目录。 
			 boolean mkdirs() 
			          创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。 
			          
		 * 	删
			 boolean delete() 
			          删除此抽象路径名表示的文件或目录。 
			 void deleteOnExit() 
			          在虚拟机终止时，请求删除此抽象路径名表示的文件或目录。 
			          
		 * 	改
			 boolean renameTo(File dest) 
			          重新命名此抽象路径名表示的文件。 
			 boolean setExecutable(boolean executable) 
			          设置此抽象路径名所有者执行权限的一个便捷方法。 
			 boolean setExecutable(boolean executable, boolean ownerOnly) 
			          设置此抽象路径名的所有者或所有用户的执行权限。 
			 boolean setLastModified(long time) 
			          设置此抽象路径名指定的文件或目录的最后一次修改时间。 
			 boolean setReadable(boolean readable) 
			          设置此抽象路径名所有者读权限的一个便捷方法。 
			 boolean setReadable(boolean readable, boolean ownerOnly) 
			          设置此抽象路径名的所有者或所有用户的读权限。 
			 boolean setReadOnly() 
			          标记此抽象路径名指定的文件或目录，从而只能对其进行读操作。 
			 boolean setWritable(boolean writable) 
			          设置此抽象路径名所有者写权限的一个便捷方法。 
			 boolean setWritable(boolean writable, boolean ownerOnly) 
			          设置此抽象路径名的所有者或所有用户的写权限。 
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
