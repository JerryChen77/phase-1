# Day 19笔记

## 一、字符输入流

### 1.1 概述

* 以字符为单位读取数据的流

### 1.2 抽象类和实现类

* Reader
  * 用于读取字符流的抽象类。
  * 子类必须实现的方法只有 read(char[], int, int) 和 close()。
  * 但是，多数子类将重写此处定义的一些方法，以提供更高的效率和/或其他功能。 
* FileReader
  * 用来读取字符文件的便捷类。
  * 此类的构造方法假定默认字符编码和默认字节缓冲区大小都是适当的。
  * 要自己指定这些值，可以先在 FileInputStream  上构造一个 InputStreamReader。  
  * `FileReader` 用于读取字符流。要读取原始字节流，请考虑使用 `FileInputStream`。 

### 1.3 创建对象

```
FileReader(File file) 
          在给定从中读取数据的 File 的情况下创建一个新 FileReader。  
FileReader(String fileName) 
          在给定从中读取数据的文件名的情况下创建一个新 FileReader。 
```

### 1.4 读取英文字符

```java
package com.qf.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	FileReader(File file) 
			          在给定从中读取数据的 File 的情况下创建一个新 FileReader。 
			FileReader(String fileName) 
			          在给定从中读取数据的文件名的情况下创建一个新 FileReader。 
			          
			          
			 int read() 
			          读取单个字符。 
			 int read(char[] cbuf) 
			          将字符读入数组。 
			 int read(char[] cbuf, int off, int len) 
			          将字符读入数组的某一部分。 
		 */
		
		FileReader reader = null;
		try {
			reader = new FileReader(new File("haha.txt"));
			
			int i = reader.read();
			System.out.println(i);
			
			i = reader.read();
			System.out.println(i);
			
			i = reader.read();
			System.out.println(i);
			
			i = reader.read();
			System.out.println(i);
			
			i = reader.read();
			System.out.println(i);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("OVER");
	}
}
```



### 1.5 读取中文字符

```java
package com.qf.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 	FileReader(File file) 
			          在给定从中读取数据的 File 的情况下创建一个新 FileReader。 
			FileReader(String fileName) 
			          在给定从中读取数据的文件名的情况下创建一个新 FileReader。 
			          
			          
			 int read() 
			          读取单个字符，返回字符编码
			 int read(char[] cbuf) 
			          将字符读入数组，返回读取数量
			 int read(char[] cbuf, int off, int len) 
			          将字符读入数组的某一部分，返回读取数量
		 */
		
		FileReader reader = null;
		try {
			reader = new FileReader(new File("hehe.txt"));
			
			int i = reader.read();
			System.out.println(i);
			
			i = reader.read();
			System.out.println(i);
			
			i = reader.read();
			System.out.println(i);
			
			i = reader.read();
			System.out.println(i);
			
			i = reader.read();
			System.out.println(i);
			
			char[] c = new char[2];
			reader.read(c);
			System.out.println(Arrays.toString(c));
			
			reader.read(c);
			System.out.println(Arrays.toString(c));
			
			reader.read(c);
			System.out.println(Arrays.toString(c));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("OVER");
	}
}
```

## 二、字符输出流

### 2.1 概述

* 以字符为单位写入数据的对象

### 2.2 抽象类和实现类

* Writer
  * 写入字符流的抽象类。
  * 子类必须实现的方法仅有 write(char[], int, int)、flush() 和 close()。
  * 但是，多数子类将重写此处定义的一些方法，以提供更高的效率和/或其他功能。 
* FileWriter
  * 用来写入字符文件的便捷类。
  * 此类的构造方法假定默认字符编码和默认字节缓冲区大小都是可接受的。
  * 要自己指定这些值，可以先在 FileOutputStream 上构造一个 OutputStreamWriter。 
  * `FileWriter` 用于写入字符流。要写入原始字节流，请考虑使用 FileOutputStream

### 2.3 创建对象

```
FileWriter(File file) 
          根据给定的 File 对象构造一个 FileWriter 对象。 
FileWriter(File file, boolean append) 
          根据给定的 File 对象构造一个 FileWriter 对象。  
          
FileWriter(String fileName) 
          根据给定的文件名构造一个 FileWriter 对象。 
FileWriter(String fileName, boolean append) 
          根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象。 
```

### 2.4 写入字符

```java
package com.qf.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	FileWriter(File file) 
			          根据给定的 File 对象构造一个 FileWriter 对象。 
			FileWriter(File file, boolean append) 
			          根据给定的 File 对象构造一个 FileWriter 对象。  
			          
			FileWriter(String fileName) 
			          根据给定的文件名构造一个 FileWriter 对象。 
			FileWriter(String fileName, boolean append) 
			          根据给定的文件名以及指示是否附加写入数据的 boolean 值来构造 FileWriter 对象。 
			          
			          
			 void write(int c) 
			          写入单个字符。 
			 void write(String str) 
			          写入字符串。 
			 void write(String str, int off, int len) 
			          写入字符串的某一部分。 
			 void write(char[] cbuf) 
			          写入字符数组。 
			 void write(char[] cbuf, int off, int len) 
			          写入字符数组的某一部分。 
		 */
		
		FileWriter writer = null;
		
		try {
			writer = new FileWriter(new File("hihi.txt"));
			
			// 写入数据
			/**
			 	26085
				29031
				39321
				28809
				29983
			 */
			writer.write(26085);
			writer.write(29031);
			writer.write(39321);
			writer.write(28809);
			writer.write(29983);
			
			writer.write("紫烟");
			writer.write("\r\n遥看瀑布挂前川\r\n");
			
			char[] c = {'飞','流','直','下','三','千','尺'};
			writer.write(c);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("OVER");
	}
}
```

