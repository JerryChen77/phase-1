# Day 14笔记

## 一、Object类

### 1.1 概述

* 类 `Object` 是类层次结构的根类。
* 每个类都使用 `Object` 作为超类。
* 所有对象（包括数组）都实现这个类的方法。 

### 1.2 对象创建

```java
构造方法摘要 
Object()  
```

```java
package com.qf.obj;

public class Demo01 {
	public static void main(String[] args) {
		String str = "";
		Stu stu = new Stu();
		Object obj = new Object();
	}
}


class Stu extends Object{}
```

### 1.3 getClass

* 返回运行时对象的类型

```java
package com.qf.obj;

public class Demo02 {
	public static void main(String[] args) {
		/**
			 Class<?> getClass() 
			          返回此 Object 的运行时类。 
			 String toString() 
			          返回该对象的字符串表示。 
			 int hashCode() 
			          返回该对象的哈希码值。 
		  	 boolean equals(Object obj) 
			          指示其他某个对象是否与此对象“相等”。 
			 protected  void finalize() 
			          当垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法。 
		 */
		
		// 判断一个运行时对象的类型
		String str = "";
		System.out.println(str.getClass());
		
		int[] arr = {};
		System.out.println(arr.getClass());
		
		A a = new B();
		System.out.println(a.getClass());
		System.out.println(a instanceof A);
		
	}
}

class A{}

class B extends A{}
```

### 1.4 toString

* 返回对象的字符串形式

```java
package com.qf.obj;

public class Demo03 {
	public static void main(String[] args) {
		Student s = new Student("张三	", 23, "九堡", "中国知名度很高的一个人");
		System.out.println(s);
		System.out.println(s.getClass().getName() + "@" + Integer.toHexString(s.hashCode()));
	}
}

class Student{
	String name;
	int age;
	String address;
	String info;
	
	public Student() {
		super();
	}

	public Student(String name, int age, String address, String info) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.info = info;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", info=" + info + "]";
	}
	
	/**
	 * 	返回对象的字符串形式
	 * 		建议重写此方法
	 * 		返回对象的各种属性值
	
	@Override
	public String toString() {
		return "name=" + name + ",age=" + age + "address=" + address + ",info=" + info;
	}
	*/	
}
```

### 1.5 hashCode

* 返回运行时对象的哈希码值
* 根地址和属性有关，有hash算法计算而来

```java
package com.qf.obj;

public class Demo04 {
	public static void main(String[] args) {
		// hashCode--获取对象的哈希码值
		Dog dog01 = new Dog();
		int code01 = dog01.hashCode();
		System.out.println(code01);
		
		Dog dog02 = new Dog();
		int code02 = dog02.hashCode();
		System.out.println(code02);
		
	}
}

class Dog {
	String name;
	int age;

	public Dog() {
		super();
	}

	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}

}
```

### 1.6 equals

* 比较两个对象是否相等
* 默认比较地址值
* 可以通过重写的方法自定义比较的内容

```java
package com.qf.obj;

public class Demo05 {
	public static void main(String[] args) {
		 
```

### 1.7 equals PK ==

* 相同
  * 都比较对象是否相等
* 不同
  * ==是运算符，可以比较基本类型和引用类型
  * equals是方法，只能比较引用类型
  * ==对于基本类型比较字面值，引用类型比较地址值
  * equals默认比较地址值，可以通过重写的方法自定义比较规则

### 1.8 finalize

* 当垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法。
* 子类重写 finalize 方法，以配置系统资源或执行其他清除。 

```java
package com.qf.obj;

public class Demo06 {
	public static void main(String[] args) {
		for (int i = 0; i < 1000000; i++) {
			new Fish("zhangsan" + i, 2);
		}
		System.out.println("OVER");
		
	}
}

class Fish {
	String name;
	int age;

	public Fish(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Fish [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(name + "被垃圾回收器回收啦啦啦啦");
	}

}
```

## 二、包装类

### 2.1 概述

* 基本类型对应的引用类型

### 2.2 包装类

| 基本类型 | 引用类型  |
| -------- | --------- |
| byte     | Byte      |
| short    | Short     |
| int      | Integer   |
| long     | Long      |
| float    | Float     |
| double   | Double    |
| boolean  | Boolean   |
| char     | Character |

## 三、Integer

###  3.1 概述

