package com.qf.arr;

public class Demo03 {
	public static void main(String[] args) {
		String[] names = new String[6];
		// �޸������е�Ԫ��
		names[0] = "�����";
		names[1] = "˾��ܲ";
		names[2] = "��ͳ";
		names[3] = "���";
		names[4] = "����";
		
		// ����Ԫ��--��ȡԪ��--��ȡ����--��ȡԪ��
		/**
		 * names��¼������ĵ�ַ
		 * 	names[0]��ʾ�ҵ�namesָ�������еĵ�1��Ԫ��(�±�Ϊ0��Ԫ��)
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
		
		names[0] = "����";
		System.out.println(names[0]);
		
		names[5] = "��ڼ";
		System.out.println(names[5]);
		
		// names[10] = "½ѷ";
		// System.out.println(names[6]);
		
		/**
		 * int���飬��ɼ�
		 * String���飬�����μ���������
		 */
		
	}
}
