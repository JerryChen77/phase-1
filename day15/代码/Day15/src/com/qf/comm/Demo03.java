package com.qf.comm;

import java.math.BigDecimal;

public class Demo03 {
	public static void main(String[] args) {
		System.out.println(1.0 - 0.9);
		System.out.println(10.0 / 3);
		
		BigDecimal bd01 = new BigDecimal("1.00");
		BigDecimal bd02 = new BigDecimal("0.90");
		
		System.out.println(bd01.add(bd02));
		System.out.println(bd01.subtract(bd02));
		System.out.println(bd01.multiply(bd02));
		// System.out.println(bd01.divide(bd02));
		System.out.println(bd01.divide(bd02, 4, BigDecimal.ROUND_HALF_UP));
		
		BigDecimal bd03 = new BigDecimal("10.0");
		BigDecimal bd04 = new BigDecimal("6.0");
		
		System.out.println(bd03.divide(bd04,5,BigDecimal.ROUND_HALF_UP));
	}
}
