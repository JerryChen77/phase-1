# Day 05笔记

## 一、开发工具

### 1.1 概述

* 好的开发工具
  * 功能强大
  * 学习简单
  * 最好免费...

### 1.2 工具选择--IDE

* EditPlus
* Eclipse
  * 2--5周
* IDEA
  * 6--

### 1.3 下载和安装

* 下载
  * https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2021-03/R/eclipse-jee-2021-03-R-win32-x86_64.zip
* 安装
  * 绿色版，解压后可以直接运行

## 二、循环--while

### 2.1 概述

* 满足一定条件，重复执行一段代码

### 2.2 语法

```
初始化语句
while(条件){
	循环体
	控制条件
}
后续代码块

第一轮：
	初始化语句====》条件--true===》循环体====》控制条件
第二轮：
	条件===》true====》循环体====》控制
... ...
	条件===》false===》循环结束===》后续代码块
```

```java
package com.qf.loop;

/**
 * @author Dushine2008
 *
 */
public class Demo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 	初始化语句
		 * while(条件){
		 * 	条件成立执行
		 * 
		 * 	条件控制
		 * }
		 * 
		 * 
		 * int count = 0;
		 * while(count <= 25){
		 * 	跑一圈
		 * 	count++;
		 * }
		 * 
		 */
		
		int count = 0;
		while (count <= 25) {
			System.out.println("跑"+count+"圈");
			count++;
		}
		
		System.out.println("OVER");
		
	}
}
```

### 2.3 输出数字

```java
package com.qf.loop;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 *	1、 输出1--100之间的整数
		 *	2、输出1--100之间的偶数
		 */
		// 从1开始
		int i = 1;
		while (i <= 100) {	// 如果小于等于100就继续输出
			System.out.println(i);
			
			// 每输出一次,数字加1
			i++;
		}
		
		System.out.println("================");
		
		int j = 1;
		while (j <= 100) {
			// 如果j是偶数就输出
			if (j % 2 == 0) {
				System.out.println(j);
			}
			
			j++;
		}
		System.out.println("================");
		
		int k = 0;
		while (k <= 100) {
			System.out.println(k);
			k += 2;
		}
		
	}
}
```

### 2.4 计算数字累加

```java
package com.qf.loop;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 *	3、计算0--100累加的结果
		 *	4、计算0--100奇数累加的结果
		 */
		// 从0开始
		int i = 0;
		// 累加的结果
		int sum = 0;
		while (i <= 100) {
			sum = sum + i;
			i++;
		}
		
		System.out.println("0-100累加的结果是:" + sum);
		
		// 把开始和累加归零
		i = 0;
		sum = 0;
		while (i <= 100) {
			// 判断i是不是奇数,如果是就累加
			if (i % 2 != 0) {
				sum += i;
			}
			
			i++;
		}
		System.out.println("0--100奇数累加的结果是:" + sum);
		
	}
}
```

### 2.5 应用题

```java
package com.qf.loop;

public class Demo05 {
	public static void main(String[] args) {
		/**
		 *	5、计算猴子摘桃
		 *		有一只猴子，摘了很多桃子
		 *		每天吃下全部桃子数量的一半，感觉没吃饱又补了一个
		 *		第十天吃完之后发现还剩下一个
		 *		问：
		 *			猴子一共摘了多少桃子
		 *	6、计算挑水次数
		 *		小和尚挑水喝，水桶容量是15L，水缸容量100L
		 *		问：
		 *			小和尚需要挑水多少次
		 */
		
		/**
		 * 	第十天
		 * 		(1+1)*2==4
		 * 	第九天
		 * 		(4+1)*2==10
		 * 	第八天
		 * 		(10+1)*2=22
		 */
		
		int count = 1;
		
		int day = 10;
		
		while (day >= 1) {
			count = (count + 1)*2;
			day--;
		}
		System.out.println("猴子一共摘了桃子:" + count);
	}
}
```

### 2.6 输出字母

