package com.qf.obj;

public class Demo02 {
	public static void main(String[] args) {
		/**
			 Class<?> getClass() 
			          返回此 Object 的运行时类。 
			 String toString() 
			          返回该对象的字符串表示。 
			 int hashCode() 
			          返回该对象的哈希码值。 
		  	 boolean equals(Object obj) 
			          指示其他某个对象是否与此对象“相等”。 
			 protected  void finalize() 
			          当垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法。 
		 */
		
		// 判断一个运行时对象的类型
		String str = "";
		System.out.println(str.getClass());
		
		int[] arr = {};
		System.out.println(arr.getClass());
		
		A a = new B();
		System.out.println(a.getClass());
		System.out.println(a instanceof A);
		
	}
}

class A{}

class B extends A{}
