package com.qf.extend;

public class Demo04 {
	public static void main(String[] args) {
		Husky husky = new Husky();
		
		Hyena hyena = new Hyena();
		
		husky.eat();
		hyena.eat();
	}
}

class Dog{
	String type;
	String name;
	int age;
	
	public void eat() {
		System.out.println("狗子也要吃东西");
	}
}

/**
 * 	重写父类的方法
 */
class Husky extends Dog{
	
	@Override
	public void eat() {
		System.out.println("哈士奇喜欢吃饼干");
	}
}

/**
 * 	重写父类的方法
 */
class Hyena extends Dog{
	@Override
	public void eat() {
		System.out.println("鬣狗喜欢吃捕获的猎物...");
	}
}


class JiWawa extends Dog{
	
	@Override
	public void eat() {
		System.out.println("吉娃娃喜欢吃苹果");
	}
}
