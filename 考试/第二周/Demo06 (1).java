package com.qf.exam;

public class Demo06 {
	public static void main(String[] args) {
		/**
		 * 编写人类Human，有不少于3个属性和方法，
		 * 编写Human的子类Man和Woman，有独特的属性和方法，创建对象，调用方法和属性
		 */
		// 创建Man对象--2分
		Man man = new Man();
		man.name = "张三";
		man.age = 23;
		man.addr = "九堡";
		man.info = "雄壮的汉子";
		man.show();
		
		// 创建Woman对象--2分
		Woman woman = new Woman();
		woman.name = "张三丫";
		woman.age = 20;
		woman.addr = "下沙";
		woman.info = "温婉的妹子";
		woman.show();
		
	}
}

/**
 * Human类--2分
 * @author Dushine2008
 *
 */
class Human{
	String name;
	int age;
	String addr;
	
	public void eat() {
		System.out.println("人需要进食维持生命活动");
	}
	
	public void sleep() {
		System.out.println("人需要休息");
	}
	
	public void play() {
		System.out.println("人需要娱乐");
	}
}

/**
 * Human子类Man--2分
 * @author Dushine2008
 *
 */
class Man extends Human{
	String info;
	
	public void sing() {
		System.out.println("男人开心的时候会唱歌");
	}
	
	public void show() {
		System.out.println("Man [info=" + info + ", name=" + name + ", age=" + age + ", addr=" + addr + "]");
	}
	
}

/**
 * Human子类Woman--2分
 * @author Dushine2008
 *
 */
class Woman extends Human{
	String info;
	
	public void dance() {
		System.out.println("女人开心的时候跳舞");
	}
	
	public void show() {
		System.out.println("Woman [info=" + info + ", name=" + name + ", age=" + age + ", addr=" + addr + "]");
	}
}
