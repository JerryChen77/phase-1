package com.qf.arr2d;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * 	存储四大名著中一些人物的名字
		 * 		每个名著是一个独立的数组
		 * 		把四大名著放在二维数组中
		 */
		
		String[][] names = new String[2][];
		
		names[0] = new String[] {"嫦娥","兔子精","孔雀公主","女儿国国王","白骨精","铁扇公主"};
		names[1] = new String[] {"贾宝玉","林黛玉","薛宝钗","王熙凤"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			
			for (int j = 0; j < names[i].length; j++) {
				System.out.println(names[i][j]);
			}
		}
	}
}