### 2.5 复制文本文件

```java
package com.qf.writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 	复制文本文件到桌面
		 * 	1、创建输出流、输出流
		 * 	2、读写文件
		 * 	3、关闭流
		 */
		
		FileReader reader = null;
		FileWriter writer = null;
		
		try {
			// 创建对象
			reader = new FileReader(new File("D:/threeCountry.txt"));
			writer = new FileWriter(new File("C:\\Users\\Dushine2008\\Desktop\\threeCountry.txt"));
			
			// 读写数据
			char[] c = new char[1024];
			int len = -1;
			
			while ((len=reader.read(c)) != -1) {
				writer.write(c, 0, len);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 关闭流
				if (writer != null) {
					writer.close();
				}
				
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("OVER");
	}
}
```

## 三、字节缓冲流

### 3.1 概述

* 以字节为单位操作数据
* 会创建一个字节缓冲区，把数据暂时存在缓冲器，缓冲器满了或者手动调用flush方法才会把数据写出
* 提高读写的效率

### 3.2 API

* BufferedInputStream
* BufferedOutputStream

### 3.3 缓冲字节流案例

```java
package com.qf.buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	使用缓冲字节流复制一个文件
		 */
		long startTime = System.currentTimeMillis();
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream(new File("D:\\software\\XTLBB-JD-3.67.9033_GF.zip")));
			bos = new BufferedOutputStream(new FileOutputStream(new File("D:\\software\\XTLBB-JD-3.67.9033_GF-副本.zip")));
			
			// 复制文件
			byte[] b = new byte[1024*1024];
			int len = -1;
			
			while ((len=bis.read(b)) != -1) {
				bos.write(b, 0, len);
			}
			
			// 强制情况缓冲区数据
			bos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bos != null) {
					bos.close();
				}
				
				if (bis != null) {
					bis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(System.currentTimeMillis() - startTime);
		System.out.println("OVER");
	}
}
```

## 四、桥转换流

### 4.1 概述

* 字符和字节转换的对象

### 4.2 API

* InputStreamReader
  * InputStreamReader 是字节流通向字符流的桥梁：它使用指定的 [`charset`](../../java/nio/charset/Charset.html) 
    读取字节并将其解码为字符。
  * 它使用的字符集可以由名称指定或显式给定，或者可以接受平台默认的字符集。 
* OutputStreamWriter
  * OutputStreamWriter 是字符流通向字节流的桥梁：可使用指定的 [`charset`](../../java/nio/charset/Charset.html) 
    将要写入流中的字符编码成字节。
  * 它使用的字符集可以由名称指定或显式给定，否则将接受平台默认的字符集。 

### 4.3 创建对象

* InputStreamReader

```
InputStreamReader(InputStream in) 
          创建一个使用默认字符集的 InputStreamReader。 
InputStreamReader(InputStream in, String charsetName) 
          创建使用指定字符集的 InputStreamReader。 
```

* OutputStreamWriter 

```
OutputStreamWriter(OutputStream out) 
          创建使用默认字符编码的 OutputStreamWriter。 
OutputStreamWriter(OutputStream out, String charsetName) 
          创建使用指定字符集的 OutputStreamWriter。 
```

### 4.4 复制文件--解决乱码问题

```java
package com.qf.transfer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	复制乱码的文件
		 * 	在复制文件过程中解决乱码问题
		 * 
		 * 	读文件--以文件原来的编码方式读
		 * 	写文件--一当前生产环境的字符编码写
		 * 
		 *  InputStreamReader(InputStream in) 
			          创建一个使用默认字符集的 InputStreamReader。 
			InputStreamReader(InputStream in, String charsetName) 
			          创建使用指定字符集的 InputStreamReader。
          
          
            OutputStreamWriter(OutputStream out) 
		          	创建使用默认字符编码的 OutputStreamWriter。 
		    OutputStreamWriter(OutputStream out, String charsetName) 
		          	创建使用指定字符集的 OutputStreamWriter。 
		 * 
		 */
		
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		
		try {
			// 创建对象
			isr = new InputStreamReader(new BufferedInputStream(new FileInputStream(new File("day18笔记.md"))), "UTF-8");
			osw = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(new File("day18笔记-副本.md"))), "GBK");
			
			// 读写数据
			char[] c = new char[1024];
			int len = -1;
			
			while ((len = isr.read(c)) != -1) {
				osw.write(c, 0, len);
			}
			osw.flush();
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (osw != null) {
					osw.close();
				}
				if (isr != null) {
					isr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
		System.out.println("OVER");
	}
}
```

## 五、对象流

### 5.1 概述

* 传输对象的流
* 对象的序列化
  * 写出去
* 反序列化
  * 取回来
* 对象传输之前必须进行序列化

### 5.2 对象序列化

```java
package com.qf.serialize;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 	对象序列化
 * @author Dushine2008
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		Stu stu = new Stu("zhangsan", 23);
		/**
		 * 	使用流传输对象
		 */
		
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(new File("stu_zhansan")));
			oos.writeObject(stu);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("OVER");
	}
}

class Stu implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 11321641216L;
	String name;
	int age;
	
	public Stu() {}

	public Stu(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Stu [name=" + name + ", age=" + age + "]";
	}
	
}
```

### 5.3 反序列化

```java
package com.qf.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 	对象反序列化
 * @author Dushine2008
 */
public class Demo02 {
	public static void main(String[] args) {
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream(new File("stu_zhansan")));
			Object object = ois.readObject();
			
			System.out.println(object);
			
			Stu stu = (Stu) object;
			System.out.println(stu);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("OVER");
	}
}
```

