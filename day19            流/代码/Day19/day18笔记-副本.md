# Day	18�ʼ�

## һ���쳣

### 1.1 �쳣����

* ��������˲����������
* ArithmeticException
* NullPointException
* ArrayIndexOutOfBoundsException
* ParseException
* ClassCaseException

### 1.2 �쳣�����Ҫ��

* �쳣����֮�󣬺���Ĵ��뽫�޷����У�������ֹ
* ���������ʧ

### 1.3 �쳣ȫ��

* Throwable
  * `Throwable` ���� Java ���������д�����쳣�ĳ��ࡣ
  * ֻ�е������Ǵ��ࣨ��������֮һ����ʵ��ʱ������ͨ�� Java ��������� Java `throw` ����׳���
  * ���Ƶأ�ֻ�д����������֮һ�ſ����� `catch` �Ӿ��еĲ������͡�
  * ���������ʵ����[`Error`](../../java/lang/Error.html) �� [`Exception`](../../java/lang/Exception.html)��ͨ������ָʾ�������쳣�����
* Error
  * `Error` �� `Throwable` �����࣬����ָʾ�����Ӧ�ó���Ӧ����ͼ������������⡣
  * ����������Ĵ������쳣������
* Exception
  * `Exception` �༰��������  ��һ����ʽ����ָ���˺����Ӧ�ó�����Ҫ����������� 

### 1.4 �쳣�Ĳ���

* �Զ��׳�

  * �������⵽�������﷨�ȴ����Զ��׳��쳣

* �ֶ��׳�

  * ������ΪһЩ����³�����������ģ��ֶ����÷����׳��쳣

  

### 1.5 �쳣�Ĵ���

* �쳣�ǻᴫ�ݵ�
* ���շ�������˳���򴫵�
* ���һֱû�д��������JVM��������ֹ���򣬴�ӡ��ջ׷����Ϣ

```java
package com.qf.exception;

public class Demo02 {
	public static void main(String[] args) {
		System.out.println("main��ʼ...");

		show01();

		System.out.println("main����...");
	}

	public static void show01() {
		System.out.println("show01��ʼ...");

		show02();
			
		System.out.println("show01����...");

	}

	public static void show02() {
		System.out.println("show02��ʼ...");

		show03();
			
		System.out.println("show02����...");

	}
	
	public static void show03() {
		System.out.println("show03��ʼ...");

		System.out.println(10 / 0);
			
		System.out.println("show03����...");

	}
}
```

### 1.6 �׳��쳣

* ʹ�ùؼ���throws�����׳��쳣
* �쳣�����ɷ����ĵ����ߴ���
* �ڷ����Ĳ����б���������쳣

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

### 1.7 �쳣����try--catch--finally

```
try{}catch(){}
try{}catch(){}catch(){}
try{}catch(){}catch(){}finally{}
```

* try
  * ���п��ܳ����쳣�Ĵ���
* catch
  * ������ֵ��쳣
* finally
  * ������ζ�Ҫִ�еĴ���

```java
package com.qf.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 * 	����¼�����֣�����100����������ֵĽ��
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�����ֱ�100��:");
		
		
		try {
			int num = sc.nextInt();
			System.out.println(100 / num);
		} catch (ArithmeticException e) {
			// e.printStackTrace();
			System.err.println("��������Ϊ0��������");
		} catch (InputMismatchException e) {
			// e.printStackTrace();
			System.err.println("��������ֱ���������");
			System.out.println(10 / 0);
		} catch (Exception e) {
			// e.printStackTrace();
			System.err.println("δ֪�쳣");
		} finally {
			System.out.println("������ֹ");
		}
		
		
	}
}
```

### 1.8 �쳣����ע��

* try�д��벻��Խ��Խ��

  ```java
  package com.qf.exception;
  
  public class Demo05 {
  	public static void main(String[] args) {
  		System.out.println("HelloWorld001");
  		try {
  			System.out.println(10 / 0);
  		} catch (ArithmeticException e) {
  			// e.printStackTrace();
  			System.err.println("���������쳣");
  		}
  		
  		System.out.println("HelloWorld002");
  		try {
  			System.out.println("Hello".charAt(110));
  		} catch (StringIndexOutOfBoundsException e) {
  			// e.printStackTrace();
  			System.err.println("�ַ�������Խ��");
  		}
  		
  		System.out.println("HelloWorld003");
  		String[] arr = new String[10];
  		try {
  			System.out.println(arr[10].length());
  		} catch (ArrayIndexOutOfBoundsException e) {
  			// e.printStackTrace();
  			System.out.println("�����±�Խ��");
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

* finally����Զ��ִ�е���

  * finally�ɵĹ�return
  * finally�ɲ���System.exit(0)

```java
package com.qf.exception;

