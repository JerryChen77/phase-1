# Day 17笔记

## 一、Collections

### 1.1 概述

* 此类完全由在 collection 上进行操作或返回 collection 的静态方法组成。

### 1.2 创建对象

* 没有公开的构造器
* 都是静态方法，可以直接调用

### 1.3 常用方法

```java
package com.qf.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo01 {
	public static void main(String[] args) {
		/**
			static <T> boolean addAll(Collection<? super T> c, T... elements) 
          		将所有指定元素添加到指定 collection 中。 
          
          	static <T> void fill(List<? super T> list, T obj) 
          		使用指定元素替换指定列表中的所有元素。 
          
			static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll) 
				根据元素的自然顺序，返回给定 collection 的最大元素。 
			static <T extends Object & Comparable<? super T>> T min(Collection<? extends T> coll) 
          		根据元素的自然顺序 返回给定 collection 的最小元素。 
          		
			static <T> boolean replaceAll(List<T> list, T oldVal, T newVal) 
          		使用另一个值替换列表中出现的所有某一指定值。 
			static void reverse(List<?> list) 
          		反转指定列表中元素的顺序。 
          
          	static void rotate(List<?> list, int distance) 
          		根据指定的距离轮换指定列表中的元素。 
			static void shuffle(List<?> list) 
          		使用默认随机源对指定列表进行置换。 

			static <T extends Comparable<? super T>> void sort(List<T> list) 
          		根据元素的自然顺序 对指定列表按升序进行排序。 
			static void swap(List<?> list, int i, int j) 
          		在指定列表的指定位置处交换元素。 
		 */
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(111);
		list.add(111);
		list.add(31);
		list.add(45642);
		list.add(42);
		list.add(78653);
		list.add(4);
		list.add(452);
		System.out.println(list);
		
		// 将所有指定元素添加到指定 collection 中。
		Collections.addAll(list, 123,12,132,147,159);
		System.out.println(list);
		
		// Collections.fill(list, 1111);
		System.out.println(list);
		
		Integer max = Collections.max(list);
		System.out.println(max);
		
		Integer min = Collections.min(list);
		System.out.println(min);
		
		Collections.replaceAll(list, 111, 1111111);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.rotate(list, 3);
		System.out.println(list);
		
		// 使用默认随机源对指定列表进行置换。 
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.sort(list,new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return i2-i1;
			}
		});
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.swap(list, 0, list.size()-1);
		System.out.println(list);
		
	}
}
```

## 二、Set接口

### 2.1 概述

* 一个不包含重复元素的 collection。
* 更确切地讲，set 不包含满足 `e1.equals(e2)` 的元素对`e1` 和 `e2`，并且最多包含一个 null 元素。
* 正如其名称所暗示的，此接口模仿了数学上的*set* 抽象。

### 2.2 实现类

* HashSet
* LinkedHashSet
* TreeSet

## 三、HashSet

### 3.1 概述

* 此类实现 `Set` 接口，由哈希表（实际上是一个 `HashMap` 实例）支持。
* 它不保证 set  的迭代顺序；特别是它不保证该顺序恒久不变。
* 此类允许使用 `null` 元素。  **注意，此实现不是同步的。**
* 此类为基本操作提供了稳定性能，这些基本操作包括 `add`、`remove`、`contains` 和  `size`，假定哈希函数将这些元素正确地分布在桶中。
* 对此 set 进行迭代所需的时间与 `HashSet`  实例的大小（元素的数量）和底层 `HashMap`  实例（桶的数量）的“容量”的和成比例。
* 因此，如果迭代性能很重要，则不要将初始容量设置得太高（或将加载因子设置得太低）。  

### 3.2 创建对象

```
HashSet() 
          构造一个新的空 set，其底层 HashMap 实例的默认初始容量是 16，加载因子是 0.75。 
HashSet(Collection<? extends E> c) 
          构造一个包含指定 collection 中的元素的新 set。 
HashSet(int initialCapacity) 
          构造一个新的空 set，其底层 HashMap 实例具有指定的初始容量和默认的加载因子（0.75）。 
HashSet(int initialCapacity, float loadFactor) 
          构造一个新的空 set，其底层 HashMap 实例具有指定的初始容量和指定的加载因子。 
```

