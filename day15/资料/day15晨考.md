#### 1、写出String创建对象的方法和String对象常用方法*6和这些方法的作用

* 直接赋值
  * String s = "";
* new对象
  * String ss = new String();
* length
* split
* replace
* compare
* matches
* trim
* indexOf
* charAt

#### 2、写出Integer各种转换的方法

#### 3、Object类有什么特点，有哪些常用方法

* 是java继承结构中的根类，是所有类的直接或者间接父类
* getClass
* equals
* hashCode
* finalize
* toString

#### 4、 怎么理解toString和equals方法，equals和==有何异同

* toString
  * 返回对象的字符串形式
  * 一般建议重写
* equals
  * 比较两个对象是否相等
  * 默认比较地址值
  * 可以重写自定义比较规则
* ==
  * 运算符
  * 比较对象是否相等，比较的是
  * 基本类型比较字面值，引用类型比较引用地址值

#### 5、写出基本类型和对应的包装类