# Day	18笔记

## 一、异常

### 1.1 异常概述

* 程序出现了不正常的情况
* ArithmeticException
* NullPointException
* ArrayIndexOutOfBoundsException
* ParseException
* ClassCaseException

### 1.2 异常处理必要性

* 异常产生之后，后面的代码将无法运行，程序终止
* 可能造成损失

### 1.3 异常全家

* Throwable
  * `Throwable` 类是 Java 语言中所有错误或异常的超类。
  * 只有当对象是此类（或其子类之一）的实例时，才能通过 Java 虚拟机或者 Java `throw` 语句抛出。
  * 类似地，只有此类或其子类之一才可以是 `catch` 子句中的参数类型。
  * 两个子类的实例，[`Error`](../../java/lang/Error.html) 和 [`Exception`](../../java/lang/Exception.html)，通常用于指示发生了异常情况。
* Error
  * `Error` 是 `Throwable` 的子类，用于指示合理的应用程序不应该试图捕获的严重问题。
  * 大多数这样的错误都是异常条件。
* Exception
  * `Exception` 类及其子类是  的一种形式，它指出了合理的应用程序想要捕获的条件。 

### 1.4 异常的产生

* 自动抛出

  * 虚拟机检测到参数、语法等错误，自动抛出异常

* 手动抛出

  * 我们认为一些情况下程序是有问题的，手动调用方法抛出异常

  

### 1.5 异常的传递

* 异常是会传递的
* 按照方法调用顺序反向传递
* 如果一直没有处理，最后由JVM处理，会终止程序，打印堆栈追踪信息

```java
package com.qf.exception;

public class Demo02 {
	public static void main(String[] args) {
		System.out.println("main开始...");

		show01();

		System.out.println("main结束...");
	}

	public static void show01() {
		System.out.println("show01开始...");

		show02();
			
		System.out.println("show01结束...");

	}

	public static void show02() {
		System.out.println("show02开始...");

		show03();
			
		System.out.println("show02结束...");

	}
	
	public static void show03() {
		System.out.println("show03开始...");

		System.out.println(10 / 0);
			
		System.out.println("show03结束...");

	}
}
```

### 1.6 抛出异常

* 使用关键字throws可以抛出异常
* 异常将交由方法的调用者处理
* 在方法的参数列表后面声明异常

```java
package com.qf.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Demo03 {
	public static void main(String[] args) {
		// show();
	}
	
	public static void show() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.parse("1990-12-30");
	}
}
```

### 1.7 异常处理try--catch--finally

```
try{}catch(){}
try{}catch(){}catch(){}
try{}catch(){}catch(){}finally{}
```

* try
  * 运行可能出现异常的代码
* catch
  * 捕获出现的异常
* finally
  * 无论如何都要执行的代码

```java
package com.qf.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 * 	键盘录入数字，计算100除以这个数字的结果
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字被100除:");
		
		
		try {
			int num = sc.nextInt();
			System.out.println(100 / num);
		} catch (ArithmeticException e) {
			// e.printStackTrace();
			System.err.println("除数不能为0，有问题");
		} catch (InputMismatchException e) {
			// e.printStackTrace();
			System.err.println("输入的数字必须是整数");
			System.out.println(10 / 0);
		} catch (Exception e) {
			// e.printStackTrace();
			System.err.println("未知异常");
		} finally {
			System.out.println("程序终止");
		}
		
		
	}
}
```

### 1.8 异常处理注意

