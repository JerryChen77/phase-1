package com.qf.block;

public class Demo01 {
	int num = 20;
	public static void main(String[] args) {
		System.out.println("HelloWorld001");
		System.out.println("HelloWorld002");
		System.out.println("HelloWorld003");
		int num = 10;
		System.out.println("num = " + num);
		
		{
			// 꼻�һ��
			int n = 110;
			num = 33;
			System.out.println("���Ǿֲ������...");
			System.out.println("n = " + n);
		}
		// System.out.println("n = " + n);
		
		System.out.println("HelloWorld004");
		System.out.println("HelloWorld005");
		System.out.println("HelloWorld006");
		
		// �ֲ�����
		System.out.println(num);
	}
}
