package com.qf.arr;

import java.util.Random;
import java.util.Scanner;

public class Demo13 {
	public static void main(String[] args) {
		/**
		 * 	随机出生成0--100之间的一个整数
		 * 	给7次机会猜，看运气
		 */
		Random r = new Random();
		int num = r.nextInt(100);
		
		Scanner sc = new Scanner(System.in);
		
		int count = 7;
		while (count > 0) {
			count--;
			System.out.println("请猜一个数字(0--100):");
			int i = sc.nextInt();
			// 判断你输入的数字和随机数字
			if (i == num) {
				System.out.println("猜对啦,还剩下机会次数:" + count);
				break;
			} else if (i > num) {
				System.out.println("数字猜大啦啦啦啦");
			} else {
				System.out.println("数字猜小啦啦啦啦");
			}
			System.out.println("还剩下机会:" + count);
		}
	}
}
