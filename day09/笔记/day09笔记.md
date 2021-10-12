# Day 09笔记

## 一、面向对象

### 1.1 概述

* 面向对象
* 面向对象编程
* 对象
* 类

### 1.2 类的抽取

* 名称提炼法

* 三要素

  * 类名
  * 属性
  * 方法
  * 构造器

* ```java
  package com.qf.obj;
  
  /**
   * 	狗类
   * 		类名
   * 			Dog
   * 		属性
   * 			品种
   * 			毛色
   * 			性别
   * 			年龄
   *
   *		行为
   *			吃饭
   *			睡觉
   *			看家
   */
  public class Dog {
  	// 属性--变量
  	String type;
  	String color;
  	String gender;
  	int age;
  	
  	// 属性--方法
  	public void eat() {
  		
  	}
  	
  	public void sleep() {
  		
  	}
  	
  	public void lookHome() {
  		
  	}
  }
  ```

  

## 二、类

### 2.1 概述

* 可以把多个具有共同属性的特行为的对象抽取成一个类型
* 使用class声明

```
class 类名{
	属性01;
	属性02;
	。。。
	
	方法01
	
	方法02
}
```

## 三、对象

### 3.1 概述

* 使用类当做模板创建对象

```
类名 对象名 = new 类名();
```

### 3.2 创建对象

```java
package com.qf.obj;

public class Demo01 {
	public static void main(String[] args) {
		// 创建对象
		Dog dog = new Dog();
		// 调用dog对象的方法
		dog.eat("骨头和肉");
		
		String type = dog.type;
		System.out.println(type);
		
		dog.type = "中华田园犬";
		System.out.println(dog.type);
	}
}
```

### 3.3 访问属性

* 对象创建之后，对象中存储了类中声明的属性
* 访问属性
  * 对象.属性
* 修改属性
  * 对象.属性 = 数据

### 3.4 调用方法

* 对象创建之后可以调用类中声明的方法
* 对象.方法(参数列表)

### 3.5 创建car类和对象

* Car类

```java
package com.qf.obj;

/**
 * 	类名
 *		Car
 *	属性
 *		brand
 *		color		
 *		model
 *		price
 *	方法
 *		start
 *		stop
 *		run
 */
public class Car {
	// 属性
	String brand;
	String color;
	String model;	// 型号
	int price;
	
	// 方法
	public void start(String func) {
		System.out.println("这个车子启动的方式是：" + func);
	}
	
	public void stop(String func) {
		System.out.println("我们家车子刹车的方式是：" + func);
	}
	
	public void run(int speed) {
		System.out.println("车子最高时速能达到:" + speed);
	}
	
	public void show() {
		System.out.println("Car [brand=" + brand + ", color=" + color + ", model=" + model + ", price=" + price + "]");
	}
	
}
```

* 创建对象

```java
package com.qf.obj;

public class Demo02 {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.brand = "BYD";
		car.model = "汉";
		car.price = 25;
		car.color = "红色";
		
		car.show();
		
		car.start("电启动");
		car.stop("电刹");
		
		car.run(220);
		
	}
}
```

### 3.6 创建多个对象

* Student

```
package com.qf.obj;

public class Student {
	// 属性
	String name;
	String gender;
	int age;
	int score;
	
	// 方法
	public void sayHi() {
		System.out.println("我是:" + name + ",今年：" + age + "性别是:" + gender + "，考试得分:" + score); 
	}
}
```

* 创建对象

```java
package com.qf.obj;

public class Demo04 {
	public static void main(String[] args) {
		// 创建对象s1
		Student s1 = new Student();
		s1.name = "李逵";
		s1.gender = "男";
		s1.age = 15;
		s1.score = 88;
		s1.sayHi();
		
		// 创建对象s2
		Student s2 = new Student();
		s2.name = "李鬼";
		s2.gender = "男";
		s2.age = 14;
		s2.score = 87;
		s2.sayHi();
		
	}
}
```

## 四、局部和成员

### 4.1 局部变量和成员变量

