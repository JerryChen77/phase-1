#### 1、简述this和super的区别

* this表示当前对象的引用
  * 可以调用当前对象的属性、方法，所在类的构造器
* super
  * super引用指向父类，可以调用父类的属性、方法、构造器

#### 2、什么是多态，怎么在程序中使用多态，编写代码演示

* 事物的多种表现形态

* 父类引用指向子类

* ```
  class Animal{}
  class Dog extends Animal{}
  
  Animal a = new Dog();
  Dog d = (Dog)a;
  ```

#### 3、简述什么是是向上转型和向下转型，有什么区别，写出主要代码展示

#### 4、多态中方法和属性的使用有什么特点

* 只能调用父类中定义的属性和方法
  * 只能调用父类的属性
  * 如果子类重写了方法，调用子类重写之后的

#### 5、简述重写和重载的异同点

* 同
  * 方法名同
* 异
  * 定义位置不同
    * 重写是子类和父类之间
    * 重载是同一个类
  * 参数列表不同
    * 重写要求参数列表完全相同
    * 重载要求参数列表不同
  * 返回值不同
    * 重写要求返回值必须相同
    * 重载无要求
  * 访问修饰符不同
    * 重写要求范围相同或者更大
    * 重载无要求