```java
package com.qf.set;

import java.util.HashSet;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 	HashSet() 
			          构造一个新的空 set，其底层 HashMap 实例的默认初始容量是 16，加载因子是 0.75。 
			HashSet(Collection<? extends E> c) 
			          构造一个包含指定 collection 中的元素的新 set。 
			HashSet(int initialCapacity) 
			          构造一个新的空 set，其底层 HashMap 实例具有指定的初始容量和默认的加载因子（0.75）。 
			HashSet(int initialCapacity, float loadFactor) 
			          构造一个新的空 set，其底层 HashMap 实例具有指定的初始容量和指定的加载因子。 
		 */
		// 构造一个新的空 set，其底层 HashMap 实例的默认初始容量是 16，加载因子是 0.75。 
		HashSet<String> set01 = new HashSet<String>();
		set01.add("abc");
		System.out.println(set01);
		System.out.println(set01.size());
		
		HashSet<String> set02 = new HashSet<String>(set01);
		System.out.println(set02);
		
		HashSet<String> set03 = new HashSet<String>(10000);
		System.out.println(set03);
		System.out.println(set03);
		
		HashSet<String> set04 = new HashSet<String>(10000,0.8F);
		System.out.println(set04);
		
	}
}
```

### 3.3 HashSet添加数据

* 无序
* 不重复

```java
package com.qf.set;

import java.util.HashSet;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * 	增
		 *   boolean add(E e) 
			          如果此 set 中尚未包含指定元素，则添加指定元素。 
			 addAll
			 
		 * 	删
			 void clear() 
			          从此 set 中移除所有元素。 
			 boolean remove(Object o) 
			          如果指定元素存在于此 set 中，则将其移除。 
			 removeAll 
			 retainAll
			 
		 * 	查
			 boolean contains(Object o) 
			          如果此 set 包含指定元素，则返回 true。 
			 boolean isEmpty() 
			          如果此 set 不包含任何元素，则返回 true。 
			 Iterator<E> iterator() 
			          返回对此 set 中元素进行迭代的迭代器。 
			 int size() 
			          返回此 set 中的元素的数量（set 的容量）。 
			 equals
			 containsAll
		 */
		
		HashSet<String> set = new HashSet<String>();
		set.add("宋江");
		set.add("时迁");
		set.add("燕青");
		set.add("林冲");
		// 无序
		System.out.println(set);
		
		// 不能重复
		set.add("林冲");
		set.add("林冲");
		System.out.println(set);
		
	}
}
```

### 3.4 HashSet去重

* 先计算hash值
* 如果hash值相同，使用equals方法笔记属性是否相同

```java
package com.qf.set;

import java.util.HashSet;

public class Demo04 {
	public static void main(String[] args) {
		HashSet<Stu> stus = new HashSet<Stu>();
		stus.add(new Stu("张三", 23));
		stus.add(new Stu("李四", 23));
		stus.add(new Stu("王五", 23));
		stus.add(new Stu("赵柳", 23));
		stus.add(new Stu("赵柳", 23));
		System.out.println(stus);
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

	@Override
	public int hashCode() {
		System.out.println(name + "调用了HashCode方法");
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println(name + "调用了equals方法");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stu other = (Stu) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
```

## 四、LinkedHashSet

### 4.1 概述

* 具有可预知迭代顺序的 `Set` 接口的实现，同时也是哈希表和链表实现。
* 此实现与 `HashSet` 的不同之外在于，后者维护着一个运行于所有条目的双重链表。
* 此链表定义了迭代顺序，即按照将元素插入到 set 中的顺序（*插入顺序*）进行迭代。
* 注意，插入顺序*不* 受在 set 中*重新插入的* 元素的影响。（

### 4.2 对象创建