* `Integer` 类在对象中包装了一个基本类型 `int` 的值。
* `Integer` 类型的对象包含一个 `int` 类型的字段。
* 此外，该类提供了多个方法，能在 `int` 类型和 `String` 类型之间互相转换，
* 还提供了处理 `int` 类型时非常有用的其他一些常量和方法。 

### 3.2 创建对象

```
Integer(int value) 
          构造一个新分配的 Integer 对象，它表示指定的 int 值。 
Integer(String s) 
          构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。 
```

```java
package com.qf.pack;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 *  Integer(int value) 
			          构造一个新分配的 Integer 对象，它表示指定的 int 值。 
			Integer(String s) 
			          构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。 
		 */
		
		Integer i1 = new Integer(110);
		System.out.println(i1);
		System.out.println(i1.getClass());
		System.out.println(i1 == 110);				//true
		
		Integer i2 = new Integer("220");
		System.out.println(i2);
		System.out.println(i2.getClass());
		System.out.println(i2 == 220);				//true
		
		Integer i3 = 330;
		System.out.println(i3);
		System.out.println(i3.getClass());
		System.out.println(i3 == 330);				//true
		
		int i4 = 330;
		System.out.println(i3 == i4);				//true
		
		Integer i5 = new Integer(110);
		System.out.println(i1 == i5);				//false
		
	}
}
```

### 3.3 字段

```java
static int MAX_VALUE 
          值为 231－1 的常量，它表示 int 类型能够表示的最大值。 
static int MIN_VALUE 
          值为 －231 的常量，它表示 int 类型能够表示的最小值。 
```

### 3.4 各种类型数据的转换

```java
package com.qf.pack;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * int		===》	String
		 * String	===》	int
		 * int 		===》	Integer
		 * Integer	===》	int
		 * String	===》	Integer
		 * Integer	===>	String
		 */
		
		// int		===》	String
		int i01 = 110;
		String s01 = i01 + "";
		String s02 = Integer.toString(110);
		
		// String	===》	int
		int i02 = Integer.parseInt("220");
		System.out.println(i02);
		
		// int 		===》	Integer
		Integer i03 = new Integer(330);
		Integer i04 = Integer.valueOf(330);
		
		// Integer	===》	int
		int i004 = i04.intValue();
		System.out.println(i004);
		
		// String	===》	Integer
		Integer i05 = new Integer("550");
		Integer i005 = Integer.valueOf("5500");
		
		/**
		 * 	Integer	===>	String
		 * 	static String toBinaryString(int i) 
			          以二进制（基数 2）无符号整数形式返回一个整数参数的字符串表示形式。 
			static String toHexString(int i) 
			          以十六进制（基数 16）无符号整数形式返回一个整数参数的字符串表示形式。 
			static String toOctalString(int i) 
			          以八进制（基数 8）无符号整数形式返回一个整数参数的字符串表示形式。 
			String toString() 
			          返回一个表示该 Integer 值的 String 对象。 
		 */
		
		String s05 = i005.toString();
		System.out.println(s05);
		
		String binaryString = Integer.toBinaryString(60);
		System.out.println(binaryString);
		
	}
}
```

## 四、装箱和拆箱

### 4.1 概述

* 基本类型和引用类型之间的转换
* 装箱
  * 基本类型===》引用类型
* 拆箱
  * 引用类型===》基本类型

### 4.2 手动装箱和拆箱

* 自己调用方法在基本和引用类型之间进行转换

```
package com.qf.pack;

public class Demo03 {
	public static void main(String[] args) {
		// int	===>	Integer
		Integer i01 = new Integer(1110);
		Integer i001 = Integer.valueOf(110);
		
		// Integer	===>	int
		int i02 = i01.intValue();
	}
}
```

### 4.3 自动装箱和拆箱

* JDK1.5 之后引入了自动装箱和拆箱，不用再去调用方法转换

```java
package com.qf.pack;

public class Demo04 {
	public static void main(String[] args) {
		// 自动装箱
		Integer i01 = 1111;
		
		// 自动拆箱
		int i02 = i01;
	}
}
```

## 五、String

### 5.1 概述

* `String` 类代表字符串。
* Java 程序中的所有字符串字面值（如 `"abc"`  ）都作为此类的实例实现。  
* **字符串是常量**；它们的值在创建之后不能更改。
* 字符串缓冲区支持可变的字符串。
* 因为 String 对象是不可变的，所以可以共享。

