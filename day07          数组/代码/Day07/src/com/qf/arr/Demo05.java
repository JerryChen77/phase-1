package com.qf.arr;

public class Demo05 {
	public static void main(String[] args) {
		String[] names = new String[6];
		
		names[0] = "����";
		names[1] = "��ֲ";
		names[2] = "���Ŵ����";
		names[3] = "�˽���";
		names[4] = "����";
		names[5] = "۩��";
		
		// �������
		for (int i = names.length-1; i >= 0; i--) {
			System.out.println(names[i]);
		}
		
		System.out.println("========");
		
	}
}
