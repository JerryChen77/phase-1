package com.qf.inter0;

import com.qf.inter.USB;

public class Demo01 {
	public static void main(String[] args) {
		// 跨包能使用--public修饰的
		System.out.println(USB.Voltage);
	}
}