```java
LinkedHashSet() 
          构造一个带默认初始容量 (16) 和加载因子 (0.75) 的新空链接哈希 set。 
LinkedHashSet(Collection<? extends E> c) 
          构造一个与指定 collection 中的元素相同的新链接哈希 set。 
LinkedHashSet(int initialCapacity) 
          构造一个带指定初始容量和默认加载因子 (0.75) 的新空链接哈希 set。 
LinkedHashSet(int initialCapacity, float loadFactor) 
          构造一个带有指定初始容量和加载因子的新空链接哈希 set。 
```

### 4.3 特点

* 元素不重复
* 可以预知顺序
  * 放入和取出顺序一致

```java
package com.qf.set;

import java.util.LinkedHashSet;

public class Demo05 {
	public static void main(String[] args) {
		/**
		 * 	LinkedHashSet() 
			          构造一个带默认初始容量 (16) 和加载因子 (0.75) 的新空链接哈希 set。 
			LinkedHashSet(Collection<? extends E> c) 
			          构造一个与指定 collection 中的元素相同的新链接哈希 set。 
			LinkedHashSet(int initialCapacity) 
			          构造一个带指定初始容量和默认加载因子 (0.75) 的新空链接哈希 set。 
			LinkedHashSet(int initialCapacity, float loadFactor) 
			          构造一个带有指定初始容量和加载因子的新空链接哈希 set。 
		 */
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		// 放入和取出顺序一致
		set.add("宋江");
		set.add("时迁");
		set.add("燕青");
		set.add("林冲");
		System.out.println(set);
		
		// 不重复
		set.add("燕青");
		set.add("燕青");
		System.out.println(set);
		
	}
}
```

## 五、TreeSet

### 5.1 概述

* 基于 [`TreeMap`](../../java/util/TreeMap.html) 的 [`NavigableSet`](../../java/util/NavigableSet.html) 实现。
* 使用元素的[自然顺序](../../java/lang/Comparable.html)对元素进行排序，或者根据创建 set 时提供的 [`Comparator`](../../java/util/Comparator.html) 进行排序，具体取决于使用的构造方法。

### 5.2 创建对象

```
TreeSet() 
          构造一个新的空 set，该 set 根据其元素的自然顺序进行排序。 
TreeSet(Collection<? extends E> c) 
          构造一个包含指定 collection 元素的新 TreeSet，它按照其元素的自然顺序进行排序。 
TreeSet(Comparator<? super E> comparator) 
          构造一个新的空 TreeSet，它根据指定比较器进行排序。 
```

### 5.3 按照自然顺序排序

```java
package com.qf.set;

import java.util.TreeSet;

public class Demo06 {
	public static void main(String[] args) {
		/**
		 * 	元素不重复	-- set
		 * 	元素能排序	-- list
		 * 
		 * TreeSet能搞定
		 * 
		 *  TreeSet() 
			          构造一个新的空 set，该 set 根据其元素的自然顺序进行排序。 
			TreeSet(Collection<? extends E> c) 
			          构造一个包含指定 collection 元素的新 TreeSet，它按照其元素的自然顺序进行排序。 
			TreeSet(Comparator<? super E> comparator) 
			          构造一个新的空 TreeSet，它根据指定比较器进行排序。 
		 */
		
		// 排序
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(110);
		set.add(456);
		set.add(111);
		set.add(123);
		set.add(789);
		set.add(78);
		System.out.println(set);
		
		// 排序和不可重复
		TreeSet<String> set0 = new TreeSet<String>();
		set0.add("Tom");
		set0.add("Tony");
		set0.add("Jerry");
		set0.add("Lucy");
		set0.add("Lily");
		set0.add("Lily");
		set0.add("Lily");
		set0.add("Lily");
		System.out.println(set0);
		
		TreeSet<Student> stus = new TreeSet<Student>();
		System.out.println(stus);
		
		stus.add(new Student("zhangsan", 23));
		stus.add(new Student("lisisi", 25));
		stus.add(new Student("wangwu", 20));
		stus.add(new Student("zhaoliu", 20));
		System.out.println(stus);
		
	}
}

/**
 * 	实现了Comparable接口的类
 * 	按照学生的年龄排序
 *
 */
class Student implements Comparable<Student>{
	String name;
	int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/**
	 * 	按照年龄排序
	 * 	如果年龄相同再比较姓名
	 */
	@Override
	public int compareTo(Student s) {
		int ret = this.age - s.age;
		
		if (ret == 0) {
			ret = this.name.compareTo(s.name);
		}
		return ret;
	}
	
}
```

