package com.qf.exception;

public class Demo07 {
	public static void main(String[] args) {
		try {
			System.out.println("HelloWorld001");
			// try������������κ��쳣������Ĵ��벻��ִ�У�ִ��catch�еĴ���
			System.out.println(10 / 0);
			
			System.out.println("HelloWorld002");
			System.out.println("Hello".charAt(110));
			
			System.out.println("HelloWorld003");
			String[] arr = new String[10];
			System.out.println(arr[10].length());
			
			System.out.println("HelloWorld004");
			System.out.println(arr[0].length());
			
			System.out.println("HelloWorld005");
			System.out.println("HelloWorld006");
			System.out.println("HelloWorld007");
		} catch (Exception e) {
			System.err.println("�����д���");
			// return;
			System.exit(0);
		} finally {
			System.out.println("OVER");
		}
	}
}
