package com.qf.final0;

public class Demo02 {
	public static void main(String[] args) {
		
	}
}

class Calculator{
	
	/**
	 * º”∑®º∆À„
	 * @param is
	 * @return
	 */
	public final int getSum(int...is) {
		int sum = 0;
		for (int i = 0; i < is.length; i++) {
			sum += is[i];
		}
		return sum;
	}
}

class MyCalculator extends Calculator{
	/*
	@Override
	public int getSum(int... is) {
		return 333;
	}
	*/
}

