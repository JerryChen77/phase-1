package com.qf.func;

public class Demo11 {
	public static void main(String[] args) {
		printShape();
		
		getNum();
		
	}
	
	/**
	 * return�ڷ���������ʱ�����
	 */
	public static void printShape() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// ��������ķ���ֵ��void,����������ʱ�����ʹ��return,return���治�ܼ�����
		return;
	}
	
	// �ʣ�1��1000֮����û�����㡰��3����2 && ��5����3 && ��7����2������
	public static void getNum() {
		System.out.println("getNum����kaishi");
		for (int i = 1; i < 1000; i++) {
			if ((i%3==2) && (i%5==3) && (i%7==2)) {
				System.out.println(i);
				// ֱ�ӽ�������
				return;
				//break;
			}
		}
		System.out.println("getNum��������");
	}
	
}
