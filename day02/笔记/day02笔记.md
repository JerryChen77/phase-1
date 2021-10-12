# Day 02笔记

## 一、计算机常识

### 1.1 计算机的诞生

* 1946年2月14日

### 1.2 计算机的发展

* 电子管计算机
* 晶体管计算机
* 大规模集成电路计算机
* 超大规模集成电路计算机

### 1.3 计算机发展史上的重要人物

* 计算机之父
  * 冯诺依曼
* 人工智能之父
  * 艾伦图灵

### 1.4 计算机的组成

* 计算器
* 控制器
* 存储器
* 输入设备
* 输出设备

### 1.5 软件

* 安装特定顺序组织的计算机指令和数据的集合

### 1.6 硬件

* 物理设备

### 1.7 操作系统

* 管理和控制计算机软件和硬件的计算机程序
* PC端
  * Windows
  * Linux
  * MacOS
  * Unix
* 移动端
  * Android
  * IOS
  * 黑莓
  * 塞班
  * WPhone

### 1.8 DOS指令

* 磁盘操作系统
* DOS操作系统中使用的指令

### 1.9 常用DOS命令

* 切换盘符
  * 盘符:
* 切换文件夹
  * cd 文件夹
* 创建文件
  * mkdir 文件夹名字
  * md 文件夹名字
* 删除文件
  * rmdir 文件夹名字
  * rd 文件夹名字
* 查询文件
  * dir
* ip查询
  * ipconfig
* 测试ip是否通
  * ping ip地址
* 清屏
  * cls
* 退出
  * exit
* 自行查找20+DOS命令，练习使用

## 二、Java概述

### 2.1 诞生和发展

* 作者
  * 詹姆斯高斯林
* 发布时间
  * 1995
* 最新版本
  * JDK16
* 使用人数较多的版本
  * JDK8
  * JDK11
* 我们学习&使用的版本
  * JDK8
* java名字的由来
* Java的版本
  * JavaSE
  * JavaEE
  * JavaME

### 2.2 下载JDK

* https://www.oracle.com/cn/java/technologies/javase/javase-jdk8-downloads.html
* 从飞秋下载

### 2.3 卸载JDK

* 删除配置信息
* 卸载软件

### 2.4 安装JDK

* 安装软件
  * 双击安装包
  * 选择安装位置

### 2.5 配置JDK

* 添加到系统环境变量
* 创建JAVA_HOME
* 把JAVA_HOME引用到Path中

## 三、我的第一个程序-HelloWorld

### 3.1 流程

```
1、创建java文件
	以.java为后缀名的文件成为java文件
2、编写java代码
3、编译java文件
	产生字节码文件
4、执行字节码文件
	解释执行
```

```java
class HelloWorld{
	public static void main(String[] args){
		System.out.println("Hello World!");
	}
}
```

### 3.2 Java程序跨平台原理

* 因为有安装在不同平台的java虚拟机

### 3.3 HelloWorld详解

```
class HelloWorld{
	public static void main(String[] args){
		System.out.println("Hello World!");
	}
}
```

* class
  * java中的关键字，表示要声明一个类
  * 区分大小写
* HelloWorld
  * 类名
  * 自己定义，需要是合法的标识符
  * 建议是英文单词+数字
  * 生成的字节码文件的名字和类名是一样的
* 类名后面的{}
  * 当前类的作用域
  * 我们的所有代码都要写在{}中
* public
  * java中的关键字，访问权限修饰符
* static
  * java中的关键字，静态的
* void
  * java中的关键字，返回值为空
* main
  * 方法名，java中的特殊的方法，java程序的入口
  * 一个类中只能有一个main方法
* (String[] args)
  * 参数列表
* main方法后面{}
  * 方法的作用域
* System.out.println("Hello World!");
  * main方法中执行的操作

### 3.4 文件名和类名和字节码文件名的关系

* 类名和字节码文件名

  * 是一样的

* 文件名和类名

  * 不是必须一样的
  * 但是如果类名使用public修饰，类名和文件名必须一样

  ```java
  public class Demo003 {
  	public static void main(String[] args) {
  		System.out.println("Hello World!");
  	}
  }
  ```

### 3.5 一个Java文件中能不能出现多个类

* 可以，编译之后会产出类名对应的字节码文件，每个字节码文件都能独立使用

* 多个类的名字不能重复

* 只能有一个类是使用public修饰的

  ```java
  public class Demo04 {
  	public static void main(String[] args) {
  		System.out.println("Hello World! 04");
  	}
  }
  
  public class Demo004 {
  	public static void main(String[] args) {
  		System.out.println("Hello World! 004");
  	}
  }
  ```

  

## 四、编码规范

### 4.1 书写规范

* 层级之间必须使用tab进行缩进
  * 类和方法
  * 方法和方法体
  * ... ...

### 4.2 注释

* 标注、解释
* 把暂时用不到的代码先隐藏起来
* 注释的代码不参与编译、运行

### 4.3 注释的分类

* 单行注释

* 多行注释
* 文档注释

```java
class Demo05 {
	/**
		我是文档注释
		生成文档内容
		使用的指令是javadoc
	*/
	public static void main(String[] args) {
		// 我是一个单行注释,只能标注一行代码--hahahaha
		// heheheh
		System.out.println("Hello World!");

		/*
			我是多行注释
			能同时注释多行代码
		*/
	}
}
```

* 文档注释结合javadoc命令可以生成文档

## 五、进制（熟悉）

### 5.1 概述

* 逢几进一的制度

### 5.2 常用的进制

* 二进制
  * 0--1
* 八进制
  * 0--7
* 十进制
  * 0--9
* 十六进制
  * 0--9  a--f

### 5.3 二进制==》十进制

### 5.4 十进制到二进制

### 5.5 二进制到其他进制

## 六、原码反码补码（拓展）

```
60 - 45
45 - 60
```

* 使用二进制运算

## 七、练习

* 查找20+DOS命令，熟练使用
* 安装==配置==卸载JDK  *  2
* 手写HelloWorld.java * 20+
* 编写HelloWorld.java===编译===运行 * 20
* 拓展
  * 60-45
  * 45-60