### 5.2 字符串是不可变的

```java
package com.qf.str;

public class Demo01 {
	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(s.hashCode());		//69609650

		s = "World";
		System.out.println(s.hashCode());		//83766130
		
		Stu stu = new Stu("", 23);
		System.out.println(stu.hashCode());		//366712642
		
		stu.name = "张三";
		System.out.println(stu.hashCode());		//366712642
		
	}
}

class Stu {
	String name;
	int age;

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

### 5.3 创建对象

```java
package com.qf.str;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 *  String() 
			          初始化一个新创建的 String 对象，使其表示一个空字符序列。 
			          
			String(String original) 
			          初始化一个新创建的 String 对象，使其表示一个与参数相同的字符序列；换句话说，新创建的字符串是该参数字符串的副本。 
			          
			String(byte[] bytes) 
			          通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String。 
			String(byte[] bytes, int offset, int length) 
			          通过使用平台的默认字符集解码指定的 byte 子数组，构造一个新的 String。 
			          
			String(char[] value) 
			          分配一个新的 String，使其表示字符数组参数中当前包含的字符序列。 
			String(char[] value, int offset, int count) 
			          分配一个新的 String，它包含取自字符数组参数一个子数组的字符。 
			          
			String(int[] codePoints, int offset, int count) 
			          分配一个新的 String，它包含 Unicode 代码点数组参数一个子数组的字符。 
		 */
		
		String s01 = new String();
		System.out.println(s01);
		
		String s02 = new String("HelloWorld");
		System.out.println(s02);
		System.out.println(s02.equals("HelloWorld"));
		System.out.println(s02 == ("HelloWorld"));
		
		byte[] bytes = {65,66,67,68,69,70,71};
		String s03 = new String(bytes);
		System.out.println(s03);
		
		s03 = new String(bytes, 2, 3);
		System.out.println(s03);
		
		char[] chars = {'a','b','c','d','e','f','g'};
		String s04 = new String(chars);
		System.out.println(s04);
		s04 = new String(chars, 2, 3);
		System.out.println(s04);
		
		System.out.println('张' + 1);
		int[] arr = {24352,24353,24354,24355,24356};
		String s05 = new String(arr, 0, arr.length);
		System.out.println(s05);
	}
}
```

### 5.4 字符串常用方法--增删改

```java
package com.qf.str;

import java.util.Arrays;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 * 	增
			 String concat(String str) 
			          将指定字符串连接到此字符串的结尾。 
		 * 
		 * 	删
			 String trim() 
			          返回字符串的副本，忽略前导空白和尾部空白。 
		 * 
		 * 	改
			 String replace(char oldChar, char newChar) 
			          返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。 
			 String replace(CharSequence target, CharSequence replacement) 
			          使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。 
			 String replaceAll(String regex, String replacement) 
			          使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。 
			 String replaceFirst(String regex, String replacement) 
			          使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。 
			 String[] split(String regex) 
			          根据给定正则表达式的匹配拆分此字符串。 
			 String[] split(String regex, int limit) 
			          根据匹配给定的正则表达式来拆分此字符串。 
			 char[] toCharArray() 
			          将此字符串转换为一个新的字符数组。 
			 String toLowerCase() 
			          使用默认语言环境的规则将此 String 中的所有字符都转换为小写。 
			 String toUpperCase() 
			          使用默认语言环境的规则将此 String 中的所有字符都转换为大写。 
		 */
		
		String str = "ABCDEFG";
		// 拼接字符串,得到拼接之后的结果
		String concat = str.concat("hijklmn");
		System.out.println(concat);
		
		String str0 = "  He   llo   ";
		// 去除字符串两端的空格
		String trim = str0.trim();
		System.out.println(str0);
		System.out.println(trim);
		
		String str01 = "中国军队打了打胜仗";
		// 使用后面的替换前面的
		String replaceAll = str01.replaceAll("国军", "**");
		System.out.println(replaceAll);
		
		String str02 = "HelloWorldHello";
		String[] split = str02.split("l",2);
		System.out.println(Arrays.toString(split));
		
		char[] charArray = str02.toCharArray();
		System.out.println(Arrays.toString(charArray));
		
		// 全部字母小写
		String lowerCase = str02.toLowerCase();
		System.out.println(lowerCase);
		
		String upperCase = str02.toUpperCase();
		System.out.println(upperCase);
		
	}
}
```

### 5.5 字符串常用方法--查

```java
package com.qf.str;