### 5.4 创建TreeSet传入比较器实现类对象

```java
package com.qf.set;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo07 {
	public static void main(String[] args) {
		/**
		 * TreeSet(Comparator<? super E> comparator) 
			          构造一个新的空 TreeSet，它根据指定比较器进行排序。 
		 */
		// 创建TreeSet,传入比较器,自定义比较规则
		MyComparator mc = new MyComparator();
		TreeSet<Integer> set = new TreeSet<Integer>(mc);
		set.add(110);
		set.add(456);
		set.add(111);
		set.add(123);
		set.add(789);
		set.add(78);
		System.out.println(set);
		
		System.out.println("======================");
		
		HumanComparator hc = new HumanComparator();
		TreeSet<Human> mans = new TreeSet<Human>(hc);
		
		mans.add(new Human("zhangsan", 23));
		mans.add(new Human("lisisi", 25));
		mans.add(new Human("wangwu", 20));
		mans.add(new Human("zhaoliu", 20));
		
		System.out.println(mans);
	}
}

class MyComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer i1, Integer i2) {
		return i2-i1;
	}
	
}

class Human{
	String name;
	int age;
	
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

/**
 * Human比较器
 * 	先按照年龄排序
 * 	如果年龄相同，比较姓名
 * @author Dushine2008
 *
 */
class HumanComparator implements Comparator<Human>{

	@Override
	public int compare(Human h1, Human h2) {
		int ret = h1.age - h2.age;
		if (ret == 0) {
			ret = h1.name.compareTo(h2.name);
		}
		return ret;
	}
	
}
```

### 5.5 TreeSet匿名比较器对象

```java
package com.qf.set;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo08 {
	public static void main(String[] args) {
		// 创建TreeSet对象,传入匿名内部类对象
		TreeSet<Worker> workers = new TreeSet<Worker>(new Comparator<Worker>() {
			@Override
			public int compare(Worker w1, Worker w2) {
				int ret = w1.age - w2.age;
				return w1.age - w2.age==0 ? w1.name.compareTo(w2.name) : ret;
			}
		});
		
		workers.add(new Worker("zhangsan", 23));
		workers.add(new Worker("lisisi", 25));
		workers.add(new Worker("wangwu", 20));
		workers.add(new Worker("zhaoliu", 20));
		
		System.out.println(workers);
	}
}

/**
 * 	工人类
 */
class Worker {
	String name;
	int age;

	public Worker(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
```

## 六、Map接口

### 6.1 概述

* 将键映射到值的对象。
* 一个映射不能包含重复的键；每个键最多只能映射到一个值。
  * 姓名=张三
  * 地址=九堡
  * .. ...

### 6.2 实现类

* HashMap
* HashTable
* Properties
* TreeMap

## 七、HashMap

### 7.1 概述

* 基于哈希表的 `Map` 接口的实现。
* 此实现提供所有可选的映射操作，并允许使用 `null` 值和 `null` 键。
* （除了非同步和允许使用 null 之外，`HashMap` 类与 `Hashtable` 大致相同。）
* 此类不保证映射的顺序，特别是它不保证该顺序恒久不变。 
* `HashMap` 的实例有两个参数影响其性能：*初始容量* 和*加载因子*。
  * *容量* 是哈希表中桶的数量，初始容量只是哈希表在创建时的容量。
  * *加载因子* 是哈希表在其容量自动增加之前可以达到多满的一种尺度。
* **此实现不是同步的。**

### 7.2 创建对象

