package com.qf.static0;

public class Demo05 {
	public static void main(String[] args) {
		Japanese j1 = new Japanese();
		System.out.println(j1.location);
		Japanese.show();
		Asian.show();
	}
}

class Asian{
	String name;
	int age;
	static String location = "�����򶫰���";
	
	public void eat() {
		System.out.println("�����������Ե��Ӻ�����Ϊ��");
	}
	
	public static void show() {
		System.out.println("�������Ի�����Ϊ��,û���������...");
	}
}

class Japanese extends Asian{
	
	public static void show() {
		System.out.println("�ձ����Ի�����Ϊ��,��ǰ��ߺܵ�...");
	}
}

// private class DD{}