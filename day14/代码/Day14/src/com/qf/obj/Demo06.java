package com.qf.obj;

public class Demo06 {
	public static void main(String[] args) {
		for (int i = 0; i < 1000000; i++) {
			new Fish("zhangsan" + i, 2);
		}
		System.out.println("OVER");
		
	}
}

class Fish {
	String name;
	int age;

	public Fish(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Fish [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(name + "被垃圾回收器回收啦啦啦啦");
	}

}