* try中代码不是越多越好

  ```java
  package com.qf.exception;
  
  public class Demo05 {
  	public static void main(String[] args) {
  		System.out.println("HelloWorld001");
  		try {
  			System.out.println(10 / 0);
  		} catch (ArithmeticException e) {
  			// e.printStackTrace();
  			System.err.println("算术运算异常");
  		}
  		
  		System.out.println("HelloWorld002");
  		try {
  			System.out.println("Hello".charAt(110));
  		} catch (StringIndexOutOfBoundsException e) {
  			// e.printStackTrace();
  			System.err.println("字符串索引越界");
  		}
  		
  		System.out.println("HelloWorld003");
  		String[] arr = new String[10];
  		try {
  			System.out.println(arr[10].length());
  		} catch (ArrayIndexOutOfBoundsException e) {
  			// e.printStackTrace();
  			System.out.println("数组下标越界");
  		}
  		
  		System.out.println("HelloWorld004");
  		try {
  			System.out.println(arr[0].length());
  		} catch (NullPointerException e) {
  			e.printStackTrace();
  		}
  		
  		System.out.println("HelloWorld005");
  		System.out.println("HelloWorld006");
  		System.out.println("HelloWorld007");
  	}
  }
  ```

* finally是永远会执行的吗？

  * finally干的过return
  * finally干不过System.exit(0)

```java
package com.qf.exception;

public class Demo07 {
	public static void main(String[] args) {
		try {
			System.out.println("HelloWorld001");
			// try代码块中遇到任何异常，后面的代码不会执行，执行catch中的代码
			System.out.println(10 / 0);
			
			System.out.println("HelloWorld002");
			System.out.println("Hello".charAt(110));
			
			System.out.println("HelloWorld003");
			String[] arr = new String[10];
			System.out.println(arr[10].length());
			
			System.out.println("HelloWorld004");
			System.out.println(arr[0].length());
			
			System.out.println("HelloWorld005");
			System.out.println("HelloWorld006");
			System.out.println("HelloWorld007");
		} catch (Exception e) {
			System.err.println("代码有错误");
			// return;
			System.exit(0);
		} finally {
			System.out.println("OVER");
		}
	}
}
```

### 1.9 自定义异常

* 官方的异常不满足个性化的需求
* 继承Exception或者RuntimeException
* 调用父类的构造器

```java
package com.qf.exception;

public class Demo08 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "张三";
		s.setWeight(2000);
		System.out.println(s);
	}
}

class Student {
	String name;
	private double weight;
	private double height;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if (weight > 50 && weight <= 125) {
			this.weight = weight;
		} else {
			throw new WeightOutOfBoundsException("体重超出范围 by " + weight);
		}

	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height > 140 && height <= 240) {
			this.height = height;
		} else {
			throw new HeightOutOfBoundsException("身高超出范围 by " + height);
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", weight=" + weight + ", height=" + height + "]";
	}
}

/**
 * 	自定义异常
 * 	体重超出范围异常
 * @param message
 */
class WeightOutOfBoundsException extends RuntimeException {

	public WeightOutOfBoundsException(String message) {
		super(message);

	}

}

/**
 * 	自定义异常
 * 	身高超出范围异常
 * @param message
 */
class HeightOutOfBoundsException extends RuntimeException {

	public HeightOutOfBoundsException(String message) {
		super(message);
	}
	
}
```

### 1.10 异常在方法重写中的注意

* 子类抛出的异常不能比父类范围更广
* 抛出的编译时异常不能更多

```java
package com.qf.exception;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

public class Demo09 {
	public static void main(String[] args) {
		
	}
}

class F{
	public void show() throws ParseException{
		System.out.println("父类的show方法");
	}
}

class S extends F{
	@Override
	public void show() throws ParseException{
		super.show();
	}
}
```

## 二、流

### 2.1 概述

* 数据传输的通道
* 读取数据是输入流
* 写出数据是输出流

### 2.2 流的分类

* 方向
  * 输入流
  * 输出流
* 单位
  * 字节流
  * 字符流
* 功能
  * 节点流
  * 转换流
  * 过滤流
  * 对象流
  * ... ...

## 三、File

### 3.1 概述

* 文件和目录路径名的抽象表示形式。  
* 用户界面和操作系统使用与系统相关的*路径名字符串* 来命名文件和目录。

### 3.2 对象创建

