# Day 16笔记（掌握）

## 一、Collection

### 1.1 查询的方法

```java
package com.qf.coll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 *	查
			 boolean contains(Object o) 
			          如果此 collection 包含指定的元素，则返回 true。 
			 boolean containsAll(Collection<?> c) 
			          如果此 collection 包含指定 collection 中的所有元素，则返回 true。 
			 boolean equals(Object o) 
			          比较此 collection 与指定对象是否相等。 
			 int hashCode() 
			          返回此 collection 的哈希码值。 
			 boolean isEmpty() 
			          如果此 collection 不包含元素，则返回 true。 
			 int size() 
			          返回此 collection 中的元素数。 
			          
		 * 	其他
			 Iterator<E> iterator() 
			          返回在此 collection 的元素上进行迭代的迭代器。 
			 Object[] toArray() 
			          返回包含此 collection 中所有元素的数组。 
		 */
		
		Collection c = new ArrayList();
		c.add("刘备");
		c.add("关羽");
		c.add("张飞");
		c.add("赵云");
		System.out.println(c);
		
		System.out.println(c.contains("张飞"));
		System.out.println(c.contains("张飞飞"));
		
		Collection cc = new ArrayList();
		cc.add("张飞");
		cc.add("刘备");
		cc.add("赵云");
		cc.add("关羽");
		System.out.println(cc);
		System.out.println(c.containsAll(cc));
		System.out.println(c.equals(cc));
		
		cc.add("诸葛亮");
		System.out.println(c.containsAll(cc));
		
		System.out.println(cc.size());
		System.out.println(cc.isEmpty());
		cc.clear();
		System.out.println(cc.size());
		System.out.println(cc.isEmpty());
		
		Object[] objects = c.toArray();
		System.out.println(Arrays.toString(objects));
		
	}
}
```

### 1.2 Collection声明的集合遍历

```
package com.qf.coll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("刘备");
		c.add("关羽");
		c.add("张飞");
		c.add("赵云");
		System.out.println(c);
		
		System.out.println("============foreach遍历集合===========");
		for (Object obj : c) {
			System.out.println(obj);
		}
		
		System.out.println("=============iterator=================");
		
		// 获取迭代器对象
		Iterator it = c.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		/*
		if (it.hasNext()) {
			System.out.println(it.next());
		}
		
		if (it.hasNext()) {
			System.out.println(it.next());
		}
		
		if (it.hasNext()) {
			System.out.println(it.next());
		}
		
		if (it.hasNext()) {
			System.out.println(it.next());
		}
		
		if (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println(it.hasNext());
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		// System.out.println(it.next());
		 
		 */
		
	}
}
```

## 二、List接口

### 2.1 概述

* 有序的  collection（也称为*序列*）。
* 此接口的用户可以对列表中每个元素的插入位置进行精确地控制。
* 用户可以根据元素的整数索引（在列表中的位置）访问元素，并搜索列表中的元素。 
* 与 set 不同，列表通常允许重复的元素。
* 更确切地讲，列表通常允许满足 `e1.equals(e2)` 的元素对 `e1` 和  `e2`，并且如果列表本身允许 null 元素的话，通常它们允许多个 null 元素。

### 2.2 实现类

* ArrayList
* LinkedList
* Vector

## 三、ArrayList

### 3.1 概述

* `List` 接口的	数组的实现。
* 实现了所有可选列表操作，并允许包括  在内的所有元素。
* 除了实现 接口外，此类还提供一些方法来操作内部用来存储列表的数组的大小。
* （此类大致上等同于Vector类，除了**此类是不同步的**。）

### 3.2 创建对象

```
ArrayList() 
    构造一个初始容量为 10 的空列表。 
ArrayList(Collection<? extends E> c) 
    构造一个包含指定 collection 的元素的列表，这些元素是按照该 collection 的迭代器返回它们的顺序排列的。 
ArrayList(int initialCapacity) 
    构造一个具有指定初始容量的空列表。 
```