public class Demo07 {
	public static void main(String[] args) {
		try {
			System.out.println("HelloWorld001");
			// try������������κ��쳣������Ĵ��벻��ִ�У�ִ��catch�еĴ���
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
			System.err.println("�����д���");
			// return;
			System.exit(0);
		} finally {
			System.out.println("OVER");
		}
	}
}
```

### 1.9 �Զ����쳣

* �ٷ����쳣��������Ի�������
* �̳�Exception����RuntimeException
* ���ø���Ĺ�����

```java
package com.qf.exception;

public class Demo08 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "����";
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
			throw new WeightOutOfBoundsException("���س�����Χ by " + weight);
		}

	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height > 140 && height <= 240) {
			this.height = height;
		} else {
			throw new HeightOutOfBoundsException("��߳�����Χ by " + height);
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", weight=" + weight + ", height=" + height + "]";
	}
}

/**
 * 	�Զ����쳣
 * 	���س�����Χ�쳣
 * @param message
 */
class WeightOutOfBoundsException extends RuntimeException {

	public WeightOutOfBoundsException(String message) {
		super(message);

	}

}

/**
 * 	�Զ����쳣
 * 	��߳�����Χ�쳣
 * @param message
 */
class HeightOutOfBoundsException extends RuntimeException {

	public HeightOutOfBoundsException(String message) {
		super(message);
	}
	
}
```

### 1.10 �쳣�ڷ�����д�е�ע��

* �����׳����쳣���ܱȸ��෶Χ����
* �׳��ı���ʱ�쳣���ܸ���

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
		System.out.println("�����show����");
	}
}

class S extends F{
	@Override
	public void show() throws ParseException{
		super.show();
	}
}
```

## ������

### 2.1 ����

* ���ݴ����ͨ��
* ��ȡ������������
* д�������������

### 2.2 ���ķ���

* ����
  * ������
  * �����
* ��λ
  * �ֽ���
  * �ַ���
* ����
  * �ڵ���
  * ת����
  * ������
  * ������
  * ... ...

## ����File

### 3.1 ����

* �ļ���Ŀ¼·�����ĳ����ʾ��ʽ��  
* �û�����Ͳ���ϵͳʹ����ϵͳ��ص�*·�����ַ���* �������ļ���Ŀ¼��

### 3.2 ���󴴽�

```java
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
```

### 3.3 ���÷���

* ��
* ɾ
* ��

```java
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

```

* ��

```java
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
```

### 3.4 ��ȡָ��·�������е��ļ����ļ���

```java
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
```

### 3.5 �ļ�������

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
 * 	�ļ�������
 * 	ֻ����md���͵��ļ�
 */
class MdFileFilter implements FileFilter{
	@Override
	public boolean accept(File file) {
		return file.getAbsolutePath().endsWith(".md");
	}
	
}
```

## �ġ��ֽ�������

### 4.1 ����

* ���ֽ�Ϊ��λ��ȡ�����ļ����ݵĶ���

### 4.2 �������ʵ����

* ����
  * InputStream
* ʵ����
  * FileInputStream
  * `FileInputStream` ���ļ�ϵͳ�е�ĳ���ļ��л�������ֽڡ���Щ�ļ�����ȡ��������������  
  * `FileInputStream` ���ڶ�ȡ����ͼ������֮���ԭʼ�ֽ�����
  * Ҫ��ȡ�ַ������뿼��ʹ��  `FileReader`�� 

### 4.3 ��������

```
FileInputStream(File file) 
	ͨ����һ����ʵ���ļ�������������һ�� FileInputStream�����ļ�ͨ���ļ�ϵͳ�е� File ���� file ָ����
