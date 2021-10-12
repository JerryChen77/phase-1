package com.qf.loop;

public class Demo05 {
	public static void main(String[] args) {
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
		
		int i = 1;
		while (i <= 9) {
			int j = 1;
			while (j <= i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			
			i++;
		}
	}
}
