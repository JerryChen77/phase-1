package com.qf.loop;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * * * * * * * * * * 
		 * * * * * * * * * * 
		 * * * * * * * * * * 
		 * * * * * * * * * * 
		 * * * * * * * * * * 
		 * * * * * * * * * * 
		 * * * * * * * * * * 
		 * * * * * * * * * * 
		 * * * * * * * * * * 
		 */
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		/**
		 * 
		 * * 
		 * * * 
		 * * * * 
		 * * * * * 
		 * * * * * *
		 * * * * * * * 
		 * * * * * * * *
		 * * * * * * * * *
		 * 
		 * 	ÐÐÊý	i	j
		 * 	1	0	0
		 * 	2	1	1
		 * 	3	2	2
		 */
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("===============");
		
		/**
		 * * * * * * * * * 
		 * * * * * * * * 
		 * * * * * * * 
		 * * * * * * 
		 * * * * * 
		 * * * * 
		 * * * 
		 * *
		 * 
		 * 
		 * 	ÐÐ	i	j
		 * 	1	0	8	j=8-i
		 * 	2	1	7
		 * 	3	2	6
		 * 
		 */
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
