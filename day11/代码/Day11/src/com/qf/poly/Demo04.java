package com.qf.poly;

public class Demo04 {
	public static void main(String[] args) {
		Human human = new Human();
		sing(human);
		
		Human man = new Male();
		sing(man);
		
		sing(new Female());
	}
	
	public static void sing(Male human) {
		human.sing();
	}
	
	public static void sing(Female human) {
		human.sing();
	}
	
	/**
	 * 多态使用创建
	 * 	父类当做方法的形参
	 * @param human
	 */
	public static void sing(Human human) {
		human.sing();
	}
}


class Human{
	public void sing() {
		System.out.println("唱歌这些活动最早是为了祭天酬神");
	}
}

class Male extends Human{
	@Override
	public void sing() {
		System.out.println("男人唱歌比较豪放");
	}
}

class Female extends Human{
	@Override
	public void sing() {
		System.out.println("女人唱歌比较婉约");
	}
}