```java
package com.qf.list;

import java.util.ArrayList;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	ArrayList() 
			          构造一个初始容量为 10 的空列表。 
			ArrayList(Collection<? extends E> c) 
			          构造一个包含指定 collection 的元素的列表，这些元素是按照该 collection 的迭代器返回它们的顺序排列的。 
			ArrayList(int initialCapacity) 
			          构造一个具有指定初始容量的空列表。 
		 */
		
		// Constructs an empty list with an initial capacity of ten.
		ArrayList list = new ArrayList();
		System.out.println(list);
		
		ArrayList list2 = new ArrayList(list);
		
		ArrayList list3 = new ArrayList(100);
		
	}
}
```

### 3.3 插入数据

```java
package com.qf.list;

import java.util.ArrayList;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 	增
		 * 	 boolean add(E e) 
			          将指定的元素添加到此列表的尾部。 
			 void add(int index, E element) 
			          将指定的元素插入此列表中的指定位置。 
			 boolean addAll(Collection<? extends E> c) 
             按照指定 collection 的迭代器所返回的元素顺序，将该 collection 中的所有元素添加到此列表的尾部。 
			 boolean addAll(int index, Collection<? extends E> c) 
			          从指定的位置开始，将指定 collection 中的所有元素插入到此列表中。 

		 */
		
		ArrayList list = new ArrayList();
		list.add("黑熊精");
		list.add("白骨精");
		list.add("狮子精");
		list.add("鹿力大仙");
		list.add("虎力大仙");
		list.add("羊力大仙");
		
		System.out.println(list);
		
		// 在指定位置插入数据
		list.add(0, "奔波儿灞");
		System.out.println(list);
		
		ArrayList list0 = new ArrayList();
		list0.add("赤脚大仙");
		list0.add("土地公公");
		list0.add("红孩儿");
		
		System.out.println(list0);
		
		list.addAll(list0);
		System.out.println(list);
		
		list.addAll(0, list0);
		System.out.println(list);
	}
}
```

### 3.4 删除数据

```java
package com.qf.list;

import java.util.ArrayList;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 *	删
			 E remove(int index) 
			          移除此列表中指定位置上的元素。 
			 boolean remove(Object o) 
			          移除此列表中首次出现的指定元素（如果存在）。 
			 removeAll
			 retainAll
			 void clear() 
			          移除此列表中的所有元素。 
		 */
		
		ArrayList list = new ArrayList();
		list.add("黑熊精");
		list.add("白骨精");
		list.add("白骨精");
		list.add("狮子精");
		list.add("鹿力大仙");
		list.add("虎力大仙");
		list.add("羊力大仙");
		System.out.println(list);
		
		// 移除此列表中首次出现的指定元素（如果存在）
		boolean b = list.remove("白骨精");
		System.out.println(b);
		b = list.remove("白骨精");
		System.out.println(b);
		
		Object obj = list.remove(0);
		System.out.println(obj);
		
		list.add(3);
		System.out.println(list);
		
		// 按照索引移除
		list.remove(new Integer(3));
		System.out.println(list);
		
		ArrayList list0 = new ArrayList();
		list0.add("赤脚大仙");
		list0.add("土地公公");
		list0.add("红孩儿");
		list0.add("羊力大仙");
		
		// 只要两个集合有交集就返回true
		b = list.removeAll(list0);
		System.out.println(b);
		list.add("羊力大仙");
		System.out.println(list);
		System.out.println(list0);
		
		// 取交集
		list.retainAll(list0);
		System.out.println(list);
	}
}

```



### 3.5 修改数据

```java
package com.qf.list;

import java.util.ArrayList;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 * 	改
			 void ensureCapacity(int minCapacity) 
			          如有必要，增加此 ArrayList 实例的容量，以确保它至少能够容纳最小容量参数所指定的元素数。 
			 E set(int index, E element) 
			          用指定的元素替代此列表中指定位置上的元素。 
			 void trimToSize() 
			          将此 ArrayList 实例的容量调整为列表的当前大小。 
		 */
		ArrayList list = new ArrayList();
		list.add("黑熊精");
		list.add("白骨精");
		list.add("白骨精");
		list.add("狮子精");
		list.add("鹿力大仙");
		list.add("虎力大仙");
		list.add("羊力大仙");
		System.out.println(list);
		
		list.set(0, "黑瞎子");
		System.out.println(list);
		
	}
}
```



### 3.6 查询数据

