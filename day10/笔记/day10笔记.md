# Day10笔记

## 一、this关键字

### 1.1 概述

* java中的关键字
* 表示当前对象的引用

### 1.2 调用成员变量

* this.成员变量

```java
package com.qf.this0;

public class Demo01 {
	public static void main(String[] args) {
		Human h1 = new Human("孙坚", 33, "东吴");
		h1.show();
		System.out.println("h1=====" + h1);
		
		Human h2 = new Human("孙尚香", 22, "蜀国");
		h2.show();
		System.out.println("h2=====" + h2);
	}
}

class Human{
	String name;
	int age;
	String add;
	
	public Human() {}
	
	public Human(String n,int a,String add) {
		name = n;
		age = a;
		this.add = add;
	}
	
	public void show() {
		System.out.println("我是" + name + "今年" + age + "来自" + add);
		System.out.println(this);
	}
}
```

### 1.3 调用成员方法

* this.成员方法(实参）

### 1.4 调用构造方法

* this(参数)

```java
package com.qf.this0;

public class Demo02 {
	public static void main(String[] args) {
		Plane p1 = new Plane("", "", "", "");
		p1.fly();
	}
}

class Plane{
	String brand;
	String model;
	String country;
	String price;
	int speed;
	String color;
	
	public Plane() {
		System.out.println("我是没有参数的构造器");
	}
	
	public Plane(String brand,String model,String price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		System.out.println("我是三个参数的构造器");
	}
	
	public Plane(String brand,String model,String country,String price) {
		// 构造器调用必须放在第一行
		this(brand, model, price);
		this.country = country;
		System.out.println("我是四个参数的构造器");
		// 构造器中可以调用实例方法和实例变量
		fly();
	}
	
	public void fly() {
		// 构造器调用必须在构造器中
		// this(brand, model, price);
		System.out.println("飞机可以在地面和天空行驶");
		// 调用实例方法
		this.attack();
	}
	
	public void attack() {
		System.out.println("有些飞机可以在战争中使用");
	}
	
}
```

### 1.5 注意

* 构造器
  * 只能在构造器中调用构造器
  * 必须放在构造器的第一行
  * 构造器中只能调用其他的一个构造器
* 实例方法
  * 实例方法中不能调用构造器
  * 构造器中可以调用实例方法

## 二、封装

### 2.1 概述

* 属性有合法的范围
* 比如age
  * 年龄大于0&&小于135才是合法的
  * age可以赋值int范围内的任意数字
* 需要对age进行保护

### 2.2 private关键字

* 访问修饰符
* 限制访问范围
  * 只能在当前类中访问
  * 防止外部对属性进行任意修改

### 2.3 封装过程

* 私有化属性
* 提供公开的方法
  * get
  * set
* 在方法中设置访问的规则

```java
package com.qf.pri;

public class Demo02 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "王五";
		s1.setAge(255);
		// s1.age = 2555;
		s1.show();
	}
	
}

/**
 * 	私有化成员变量
 * 	提供公开的方法
 * 	在方法中设置规则
 * 		get
 * 			读取	
 * 		set
 * 			设置
 */
class Student{
	String name;
	// 私有化属性,只能在本类中使用
	private int age;
	
	public void show() {
		System.out.println("我是" + name + ",今年" + getAge());
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		// 判断age是否合法
		if (age > 0 && age < 135) {
			this.age = age;
		} else {
			this.age = -1;
			System.err.println("年龄不合法");
		}
	}
}
```

### 2.4 封装案例

```java
package com.qf.pri;

public class Demo03 {
	public static void main(String[] args) {
		Car car = new Car();
		car.brand = "长城";
		car.model = "炮";
		car.info = "在皮卡解禁的十里春风之下，引领中国皮卡乘用化时代的长城炮显得愈发耀眼";
		car.setPrice(120000);
		
		car.show();
		
		// 绕过了私有的设定规则
		car = new Car("长城", "初恋", -20000, "不得不说,长城汽车的设计师真的是“脑洞大开”,竟然能够直接给新车命名为哈弗初恋,这款车自从亮相就获得了很高的曝光度,基于全新柠檬平台打造,名字有这么“新鲜”,");
		car.show();
	}
}

class Car{
	String brand;
	String model;
	private int price;
	String info;
	
	public Car() {}
	
	public Car(String brand, String model, int price, String info) {
		super();
		this.brand = brand;
		this.model = model;
		this.setPrice(price);
		this.info = info;
	}

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		if (price >= 100000 && price < 170000) {
			this.price = price;
		}else {
			this.price = -1;
			System.err.println("价格不在合法范围");
		}
	}
	
	public void show() {
		System.out.println("这是一台" + brand + "牌的" + model + "车,价格是:" + price + "," + info); 
	}
	
}
```

## 三、继承

### 3.1 概述

* 生活中的继承
  * 后辈从前辈获取财、物、基因等
* 程序中的继承
  * 两个类使用关键字extends产生继承关系
  * 子类继承父类
  * 子类可以获取父类中的属性和方法

```java
package com.qf.extend;

public class Demo01 {
	public static void main(String[] args) {
		Lion lion = new Lion();
		
		Hippo hippo = new Hippo();
	}
}

/**
 * 	动物类
 */
class Animal{
	String type;
	String name;
	String age;
	double height;
	double length;
	double weight;
	String color;
	String gender;
	String address;
	String info;
	
	public void eat() {}
	
	public void sleep() {}
	
}

/**
 * 	狮子类
 */
class Lion{
	String type;
	String name;
	String age;
	double height;
	double length;
	double weight;
	String color;
	String gender;
	String address;
	String info;
	
	public void eat() {}
	
	public void hunt() {}
	
	public void sleep() {}
	
}

/**
 * 	蜜獾类
 */
class HoneyBadger{
	String type;
	String color;
	String name;
	String age;
	double height;
	double weight;
	double length;
	String info;
	
	public void eat() {}
	
	public void hunt() {}
	
	public void sleep() {}
	
}

/**
 * 	斑马类
 */
class Zebra{
	String type;
	String color;
	String name;
	String age;
	double height;
	double weight;
	double length;
	String info;
	
	public void eat() {}
	
	public void hunt() {}
	
	public void sleep() {}
}

/**
 * 	河马类
 */
class Hippo extends Animal{
	String BiteForce;
	
	public void hunt() {}
}
```

### 3.2 父类的选择

* 总结所有子类

  * 共同的属性
  * 共同的方法

* 直接父类

  * 和子类重复度越高越好

* 间接父类

  * 概括性最高

  

### 3.3 java继承的特点

* 子类能获取父类的属性和方法
* 子类只能有一个直接父类
* java是单继承，可以多级继承
  * B extends A
  * c extends B
  * C获取A和B中所有的属性和方法

```java
package com.qf.extend;

public class Demo02 {
	public static void main(String[] args) {
		C c = new C();
	}
}

class A{
	String nameA = "A";
	
	public void showA() {
		
	}
	
}

class B extends A{
	String nameB = "B";
	
	public void showB() {
		
	}
}

class C extends B{
	String nameC = "C";
	
	public void showC() {
		
	}
}
```

### 3.4 不可继承

* 父类的构造方法
* 父类中使用private修饰的属性和方法

```java
package com.qf.extend;

public class Demo05 {
	public static void main(String[] args) {
		S s = new S();
		System.out.println(s.name);
		System.out.println(s.age);
		// 私有的属性子类无法访问
		// System.out.println(s.secret);
		
		s.show();
		// 子类无法访问父类中私有的方法
		// s.showSecret();
		
		/**
		 * 	子类有没有继承到父类中私有的数据
		 */
	}
}

class F{
	String name = "F";
	int age = 70;
	private String secret = "我有很多小秘密";
	
	public void show() {
		System.out.println("我是F中的show方法");
	}
	
	private void showSecret() {
		System.out.println("我有很多小秘密就不告诉你");
	}
	
}

class S extends F{
	
}
```



## 四、方法重写

### 4.1 概述

* 子类中出现了和父类方法声明完全一样的方法
* 称为方法的重写--方法覆盖
* 原因
  * 继承得到的方法无法满足子类的需求

### 4.2 案例

```java
package com.qf.extend;

public class Demo03 {
	public static void main(String[] args) {
		JavaProgrammer jp = new JavaProgrammer();
		jp.work();
	}
}

class Worker{
	String name;
	int age;
	
	public void work() {
		System.out.println("每天努力工作");
	}
}

/**
 * 	子类继承Worker
 */
class JavaProgrammer extends Worker{
	/**
	 * 	覆盖继承的方法
	 * 	重写--Override
	 */
	public void work() {
		System.out.println("java程序员每天写代码、制造bug、解决bug,和产品经理展开自由搏击");
	}
}
```

```java
package com.qf.extend;

public class Demo04 {
	public static void main(String[] args) {
		Husky husky = new Husky();
		
		Hyena hyena = new Hyena();
		
		husky.eat();
		hyena.eat();
	}
}

class Dog{
	String type;
	String name;
	int age;
	
	public void eat() {
		System.out.println("狗子也要吃东西");
	}
}

/**
 * 	重写父类的方法
 */
class Husky extends Dog{
	@Override
	public void eat() {
		System.out.println("哈士奇喜欢吃饼干");
	}
}

/**
 * 	重写父类的方法
 */
class Hyena extends Dog{
	@Override
	public void eat() {
		System.out.println("鬣狗喜欢吃捕获的猎物...");
	}
}
```

### 4.3 重写注意实现

* 参数列表
  * 必须和父类中继承的方法一样
* 方法名字
  * 必须和父类一样
* 返回值
  * 必须和父类一样
* 访问修饰符
  * 可见性必须大于等于父类
  * 一般选择相同
* 总结
  * 除了方法体，其他部分都要一样

## 五、访问修饰符

### 5.1 概述

* 限制属性或者方法的可见性
* 限制访问

### 5.2 案例

	* 	private修饰的属性可见性
	* 		只有本类中可以访问
	* 	defaule修饰属性
	* 		本类中可以访问
	* 		同一个包中可以访问
	* 		不同包访问不到
	* 	protected--受保护的
	* 		本类中可以访问
	* 		同一个包中可以访问
	* 		不同包子类可以访问
	* 	public
	* 		本类中可以访问
	* 		同一个包中可以访问
	* 		不同包子类可以访问
	* 		其他位置可以访问
