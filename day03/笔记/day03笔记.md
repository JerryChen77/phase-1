# Day 03笔记

## 一、标识符

### 1.1 概述

* java中的标识符是给类、方法、变量等命名的一个字符序列

### 1.2 组成

* 字母
* 数字
* 下划线_
* 美元符$

### 1.3 命名规则

* 不能以数字开头

* 见明知义

* 类名

  * 所有单词首字母大写
  * HelloWorld

* 方法名、变量名

  * 第一个单词首字母小写，其余单词首字母大写

* 常量

  * 只能赋值一次的变量
  * URL
  * LOCALHOST
  * USER_INFO
  * 所有字母大写，多个单词使用下划线连接

* 包名

  * com.qf.项目名.模块名

  

## 二、变量

### 2.1 概述

* 内存中的一片空间，用来存储数据

```java
class Demo01 {
	public static void main(String[] args) {
		/*
			房间类型 房间号码 = 人;
			数据类型 变量名字 = 值;
			int age = 18;
			String name = "张三";

		*/

		String name = "张三";

		System.out.println(name);
		System.out.println("张三");
	
		int age = 18.5;	// 错误的代码
		System.out.println(age);
	}
}
```



### 2.2 变量的创建

* 先声明，后赋值
* 声明的同时赋值
* 一次声明多个变量，再分别赋值
* 一次声明多个变量的同时赋值

```java
class Demo02{
	public static void main(String[] args) {
		// 1、先声明,再赋值
		int result;
		result = 10;
		result = 20;
		System.out.println(result);

		///2、声明的同时赋值
		String info = "静夜思--唐李白--床前明月光，疑是地上霜。";
		System.out.println(info);

		// 同一个方法中不能出现两个名字完全相同的变量
		String Info = "静夜思--唐李白--举头望明月，低头思故乡。";
		System.out.println(Info);

		// 3、一次声明多个变量--类型相同
		int a,b,c;
		a = 20;
		b = 50;
		System.out.println(a);
		System.out.println(b);
		// 方法中的变量使用之前必须赋值
		c = 80;
		System.out.println(c);

		// 4、一次声明多个变量并赋值
		int x,y=15,z=20;
		// System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		String 名字 = "张三";
		System.out.println(名字);
	}
}
```

### 2.3 字符串拼接变量

* 字符串可以和任意数据拼接

```
class Demo03 {
	public static void main(String[] args) {
		String name = "张三";
		int age = 23;
		String msg = "法外狂徒";
		System.out.println("姓名:" + name);
		System.out.println("年龄:" + age);
		System.out.println("备注:" + msg);
		
		System.out.println("========================");

		System.out.print("姓名:" + name);
		System.out.print("，年龄:" + age);
		System.out.println("，备注:" + msg);

		System.out.println("========================");

		// 字符串拼接变量--最终都变成字符串--夹饼--大饼夹一切
		System.out.print("姓名:" + name + "，年龄:" + age + "，备注:" + msg);
		
	}
}
```

## 三、数据类型

### 3.1 概述

* java是一门强类型语言，每一个数据都有自己的类型

### 3.2 分类

* 基本数据类型
  * 整数
  * 小数
  * 布尔
  * 字符
* 引用数据类型
  * 除了基本类型，全是引用类型
  * 数组
  * 对象
  * ... ...

### 3.3 整数

| 类型  | 名称   | 范围                     | 备注           | 大小  |
| ----- | ------ | ------------------------ | -------------- | ----- |
| byte  | 字节   | -128----127              | -2^7--2^7-1    | 1字节 |
| short | 短整型 | -32768---32767           | -2^15--2^15-1  | 2字节 |
| int   | 整型   | -2147483648---2147483647 | -2^31--2^31-1  | 4字节 |
| long  | 长整型 |                          | -2^63---2^63-1 | 8字节 |

