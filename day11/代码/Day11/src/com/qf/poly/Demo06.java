package com.qf.poly;

public class Demo06 {
	public static void main(String[] args) {
		/**
		 * 向上转型
		 * 	类型小的===》类型大的
		 * 	安全
		 * 	只能调用父类的方法
		 * 	多态的核心概念
		 */
		Person p = new Man();
		p.dance();
		
		/**
		 * 向下转型
		 * 	转回小的类型
		 * 	有风险
		 * 	如果转回的是本身的类型--可以调用自己的属性和方法
		 * 
		 * 	如果转换成此父类的其他子类类型会报错：ClassCastException:
		 * 
		 * 	向下转换之前可以使用instanceof关键字检查
		 * 		如果结果为true则可以转
		 * 		否则不可以转
		 */
		
		Man man = (Man) p;
		man.fight();
		
		// Woman woman = (Woman)p;
		
		System.out.println(p instanceof Woman);
		System.out.println(p instanceof Man);
		
	}
}


class Person{
	String name = "人";
	int age = 22;
	
	public void dance() {
		System.out.println("人开心的时候会手舞足蹈...");
	}
	
}

class Man extends Person{
	@Override
	public void dance() {
		super.dance();
		System.out.println("男人喜欢跳迪斯科");
	}
	
	public void fight() {
		System.out.println("男性比较好斗");
	}
}

class Woman extends Person{
	@Override
	public void dance() {
		super.dance();
		System.out.println("女人喜欢跳广场舞");
	}
}