FileInputStream(String name) 
	ͨ����һ����ʵ���ļ�������������һ�� FileInputStream�����ļ�ͨ���ļ�ϵͳ�е�·���� name ָ���� 

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
```

### 4.4 ��ȡ�����ֽ�

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
			          �Ӵ��������ж�ȡһ�������ֽڡ� 
			 int read(byte[] b) 
			          �Ӵ��������н���� b.length ���ֽڵ����ݶ���һ�� byte �����С� 
			 int read(byte[] b, int off, int len) 
			          �Ӵ��������н���� len ���ֽڵ����ݶ���һ�� byte �����С� 
		 */
		
		FileInputStream fis = null;
		
		try {
			// ʵ��������
			fis = new FileInputStream(new File("bbb.txt"));
			// ��ȡ�ֽ�����,����ƶ��α�
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

### 4.5 ��ȡһ���ֽ�

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
			// ʵ��������
			fis = new FileInputStream(new File("bbb.txt"));
			// ÿ�ζ�ȡһ����Ϣ
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

### 4.6 ѭ����ȡ����

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
		 * 	ʹ��ѭ����ȡ����
		 */
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(new File("bbb.txt"));
			
			byte[] b = new byte[4];
			// ÿ�ζ�ȡ���ݵ�����
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

## �塢�ֽ������

### 5.1 ����

* ���ֽ�Ϊ��λд�����ݵĶ���

* �ļ�����������ڽ�����д�� `File` �� `FileDescriptor`  ���������
* �ļ��Ƿ���û��ܷ���Ա�����ȡ���ڻ���ƽ̨��
* `FileOutputStream` ����д������ͼ������֮���ԭʼ�ֽڵ�����
* Ҫд���ַ������뿼��ʹ��  `FileWriter`�� 

### 5.2 �������ʵ����

* ������
  * OutputStream
* ʵ����
  * FileOutputStream

### 5.3 ��������

```
FileOutputStream(File file) 
          ����һ����ָ�� File �����ʾ���ļ���д�����ݵ��ļ�������� 
FileOutputStream(File file, boolean append) 
          ����һ����ָ�� File �����ʾ���ļ���д�����ݵ��ļ�������� 
FileOutputStream(String name) 
          ����һ�������ָ�����Ƶ��ļ���д�����ݵ�����ļ����� 
FileOutputStream(String name, boolean append) 
          ����һ�������ָ�� name ���ļ���д�����ݵ�����ļ����� 
```

### 5.4 д����

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
			          ����һ����ָ�� File �����ʾ���ļ���д�����ݵ��ļ�������� 
			FileOutputStream(File file, boolean append) 
			          ����һ����ָ�� File �����ʾ���ļ���д�����ݵ��ļ�������� 
			
			FileOutputStream(String name) 
			          ����һ�������ָ�����Ƶ��ļ���д�����ݵ�����ļ����� 
			FileOutputStream(String name, boolean append) 
			          ����һ�������ָ�� name ���ļ���д�����ݵ�����ļ����� 
		 */
		
		
		/**
			 void write(int b) 
			          ��ָ���ֽ�д����ļ�������� 
		  	 void write(byte[] b) 
			          �� b.length ���ֽڴ�ָ�� byte ����д����ļ�������С� 
			 void write(byte[] b, int off, int len) 
			          ��ָ�� byte �����д�ƫ���� off ��ʼ�� len ���ֽ�д����ļ�������� 
		 */
		
		FileOutputStream fos = null;
		try {
			// �������������,����������true,��ʾ��֮ǰ���ļ���׷������
			fos = new FileOutputStream(new File("ccc.txt"),true);
			
			// д������
			fos.write(65);
			fos.write(66);
			fos.write(67);
			fos.write(68);
			fos.write(69);
			
			fos.write(new byte[] {97,98,99,100,101});
			
			fos.write("��ǰ���¹�".getBytes());
			
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

### 5.5 �����ļ�

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
		 * 	�����ļ�������
		 * 
		 * 	��ȡ����
		 * 		�ֽ�������
		 * 		��������
		 * 		������
		 * 
		 * 	д������
		 * 		�ֽ������
		 * 		��������
		 * 		д����
		 */
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// �����������������
			fis = new FileInputStream(new File("D:/img001.jpg"));
			fos = new FileOutputStream(new File("C:\\Users\\Dushine2008\\Desktop\\img001.jpg"));
			
			// ÿ�ζ�ȡ���ݵ���������
			byte[] b = new byte[1024*1024];
			// ÿ�ζ�ȡ���ݵĳ���
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
		System.out.println("�����ļ�����...");
	}
}
```

