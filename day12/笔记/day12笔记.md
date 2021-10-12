# Day12笔记

## 一、instanceof

### 1.1 需求

```
* 	各种工程师
父类
	ITProgrammer
子类
    JavaProgrammer
    UiProgrammer
    DBAProgrammer
每种工程师都有自己的工作内容（至少两个方法）

在主类中添加show方法，传入ITProgrammer的子类对象，根据不同的子类调用他们的方法展示工作信息
```

### 1.2 实现

#### ITProgrammer

```java
package com.qf.demos;

/**
 * 抽象父类
 */
public abstract class ITProgrammer {
	
	public abstract void coding();
	
	public abstract void dress();
	
}
```

#### JavaProgrammer

```java
package com.qf.demos;

public class JavaProgrammer extends ITProgrammer {

	@Override
	public void coding() {
		System.out.println("我们编写服务端代码...");
	}

	@Override
	public void dress() {
		System.out.println("我们喜欢穿格子衫。。。");
	}
	
	public void liveAlone() {
		System.out.println("我们Java学科的班级号称Java武僧班...");
	}

}
```

#### UiProgrammer

```java
package com.qf.demos;

public class UiProgrammer extends ITProgrammer {

	@Override
	public void coding() {
		System.out.println("UI工程师主要负责作图...");
	}

	@Override
	public void dress() {
		System.out.println("我们喜欢打扮的花枝招展...");
	}
	
	public void shopping() {
		System.out.println("UI的工作内容稍轻松,可以逛街吃大餐...");
	}

}
```

#### DBAProgrammer

```java
package com.qf.demos;

public class DBAProgrammer extends ITProgrammer {

	@Override
	public void coding() {
		System.out.println("DBA负责数据库管理,擅长删库跑路...");
	}

	@Override
	public void dress() {
		System.out.println("喜欢黑色系衣服...");
	}

	public void putIntoPrison() {
		System.out.println("我们擅长删库跑路...");
	}
}
```

#### 测试类

```java
package com.qf.demos;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	各种工程师
			父类
				ITProgrammer
			子类
				JavaProgrammer
				UiProgrammer
				DBAProgrammer
			每种工程师都有自己的工作内容（至少两个方法）
		
			在主类中添加show方法，传入ITProgrammer的子类对象，根据不同的子类调用他们的方法展示工作信息
		 */
		
		show(new JavaProgrammer());
		
		System.out.println("============");
		
		show(new UiProgrammer());
		
		System.out.println("+=================+");
		
		show(new DBAProgrammer());
		
	}
	
	/**
	 * 展示ITProgrammer子类的方法
	 * @param programmer
	 */
	public static void show(ITProgrammer programmer) {
		if (programmer instanceof JavaProgrammer) {
			programmer.coding();
			programmer.dress();
			((JavaProgrammer) programmer).liveAlone();
		} else if (programmer instanceof UiProgrammer) {
			programmer.coding();
			programmer.dress();
			((UiProgrammer) programmer).shopping();
		} else if (programmer instanceof DBAProgrammer) {
			programmer.coding();
			programmer.dress();
			((DBAProgrammer) programmer).putIntoPrison();
		} else {
			System.err.println("传入的类型不存在...");
		}
	}
}
```

## 二、static

### 2.1 成员变量

* 定义在类中方法外
* 随着对象的创建而创建
* 每个对象都持有一份

```java
package com.qf.static0;

public class Demo01 {
	public static void main(String[] args) {
		D1 d1 = new D1();
		d1.name = "张三";
		d1.age = 23;
		d1.show();
		
		System.out.println("=====================");
		
		D1 d01 = new D1();
		d01.name = "lisisi";
		d01.age = 24;
		d01.show();
	}
}

class D1{
	/**
	 * 实例属性
	 * 	随着对象的创建而创建
	 * 	每个对象都持有一份
	 */
	String name;
	int age;
	
	public void show() {
		System.out.println("D1 [name=" + name + ", age=" + age + "]");
	}
	
}
```

### 2.2 静态变量

* 定义在类中方法外，使用static修饰
* 每个类的所有对象共同持有一份
* 如果有任何对象修改了静态变量，其他所有对象得到的都是修改之后的数据
* 静态变量推荐使用         类名.属性       直接调用