```java
package com.qf.loop;

public class Demo06 {
	public static void main(String[] args) {
		/**
		 * 	倒序输出0--100之间的数字
		 * 	输出A--Z
		 * 	输出z--a
		 */
		
		int i = 100;
		while(i >= 0) {
			System.out.println(i);
			i--;
		}
		
		System.out.println("===================");
		// A对应ASCII表中的65，Z对应90
		int j = 65;
		while (j <= 90) {
			System.out.println((char) j);
			j++;
		}
		
		System.out.println("******************");
		char c = 'A';
		while (c <= 'Z') {
			System.out.println(c);
			c++;
		}
	}
}
```

### 2.7 while循环特殊情况

* 一次都不执行
  * 第一次判断不成立
* 根本停不下来
  * 循环条件恒成立

```java
package com.qf.loop;

public class Demo07 {
	public static void main(String[] args) {
		int i = 0;
		
		// 一次都不执行
		while (i > 0) {
			System.out.println("过来干活...");
			i++;
		}
		System.out.println("OVER");
		
		// 循环条件恒成立
		while (i >= 0) {
			System.out.println("国企=======过来干活...");
			i++;
		}
		System.out.println("OVER");
	}
}
```

```
1 - 1/2 + 1/3 - 1/4 ... 1/99
输出100-1000之间的水仙花数字
```

```java
package com.qf.loop;

public class Demo09 {
	public static void main(String[] args) {
		/**
		 * 1/1 - 1/2 + 1/3 - 1/4 ... 1/99
		 */
		
		int i = 1;
		// 计算的结果
		double sum = 0;
		
		while (i < 100) {
			// 奇数+
			if (i % 2 != 0) {
				sum = sum + 1.0/i;
			} else {
				// 偶数-
				sum = sum - 1.0/i;
			}
			i++;
		}
		System.out.println("计算的结果是:" + sum);
	}
}
```

## 三、do...while

### 3.1 概述

* while的特点
  * 先判断在执行
  * 执行的次数是:0---N次，有可能一次都不执行
* 有些场景需要先执行一次,再判断是否继续执行，使用do...while解决

### 3.2 语法

```
初始化语句
do{
	循环体
	循环控制
}while(条件)
```

### 3.3 实例

```java
package com.qf.loop;

import java.util.Scanner;

public class Demo11 {
	public static void main(String[] args) {
		/**
		 * 	学生写作业,老师验收
		 */
		
		Scanner sc = new Scanner(System.in);
		char ret = 'N';
		// 无论如何要先写作业,写完验收,根据结果判断是否在写一次
		do {
			System.out.println("努力学作业...");
			System.out.println("请输入验收结果:");
			ret = sc.next().charAt(0);
		} while (ret != 'Y');
		System.out.println("OVER");
	}
}
```

## 四、for循环

### 4.1 概述

* foreach--循环、遍历
* 实现循环的一种方式，和while功能基本一样

	### 4.2 语法

```
for(初始化语句;条件;控制条件变化){
	循环体
}
```

```java
package com.qf.forloop;

public class Demo02 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("OVER");
	}
}
```

```
第一轮
	int i = 0,====>	i<10===>true    循环体
第二轮
	i++   >>>  i=1  >>>  i<10  >>>true   >>>  循环体
第三轮
	i++   >>>  i=2  >>>  i<10  >>>true   >>>  循环体
第四轮
	i++   >>>  i=3  >>>  i<10  >>>true   >>>  循环体
... ...
第十轮
	i++   >>>  i=9  >>>  i<10  >>>true   >>>  循环体
第十一轮
	i++   >>>  i=10  >>>  i<10  >>>false   >>>  循环结束
```

### 4.3 输出数字