import java.util.Arrays;

public class Demo05 {
	public static void main(String[] args) {
		/**
		 * 	查
		 *   char charAt(int index) 
			          返回指定索引处的 char 值。 
			 int codePointAt(int index) 
			          返回指定索引处的字符（Unicode 代码点）。 
			 int compareTo(String anotherString) 
			          按字典顺序比较两个字符串。 
			 int compareToIgnoreCase(String str) 
			          按字典顺序比较两个字符串，不考虑大小写。 
			 boolean contains(CharSequence s) 
			          当且仅当此字符串包含指定的 char 值序列时，返回 true。 
			 boolean endsWith(String suffix) 
			          测试此字符串是否以指定的后缀结束。 
			 boolean equals(Object anObject) 
			          将此字符串与指定的对象比较。 
			 boolean equalsIgnoreCase(String anotherString) 
			          将此 String 与另一个 String 比较，不考虑大小写。 
			 byte[] getBytes() 
			          使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。 
			 void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) 
			          将字符从此字符串复制到目标字符数组。 
			 int indexOf(int ch) 
			          返回指定字符在此字符串中第一次出现处的索引。 
			 int indexOf(int ch, int fromIndex) 
			          返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。 
			 String intern() 
			          返回字符串对象的规范化表示形式。 
			 int lastIndexOf(int ch) 
			          返回指定字符在此字符串中最后一次出现处的索引。 
			 int lastIndexOf(int ch, int fromIndex) 
			          返回指定字符在此字符串中最后一次出现处的索引，从指定的索引处开始进行反向搜索。 
			 int length() 
			          返回此字符串的长度。 
			 boolean startsWith(String prefix) 
			          测试此字符串是否以指定的前缀开始。 
			 boolean startsWith(String prefix, int toffset) 
			          测试此字符串从指定索引开始的子字符串是否以指定前缀开始。 
			 CharSequence subSequence(int beginIndex, int endIndex) 
			          返回一个新的字符序列，它是此序列的一个子序列。 
			 String substring(int beginIndex) 
			          返回一个新的字符串，它是此字符串的一个子字符串。 
			 String substring(int beginIndex, int endIndex) 
			          返回一个新字符串，它是此字符串的一个子字符串。 
		 * 
		 * 	其他
			static String valueOf(boolean b) 
			          返回 boolean 参数的字符串表示形式。 
			static String valueOf(char c) 
			          返回 char 参数的字符串表示形式。 
			static String valueOf(char[] data) 
			          返回 char 数组参数的字符串表示形式。 
			static String valueOf(char[] data, int offset, int count) 
			          返回 char 数组参数的特定子数组的字符串表示形式。 
			static String valueOf(double d) 
			          返回 double 参数的字符串表示形式。 
			static String valueOf(float f) 
			          返回 float 参数的字符串表示形式。 
			static String valueOf(int i) 
			          返回 int 参数的字符串表示形式。 
			static String valueOf(long l) 
			          返回 long 参数的字符串表示形式。 
			static String valueOf(Object obj) 
			          返回 Object 参数的字符串表示形式。 
		 */
		
		String s01 = "abcdefghijklmn";
		// 查指定索引位置的字符
		System.out.println(s01.charAt(6));
		// 查字符对应的Unicode编码
		System.out.println(s01.codePointAt(0));
		
		// 比较首字母的Unicode编码差值
		System.out.println("Hello".compareTo("j"));
		
		// 是否包含字符序列
		System.out.println(s01.contains("abc"));
		System.out.println(s01.contains("abd"));
		
		// 判断是否以XXX结尾
		System.out.println("勒布朗詹姆斯".endsWith("詹姆斯"));
		System.out.println("勒布朗詹姆斯".endsWith("勒布朗"));
		
		System.out.println("诸葛孔明".startsWith("诸葛"));
		
		System.out.println("Hello".equals("HELLO"));
		// 忽略大小写比较
		System.out.println("Hello".equalsIgnoreCase("HELLO"));
		
		byte[] bytes = s01.getBytes();
		System.out.println(Arrays.toString(bytes));
		System.out.println(Arrays.toString("床前明月光".getBytes()));
		
		// 从字符串取出字符放入数组
		char[] chars = new char[10];
		s01.getChars(0, 5, chars, 0);
		System.out.println(Arrays.toString(chars));
		
		System.out.println(s01.indexOf(99));
		System.out.println(s01.indexOf("c"));
		System.out.println(s01.indexOf("c",3));
		
		String intern = s01.intern();
		System.out.println(intern);
		
		// 从右侧向左侧查询
		System.out.println(s01.lastIndexOf(99));
		System.out.println(s01.lastIndexOf("c"));
		System.out.println(s01.lastIndexOf("c",0));
		
		System.out.println(s01.length());
		for (int i = 0; i < s01.length(); i++) {
			System.out.println(s01.charAt(i));
		}
		
		System.out.println(s01.substring(3));
		System.out.println(s01.substring(3,10));
		
		String valueOf = String.valueOf(true);
		System.out.println(valueOf);
		System.out.println(valueOf.getClass());
		
	}
}
```

### 5.6 字符串面试题

```java
package com.qf.str;