```java
package com.qf.static0;

public class Demo02 {
	public static void main(String[] args) {
		Korean k1 = new Korean();
		k1.name = "朴一万";
		k1.age = 45;
		k1.show();
		
		System.out.println("=====================");
		
		Korean k2 = new Korean();
		k2.name = "朴八千";
		k2.age = 25;
		k2.show();
		
		System.out.println("====================");
		
		// 修改成员变量--只对当前对象有影响
		k1.name = "朴百万";
		k1.show();
		
		k2.show();
		System.out.println("====================");
		
		// 修改类变量--所有此类对象都会受到影响
		Korean.capital = "首尔";
		k2.show();
		k1.show();
	}
}

class Korean{
	/**
	 * 实例属性
	 * 	实例变量
	 */
	String name;
	int age;
	/**
	 * 静态属性
	 * 	类变量
	 */
	static String capital = "汉城";
	
	public void show() {
		System.out.println("Korean [name=" + name + ", age=" + age + ", capital=" + capital + "]");
	}
	
}
```

### 2.3 统计对象创建次数

```java
package com.qf.static0;

public class Demo03 {
	public static void main(String[] args) {
		User u1 = new User();
		User u2 = new User();
		User u3 = new User();
		User u4 = new User();
		User u5 = new User("","");
	}
}

class User{
	String name;
	String uid;
	static int count = 0;
	
	public User() {
		super();
		count++;
		System.out.println("当前注册用户数量:" + count);
	}

	public User(String name, String uid) {
		super();
		this.name = name;
		this.uid = uid;
		count++;
		System.out.println("当前注册用户数量:" + count);
	}
	
	public void show() {
		System.out.println("User [name=" + name + ", uid=" + uid + "]");
	}
	
}
```

### 2.4 静态和非静态调用

* 静态只能调用静态（加载时间最早）
* 非静态可以调用静态和非静态（加载时间最早）
* 静态不能调用this和super（加载时间最早）

```java
package com.qf.static0;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 * 	System.arraycopy(src, srcPos, dest, destPos, length);
			Math.random()
			Arrays.copyOf(original, newLength)
			
			new Random().nextInt(100)
		
		
		 * 有些方法可以使用类名.方法调用
		 * 	这个方法都是用static修饰
		 * 
		 * 有些方法必须先创建对象再使用对象调用
		 */
		
	}
}

class Russians{
	String name;
	int age;
	static String capital = "莫斯科";
	
	public Russians() {
		super();
	}

	public Russians(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("俄罗斯小吃：大列巴、俄罗斯香肠、俄罗斯伏特加");
	}
	
	public void show() {
		System.out.println("Russians [name=" + name + ", age=" + age + ", capital=" + capital + "]");
		System.out.println(this);
	}
	
	public static void showStatic() {
		// 静态方法中不能调用非静态变量
		// System.out.println("Russians [name=" + name + ", age=" + age + ", capital=" + capital + "]");
		// 静态方法中不能调用非静态方法
		// show();
		// 静态方法中不能使用this--静态数据加载时间早于对象
		// System.out.println(this);
	}
}
```

### 2.5 静态和继承

* 子类能继承到父类的静态属性和静态方法
* 子类不能重写父类的静态方法
* 静态方法没有多态

```java
package com.qf.static0;

public class Demo05 {
	public static void main(String[] args) {
		Japanese j1 = new Japanese();
		System.out.println(j1.location);
		Japanese.show();
		Asian.show();
	}
}

class Asian{
	String name;
	int age;
	static String location = "北半球东半球";
	
	public void eat() {
		System.out.println("亚洲人事物以稻子和麦子为主");
	}
	
	public static void show() {
		System.out.println("亚洲人以黄种人为主,没有身高优势...");
	}
}

class Japanese extends Asian{
	
	public static void show() {
		System.out.println("日本人以黄种人为主,以前身高很低...");
	}
}
```

### 2.6 静态小结

* 修饰内容
  * 修饰属性
  * 修饰方法
  * 修饰类
  * 修饰代码块
* 修饰之后
  * 随着类的加载而加载，加载时间早于对象
  * 可以使用类名直接调用
* 调用注意
  * 静态只能调用静态
  * 不能调用非静态和this和super
* 继承
  * 可以继承静态变量、方法
  * 不能重写

