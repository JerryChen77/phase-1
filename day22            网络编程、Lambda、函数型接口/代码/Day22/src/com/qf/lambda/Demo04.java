package com.qf.lambda;

public class Demo04 {
	public static void main(String[] args) {
		Sum s1 = new Sum() {
			@Override
			public int getSum(int a, int b) {
				return a+b;
			}
		};
		int sum01 = s1.getSum(33, 55);
		System.out.println(sum01);
		
		Sum s2 = (a,b) -> a+b;
		int sum02 = s2.getSum(33, 55);
		System.out.println(sum02);
	}
}

/**
 * 	函数型接口
 * @author Dushine2008
 *
 */
@FunctionalInterface
interface Sum{
	int getSum(int a,int b);
}
