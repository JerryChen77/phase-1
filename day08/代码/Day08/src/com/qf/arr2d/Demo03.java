package com.qf.arr2d;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * 	�洢�Ĵ�������һЩ���������
		 * 		ÿ��������һ������������
		 * 		���Ĵ��������ڶ�ά������
		 */
		
		String[][] names = new String[2][];
		
		names[0] = new String[] {"�϶�","���Ӿ�","��ȸ����","Ů��������","�׹Ǿ�","���ȹ���"};
		names[1] = new String[] {"�ֱ���","������","Ѧ����","������"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			
			for (int j = 0; j < names[i].length; j++) {
				System.out.println(names[i][j]);
			}
		}
	}
}
