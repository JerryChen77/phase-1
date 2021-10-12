### 1. 名词解释

* JDK
  * java开发工具包
* JRE
  * java运行时环境
* JVM
  * java虚拟机

### 2. Java程序跨平台运行原理

* 因为有适用于不同平台的java虚拟机

### 3. 环境变量的作用和配置方式

* 可以在任意位置运行一个程序--java和javac
* 配置到系统环境变量
  * JAVA_HOME
  * 配置到path

### 4. 编写代码实现Hello World程序，编译、运行这个代码

```java
class HelloWorld{
	public static void main(String[] args){
		System.out.println("HelloWorld!");
	}
}
```

* javac HelloWorld.java
* java HelloWorld

### 5.注释的作用和分类

* 标注解释
* 把暂时用不到的代码隔离
* 单行注释
  * 注释一行代码
* 多行注释
  * 注释多行代码
* 文档注释
  * 注释多行代码
  * 可以生成说明文档