# Day 13笔记

## 一、接口

###  1.1 概述

* 使用interface声明的内容是java中的接口
* 表示一种规范

### 1.2 接口初体验

* 定义USB接口

  ```java
  package com.qf.inter;
  
  public interface USB {
  	String Voltage = "5V";
  	
  	public void power();
  	
  }
  ```

  

* USB实现类

```java
package com.qf.inter;

public class Mouse implements USB {

	@Override
	public void power() {
		System.out.println("USB接口具有供电的功能");
	}

}
```

* 测试类

```java
package com.qf.inter;

public class Demo01 {
	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		System.out.println(mouse.Voltage);
		mouse.power();
	}
}
```

### 1.3 接口中的内容

* 变量
  * 公开
  * 静态
  * 常量
* 方法
  * 公开抽象方法

```java
package com.qf.inter;

public class Demo01 {
	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		// 接口中的变量是静态的
		System.out.println(USB.Voltage);
		mouse.power();
		// final修饰的变量
		// USB.Voltage = "5.0V";
	}
}
```

### 1.4 接口的使用

#### USB接口

```
package com.qf.inter1;

/**
 * USB接口
 * @author Dushine2008
 *
 */
public interface USB {
	String USB_VOLTAGE = "5V";
	
	void usbPower();
}

```



#### SD接口

```java
package com.qf.inter1;

/**
 * SD接口
 */
public interface SD {
	void SDreadData();
	void SDwriteData();
}
```



#### RJ45接口

```java
package com.qf.inter1;

/**
 * RJ45接口
 */
public interface RJ45 {
	void surfInternet();
}
```



#### HDMI接口

```java
package com.qf.inter1;

/**
 * HDMI接口
 * @author Dushine2008
 *
 */
public interface HDMI {
	void transferAVSignal();
}
```

#### Computer类

```java
package com.qf.inter1;

public class Computer implements USB,HDMI,SD,RJ45 {

	@Override
	public void surfInternet() {
		System.out.println("我喜欢看小说、葫芦娃");
	}

	@Override
	public void SDreadData() {
		System.out.println("能读取SD卡中的数据");
	}

	@Override
	public void SDwriteData() {
		System.out.println("可以向SD卡写入数据");
	}

	@Override
	public void transferAVSignal() {
		System.out.println("可以传输视频信号");
	}

	@Override
	public void usbPower() {
		System.out.println("可以通过USB接口向外供电");
	}

}
```

#### 测试类

```java
package com.qf.inter1;

public class Demo01 {
	public static void main(String[] args) {
		Computer c = new Computer();
		c.transferAVSignal();
	}
}
```

### 1.5 接口和类之间的关系

#### 接口和接口

* 继承关系，多继承
* 使用关键字extends

#### 接口和类

* 实现关系，多实现
* 使用implements

#### 类和类

* 继承关系，单继承
* 使用关键字extends

#### 类继承和实现可以同时发生

* 类可以在继承一个类的同时实现多个接口

### 1.6 接口的多态

* 接口可以声明为引用类型，引用指向实现类对象
* 只能调用接口中声明的方法和属性，不能调用实现类独有的
* 可以转回实现类原本的类型

#### Jumpable

```java
package com.qf.inter3;

/**
 * 跳跃的能力
 */
public interface Jumpable {
	void jump();
}
```

#### Swimable

```java
package com.qf.inter3;

/**
 * 游泳的能力
 * @author Dushine2008
 *
 */
public interface Swimable {
	void swim();
}
```

#### Dog

```java
package com.qf.inter3;

/**
 * 狗子类
 */
public class Dog implements Jumpable, Swimable {

	@Override
	public void swim() {
		System.out.println("狗子天生就会游泳");
	}

	@Override
	public void jump() {
		System.out.println("狗子跳的不是太高");
	}

}
```

#### 测试类

```java
package com.qf.inter3;

public class Demo01 {
	public static void main(String[] args) {
		// 把狗子对象看成会跳的对象
		Jumpable jumpable = new Dog();
		jumpable.jump();
		
		System.out.println("===================");
		
		// 把狗子对象看成会游泳的对象
		Swimable swimable = new Dog();
		swimable.swim();

		System.out.println("===================");
		
		Dog dog01 = (Dog) jumpable;
		dog01.jump();
		dog01.swim();
		
		System.out.println("===================");
		
		Dog dog02 = (Dog) swimable;
		dog02.swim();
		dog02.jump();
	}
}
```

