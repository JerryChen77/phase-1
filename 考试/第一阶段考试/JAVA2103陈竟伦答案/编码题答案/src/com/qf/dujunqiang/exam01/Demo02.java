package com.qf.dujunqiang.exam01;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * (二) 输出100以内的素数，每五个一行
		 */
		//外层循环遍历被除数i(因为1既不是素数也不是和数，所以直接从2开始遍历)
		int count = 0;
		for (int i = 2; i <= 100; i++) {
			//定义一个逻辑值，初值为true
			boolean flag = true;
			//内层遍历除数j
			for (int j = 2; j < i; j++) {
				//判断是否存在j能整除i，若存在，则更改flag的值并跳出循环
				if (0 == i % j) {
					flag = false;
					break;
				}
			}
			//根据flag的值判断是否输出i
			if (flag) {
				System.out.print(i + "\t");
				count++;
				if (count % 5 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("OVER");
	}
}
