package com.qf.arr;

public class Demo04 {
	public static void main(String[] args) {
		String[] name01 = {"����","��","��Τ","����"};
		String[] name02 = {"�ֳ�","����","³����","������"};
		
		String[] names = mergeArr(name01, name02);
		for (String name : names) {
			System.out.println(name);
		}
		
	}
	
	/**
	 * 	�ϲ�����
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static String[] mergeArr(String[] s1,String[] s2) {
		String[] names = new String[s1.length + s2.length];
		
		// �ϲ�s1��s2
		System.arraycopy(s1, 0, names, 0, s1.length);
		System.arraycopy(s2, 0, names, s1.length, s2.length);
		
		// ���غϲ�֮�������
		return names;
	}
}