### 1.7 常量接口

```java
package com.qf.inter4;
/**
 * 记录常用数据的接口--常量接口
 * @author Dushine2008
 *
 */
public interface Constant {
	/**
	 * 国家数据
	 */
	public static final String CHINA_AREA = "960万平方公里";
	
	
	/**
	 * 数据库相关数据
	 */
	String URL = "10.31.153.88";
	
	/**
	 * 公司相关数据
	 */
	
}
```

```java
package com.qf.inter4;

public class Demo01 {
	public static void main(String[] args) {
		// 常量接口中的数据
		System.out.println(Constant.CHINA_AREA);
		System.out.println(Constant.URL);
	}
}	
```

### 1.8 抽象类 PK 接口

* 相同点
  * 都是在java文件中
  * 都能生成字节码文件
  * 都不能创建对象
  * 都能声明为引用类型
  * 都有Object中的方法
* 不同点
  * 抽象类中可以有普通类中的所有属性、方法、抽象方法
  * 接口中的属性是公开静态常量，方法是公开抽象方法
  * 接口中不能有构造器、构造代码块、静态代码块

### 1.9 接口回调

* A调用B，B执行一段代码之后再调用A
* 如果A实现类某一个接口，那么只要是实现这这个接口的类都能调用B

#### OnWorkFinishedListener

```java
package com.qf.inter6;

/**
 * 监听的接口
 * 	Boss可以实现这个接口
 * @author Dushine2008
 *
 */
public interface OnWorkFinishedListener {
	void workFinishListener(String info);
}
```

#### Boss

```java
package com.qf.inter6;

/**
 * 实现了OnWorkFinishedListener的Boss
 * @author Dushine2008
 *
 */
public class Boss implements OnWorkFinishedListener {
	Worker worker;

	public Boss(Worker worker) {
		super();
		this.worker = worker;
	}

	/**
	 * 给工人分配工作
	 * @param info
	 */
	public void giveWork(String info) {
		worker.work(info, this);
	}

	public void workFinishListener(String info) {
		System.out.println("接收到工人传来的信息:" + info);
	}
}
```

#### Boss2

```java
package com.qf.inter6;

/**
 * 实现了OnWorkFinishedListener的Boss2
 * @author Dushine2008
 *
 */
public class Boss2 implements OnWorkFinishedListener {
	Worker worker;

	public Boss2(Worker worker) {
		super();
		this.worker = worker;
	}

	/**
	 * 给工人分配工作
	 * @param info
	 */
	public void giveWork(String info) {
		worker.work(info, this);
	}

	public void workFinishListener(String info) {
		System.out.println("接收到工人传来的信息:" + info);
	}
}
```

#### Worker

```java
package com.qf.inter6;

/**
 * 接收Boss任务的工人
 * 	只要是实现了OnWorkFinishedListener的都能指挥工人
 * @author Dushine2008
 *
 */
public class Worker {

	public void work(String info, OnWorkFinishedListener listener) {
		System.out.println("接收到Boss分配的任务:" + info);
		
		System.out.println();
		
		// 把工作信息告诉BOSS
		listener.workFinishListener("努力工作,工作进度:30%");
		
	}
	
}
```

#### 测试类

```java
package com.qf.inter6;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * Boss分配任务：买包烟
		 * 	分配任务的方法
		 * 		giveWork(工作内容,分配任务的对象)
		 * 	任务给工人--监听工人工作进度
		 * 		workFinishedListener(String info)
		 * 
		 * Worker接收任务
		 * 	买包烟
		 * 	干活的方法--work
		 * 	买烟完成之后告诉Boss任务完成情况--调用Boss监听的方法告诉他
		 */
		
		Worker worker = new Worker();
		
		Boss boss = new Boss(worker);
		
		boss.giveWork("挖坑埋自己");
		
	}
}
```

## 二、内部类

### 2.1 概述

* 定义在类的内部的另一个完整的类称为内部类
* 能描述更多更全的信息

### 2.2 内部类分类

* 局部内部类
* 成员内部类
* 静态内部类
* 匿名内部类