```java
package com.qf.forloop;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * 	1、输出0--100
		 * 	2、输出0--100之间的偶数
		 * 
		 * 	3、计算0--100累加的结果
		 * 	4、计算0--100奇数累加的结果
		 * 
		 * 	5、输出A--Z，z--a
		 * 	6、计算键盘录入数字的阶乘
		 * 	
		 * 	7、小球落地经过的距离
		 * 	8、计算5个学生的平均成绩
		 */
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("============");
		
		for (int i = 0; i <= 10; i++) {
			// 判断i是不是偶数
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("============");
		
		for (int i = 0; i <= 10; i+=2) {
			System.out.println(i);
		}
		
		System.out.println("============");
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			i++;
		}
	}
}
```

### 4.4 计算数字累加

```java
package com.qf.forloop;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 *	3、计算0--100累加的结果
		 * 	4、计算0--100奇数累加的结果
		 */
		// 累加的结果
		// 从0开始到100
		int sum = 0;
		for (int i = 0; i <= 100; i++){
			// 累加所有的数字
			sum += i;
		}
		System.out.println("sum = " + sum);
		
		System.out.println("=====================");
		
		int ret = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				ret += i;
			}
		}
		System.out.println("ret = " + ret);
	}
}
```

### 4.5 字母和阶乘

```java
package com.qf.forloop;

import java.util.Scanner;

public class Demo05 {
	public static void main(String[] args) {
		/**
		 *	5、输出A--Z，z--a
		 * 	6、计算键盘录入数字的阶乘
		 */
		
		for (int i = 65; i <= 90; i++) {
			System.out.print((char)i + ",");
		}
		System.out.println("\n===========");
		
		for (char i = 65; i <= 90; i++) {
			System.out.print(i + ",");
		}
		System.out.println("\n===========");
		
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + ",");
		}
		System.out.println("\n===========");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个数字,计算它的阶乘:");
		int num = sc.nextInt();
		
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		System.out.println(result);		
	}
}
```

### 4.6 计算平均成绩

```java
package com.qf.forloop;

import java.util.Scanner;

public class Demo07 {
	public static void main(String[] args) {
		/**
		 *	7、小球落地经过的距离
		 *		有一个小球从100米的空中落下，落地后会弹起落下高度的一半
		 *		第十次落地的时候经历了多少米
		 *
		 * 	8、计算5个学生的平均成绩
		 * 		键盘录入5个学生的成绩，计算平均值
		 */
		Scanner sc = new Scanner(System.in);
		
		int scores = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("请输入第"+i+"个学生的成绩:");
			int score = sc.nextInt();
			scores += score;
		}
		
		System.out.println("学生的平均成绩是：" + (scores / 5.0));
		
	}
}
```

### 4.7 for循环特殊情况

```java
package com.qf.forloop;

public class Demo08 {
	public static void main(String[] args) {
		// 一次都不执行
		for (int i = 0; i < -1; i++) {
			System.out.println(i);
		}
		System.out.println("OVER");
		
		// 死循环
		for (int i = 0; i>=0 && i<100; i++) {
			System.out.println(i);
		}
		System.out.println("OVER");
		
		/*
		// 缺失结束条件
		for (int i = 0; ; i++) {
			System.out.println(i);
		}
		
		// System.out.println("OVER");
		
		
		// 缺失条件控制语句
		for (int i = 0; i < 100;) {
			System.out.println(i);
		}
		
		
		// 缺失判断和控制
		for (int i = 0;;) {
			System.out.println(i);
		}
		
		for (;;) {
			System.out.println("66666666666666");
		}
		*/
		
	}
}
```

## 五、流程控制

### 5.1 概述

* 控制循环、选择结构的执行
* 可以使用break或者continue

### 5.2 break

* 终止
* 可以结束当前所在的循环
* 可以跳出switch结构

```java
package com.qf.forloop;

public class Demo09 {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			if (i == 66) {
				// 终止当前循环
				break;
			}
		}
		
		System.out.println("OVER");
	}
}
```

### 5.3 continue

* 跳过continue之后的循环内容，进入新的一轮循环

```java
package com.qf.forloop;

public class Demo10 {
	public static void main(String[] args) {
		// 输出0--100之间的数字
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				// 跳过continue后面的内容,进入新的一轮循环
				continue;
			}
			System.out.println(i);
		}
	}
}
```