|          | 局部变量           | 成员（实例）变量 |
| -------- | ------------------ | ---------------- |
| 定义位置 | 方法声明或者方法体 | 类中方法外       |
| 适用范围 | 声明到方法结束     | 整个类           |
| 默认值   | 无                 | 有               |
| 运行位置 | 栈                 | 堆               |
| 生命周期 | 声明到方法结束     | 和对象一样       |
| 重名情况 | 局部变量优先       | 就近原则         |

### 4.2 成员变量的名字

* 属性
* 成员变量
* 实例变量

### 4.3 实例方法

* 定义在类中的方法成为实例方法
  * 没有static修饰

* 和以前方法的定义方法完全相同
* 方法的声明
  * public void show(String info)
* 方法的实现
  * {...............}

```java
package com.qf.obj;

public class Demo05 {
	static int num = 110;
	public static void main(String[] args) {
		/**
		 * 	局部变量
		 * 		定义在方法中,或者方法声明上
		 * 		使用之前必须赋值
		 * 		运行在栈中
		 * 		声明周期<=方法
		 */
		// int num = 10;
		System.out.println(num);
	}
	
	// 类方法
	public static void show() {
		int num = 0;
		System.out.println(num);
	}
	
	// 实例方法
	public void show00() {}
}
```

### 4.4 计算器案例

```java
package com.qf.obj;

public class Demo06 {
	public static void main(String[] args) {
		// 创建计算器对象
		Calculator cal = new Calculator();
		// 调用加法,获取计算结果
		int sum = cal.getSum(33,55,77,88,99);
		System.out.println(sum);
		
		// 调用乘法
		int mul = cal.getMul(2,3,5,8,9);
		System.out.println(mul);
		
	}
}

/**
 * 	计算器类
 */
class Calculator{
	// 常量PI圆周率
	public final double PI = 3.141592653589793;
	
	/**
	 *	 计算任意个数整数相加的结果
	 * @param is
	 * @return
	 */
	public int getSum(int...is) {
		int sum = 0;
		for (int i = 0; i < is.length; i++) {
			sum += is[i];
		}
		return sum;
	}
	
	/**
	 * 	计算任意个数字相乘的结果
	 * @param is
	 * @return
	 */
	public int getMul(int...is) {
		int mul = 1;
		for (int i = 0; i < is.length; i++) {
			mul *= is[i];
		}
		return mul;
	}
}
```

## 五、构造器

### 5.1 概述

* 完成对象的初始化
* 是一个特殊的方法

### 5.2 语法

```
修饰符 类名(参数列表){
	方法体
}
```

### 5.3 案例

```java
package com.qf.obj;

public class Demo07 {
	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.show();
		
		Tiger tiger2 = new Tiger();
		tiger2.show();
		
		Tiger tiger3 = new Tiger("华南虎", 2, "毛子哥");
		tiger3.show();
		
	}
}

class Tiger{
	String type;
	String name;
	int age;
	double weight;
	double length;
	String color;
	
	/**
	 * 	创建对象过程中调用的方法
	 * 	完成对象的初始化
	 * 	构造方法
	 * 	构造器
	 */
	public Tiger() {
		System.out.println("干什么用的方法????");
	}
	
	public Tiger(String t,int a,String n) {
		type = t;
		age = a;
		name = n;
	}
	
	public void show() {
		System.out.println("Tiger [type=" + type + ", name=" + name + ", age=" + age + ", weight=" + weight + ", length=" + length
				+ ", color=" + color + "]");
	}
	
}
```

### 5.4 构造器特点

* 方法名和类名完全相同
* 没有返回值和返回值类型
* 自动调用
* 默认送一个无参数的构造器
  * 如果自己在类中定义了任意构造器，将不再赠送

```java
package com.qf.obj;

public class Demo08 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.show();
	}
}

class Cat{
	String type;
	String name;
	int age;
	
	public Cat() {}
	
	public Cat(String t,String n,int a) {
		type = t;
		name = n;
		age = a;
	}
	
	public void show() {
		System.out.println("Cat [type=" + type + ", name=" + name + ", age=" + age + "]");
	}	
}
```

