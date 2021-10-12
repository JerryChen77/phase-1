package com.qf.coll;

import java.util.ArrayList;
import java.util.Collection;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 *	删
			 boolean remove(Object o) 
			          从此 collection 中移除指定元素的单个实例，如果存在的话（可选操作）。 
			 boolean removeAll(Collection<?> c) 
			          移除此 collection 中那些也包含在指定 collection 中的所有元素（可选操作）。 
			 boolean retainAll(Collection<?> c) 
			          仅保留此 collection 中那些也包含在指定 collection 的元素（可选操作）。
			 void clear() 
			          移除此 collection 中的所有元素（可选操作）。 
		 */
		
		Collection c = new ArrayList();
		
		c.add("宋江");
		c.add("宋江");
		c.add("卢俊义");
		c.add("吴用");
		c.add("公孙胜");
		c.add("关胜");
		c.add("林冲");
		c.add("秦明");
		c.add("呼延灼");
		c.add("武松");
		
		// 移除指定元素的单个实例
		boolean b = c.remove("宋江");
		System.out.println(b);
		
		b = c.remove("宋江");
		System.out.println(b);
		
		Collection cc = new ArrayList();
		
		cc.add("武松");
		cc.add("武植");
		cc.add("潘金莲");
		cc.add("王婆");
		
		// 移除集合交集部分内容
		b = c.removeAll(cc);
		System.out.println(b);
		System.out.println(c);
		System.out.println(cc);
		
		b = c.removeAll(cc);
		System.out.println(b);
		System.out.println(c);
		System.out.println(cc);
		
		c.add("武松");
		System.out.println(c);
		System.out.println(cc);
		
		// 只保留交集
		c.retainAll(cc);
		
		System.out.println(c);
		System.out.println(cc);
		
		c.clear();
		System.out.println(c);
		
	}
}