```java
package com.qf.list;

import java.util.ArrayList;

public class Demo05 {
	public static void main(String[] args) {
		/**
		 * 	查
			 boolean contains(Object o) 
			          如果此列表中包含指定的元素，则返回 true。 
			 containsAll
			 E get(int index) 
			          返回此列表中指定位置上的元素。 
			 int indexOf(Object o) 
			          返回此列表中首次出现的指定元素的索引，或如果此列表不包含元素，则返回 -1。 
			 boolean isEmpty() 
			          如果此列表中没有元素，则返回 true 
			 int lastIndexOf(Object o) 
			          返回此列表中最后一次出现的指定元素的索引，或如果此列表不包含索引，则返回 -1。 
			 int size() 
			          返回此列表中的元素数。 
		 */
		
		ArrayList list = new ArrayList();
		list.add("黑熊精");
		list.add("白骨精");
		list.add("白骨精");
		list.add("狮子精");
		list.add("鹿力大仙");
		list.add("虎力大仙");
		list.add("羊力大仙");
		System.out.println(list);
		
		boolean b = list.contains("白骨精");
		System.out.println(b);
		
		ArrayList list0 = new ArrayList();
		list0.add("赤脚大仙");
		list0.add("土地公公");
		list0.add("红孩儿");
		list0.add("羊力大仙");
		
		System.out.println(list.containsAll(list0));
		
		ArrayList list00 = new ArrayList();
		list00.add("赤脚大仙");
		list00.add("土地公公");
		list00.add("羊力大仙");
		list00.add("红孩儿");
		list00.add("红孩儿");
		
		System.out.println(list0.containsAll(list00));
		System.out.println(list0.equals(list00));
		
		System.out.println(list.get(3));
		System.out.println(list.indexOf("白骨精"));
		System.out.println(list.lastIndexOf("白骨精"));
		System.out.println(list.size());
		
	}
}
```

### 3.7 遍历List集合

```java
package com.qf.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo06 {
	public static void main(String[] args) {
		/**
		 * 	          
		 * 	其他
			 Object[] toArray() 
			          按适当顺序（从第一个到最后一个元素）返回包含此列表中所有元素的数组。 
			 iterator
			 listIterator
			 subList
		 */
		ArrayList list = new ArrayList();
		list.add("黑熊精");
		list.add("白骨精");
		list.add("虎力大仙");
		list.add("羊力大仙");
		System.out.println("===============for================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("===============while================");
		int index = 0;
		while (index < list.size()) {
			System.out.println(list.get(index));
			index++;
		}
		System.out.println("===============dowhile================");
		index = 0;
		do {
			System.out.println(list.get(index));
			index++;
		}while (index < list.size());
		
		System.out.println("===============foreach================");
		for (Object obj : list) {
			System.out.println(obj);
		}
		System.out.println("===============iterator================");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		System.out.println("===============listIterator================");
		ListIterator lit = list.listIterator();
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
	}
}
```

## 四、Vector

### 4.1 概述

* `Vector` 类可以实现可增长的对象数组。
* 与数组一样，它包含可以使用整数索引进行访问的组件。
* 但是，`Vector` 的大小可以根据需要增大或缩小，以适应创建 `Vector` 后进行添加或移除项的操作。
* **`Vector` 是同步的。**

### 4.2 创建对象

```
Vector() 
          构造一个空向量，使其内部数据数组的大小为 10，其标准容量增量为零。 
Vector(Collection<? extends E> c) 
          构造一个包含指定 collection 中的元素的向量，这些元素按其 collection 的迭代器返回元素的顺序排列。 
Vector(int initialCapacity) 
          使用指定的初始容量和等于零的容量增量构造一个空向量。 
Vector(int initialCapacity, int capacityIncrement) 
          使用指定的初始容量和容量增量构造一个空的向量。 
```

### 4.3 常用方法

* 和ArrayList基本一样，详情参考ArrayList部分

### 4.4 Vector和ArrayList比较

* 同
  * 实现了List接口
  * 都是基于数组的实现
* 不同
  * ArrayList是不同步的，效率相对快，线程不安全
  * Vector是同步的，效率相对慢，线程安全

