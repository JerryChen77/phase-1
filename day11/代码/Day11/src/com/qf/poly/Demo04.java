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
	 * ��̬ʹ�ô���
	 * 	���൱���������β�
	 * @param human
	 */
	public static void sing(Human human) {
		human.sing();
	}
}


class Human{
	public void sing() {
		System.out.println("������Щ�������Ϊ�˼������");
	}
}

class Male extends Human{
	@Override
	public void sing() {
		System.out.println("���˳���ȽϺ���");
	}
}

class Female extends Human{
	@Override
	public void sing() {
		System.out.println("Ů�˳���Ƚ���Լ");
	}
}
