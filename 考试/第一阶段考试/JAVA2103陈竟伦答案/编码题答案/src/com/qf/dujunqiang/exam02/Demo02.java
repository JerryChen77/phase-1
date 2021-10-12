package com.qf.dujunqiang.exam02;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * (二)	(5分)请创建一个Animal动物类
				要求有方法eat（）方法，方法输出一条语句“吃东西”。 
				
				创建一个接口A，接口里有一个抽象方法fly（）。
				
				创建一个Bird类继承Animal类。
				实现接口A里的方法输出一条有语句“鸟儿飞翔”。
				重写eat（）方法输出一条语句“鸟儿 吃虫”。
				
				在Test类中向上转型创建b对象，调用eat方法。
				然后向下转型调用eat（）方 法、fly（）方法。
				以上内容在同一个Java文件中实现
		 */
		// 向上转型创建b对象，调用eat方法
		Animal b = new Bird();
		b.eat();
		
		// 向下转型调用eat（）方 法、fly（）方法
		Bird bb = (Bird) b;
		bb.eat();
		bb.fly();
		
	}
}

/**
 * 请创建一个Animal动物类
 * 要求有方法eat（）方法，方法输出一条语句“吃东西”
 * @author Dushine2008
 */
class Animal{
	public void eat() {
		System.out.println("动物需要进食...");
	}
}

/**
 * 创建一个接口A，接口里有一个抽象方法fly（）
 * @author Dushine2008
 *
 */
interface A{
	void fly();
}


/**
 * 创建一个Bird类继承Animal类
 * 实现接口A里的方法输出一条有语句“鸟儿飞翔”
 * 重写eat（）方法输出一条语句“鸟儿 吃虫”。
 * @author Dushine2008
 */
class Bird extends Animal implements A{
	
	@Override
	public void eat() {
		System.out.println("鸟儿吃虫子...");
	}

	@Override
	public void fly() {
		System.out.println("鸟儿飞翔...");
	}
	
}