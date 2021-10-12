package com.qf.static0;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 * 	System.arraycopy(src, srcPos, dest, destPos, length);
			Math.random()
			Arrays.copyOf(original, newLength)
			
			new Random().nextInt(100)
		
		
		 * 有些方法可以使用类名.方法调用
		 * 	这个方法都是用static修饰
		 * 
		 * 有些方法必须先创建对象再使用对象调用
		 */
		
	}
}

class Russians{
	String name;
	int age;
	static String capital = "莫斯科";
	
	public Russians() {
		super();
	}

	public Russians(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("俄罗斯小吃：大列巴、俄罗斯香肠、俄罗斯伏特加");
	}
	
	public void show() {
		System.out.println("Russians [name=" + name + ", age=" + age + ", capital=" + capital + "]");
		System.out.println(this);
	}
	
	public static void showStatic() {
		// 静态方法中不能调用非静态变量
		// System.out.println("Russians [name=" + name + ", age=" + age + ", capital=" + capital + "]");
		// 静态方法中不能调用非静态方法
		// show();
		// 静态方法中不能使用this--静态数据加载时间早于对象
		// System.out.println(this);
	}
}
