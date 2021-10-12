package com.qf.arr;

public class Demo04 {
	public static void main(String[] args) {
		String[] names = new String[6];
		names[0] = "曹操";
		names[1] = "曹丕";
		names[2] = "曹植";
		names[3] = "曹彰";
		names[4] = "曹冲";
		names[5] = "曹仁";
		
		// 访问数组中的所有元素
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		System.out.println(names[5]);
		
		System.out.println("========for循环=========");
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("========while循环=========");
		int index = 0;
		while (index < names.length) {
			System.out.println(names[index]);
			index++;
		}
		
		System.out.println("========foreach循环=========");
		/**
		 * foreach
		 * 	增强for
		 * 	高级for
		 * 	遍历数组、集合等可以迭代的数据
		 * 	不用下标
		 * 
		 * for(元素类型  临时变量 : 目标数组){
		 * 	
		 * }
		 */
		for (String name : names) {
			System.out.println(name);
		}
	
	}
}