public class Demo06 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		
		String str3 = new String("abc");
		
		System.out.println(str1 == str2);					//true
		System.out.println(str1 == str3);					//false
		System.out.println(str1.equals(str3));				//true
		
		String str5 = "a" + "bc";
		System.out.println(str1 == str5);					//true
		
		String str6 = "ab";
		String str7 = "c";
		
		String str8 = str6 + str7;				//相当于新建一个数据，复制str6和str7
		System.out.println(str1 == str8);			---->	// false     ********
		System.out.println(str1.equals(str8));				// true
		
	}
}
```

## 六、StringBuffer

### 6.1 概述

* 线程安全的可变字符序列。
* 一个类似于 [`String`](../../java/lang/String.html) 的字符串缓冲区，虽然在任意时间点上它都包含某种特定的字符序列
* 通过某些方法调用可以改变该序列的长度和内容。 

### 6.2 创建对象（构造方法）

```java
StringBuffer() 
          构造一个其中不带字符的字符串缓冲区，其初始容量为 16 个字符。 
StringBuffer(CharSequence seq) 
          public java.lang.StringBuilder(CharSequence seq) 构造一个字符串缓冲区，它包含与指定的 CharSequence 相同的字符。 
StringBuffer(int capacity) 
          构造一个不带字符，但具有指定初始容量的字符串缓冲区。 
StringBuffer(String str) 
          构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容。 
```

```java
package com.qf.sb;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 *  StringBuffer() 
			          构造一个其中不带字符的字符串缓冲区，其初始容量为 16 个字符。 
			StringBuffer(int capacity) 
			          构造一个不带字符，但具有指定初始容量的字符串缓冲区。 
			StringBuffer(String str) 
			          构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容。 
		 */
		
		StringBuffer buffer = new StringBuffer();
		System.out.println(buffer);
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		
		StringBuffer buffer2 = new StringBuffer(32);
		System.out.println(buffer2);
		System.out.println(buffer2.length());
		System.out.println(buffer2.capacity());
		
		StringBuffer buffer3 = new StringBuffer("床前明月光");
		System.out.println(buffer3);
		System.out.println(buffer3.length());
		System.out.println(buffer3.capacity());
				
	}
}
```

### 6.3 StringBuffer是可变的

```java
package com.qf.sb;

public class Demo02 {
	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(s.hashCode());

		s = "World";
		System.out.println(s.hashCode());
		
		System.out.println("=============");
		
		Stu stu = new Stu("", 23);
		System.out.println(stu.hashCode());
		
		stu.name = "张三";
		System.out.println(stu.hashCode());
		
		System.out.println("=============");
		
		StringBuffer buffer = new StringBuffer();
		System.out.println(buffer.hashCode());
		
		buffer.append(true);
		System.out.println(buffer.hashCode());
		

	}
}