```java
class Demo04 {
	public static void main(String[] args) {
		byte b = 110;
		System.out.println("byte b = " + b);

		short s = 32767;
		System.out.println("short s = " + s);

		int i = 2147483647;
		System.out.println("int i = " + i);

		// java中整数默认的类型是int,在给long类型数据赋值的时候如果数据超出了int的范围，需要加上L
		long l = 21474836470L;
		System.out.println("long l = " + l);
	}
}
```

* java中整数默认的类型是int,在给long类型数据赋值的时候如果数据超出了int的范围，需要加上L

### 3.4 小数

| 类型   | 名称       | 大小  | 范围 |
| ------ | ---------- | ----- | ---- |
| float  | 单精度小数 | 4字节 |      |
| double | 双精度小数 | 8字节 |      |

```java
class Demo05 {
	public static void main(String[] args) {
		double d = 3.141592653589793;
		System.out.println("double d = " + d);

		// 小数类型默认是double,如果使用float需要在数据后面加上f
		float f = 3.1415926F;
		System.out.println("float f = " + f);
	}
}
```

* 小数类型默认是double,如果使用float需要在数据后面加上f

### 3.5 布尔型

* 逻辑判断

| 类型    | 名称   | 大小  | 范围       |
| ------- | ------ | ----- | ---------- |
| boolean | 布尔型 | 1字节 | true/false |

```java
class Demo06 {
	public static void main(String[] args) {
		boolean b = true;
		System.out.println("boolean b = " + b);

		b = false;
		System.out.println("boolean b = " + b);

		// b = "true";
		System.out.println("boolean b = " + b);

		/*
			if
			for
			while
			。。。
		*/
	}
}
```

### 3.6 字符型

* 单个字符，使用单引号包裹'字'

| 类型 | 名称   | 大小  | 范围     |
| ---- | ------ | ----- | -------- |
| char | 字符型 | 2字节 | 0--65535 |

* 赋值方式

  * 直接赋值字符
    * 'a'
    * '6'
    * '张'
  * 赋值0--65535
    * 显示对应的Unicode编码集中的数据
  * 4个十六进制位
    * 转换成0--65535之间的数字

  ```java
  class Demo07 {
  	public static void main(String[] args) {
  		char c = 'a';
  		System.out.println("char c = " + c);
  
  		char c1 = '6';
  		System.out.println("char c1 = " + c1);
  
  		char c2 = '（';
  		System.out.println("char c2 = " + c2);
  
  		char c3 = ' ';
  		System.out.println("char c3 = " + c3);
  
  		char c4 = '张';
  		System.out.println("char c4 = " + c4);
  
  		char c5 = 65;
  		System.out.println("char c5 = " + c5);
  
  		char c6 = 24352;
  		System.out.println("char c6 = " + c6);
  		
  		char c7 = '\u5B45';
  		System.out.println("char c7 = " + c7);
  
  		System.out.println('张' + 1);
  		System.out.println((int)'张');
  		
  	}
  }
  ```

  

### 3.7 转义字符

* 转变字符原本的作用

```
\'
\"
\\
\t
\n
```

```java
class Demo08 {
	public static void main(String[] args) {
		char c = '\'';
		System.out.println("char c = " + c);

		System.out.println("HelloWorld");
		System.out.println("Hello\tWorld");
		System.out.println("Hello\nWorld");
		System.out.println("Hello\"World");
		System.out.println("Hello\\World");
	}
}
```

## 四、数据类型转换

### 4.1 概述

* 兼容的数据类型之间是可以进行转换的
* 自动转换
* 强制转换

### 4.2 自动转换

* 类型兼容
* 范围小的转换成范围大的
  * byte==》int
  * int===》long
  * int===》float

### 4.3 强制转换

* 类型兼容
* 范围大的转换成范围小的
  * 数据精度会有损失
  * 小数转换成整数：损失小数部分
  * int===》byte：只保留byte范围内的数据

