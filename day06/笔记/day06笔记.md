# Day06笔记

## 一、循环嵌套

### 1.1 概述

* 循环中的循环体是一个独立的循环

### 1.2 打印图形

```java
package com.qf.loop;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * * * * * * * * * * 
		 * * * * * * * * * * 
		 * * * * * * * * * * 
		 * * * * * * * * * * 
		 * * * * * * * * * * 
		 * * * * * * * * * * 
		 * * * * * * * * * * 
		 * * * * * * * * * * 
		 * * * * * * * * * * 
		 */
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		/**
		 * 
		 * * 
		 * * * 
		 * * * * 
		 * * * * * 
		 * * * * * *
		 * * * * * * * 
		 * * * * * * * *
		 * * * * * * * * *
		 * 
		 * 	行数	i	j
		 * 	1	0	0
		 * 	2	1	1
		 * 	3	2	2
		 */
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("===============");
		
		/**
		 * * * * * * * * * 
		 * * * * * * * * 
		 * * * * * * * 
		 * * * * * * 
		 * * * * * 
		 * * * * 
		 * * * 
		 * *
		 * 
		 * 
		 * 	行	i	j
		 * 	1	0	8	j=8-i
		 * 	2	1	7
		 * 	3	2	6
		 * 
		 */
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
```

### 1.3 打印乘法表

```java
package com.qf.loop;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 * 
		 * * 
		 * * * 
		 * * * * 
		 * * * * * 
		 * * * * * *
		 * * * * * * * 
		 * * * * * * * *
		 * * * * * * * * *
		 */
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
}
```

### 1.4 百鸡问题

```java
package com.qf.loop;

public class Demo06 {
	public static void main(String[] args) {
		/**
		 * 	鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。
		 * 	百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
		 */
		
		for (int g = 1; g < 20; g++) {
			for (int m = 1; m < 33 ; m++) {
				for (int x = 3; x < 100; x+=3) {
					// 鸡的数量==100 && 钱的花费==100
					if ((g+m+x==100) && (g*5+m*3+x/3==100)) {
						System.out.println("公鸡:" + g + ",母鸡:" + m + ",小鸡:" + x); 
					}
				}
			}
		}
		// 今有雉兔同笼，上有三十五头，下有九十四足，问雉兔各几何？
	}
}
```

## 二、函数

### 2.1 概述

* 实现特定功能的一个代码块
* 可以重复使用

	### 2.2 语法

```
public static void main(){
	System.out.println("HelloWorld");
}

* public 
	访问权限修饰符，规定了能访问的范围，固定写法
* static
	静态的，不创建对象也能调用
* void
	方法运行的返回值，根据结果的类型定义
* main
	方法名，符合标识符命名规则
* ()
	参数列表，方法运行需要操作的数据
* {}
	方法体，方法真正实现的功能代码
```

```java
package com.qf.func;

public class Demo02 {
	public static void main(String[] args) {
		System.out.println("床前明月光");
		printFo();
		
		System.out.println("疑是地上霜");
		printFo();
		
		System.out.println("举头望明月");
		printFo();
		
		System.out.println("低头思故乡");
		printFo();
	}
	
	public static void printFo() {
		System.out.println(" ......................阿弥陀佛......................\n"+
                "                       _oo0oo_                      \n"+
                "                      o8888888o                     \n"+
                "                      88\" . \"88                     \n"+
                "                      (| -_- |)                     \n"+
                "                      0\\  =  /0                     \n"+
                "                   ___/‘---’\\___                   \n"+
                "                  .' \\|       |/ '.                 \n"+
                "                 / \\\\|||  :  |||// \\                \n"+
                "                / _||||| -卍-|||||_ \\               \n"+
                "               |   | \\\\\\  -  /// |   |              \n"+
                "               | \\_|  ''\\---/''  |_/ |              \n"+
                "               \\  .-\\__  '-'  ___/-. /              \n"+
                "             ___'. .'  /--.--\\  '. .'___            \n"+
                "         .\"\" ‘<  ‘.___\\_<|>_/___.’>’ \"\".          \n"+
                "       | | :  ‘- \\‘.;‘\\ _ /’;.’/ - ’ : | |        \n"+
                "         \\  \\ ‘_.   \\_ __\\ /__ _/   .-’ /  /        \n"+
                "    =====‘-.____‘.___ \\_____/___.-’___.-’=====     \n"+
                "                       ‘=---=’                      \n"+
                "                                                    \n"+
                "....................佛祖保佑 ,永无BUG...................");
	}	
}
```

