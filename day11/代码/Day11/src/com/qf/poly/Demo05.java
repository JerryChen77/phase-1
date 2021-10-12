package com.qf.poly;

public class Demo05 {
	public static void main(String[] args) {
		// 向上转型--类型小的===》类型大的--天生安全
		byte b01 = 110;
		int i01 = b01;
		
		// 向下转型--类型大的===》类型小的==需要强制转换===》有风险
		int i02 = 1100;
		byte b02 = (byte) i02;
		System.out.println(b02);
	}
}