```
HashMap() 
          构造一个具有默认初始容量 (16) 和默认加载因子 (0.75) 的空 HashMap。 
HashMap(int initialCapacity) 
          构造一个带指定初始容量和默认加载因子 (0.75) 的空 HashMap。 
HashMap(int initialCapacity, float loadFactor) 
          构造一个带指定初始容量和加载因子的空 HashMap。 
HashMap(Map<? extends K,? extends V> m) 
          构造一个映射关系与指定 Map 相同的新 HashMap。 
```

```java
package com.qf.map;

import java.util.HashMap;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 	HashMap() 
			          构造一个具有默认初始容量 (16) 和默认加载因子 (0.75) 的空 HashMap。 
			HashMap(int initialCapacity) 
			          构造一个带指定初始容量和默认加载因子 (0.75) 的空 HashMap。 
			HashMap(int initialCapacity, float loadFactor) 
			          构造一个带指定初始容量和加载因子的空 HashMap。 
			HashMap(Map<? extends K,? extends V> m) 
			          构造一个映射关系与指定 Map 相同的新 HashMap。 
		 */
		// 构造一个具有默认初始容量 (16) 和默认加载因子 (0.75) 的空 HashMap。 
		HashMap<String, String> map = new HashMap<String, String>();
		
		// 指定出示容量使用默认加载因子
		HashMap<String, String> map01 = new HashMap<String, String>(5000);
		
		HashMap<String, String> map02 = new HashMap<String, String>(map);
		
		// HashMap<String, Integer> map03 = new HashMap<String, Integer>(map);
		
	}
}
```

### 7.3 添加数据

```java
package com.qf.map;

import java.util.HashMap;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * 	增
			 V put(K key, V value) 
			          在此映射中关联指定值与指定键。 
			 void putAll(Map<? extends K,? extends V> m) 
			          将指定映射的所有映射关系复制到此映射中，这些映射关系将替换此映射目前针对指定映射中所有键的所有映射关系。 

		 */
		
		HashMap<String, String> map = new HashMap<String, String>();
		// 无序
		map.put("中国联通", "10010");
		map.put("中国移动", "10086");
		map.put("中国电信", "10000");
		map.put("中国邮政", "95580");
		map.put("中国招商", "95555");
		System.out.println(map);
		
		// 不能重复
		map.put("中国招商", "95555");
		System.out.println(map);
		
		// 修改key映射的value
		map.put("中国招商", "95550");
		System.out.println(map);
		
	}
}

```

```java
package com.qf.map;

import java.util.HashMap;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 * 	向map中添加数据--映射
		 */
		HashMap<String, Stu> map = new HashMap<String, Stu>();
		map.put("宋江", new Stu("10001", "宋江", 23,"梁山好汉的头目,真正的法外狂徒..."));
		map.put("李逵", new Stu("10010", "李逵", 18,"梁山好汉头目的铁杆粉丝,杀虎狂人..."));
		map.put("鲁智深", new Stu("10020", "鲁智深", 20,"倒拔垂杨柳,一个人拆了一座庙..."));
		System.out.println(map);
		
		HashMap<String, Stu> stus = new HashMap<String, Stu>(map);
		System.out.println(stus);
	}
}

class Stu {
	String id;
	String name;
	int age;
	String info;

	public Stu(String id, String name, int age, String info) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.info = info;
	}

	@Override
	public String toString() {
		return "Stu [id=" + id + ", name=" + name + ", age=" + age + ", info=" + info + "]";
	}

}
```

### 7.4 删除数据

```java
package com.qf.map;

import java.util.HashMap;

public class Demo05 {
	public static void main(String[] args) {
		/**
		 *	删
			 V remove(Object key) 
			          从此映射中移除指定键的映射关系（如果存在）。
		     void clear() 
			          从此映射中移除所有映射关系。 
		 */
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("中国联通", "10010");
		map.put("中国移动", "10086");
		map.put("中国电信", "10000");
		map.put("中国邮政", "95580");
		map.put("中国招商", "95555");
		System.out.println(map);
		
		// 从此映射中移除指定键的映射关系（如果存在）。
		String str = map.remove("中国移动");
		System.out.println(str);
		
		System.out.println(map);
		
		// 保证安全
		boolean b = map.remove("中国招商","95550");
		System.out.println(b);
		System.out.println(map);
		
	}
}
```