### 2.3 函数定义的位置

* 每个方法都是类的组成部分
* 每个方法相对其他方法都是独立存在的
* 定义的位置
  * 类中
  * 方法外

### 2.4 函数的调用

* 通过方法的名字调用
* 执行顺序
  * 被调用的方法先执行
  * 执行结束后，返回到方法处，从此处继续向下执行

```java
package com.qf.func;

public class Demo04 {
	public static void main(String[] args) {
		System.out.println("main方法开始...");
		/**
		 * 	被调用的方法会比所在的方法先执行结束
		 * 	被调用的方法执行结束后从方法的位置继续向下执行
		 */
		show();
		
		System.out.println("main方法jieshu...");
	}
	
	public static void show() {
		System.out.println("\tshow方法开始...");
		
		System.out.println("\t\tshow中输出HelloWorld...........");
		
		System.out.println("\tshow方法结束...");
	}
	
}
```

### 2.5 参数

* 调用函数，很多时候需要一些数据的操作，需要我们传入一些数据进行运算
* 调用函数时候传入的数据称为参数
  * 形式参数
    * 方法中声明的参数
    * 变量的声明
  * 实际参数
    * 调用方法传入的数据
    * 具体的数据

```java
package com.qf.func;

public class Demo05 {
	public static void main(String[] args) {
		notice();
		login(123321, 110033);
	}
	
	public static void notice() {
		System.out.println("谨防诈骗...");
	}
	
	/**
	 *	登录的方法，必须传入用户名和密码--填空题的两个空，必须按照规定的数据类型填写
	 * @param username	用户名
	 * @param password	密码
	 */
	public static void login(int username,int password) {
		// 验证密码
		if ((username == 123321) && (password == 112233)) {
			System.out.println("登录成功");
		}else {
			System.out.println("密码错误");
		}
	}
}
```

### 2.6 方法的调用和参数

```java
package com.qf.func;

public class Demo06 {
	public static void main(String[] args) {
		getDouble(55);
		
		getSum(33, 55);
		
		show("张三", 23);
		
		// 传入参数的时候注意参数的顺序
		show("lisisi", 24);
	}
	
	/**
	 * 	获取数字的平方
	 * @param a
	 */
	public static void getDouble(int a) {
		System.out.println("a的平方是:"+a*a);
	}
	
	/**
	 * 	两个数据相加的结果
	 * @param a
	 * @param b
	 */
	public static void getSum(int a,int b) {
		System.out.println("a和b的和是:" + (a+b));
	}
	
	public static void show(String name,int age) {
		System.out.println("我是:" + name + ",今年:" + age);
	}
	
}
```

### 2.7 返回值

* 方法被调用之后，在执行结束的时候可能会产生一个结果
* 结果称为方法的返回值

```
public static 返回值类型 方法名(参数列表){
	方法体
	return value；
}
```

* value的数据类型需要和声明的返回值类型相同

* 调用
  * 数据类型 变量名 = 方法();

```java
package com.qf.func;

public class Demo08 {
	public static void main(String[] args) {
		int num;
		num = getSquare(5);
		System.out.println(num);
		
		int n = getSquare(6);
		System.out.println(n);
		
		System.out.println(getSquare(7));
		
		double d = getSquare(8);
		System.out.println(d);
	}
	
	/**
	 * 	计算数字的平方
	 * @param i	传入的数字
	 * @return	计算得到的结果
	 */
	public static int getSquare(int i) {
		return i*i;
	}
	
}
```

### 2.8 return关键字

* 方法运行结束，返回结果
* 一个方法中能有多个return语句吗？
  * 不能
  * 方法遇到return会马上结束，return后面的代码没有机会执行
* 如果方法中的返回值在分支语句中
  * 要保证每一个分支中都有返回值
  * 保证方法一定有返回值

