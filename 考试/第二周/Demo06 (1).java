package com.qf.exam;

public class Demo06 {
	public static void main(String[] args) {
		/**
		 * ��д����Human���в�����3�����Ժͷ�����
		 * ��дHuman������Man��Woman���ж��ص����Ժͷ������������󣬵��÷���������
		 */
		// ����Man����--2��
		Man man = new Man();
		man.name = "����";
		man.age = 23;
		man.addr = "�ű�";
		man.info = "��׳�ĺ���";
		man.show();
		
		// ����Woman����--2��
		Woman woman = new Woman();
		woman.name = "����Ѿ";
		woman.age = 20;
		woman.addr = "��ɳ";
		woman.info = "���������";
		woman.show();
		
	}
}

/**
 * Human��--2��
 * @author Dushine2008
 *
 */
class Human{
	String name;
	int age;
	String addr;
	
	public void eat() {
		System.out.println("����Ҫ��ʳά�������");
	}
	
	public void sleep() {
		System.out.println("����Ҫ��Ϣ");
	}
	
	public void play() {
		System.out.println("����Ҫ����");
	}
}

/**
 * Human����Man--2��
 * @author Dushine2008
 *
 */
class Man extends Human{
	String info;
	
	public void sing() {
		System.out.println("���˿��ĵ�ʱ��ᳪ��");
	}
	
	public void show() {
		System.out.println("Man [info=" + info + ", name=" + name + ", age=" + age + ", addr=" + addr + "]");
	}
	
}

/**
 * Human����Woman--2��
 * @author Dushine2008
 *
 */
class Woman extends Human{
	String info;
	
	public void dance() {
		System.out.println("Ů�˿��ĵ�ʱ������");
	}
	
	public void show() {
		System.out.println("Woman [info=" + info + ", name=" + name + ", age=" + age + ", addr=" + addr + "]");
	}
}