## 三、代码块

### 3.1 概述

* 使用{}包裹起来的一块独立的代码，没有名字
* 该执行的时候自动运行

### 3.2 分类

* 局部代码块
* 动态代码块--构造代码块
* 静态代码块
* 同步代码块

### 3.3 局部代码块

* 定义位置
  * 方法内部
* 定义方式
  * 方法执行到此处自动执行
* 作用
  * 临时数据的处理

```java
package com.qf.block;

public class Demo01 {
	int num = 20;
	public static void main(String[] args) {
		System.out.println("HelloWorld001");
		System.out.println("HelloWorld002");
		System.out.println("HelloWorld003");
		int num = 10;
		System.out.println("num = " + num);
		
		{
			// 昙花一现
			int n = 110;
			num = 33;
			System.out.println("我是局部代码块...");
			System.out.println("n = " + n);
		}
		// System.out.println("n = " + n);
		
		System.out.println("HelloWorld004");
		System.out.println("HelloWorld005");
		System.out.println("HelloWorld006");
		
		// 局部变量
		System.out.println(num);
	}
}
```

### 3.4 构造代码块

* 定义位置
  * 类中方法外
  * 和构造器位置相同
* 执行时间
  * 创建对象的过程中
  * 早于构造器
* 作用
  * 可以把构造器中共性的内容提取出放在构造代码块中

```java
package com.qf.block;

public class Demo02 {
	public static void main(String[] args) {
		Restaurant r1 = new Restaurant();
		Restaurant r2 = new Restaurant();
		Restaurant r3 = new Restaurant();
		Restaurant r4 = new Restaurant();
		Restaurant r5 = new Restaurant();
	}
}

class Restaurant {
	String food01;
	String food02;
	String food03;
	String food04;
	String food05;
	String food06;
	// 客流量
	static int count = 0;
	
	// 构造代码块
	{
		System.out.println("food01 = " + food01);
		System.out.println("我是动态（构造）代码块");
	}

	public Restaurant() {
		super();
		System.out.println("欢迎光临红浪漫!");
		count++;
	}

	public Restaurant(String food01) {
		super();
		this.food01 = food01;
		System.out.println("欢迎光临红浪漫!");
		count++;
	}

	public Restaurant(String food01, String food02) {
		super();
		this.food01 = food01;
		this.food02 = food02;
		System.out.println("欢迎光临红浪漫!");
		count++;
	}

	public Restaurant(String food01, String food02, String food03) {
		super();
		this.food01 = food01;
		this.food02 = food02;
		this.food03 = food03;
		System.out.println("欢迎光临红浪漫!");
		count++;
	}

	public Restaurant(String food01, String food02, String food03, String food04) {
		super();
		this.food01 = food01;
		this.food02 = food02;
		this.food03 = food03;
		this.food04 = food04;
		System.out.println("欢迎光临红浪漫!");
		count++;
	}

	public Restaurant(String food01, String food02, String food03, String food04, String food05) {
		super();
		this.food01 = food01;
		this.food02 = food02;
		this.food03 = food03;
		this.food04 = food04;
		this.food05 = food05;
		System.out.println("欢迎光临红浪漫!");
		count++;
	}

	public Restaurant(String food01, String food02, String food03, String food04, String food05, String food06) {
		super();
		this.food01 = food01;
		this.food02 = food02;
		this.food03 = food03;
		this.food04 = food04;
		this.food05 = food05;
		this.food06 = food06;
		System.out.println("欢迎光临红浪漫!");
		count++;
	}

	public void sayHi() {
		System.out.println("欢迎光临红浪漫!");
	}
}
```

### 3.5 静态代码块

* 定义位置
  * 类中方法外
  * 位置和构造器一样
* 执行时间
  * 类加载的时候执行
  * 只执行一次（第一个对象实例化时执行，之后的对象实例化不执行）
  * 执行时间早于构造代码块和构造器
* 作用
  * 完成程序的初始化
  * 加载驱动
  * 初始化全局的变量