* return的用法
  * 结束函数，返回结果
    * 方法的返回值类型不是void，return value
  * 结束函数
    * 方法的返回值类型是void，结束函数

```java
package com.qf.func;

public class Demo11 {
	public static void main(String[] args) {
		printShape();
		
		getNum();
		
	}
	
	/**
	 * return在方法结束的时候添加
	 */
	public static void printShape() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// 如果方法的返回值是void,方法结束的时候可以使用return,return后面不能加数据
		return;
	}
	
	// 问：1至1000之间有没有满足“用3除余2 && 用5除余3 && 用7除余2”的数
	public static void getNum() {
		for (int i = 1; i < 1000; i++) {
			if ((i%3==2) && (i%5==3) && (i%7==2)) {
				System.out.println(i);
				// 直接结束方法
				return;
			}
		}
	}
}
```

### 2.9 方法的分类

```java
package com.qf.func;

public class Demo12 {
	public static void main(String[] args) {
		/**
		 * 	根据参数列表和返回值
		 * 		无参数，无返回值
		 * 		无参数，有返回值
		 * 		
		 * 		有参数，无返回值
		 * 		有参数，有返回值
		 */
	}
	
	
	/**
	 * 	提示的作用
	 * 		方法体内容固定
	 * 		不要得到任何结果
	 */
	public static void notice() {
		System.out.println("请站稳扶好,注意脚下安全");
	}
	
	
	/**
	 * 	查询一些数据
	 * 		需要返回查询的结果
	 * @return
	 */
	public static String getInfo() {
		return "CPU:I5 9300H 内存:32GB 硬盘:128GB+1T";
	}
	
	/**
	 * 	传入参数，运行数据
	 * @param name
	 * @param age
	 * @param addr
	 */
	public static void show(String name,int age,String addr) {
		System.out.println("我是：" + name + ",今年" + age + ",来自:" + addr);
	}
	
	/**
	 * 	计算num的阶乘
	 * @param num
	 * @return
	 */
	public static int getMul(int num) {
		int mul = 1;
		for (int i = 1; i < num; i++) {
			mul *= i;
		}
		return mul;
	}
	
}
```

### 2.10 方法的多级调用

* 最后被调用的方法最早执行结束
* 最早被调用的方法最晚执行结束
* 就像向单夹中压子弹一样
  * 晚进去的先出去
  * 先进去的晚出去

```java
package com.qf.func;

public class Demo13 {
	public static void main(String[] args) {
		System.out.println("main方法开始....");
		show01();
		System.out.println("main方法jieshu...");
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
		System.out.println("HelloWorld!!!");
		System.out.println("show03结束...");
		
	}
}
```

### 2.11 无穷递归

* 方法中调用方法自己，会一直调用下去，知道内存溢出

```java
package com.qf.func;

public class Demo14 {
	static int count = 0;
	public static void main(String[] args) {
		System.out.println("main方法开始...");
		show();
		System.out.println("main方法jieshu...");
	}

	public static void show() {
		System.out.println("show方法开始...");
		System.out.println(++count);
		// 给一个适当出口
		if (count == 1000) {
			return;
		}
		show();
		System.out.println("show方法jieshu...");
	}
}
```

* 递归可以实现循环的操作

### 2.12 使用递归实现阶乘（熟悉）

```java
package com.qf.func;

public class Demo15 {
	public static void main(String[] args) {
		/**
		 * 	5!
		 * 		5*4*3*2*1
		 * 	5!= 5 * 4!
		 * 	= 5 * 4 * 3!
		 * 	= 5 * 4 * 3 * 2!
		 * 	= 5 * 4 * 3 * 2 * 1!
		 * 
		 * getMul(5)==
		 * 5*getMul(4);
		 * 5*4*getMul(3);
		 * 5*4*3*getMul(2);
		 * 5*4*3*2*getMul(1);
		 * 5*4*3*2*1*getMul(0);	X
		 */
		
		int mul = getMul(10);
		System.out.println(mul);
		
	}

	/**
	 *	 计算阶乘的方法
	 * @param num
	 * @return
	 */
	public static int getMul(int num) {
		if (num == 1) {
			return 1;
		}else {
			return num * getMul(num-1);
		}
	}
}
```

