package com.qf.coll;

import java.util.Collection;
import java.util.HashSet;

public class Demo02 {
	public static void main(String[] args) {
		Collection c = new HashSet();
		System.out.println(c);
		
		c.add("��ǰ���¹�");
		System.out.println(c);
		System.out.println(c.size());
		
		c.add(true);
		c.add(3.14);
		c.add(3.14);
		c.add(110);
		c.add(new Stu("���", 23));
		
		System.out.println(c);
		System.out.println(c.size());
	}
}
