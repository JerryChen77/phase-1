package com.qf.exam;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 * 编写代码，分别使用for和while打印输出99乘法表
		 */
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			}
			System.out.println();
		}
		
		
		int i = 1;
		while (i <= 9) {
			int j = 1;
			while (j <= i) {
				System.out.print(j + "*" + i + "=" + i*j + "\t");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
