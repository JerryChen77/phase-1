package com.qf.arr;

public class Demo03 {
	public static void main(String[] args) {
		String[] names = new String[6];
		// 修改数组中的元素
		names[0] = "诸葛亮";
		names[1] = "司马懿";
		names[2] = "庞统";
		names[3] = "周瑜";
		names[4] = "郭嘉";
		
		// 访问元素--获取元素--读取数据--读取元素
		/**
		 * names记录的数组的地址
		 * 	names[0]表示找到names指向数组中的第1个元素(下标为0的元素)
		 */
		String name0 = names[0];
		String name1 = names[1];
		String name2 = names[2];
		String name3 = names[3];
		String name4 = names[4];
		
		System.out.println(name0);
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		
		names[0] = "孔明";
		System.out.println(names[0]);
		
		names[5] = "贾诩";
		System.out.println(names[5]);
		
		// names[10] = "陆逊";
		// System.out.println(names[6]);
		
		/**
		 * int数组，存成绩
		 * String数组，存西游记妖怪名字
		 */
		
	}
}