```java
package com.qf.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Demo07 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
//		list.add("黑熊精");
//		list.add("白骨精");
//		list.add("虎力大仙");
//		list.add("羊力大仙");
		System.out.println(list);
		
		Vector vector = new Vector();
//		vector.add("黑熊精");
//		vector.add("白骨精");
//		vector.add("虎力大仙");
//		vector.add("羊力大仙");
		System.out.println(vector);
		
		addData(list);
		System.out.println("================");
		addData(vector);
		
	}
	
	public static void addData(List list) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			list.add(Math.random() + "===" + i);
		}
		
		System.out.println(System.currentTimeMillis() - startTime);
		
	}
	
}
```

## 五、LinkedList

### 5.1 概述

* `List` 接口的链接列表实现。
* 实现所有可选的列表操作，并且允许所有元素（包括 `null`）。
* **此实现不是同步的。**

### 5.2 创建对象

```
LinkedList() 
          构造一个空列表。 
LinkedList(Collection<? extends E> c) 
          构造一个包含指定 collection 中的元素的列表，这些元素按其 collection 的迭代器返回的顺序排列。 
```

```java
package com.qf.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo08 {
	public static void main(String[] args) {
		/**
		 * 	LinkedList() 
			          构造一个空列表。 
			LinkedList(Collection<? extends E> c) 
			          构造一个包含指定 collection 中的元素的列表，这些元素按其 collection 的迭代器返回的顺序排列。 
		 */
		
		LinkedList list01 = new LinkedList();
		System.out.println(list01);
		
		ArrayList list = new ArrayList();
		list.add("黑熊精");
		list.add("白骨精");
		list.add("虎力大仙");
		list.add("羊力大仙");
		
		LinkedList list02 = new LinkedList(list);
		System.out.println(list02);
	}
}
```

### 5.3 LinkedList常用方法

```java
package com.qf.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Demo09 {
	public static void main(String[] args) {
		/**
		 * 	增
			 void addFirst(E e) 
			          将指定元素插入此列表的开头。 
			 void addLast(E e) 
			          将指定元素添加到此列表的结尾。 
			 void push(E e) 
			          将元素推入此列表所表示的堆栈。 
			 boolean offer(E e) 
			          将指定元素添加到此列表的末尾（最后一个元素）。 
			 boolean offerFirst(E e) 
			          在此列表的开头插入指定的元素。 
			 boolean offerLast(E e) 
			          在此列表末尾插入指定的元素。 
			          
		 * 	删
			 E poll() 
			          获取并移除此列表的头（第一个元素） 
			 E pollFirst() 
			          获取并移除此列表的第一个元素；如果此列表为空，则返回 null。 
			 E pollLast() 
			          获取并移除此列表的最后一个元素；如果此列表为空，则返回 null。 
			 E pop() 
			          从此列表所表示的堆栈处弹出一个元素。 
			 E remove() 
			          获取并移除此列表的头（第一个元素）。 
			 E removeFirst() 
			          移除并返回此列表的第一个元素。 
			 boolean removeFirstOccurrence(Object o) 
			          从此列表中移除第一次出现的指定元素（从头部到尾部遍历列表时）。 
			 E removeLast() 
			          移除并返回此列表的最后一个元素。 
			 boolean removeLastOccurrence(Object o) 
			          从此列表中移除最后一次出现的指定元素（从头部到尾部遍历列表时）。 
			          
		 * 	查
			 Iterator<E> descendingIterator() 
			          返回以逆向顺序在此双端队列的元素上进行迭代的迭代器。 
			 E element() 
			          获取但不移除此列表的头（第一个元素）。 
			 E getFirst() 
			          返回此列表的第一个元素。 
			 E getLast() 
			          返回此列表的最后一个元素。 
			 E peek() 
			          获取但不移除此列表的头（第一个元素）。 
			 E peekFirst() 
			          获取但不移除此列表的第一个元素；如果此列表为空，则返回 null。 
			 E peekLast() 
			          获取但不移除此列表的最后一个元素；如果此列表为空，则返回 null。 
		 */
		
		ArrayList list = new ArrayList();
		list.add("黑熊精");
		list.add("白骨精");
		list.add("狮子精");
		list.add("白骨精");
		list.add("鹿力大仙");
		list.add("虎力大仙");
		list.add("白骨精");
		list.add("羊力大仙");
		
		LinkedList linkedList = new LinkedList(list);
		System.out.println(linkedList);
		
		linkedList.addFirst("奔波儿灞");
		System.out.println(linkedList);
		
		linkedList.addLast("霸波尔奔");
		System.out.println(linkedList);
		
		Object poll = linkedList.poll();
		System.out.println(poll);
		System.out.println(linkedList);
		System.out.println(linkedList);
		
		Object pollLast = linkedList.pollLast();
		System.out.println(pollLast);
		System.out.println(linkedList);
		
		Object pop = linkedList.pop();
		System.out.println(pop);
		System.out.println(linkedList);
		
		linkedList.push("金角大王");
		System.out.println(linkedList);
		
		Object remove = linkedList.remove();
		System.out.println(remove);
		System.out.println(linkedList);
		
		boolean firstOccurrence = linkedList.removeFirstOccurrence("白骨精");
		System.out.println(linkedList);
		
		boolean lastOccurrence = linkedList.removeLastOccurrence("白骨精");
		System.out.println(linkedList);
		
		System.out.println("=================================");
		
		// 倒序迭代集合
		Iterator dit = linkedList.descendingIterator();
		while (dit.hasNext()) {
			Object object = (Object) dit.next();
			System.out.println(object);
		}
		
		
		linkedList.offer("孔雀公主");
		System.out.println(linkedList);
		
		linkedList.offerFirst("兔子精");
		System.out.println(linkedList);
		
		Object element = linkedList.element();
		System.out.println(element);
		
		Object first = linkedList.getFirst();
		System.out.println(first);
		
		Object peekFirst = linkedList.peekFirst();
		System.out.println(peekFirst);
		
		Object peekLast = linkedList.peekLast();
		System.out.println(peekLast);
	}
}
```