```java
package com.qf.file;

import java.io.File;

public class Demo01 {
	public static void main(String[] args) {
		/**
			File(String pathname) 
			          通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。 
			File(String parent, String child) 
			          根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。 
		  	File(File parent, String child) 
			          根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。 
		 */
		// 文件路径字符串形式
		String path = "D:\\files\\JavaFiles";
		
		// 抽象成对象,可以调用方法、属性
		
		File file = new File("D:\\files\\JavaFiles");
		System.out.println(file);
		System.out.println(file.getClass());
		
		File file2 = new File("D:\\files\\JavaFiles", "Java2103");
		System.out.println(file2);
		
		File file3 = new File(file, "Java2103");
		System.out.println(file3);
		
	}
}
```

### 3.3 常用方法

* 增
* 删
* 改

```java
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

```

* 查

```java
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
```

### 3.4 获取指定路径中所有的文件和文件夹

```java
package com.qf.file;

import java.io.File;
import java.util.Scanner;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 * 	键盘录入一个文件夹,获取此文件夹中所有的文件和文件夹
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个文件夹:");
		
		String pathName = sc.next();
		File file = new File(pathName);
		
		if (file.exists() && file.isDirectory()) {
			getAllFiles(file);
		} else {
			System.out.println("输入的路径有误...");
			return;
		}
		
	}
	
	public static void getAllFiles(File file) {
		// 获取file中所有的文件夹和文件
		File[] files = file.listFiles();
		
		// 变量files,如果是文件直接输出,如果是文件夹,调用方法继续向内层获取
		for (File f : files) {
			if (f.isFile()) {
				System.out.println("\t文件：" + f);
			} else {
				System.out.println("文件夹：" + f);
				getAllFiles(f);
			}
		}
	}
}
```

### 3.5 文件过滤器

```java
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
 * 	文件过滤器
 * 	只保留md类型的文件
 */
class MdFileFilter implements FileFilter{
	@Override
	public boolean accept(File file) {
		return file.getAbsolutePath().endsWith(".md");
	}
	
}
```

## 四、字节输入流

### 4.1 概述

* 以字节为单位读取本地文件内容的对象

### 4.2 抽象父类和实现类

* 父类
  * InputStream
* 实现类
  * FileInputStream
  * `FileInputStream` 从文件系统中的某个文件中获得输入字节。哪些文件可用取决于主机环境。  
  * `FileInputStream` 用于读取诸如图像数据之类的原始字节流。
  * 要读取字符流，请考虑使用  `FileReader`。 

### 4.3 创建对象

```
FileInputStream(File file) 
	通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定。
FileInputStream(String name) 
	通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定。 

```

```java
package com.qf.inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo01 {
	public static void main(String[] args) throws IOException {
		/**
		 * 	FileInputStream(File file) 
			          通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定。 
			FileInputStream(String name) 
			          通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定。 
		 */
		
		FileInputStream fis = new FileInputStream(new File("bbb.txt"));
		System.out.println(fis);
		
		fis = new FileInputStream("bbb.txt");
		System.out.println(fis);
		
	}
}
```

### 4.4 读取单个字节

```java
package com.qf.inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 *   int read() 
			          从此输入流中读取一个数据字节。 
			 int read(byte[] b) 
			          从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。 
			 int read(byte[] b, int off, int len) 
			          从此输入流中将最多 len 个字节的数据读入一个 byte 数组中。 
		 */
		
		FileInputStream fis = null;
		
		try {
			// 实例化对象
			fis = new FileInputStream(new File("bbb.txt"));
			// 读取字节数据,向后移动游标
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
```

### 4.5 读取一组字节