### 7.5 查询数据

```java
package com.qf.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo06 {
	public static void main(String[] args) {
		/**
		 * 	查
			 boolean containsKey(Object key) 
			          如果此映射包含对于指定键的映射关系，则返回 true。 
			 boolean containsValue(Object value) 
			          如果此映射将一个或多个键映射到指定值，则返回 true。 
			 V get(Object key) 
			          返回指定键所映射的值；如果对于该键来说，此映射不包含任何映射关系，则返回 null。 
			 boolean isEmpty() 
			          如果此映射不包含键-值映射关系，则返回 true。 
			 int size() 
			          返回此映射中的键-值映射关系数。 
			          
			          
			 Set<K> keySet() 
			          返回此映射中所包含的键的 Set 视图。 
			 Collection<V> values() 
			          返回此映射所包含的值的 Collection 视图。 
			 Set<Map.Entry<K,V>> entrySet() 
			          返回此映射所包含的映射关系的 Set 视图。 
		 */
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("中国联通", "10010");
		map.put("中国移动", "10086");
		map.put("中国电信", "10000");
		map.put("中国邮政", "95580");
		map.put("中国招商", "95555");
		System.out.println(map);
		
		boolean b = map.containsKey("中国移动");
		System.out.println(b);
		
		boolean c = map.containsValue("10000");
		System.out.println(c);
		
		String str = map.get("中国邮政");
		System.out.println(str);
		
		System.out.println(map.isEmpty());
		
		System.out.println(map.size());
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		Collection<String> values = map.values();
		System.out.println(values);
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		System.out.println(entrySet);
		
	}
}
```

### 7.6 遍历Map集合**

```java
package com.qf.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Demo07 {
	public static void main(String[] args) {
		/**
		 * 	遍历Map集合
		 * 		索引遍历
		 * 		foreach
		 * 		迭代器
		 */
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("中国联通", "10010");
		map.put("中国移动", "10086");
		map.put("中国电信", "10000");
		map.put("中国邮政", "95580");
		map.put("中国招商", "95555");
		System.out.println(map);
		
		Set<String> keys = map.keySet();
		
		System.out.println("==============keySet--foreach================");
		for (String key : keys) {
			System.out.println(key + "=============" + map.get(key));
		}
		
		System.out.println("==============keySet--iterator================");
		Iterator<String> keyIt = keys.iterator();
		while (keyIt.hasNext()) {
			String key = keyIt.next();
			System.out.println(key + "=============" + map.get(key));
		}
		
		System.out.println("==============entrySet--foreach================");
		Set<Entry<String,String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey() + "====" + entry.getValue());
		}
		
		System.out.println("==============entrySet--iterator================");
		Iterator<Entry<String, String>> entryIt = entrySet.iterator();
		while (entryIt.hasNext()) {
			Entry<String,String> entry = entryIt.next();
			System.out.println(entry.getKey() + "====" + entry.getValue());
		}
	}
}
```



## 八、HashTable

### 8.1 概述

* 此类实现一个哈希表，该哈希表将键映射到相应的值。
* 任何非 `null` 对象都可以用作键或值。
* `Hashtable` 是同步的

### 8.2 和HashMap比较

* 构造器和方法基本一样，详情见HashMap

* HashTable是同步的，线程安全，效率稍低

* HashMap是不同步的，线程不安全，效率稍高

* HashTable有一个子类常用

  * Properties

  

## 九、Properties

### 9.1 概述

* `Properties` 类表示了一个持久的属性集合。
* `Properties` 可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串。
* `Properties` 继承于 `Hashtable`，所以可对 `Properties` 对象应用 `put` 和 `putAll` 方法。但不建议使用这两个方法
* 此类是线程安全的：多个线程可以共享单个 Properties 对象而无需进行外部同步。

### 9.2 创建对象