### 5.4 ArrayList 和 LinkedList比较

* ArrayList
  * 基于数组实现List接口的集合
  * 增删慢
  * 查询块
* LinkedList
  * 基于链表实现List接口的集合
  * 增删块
  * 查询慢

```java
package com.qf.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo10 {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		LinkedList linkedList = new LinkedList();
		
		addData(arrayList);
		System.out.println("---------");
		addData(linkedList);
		
		System.out.println("========================");
		
		queryData(arrayList);
		System.out.println("---------");
		queryData(linkedList);
		
	}
	
	/**
	 * 	插入数据
	 * @param list
	 */
	public static void addData(List list) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			list.add(0,Math.random() + "===" + i);
		}
		System.out.println(System.currentTimeMillis() - startTime);
	}
	
	/**
	 * 	查询数据
	 * @param list
	 */
	public static void queryData(List list) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			list.get(list.size()/2-1);
		}
		System.out.println(System.currentTimeMillis() - startTime);
	}
}
```

## 六、泛型

### 6.1 概述

* 参数化数据类型
* 在创建对象的时候指定对象中可以放入的数据类型
* 编译时检查
* 不用强转

### 6.2 泛型案例

```java
package com.qf.generic;

import java.util.ArrayList;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	泛型
		 */

		ArrayList list01 = new ArrayList();
		list01.add(110);
		list01.add("Hello");
		list01.add(3.14);
		list01.add(true);
		list01.add(new Stu("zhangsan", 23));
		System.out.println(list01);
		
		ArrayList<String> list02 = new ArrayList<String>();
		list02.add("110");
		list02.add("Hello");
		list02.add("3.14");
		list02.add("true");
		list02.add(new Stu("zhangsan", 23).toString());

	}
}

class Stu {
	String name;
	int age;

	public Stu(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Stu [name=" + name + ", age=" + age + "]";
	}

}
```

### 6.3 自定义泛型

```java
package com.qf.generic;

public class Demo02 {
	public static void main(String[] args) {
		Student s01 = new Student();
		s01.setId("20170110");
		
		Student<Integer,Long> s02 = new Student<Integer,Long>();
		s02.setId(20170110);
		
		// Student<String> s03 = new Student();
		
	}
}

class Student<T, E extends Number> {
	T id;
	String name;
	int age;
	String gender;
	E phonenum;

	public Student() {
		super();
	}

	public Student(T id, String name, int age, String gender, E phonenum) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phonenum = phonenum;
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public E getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(E phonenum) {
		this.phonenum = phonenum;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", phonenum=" + phonenum
				+ "]";
	}

}
```



