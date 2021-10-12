package com.qf.file;

import java.io.File;
import java.util.Arrays;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * 	查
		    boolean canExecute() 
			          测试应用程序是否可以执行此抽象路径名表示的文件。 
			 boolean canRead() 
			          测试应用程序是否可以读取此抽象路径名表示的文件。 
			 boolean canWrite() 
			          测试应用程序是否可以修改此抽象路径名表示的文件。 
			 boolean exists() 
			          测试此抽象路径名表示的文件或目录是否存在。 
			 File getAbsoluteFile() 
			          返回此抽象路径名的绝对路径名形式。 
			 String getAbsolutePath() 
			          返回此抽象路径名的绝对路径名字符串。 
			 long getFreeSpace() 
			          返回此抽象路径名指定的分区中未分配的字节数。 
			 String getName() 
			          返回由此抽象路径名表示的文件或目录的名称。 
			 String getParent() 
			          返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回 null。 
			 File getParentFile() 
			          返回此抽象路径名父目录的抽象路径名；如果此路径名没有指定父目录，则返回 null。 
			 String getPath() 
			          将此抽象路径名转换为一个路径名字符串。 
			 long getTotalSpace() 
			          返回此抽象路径名指定的分区大小。 
			 long getUsableSpace() 
			          返回此抽象路径名指定的分区上可用于此虚拟机的字节数。 
			 boolean isAbsolute() 
			          测试此抽象路径名是否为绝对路径名。 
			 boolean isDirectory() 
			          测试此抽象路径名表示的文件是否是一个目录。 
			 boolean isFile() 
			          测试此抽象路径名表示的文件是否是一个标准文件。 
			 boolean isHidden() 
			          测试此抽象路径名指定的文件是否是一个隐藏文件。 
			 long lastModified() 
			          返回此抽象路径名表示的文件最后一次被修改的时间。 
			 long length() 
			          返回由此抽象路径名表示的文件的长度。 
			 String[] list() 
			          返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录。 
			 String[] list(FilenameFilter filter) 
			          返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中满足指定过滤器的文件和目录。 
			 File[] listFiles() 
			          返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。 
			 File[] listFiles(FileFilter filter) 
			          返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。 
			 File[] listFiles(FilenameFilter filter) 
			          返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。 
			 static File[] listRoots() 
			          列出可用的文件系统根。 
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
		
		// 相对路径--相当于当前所在位置创建
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