```java
package com.qf.map;

import java.util.Properties;

public class Demo09 {
	public static void main(String[] args) {
		Properties properties = System.getProperties();
		System.out.println(properties);
		
		/**
		 * 	Properties() 
			          创建一个无默认值的空属性列表。 
			Properties(Properties defaults) 
			          创建一个带有指定默认值的空属性列表。 
		 */
		
		Properties p = new Properties();
		System.out.println(p);
		
	}
}
```

### 9.3 存取数据

```java
package com.qf.map;

import java.util.Properties;

public class Demo09 {
	public static void main(String[] args) {
		Properties properties = System.getProperties();
		System.out.println(properties);
		
		/**
		 * 	Properties() 
			          创建一个无默认值的空属性列表。 
			Properties(Properties defaults) 
			          创建一个带有指定默认值的空属性列表。 
		 */
		
		Properties p = new Properties();
		System.out.println(p);
		
		p.setProperty("username", "zhangsan");
		p.setProperty("password", "sanzhang");
		
		System.out.println(p);
		
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
		System.out.println(p.getProperty("password00","123456"));
		p.setProperty("username", "zhangsansan");
		System.out.println(p);
	}
}
```

## 十、TreeMap

### 10.1 概述

* 基于红黑树（Red-Black tree）的 [`NavigableMap`](../../java/util/NavigableMap.html) 实现。
* 该映射根据其键的[自然顺序](../../java/lang/Comparable.html)进行排序，或者根据创建映射时提供的 [`Comparator`](../../java/util/Comparator.html) 进行排序，具体取决于使用的构造方法。 
* **此实现不是同步的。**

### 10.2 创建对象

```java
TreeMap() 
          使用键的自然顺序构造一个新的、空的树映射。 
TreeMap(Comparator<? super K> comparator) 
          构造一个新的、空的树映射，该映射根据给定比较器进行排序。 
TreeMap(Map<? extends K,? extends V> m) 
          构造一个与给定映射具有相同映射关系的新的树映射，该映射根据其键的自然顺序 进行排序。 
TreeMap(SortedMap<K,? extends V> m) 
          构造一个与指定有序映射具有相同映射关系和相同排序顺序的新的树映射。 
```

### 10.3 TreeMap的排序

```java
package com.qf.map;

import java.util.Comparator;
import java.util.TreeMap;

public class Demo10 {
	public static void main(String[] args) {
		/**
		 * 	TreeMap() 
			          使用键的自然顺序构造一个新的、空的树映射。 
			TreeMap(Comparator<? super K> comparator) 
			          构造一个新的、空的树映射，该映射根据给定比较器进行排序。 
			TreeMap(Map<? extends K,? extends V> m) 
			          构造一个与给定映射具有相同映射关系的新的树映射，该映射根据其键的自然顺序 进行排序。 
			TreeMap(SortedMap<K,? extends V> m) 
			          构造一个与指定有序映射具有相同映射关系和相同排序顺序的新的树映射。 
		 */
		
		// 正序
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(10010, "中国联通");
		map.put(10000, "中国电信");
		map.put(10086, "中国移动");
		map.put(95555, "中国招商");
		System.out.println(map);
		
		// 倒序
		TreeMap<Integer, String> map0 = new TreeMap<Integer, String>(new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return i2-i1;
			}
		});
		
		map0.put(10010, "中国联通");
		map0.put(10000, "中国电信");
		map0.put(10086, "中国移动");
		map0.put(95555, "中国招商");
		System.out.println(map0);
		
		TreeMap<Student, String> stus = new TreeMap<Student, String>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				int ret = s1.age - s2.age;
				if (ret == 0) {
					ret = s1.name.compareTo(s2.name);
				}
				return ret;
			}
		});
		
		stus.put(new Student("zhangsan", 23),"");
		stus.put(new Student("lisisi", 25),"");
		stus.put(new Student("wangwu", 20),"");
		stus.put(new Student("zhaoliu", 20),"");
		System.out.println(stus);
		
	}
}

class Student{
	String name;
	int age;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
```

