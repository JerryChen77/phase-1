package com.qf.inner;

public class Demo05 {
	public static void main(String[] args) {
		// Outer0 outer0 = new Outer0();
		System.out.println(Outer0.Inner0.strInnerStatic);
	}
}

class Outer0{
	static {
		System.out.println("�����ⲿ��ľ�̬�����...");
	}
	
	
	static class Inner0{
		static String strInnerStatic = "��̬�ڲ��ྲ̬����";
		static {
			System.out.println("�����ڲ���ľ�̬�����...");
		}
	}
}