```java
class Demo09 {
	public static void main(String[] args) {
		byte b = 110;	// b的类型是byte，空间是1字节
		int i = b;		// 把b放入i的空间，把1字节的内容放入4字节，安全
		System.out.println("int i = " + i);

		float f = i;	// 浮点型表示的数据要多于int
		System.out.println("float f = " + f);

		int j = (int)f;		// 小数取整会舍弃小数部分,会有数据损失
		// 指鹿为马
		System.out.println("int j = " + j);

		int x = 1234;
		byte b00 = (byte)x;
		System.out.println("byte b00 = " + b00);
	}
}
```

## 五、关键字

* key-word

* 生活中的关键字
  * 被赋予了特殊含义
* 程序中的关键字
  * 被一门编程语言赋予了特殊含义
  * class
  * public
  * static
  * void
  * byte

* java中有53个关键字
* 还有一些保留字
  * 还不是关键字，以后有可能升级为关键字

```java
class Demo10 {
	public static void main(String[] args) {
		int class0 = 110;
		System.out.println("int int = " + class0);
	}
}
```

## 六、运算符

### 6.1 概述

* 参与运算的符号

### 6.2 分类

* 算术运算符
* 赋值运算符
* 关系运算符
* 逻辑运算符
* 三元运算符
* 位运算符

### 6.3 算术运算符

```
+
	两个数据相加
-
	两个数据的差值
*
	两个数据的乘积
/
	两个数据的商
%
	两个数据整除之后的余数
++
	自增一个数字
--
	自减一个数字
```

```java
class Demo12 {
	public static void main(String[] args) {
		int a = 15;
		int b = 10;
		System.out.println("a + b = " + a + b);
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));	// 结果是整数
		System.out.println("a % b = " + (a % b));	// 取整数之后的余数
		System.out.println(10.0 / 3);

		/**
			++
			--
		*/
		a++;
		System.out.println("a = " + a);

		a++;
		System.out.println("a = " + a);

		a++;
		System.out.println("a = " + a);

		a++;
		System.out.println("a = " + a);

		a++;
		System.out.println("a = " + a);

		int i = b++;

		/*
			i = b
			b = b + 1
		*/

		System.out.println("b = " + b);
		System.out.println("i = " + i);

		a = 20;
		int j = ++a;
		/*
			a = a + 1
			j = a
		*/
		System.out.println("a = " + a);
		System.out.println("j = " + j);

		/*
			统计体重

			统计之前
				80KG


			时间：
				18:00
					先吃饭，再记录体重	81KG	++在前
					先记录体重，再吃饭	80KG	++在后
			
			晚上
				19:00
				81KG
		*/
	}
}
```

### 6.4 赋值运算符

* 把运算符右侧的数据赋值给左侧

```
=
+=
-=
*=
/=
%=
```

```java
class Demo13 {
	public static void main(String[] args) {
		int a = 10;
		int b = 15;

		a += b;	// a = a + b
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a -= b;	// a = a - b
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a *= b;	// a = a * b
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a /= b;	// a = a / b
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a %= b;	// a = a % b
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
```

### 6.5 关系运算符

* 比较运算符两侧的关系是否成立
* 返回的结果是true或者false--boolean类型的结果

```
>
>=
<
<=
==
!=
```

```java
class Demo14 {
	public static void main(String[] args) {
		int a = 33;
		int b = 55;
		String c = "33";
		System.out.println("a > b ? " + (a > b));
		System.out.println("a >= b ? " + (a >= b));

		System.out.println("a < b ? " + (a < b));
		System.out.println("a <= b ? " + (a <= b));

		System.out.println("a == b ? " + (a == b));
		System.out.println("a != b ? " + (a != b));

		// 不可比较的类型:
		// System.out.println("a == c ? " + (a == c));
	}
}
```

### 6.6 逻辑运算符

* 判断逻辑是否成立
* true或者false
* 逻辑运算符两侧的数据应为布尔值或者布尔表达式

```
&&
||
!
```

