package com.qf.arr;

public class Demo13 {
	public static void main(String[] args) {
		String[] name01 = {"˾��ܲ","˾����","˾���","˾����","˾����"};
		String[] name02 = {"���","��Ȩ","���","������"};
		
		// �ϲ���������
		String[] names = new String[name01.length + name02.length];
		
		// ȡ��name01�����е�Ԫ�ط���names
		for (int i = 0; i < name01.length; i++) {
			names[i] = name01[i];
		}
		
		// ��name02�е�Ԫ�ط���names
		for (int i = 0; i < name02.length; i++) {
			names[name01.length + i] = name02[i];
		}
		
		System.out.println(names.length);
		for (String name : names) {
			System.out.println(name);
		}
	}
}