```java
package com.qf.inner;

public class Demo01 {
	public static void main(String[] args) {
		
	}
}

class Computer{
	String brand;
	double price;
	
	/**
	 * 使用内部类表示的内容更多、更具体
	 */
	class GraphicsCard{
		String brand;
		double price;
		
		public void display() {
			
		}
	}	
}
```

### 2.3 局部内部类

* 定义在方法内部的类
* 可以书写普通类中的所有内容
* 创建对象需要在类声明之后
* 如果在局部内部类中访问局部变量，局部变量需要加final修饰

```java
package com.qf.inner;

public class Demo02 {
	public static void main(String[] args) {

		System.out.println("HelloWorld001");
		System.out.println("HelloWorld002");
		
		int num = 110;

		class Inner {
			String name;
			int age;

			public Inner() {
				super();
			}

			public Inner(String name, int age) {
				super();
				this.name = name;
				this.age = age;
			}

			public void show() {
				System.out.println("我是" + name + ",今年" + age);
				System.out.println("num = " + num);
			}
		}

		Inner inner = new Inner("张三", 23);
		inner.show();
		
		// num = 220;

		System.out.println("HelloWorld003");
		System.out.println("HelloWorld004");
		System.out.println("HelloWorld005");

	}
}
```

### 2.4 成员内部类

* 定义在类中方法外的内部类是成员内部类

```java
package com.qf.inner;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 *	 创建成员内部类对象的方式
		 * 		先创建外部类对象
		 * 		在创建内部类对象
		 */
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		
		System.out.println(inner.strInner);
		inner.show();
		
	}
}

class Outer{
	String strOut = "外部类变量";
	private String strOutPri = "外部类私有变量";
	static String strOutSta = "外部类静态变量";
	int num = 110;
	
	class Inner{
		String strInner = "内部类变量";
		private String strInnerPri = "内部类私有变量";
		// 成员内部类不能声明静态数据
		// static String strInnerSta = "内部类静态变量";
		int num = 220;
		
		public void show() {
			// 内部类可以访问外部类的所有属性和方法
			System.out.println(strInner);
			System.out.println(strOut);
			System.out.println(strInnerPri);
			System.out.println(strOutPri);
			System.out.println(strOutSta);
			// 调用外部类的成员变量
			System.out.println(Outer.this.num);
		}
	}
	
}
```

### 2.5 静态内部类

* 定在类中方法外的使用static修饰的类
* 可以定义静态数据
* 不能访问外部类的非静态数据
* 创建对象不依赖外部类对象
* 懒加载

```java
package com.qf.inner;

public class Demo04 {
	public static void main(String[] args) {
		// 静态内部类对象的创建不再依赖外部类对象
		System.out.println(Outer00.Inner00.strInnerSta);
		
		Outer00.Inner00 inner00 = new Outer00.Inner00();
		
	}
}


class Outer00{
	String strOut = "外部类变量";
	private String strOutPri = "外部类私有变量";
	static String strOutSta = "外部类静态变量";
	int num = 110;
	
	static class Inner00{
		String strInner = "内部类变量";
		private String strInnerPri = "内部类私有变量";
		// 静态内部类能声明静态数据
		static String strInnerSta = "内部类静态变量";
		int num = 220;
		
		public void show() {
			// 静态内部类可以访问外部类静态属性和方法
			System.out.println(strInner);
			// 静态内部类只能访问外部类的静态数据
			// System.out.println(strOut);
			System.out.println(strInnerPri);
			// System.out.println(strOutPri);
			System.out.println(strOutSta);
			// 不能调用外部类的成员变量
			// System.out.println(Outer.this.num);
		}
	}
}
```

### 2.6 匿名内部类

* 没有名字的内部类
* 定义类、实现类、创建对象、调用方法在一行搞定
* 代码减少
* 可读性贼差

```java
package com.qf.inner;

/**
 * USB 接口
 * @author Dushine2008
 *
 */
public interface USB {
	void usbPower();
}
```

```java
package com.qf.inner;

public class Demo07 {
	public static void main(String[] args) {
		new USB() {
			public void usbPower() {
				System.out.println("USB充电啦啦啦啦");
			}
		}.usbPower();
	}
}
```

