package com.qf.sys;

public class Demo02 {
	public static void main(String[] args) {
		// gc
		for (int i = 0; i < 10; i++) {
			new Stu("张三" + i);
			// 手动调用垃圾回收器
			System.gc();
		}
		System.out.println("OVER");
	}
}

class Stu {
	String name;

	public Stu(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Stu [name=" + name + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(name + "被回收啦啦啦啦");
	}
}