class Stu {
	String name;
	int age;

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

### 6.4 添加数据

* append
  * 从末尾追加
* insert
  * 从指定位置插入数据

```java
package com.qf.sb;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * 	增
			 StringBuffer append(char c) 
			          将 char 参数的字符串表示形式追加到此序列。 
			 StringBuffer append(char[] str) 
			          将 char 数组参数的字符串表示形式追加到此序列。 
		 */
		
		StringBuffer buffer1 = new StringBuffer();
		buffer1.append(true);
		System.out.println(buffer1);
		System.out.println(buffer1.length());
		
		buffer1.append(new char[] {'a','b','c'});
		System.out.println(buffer1);
		System.out.println(buffer1.length());
		System.out.println(buffer1.capacity());
		
		// 从指定位置插入数据
		buffer1.insert(0, false);
		System.out.println(buffer1);
		System.out.println(buffer1.length());
		System.out.println(buffer1.capacity());
		
		buffer1.append(true);
		System.out.println(buffer1.length());
		System.out.println(buffer1.capacity());
		
		System.out.println(buffer1.hashCode());
		
		buffer1.append("0");
		System.out.println(buffer1);
		System.out.println(buffer1.length());
		System.out.println(buffer1.capacity());     //添加数据时超出容量，容量变为=(原容量+1)*2
		
		System.out.println(buffer1.hashCode());
		
		/**
		buffer1.append(new Dog("道哥", 2));
		System.out.println(buffer1);
		System.out.println(buffer1.length());
		System.out.println(buffer1.capacity());
		 * 
		 */
		
	}
}

class Dog {
	String name;
	int age;

	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}

}
```

### 6.5 删除、修改、查找、其他

```java
package com.qf.sb;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 *	删
			 StringBuffer delete(int start, int end) 
			          移除此序列的子字符串中的字符。 
			 StringBuffer deleteCharAt(int index) 
			          移除此序列指定位置的 char。 
			          
		 * 	改
			 StringBuffer replace(int start, int end, String str) 
			          使用给定 String 中的字符替换此序列的子字符串中的字符。 
			 StringBuffer reverse() 
			          将此字符序列用其反转形式取代。 
			 void setCharAt(int index, char ch) 
			          将给定索引处的字符设置为 ch。 
			 void setLength(int newLength) 
			          设置字符序列的长度。 
			 void trimToSize() 
			          尝试减少用于字符序列的存储空间。 
			          
		 * 	查
			 int capacity() 
			          返回当前容量。 
			 char charAt(int index) 
			          返回此序列中指定索引处的 char 值。 
			 int codePointAt(int index) 
			          返回指定索引处的字符（统一代码点）。 
			 int indexOf(String str) 
			          返回第一次出现的指定子字符串在该字符串中的索引。 
			 int indexOf(String str, int fromIndex) 
			          从指定的索引处开始，返回第一次出现的指定子字符串在该字符串中的索引。 
			 int lastIndexOf(String str) 
			          返回最右边出现的指定子字符串在此字符串中的索引。 
			 int lastIndexOf(String str, int fromIndex) 
			          返回最后一次出现的指定子字符串在此字符串中的索引。 
			 int length() 
			          返回长度（字符数）。 
			 String substring(int start) 
			          返回一个新的 String，它包含此字符序列当前所包含的字符子序列。 
			 String substring(int start, int end) 
			          返回一个新的 String，它包含此序列当前所包含的字符子序列。 
			 
		 * 	其他
			 void ensureCapacity(int minimumCapacity) 
			          确保容量至少等于指定的最小值。 
			 String toString() 
			          返回此序列中数据的字符串表示形式。 
		 */
		
		StringBuffer buffer1 = new StringBuffer("床前明月光,疑是地上霜.");
		System.out.println(buffer1);
		
		buffer1.deleteCharAt(2);
		System.out.println(buffer1);
		
		buffer1.delete(0, 3);
		System.out.println(buffer1);
		
		StringBuffer buffer2 = new StringBuffer("abcdefghijklmn");
		buffer2.replace(0, 7, "ABCDEFG");
		System.out.println(buffer2);
		
		buffer2.reverse();
		System.out.println(buffer2);
		buffer2.reverse();
		System.out.println(buffer2);
		
		buffer2.setCharAt(buffer2.length()-1, 'N');
		System.out.println(buffer2);
		System.out.println(buffer2.capacity());
		
		buffer2.setLength(50);
		System.out.println(buffer2);
		System.out.println(buffer2.capacity());
		
		// 把容量调整的和length一致
		buffer2.trimToSize();
		System.out.println(buffer2);
		System.out.println(buffer2.capacity());
		
	}
}
```



* 