package com.qf.arr;

import java.util.Scanner;

public class Demo07 {
	public static void main(String[] args) {
		/**
		 *  	数组中元素的默认值
		 * 	基本类型
		 * 		类型		默认值
		 * 		byte	0
		 * 		short	0
		 * 		int		0
		 * 		long	0
		 * 		float	0.0
		 * 		double	0.0	
		 * 		boolean	false
		 * 		char	\u0000
		 * 	引用类型
		 * 		String	null
		 * 		System	null
		 * 		Scanner	null
		 * 		... ...
		 */
		System.out.println("========byte=========");
		byte[] arrByte = new byte[10];
		System.out.println(arrByte[0]);
		System.out.println(arrByte[1]);
		System.out.println(arrByte[2]);
		
		System.out.println("========short=========");
		short[] arrShort = new short[10];
		System.out.println(arrShort[0]);
		System.out.println(arrShort[3]);
		System.out.println(arrShort[7]);
		
		System.out.println("========int=========");
		int[] arrInt = new int[10];
		System.out.println(arrInt[3]);
		System.out.println(arrInt[6]);
		System.out.println(arrInt[9]);
		
		System.out.println("========long=========");
		long[] arrLong = new long[10];
		System.out.println(arrLong[1]);
		System.out.println(arrLong[4]);
		System.out.println(arrLong[7]);
		
		System.out.println("========float=========");
		float[] arrFloat = new float[10];
		System.out.println(arrFloat[2]);
		System.out.println(arrFloat[5]);
		System.out.println(arrFloat[8]);
		
		// ctrl + alt + ↓
		
		System.out.println("========double=========");
		double[] arrDouble = new double[10];
		System.out.println(arrDouble[3]);
		System.out.println(arrDouble[5]);
		System.out.println(arrDouble[7]);
		
		System.out.println("========boolean=========");
		boolean[] arrBoolean = new boolean[10];
		System.out.println(arrBoolean[1]);
		System.out.println(arrBoolean[5]);
		System.out.println(arrBoolean[9]);
		
		System.out.println("========char=========");
		char[] arrChar = new char[10];
		System.out.println(arrChar[4]);
		System.out.println(arrChar[5]);
		System.out.println(arrChar[6]);
		
		System.out.println("========String=========");
		String[] arrString = new String[10];
		System.out.println(arrString[7]);
		System.out.println(arrString[8]);
		System.out.println(arrString[9]);
		
		System.out.println("========Scanner=========");
		Scanner[] arrScanner = new Scanner[10];
		System.out.println(arrScanner[1]);
		System.out.println(arrScanner[2]);
		System.out.println(arrScanner[3]);
		
		System.out.println("========Object=========");
		Object[] arrObject = new Object[10];
		System.out.println(arrObject[2]);
		System.out.println(arrObject[5]);
		System.out.println(arrObject[8]);
		
	}
}