```java
package com.qf.block;

public class Demo03 {
	public static void main(String[] args) {
		Mouse m1 = new Mouse();
		Mouse m2 = new Mouse();
		Mouse m3 = new Mouse();
		Mouse m4 = new Mouse();
		Mouse m5 = new Mouse();
		
	}
}

class Mouse{
	String color;
	int price;
	static String type = "鼠标";
	
	static {
		// System.out.println(color);
		System.out.println(type);
		System.out.println("加载鼠标驱动...");
		show();
	}
	
	{
		System.out.println("我是动态代码块...,鼠标连接到电脑,正在启动程序...");
	}
	
	public Mouse() {
		super();
		System.out.println("我是构造器...");
	}

	public Mouse(String color, int price) {
		super();
		this.color = color;
		this.price = price;
	}
	
	public static void show() {}
	
}
```

### 3.6 同步代码块

* 多线程部分讲解

## 四、final

### 4.1 概述

* final修饰的内容表示最终的，不可改变的

### 4.2 final修饰的内容

* 变量
* 方法
* 类

### 4.3 final修饰变量

* 变量===》常量
* 只能赋值一次
* 局部变量
  * 使用之前必须赋值
  * 只能赋值一次
* 成员变量
  * 创建对象之前必须赋值
  * 声明的同时赋值
  * 构造代码块中赋值
  * 构造器中赋值

```java
package com.qf.final0;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 常量
		 * 	字面值常量
		 * 		1,2,3,a,b,c
		 * 
		 * 	自定义常量
		 * 		自己根据程序需要定义的不可改变的数据
		 * 		圆周率π
		 */
		final String birthday = "1990-12-30";
		System.out.println("birthday = " + birthday);
		
		// final修饰的变量只能赋值一次
		// birthday = "1995-12-31";
		
		People p = new People();
		System.out.println(p.country);
		System.out.println(p.name);
		System.out.println(p.age);
		
		
	}
}

class People{
	// final修饰的成员变量必须赋值
	
	// 声明的同时直接赋值
	final String country;
	String name = "张三";
	int age;
	static String capital;
	
	{
		// 在构造代码块中赋值
		// country = "中华人民共和国";
	}
	
	public People() {
		super();
		// 可以在构造器中赋值--所有构造器必须都有赋值的操作
		this.country = "中华人民共和国";
	}

	public People(String country, String name, int age) {
		super();
		this.country = country;
		this.name = name;
		this.age = age;
	}
	
}
```

### 4.4 final修饰方法

* 变成最终的方法
* 不可修改--不可重写

```java
package com.qf.final0;

public class Demo02 {
	public static void main(String[] args) {
		
	}
}

class Calculator{
	
	/**
	 * 加法计算
	 * @param is
	 * @return
	 */
	public final int getSum(int...is) {
		int sum = 0;
		for (int i = 0; i < is.length; i++) {
			sum += is[i];
		}
		return sum;
	}
}

class MyCalculator extends Calculator{
	@Override
	public int getSum(int... is) {
		return 333;
	}
}
```

### 4.5 final修饰类

* final修饰的类变成最终的类
* 不能被继承，没有子类

```java
package com.qf.final0;

public class Demo03 {
	public static void main(String[] args) {
		
	}
}

// class MyMath extends Math{}
```

### 4.6 静态常量

* 经常用的、不能被修改的
  * PI
  * 整数最大、小值

```java
package com.qf.final0;
/**
 * 记录常用数据的类
 * @author Dushine2008
 *
 */
public class Constant {
	/**
	 * 国家数据
	 */
	public static final String CHINA_AREA = "960万平方公里";
	
	
	/**
	 * 数据库相关数据
	 */
	public static final String URL = "10.31.153.88";
	
	/**
	 * 公司相关数据
	 */
	
}
```

### 4.7 对象常量

* 基本类型常量
  * 数据不能改
* 引用类型常量
  * 引用地址值不能改
  * 引用指向的数据是可以改的

```java
package com.qf.final0;

public class Demo05 {
	public static void main(String[] args) {
		final Stu s1 = new Stu("张三", 23, 173);
		System.out.println(s1);
		s1.show();
		
		// s1 = new Stu("李四", 24, 174);
		s1.height = 175;
		System.out.println(s1);
		s1.show();
	}
	
}

class Stu{
	String name;
	int age;
	double height;
	
	public Stu() {
		super();
	}

	public Stu(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public void show() {
		System.out.println("Stu [name=" + name + ", age=" + age + ", height=" + height + "]");
	}
}
```

