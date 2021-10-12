package com.qf.func;

public class Demo11 {
	public static void main(String[] args) {
		printShape();
		
		getNum();
		
	}
	
	/**
	 * return在方法结束的时候添加
	 */
	public static void printShape() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// 如果方法的返回值是void,方法结束的时候可以使用return,return后面不能加数据
		return;
	}
	
	// 问：1至1000之间有没有满足“用3除余2 && 用5除余3 && 用7除余2”的数
	public static void getNum() {
		System.out.println("getNum方法kaishi");
		for (int i = 1; i < 1000; i++) {
			if ((i%3==2) && (i%5==3) && (i%7==2)) {
				System.out.println(i);
				// 直接结束方法
				return;
				//break;
			}
		}
		System.out.println("getNum方法结束");
	}
	
}
