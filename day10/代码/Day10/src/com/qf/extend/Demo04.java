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
		System.out.println("����ҲҪ�Զ���");
	}
}

/**
 * 	��д����ķ���
 */
class Husky extends Dog{
	
	@Override
	public void eat() {
		System.out.println("��ʿ��ϲ���Ա���");
	}
}

/**
 * 	��д����ķ���
 */
class Hyena extends Dog{
	@Override
	public void eat() {
		System.out.println("�๷ϲ���Բ��������...");
	}
}


class JiWawa extends Dog{
	
	@Override
	public void eat() {
		System.out.println("������ϲ����ƻ��");
	}
}
