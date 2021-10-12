package com.qf.loop;

public class Demo06 {
	public static void main(String[] args) {
		/**
		 * 	鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。
		 * 	百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
		 */
		
		for (int g = 1; g < 20; g++) {
			for (int m = 1; m < 33 ; m++) {
				for (int x = 3; x < 100; x+=3) {
					// 鸡的数量==100 && 钱的花费==100
					if ((g+m+x==100) && (g*5+m*3+x/3==100)) {
						System.out.println("公鸡:" + g + ",母鸡:" + m + ",小鸡:" + x); 
					}
				}
			}
		}
		// 今有雉兔同笼，上有三十五头，下有九十四足，问雉兔各几何？
	}
}
