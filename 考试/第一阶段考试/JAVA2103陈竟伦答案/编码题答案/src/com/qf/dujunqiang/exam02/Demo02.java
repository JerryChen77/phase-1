package com.qf.dujunqiang.exam02;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * (��)	(5��)�봴��һ��Animal������
				Ҫ���з���eat�����������������һ����䡰�Զ������� 
				
				����һ���ӿ�A���ӿ�����һ�����󷽷�fly������
				
				����һ��Bird��̳�Animal�ࡣ
				ʵ�ֽӿ�A��ķ������һ������䡰������衱��
				��дeat�����������һ����䡰��� �Գ桱��
				
				��Test��������ת�ʹ���b���󣬵���eat������
				Ȼ������ת�͵���eat������ ����fly����������
				����������ͬһ��Java�ļ���ʵ��
		 */
		// ����ת�ʹ���b���󣬵���eat����
		Animal b = new Bird();
		b.eat();
		
		// ����ת�͵���eat������ ����fly��������
		Bird bb = (Bird) b;
		bb.eat();
		bb.fly();
		
	}
}

/**
 * �봴��һ��Animal������
 * Ҫ���з���eat�����������������һ����䡰�Զ�����
 * @author Dushine2008
 */
class Animal{
	public void eat() {
		System.out.println("������Ҫ��ʳ...");
	}
}

/**
 * ����һ���ӿ�A���ӿ�����һ�����󷽷�fly����
 * @author Dushine2008
 *
 */
interface A{
	void fly();
}


/**
 * ����һ��Bird��̳�Animal��
 * ʵ�ֽӿ�A��ķ������һ������䡰������衱
 * ��дeat�����������һ����䡰��� �Գ桱��
 * @author Dushine2008
 */
class Bird extends Animal implements A{
	
	@Override
	public void eat() {
		System.out.println("����Գ���...");
	}

	@Override
	public void fly() {
		System.out.println("�������...");
	}
	
}