```java
package com.qf.inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo03 {
	public static void main(String[] args) {
FileInputStream fis = null;
		
		try {
			// 实例化对象
			fis = new FileInputStream(new File("bbb.txt"));
			// 每次读取一组信息
			byte[] b = new byte[4];
			System.out.println(Arrays.toString(b));
			
			int i = fis.read(b);
			System.out.println(i);
			System.out.println(Arrays.toString(b));
			
			i = fis.read(b);
			System.out.println(i);
			System.out.println(Arrays.toString(b));
			
			i = fis.read(b);
			System.out.println(i);
			System.out.println(Arrays.toString(b));
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
```

### 4.6 循环读取数据

```java
package com.qf.inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 * 	使用循环读取数据
		 */
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(new File("bbb.txt"));
			
			byte[] b = new byte[4];
			// 每次读取数据的数量
			int len = -1;
			
			while ((len = fis.read(b)) != -1) {
				// System.out.println(Arrays.toString(b));
				for (int i = 0; i < len; i++) {
					System.out.println(b[i]);
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("OVER");
	}
}
```

## 五、字节输出流

### 5.1 概述

* 以字节为单位写入数据的对象

* 文件输出流是用于将数据写入 `File` 或 `FileDescriptor`  的输出流。
* 文件是否可用或能否可以被创建取决于基础平台。
* `FileOutputStream` 用于写入诸如图像数据之类的原始字节的流。
* 要写入字符流，请考虑使用  `FileWriter`。 

### 5.2 抽象父类和实现类

* 抽象父类
  * OutputStream
* 实现类
  * FileOutputStream

### 5.3 创建对象

```
FileOutputStream(File file) 
          创建一个向指定 File 对象表示的文件中写入数据的文件输出流。 
FileOutputStream(File file, boolean append) 
          创建一个向指定 File 对象表示的文件中写入数据的文件输出流。 
FileOutputStream(String name) 
          创建一个向具有指定名称的文件中写入数据的输出文件流。 
FileOutputStream(String name, boolean append) 
          创建一个向具有指定 name 的文件中写入数据的输出文件流。 
```

### 5.4 写数据

```java
package com.qf.outputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	FileOutputStream(File file) 
			          创建一个向指定 File 对象表示的文件中写入数据的文件输出流。 
			FileOutputStream(File file, boolean append) 
			          创建一个向指定 File 对象表示的文件中写入数据的文件输出流。 
			
			FileOutputStream(String name) 
			          创建一个向具有指定名称的文件中写入数据的输出文件流。 
			FileOutputStream(String name, boolean append) 
			          创建一个向具有指定 name 的文件中写入数据的输出文件流。 
		 */
		
		
		/**
			 void write(int b) 
			          将指定字节写入此文件输出流。 
		  	 void write(byte[] b) 
			          将 b.length 个字节从指定 byte 数组写入此文件输出流中。 
			 void write(byte[] b, int off, int len) 
			          将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流。 
		 */
		
		FileOutputStream fos = null;
		try {
			// 创建输出流对象,如果后面加上true,表示向之前的文件中追加数据
			fos = new FileOutputStream(new File("ccc.txt"),true);
			
			// 写入数据
			fos.write(65);
			fos.write(66);
			fos.write(67);
			fos.write(68);
			fos.write(69);
			
			fos.write(new byte[] {97,98,99,100,101});
			
			fos.write("床前明月光".getBytes());
			
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
```

### 5.5 复制文件

```java
package com.qf.outputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 	复制文件到桌面
		 * 
		 * 	读取数据
		 * 		字节输入流
		 * 		创建对象
		 * 		读数据
		 * 
		 * 	写出数据
		 * 		字节输出流
		 * 		创建对象
		 * 		写数据
		 */
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// 创建输入流和输出流
			fis = new FileInputStream(new File("D:/img001.jpg"));
			fos = new FileOutputStream(new File("C:\\Users\\Dushine2008\\Desktop\\img001.jpg"));
			
			// 每次读取数据的内容容器
			byte[] b = new byte[1024*1024];
			// 每次读取数据的长度
			int len = -1;
			
			while ((len=fis.read(b)) != -1) {
				fos.write(b, 0, len);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("复制文件结束...");
	}
}
```

