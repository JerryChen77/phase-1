package com.qf.arr;

public class Demo04 {
	public static void main(String[] args) {
		String[] name01 = {"吕布","马超","典韦","许褚"};
		String[] name02 = {"林冲","武松","鲁智深","呼延灼"};
		
		String[] names = mergeArr(name01, name02);
		for (String name : names) {
			System.out.println(name);
		}
		
	}
	
	/**
	 * 	合并数组
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static String[] mergeArr(String[] s1,String[] s2) {
		String[] names = new String[s1.length + s2.length];
		
		// 合并s1和s2
		System.arraycopy(s1, 0, names, 0, s1.length);
		System.arraycopy(s2, 0, names, s1.length, s2.length);
		
		// 返回合并之后的数组
		return names;
	}
}
