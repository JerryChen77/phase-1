package com.qf.arr;

public class Demo04 {
	public static void main(String[] args) {
		String[] names = new String[6];
		names[0] = "�ܲ�";
		names[1] = "��ا";
		names[2] = "��ֲ";
		names[3] = "����";
		names[4] = "�ܳ�";
		names[5] = "����";
		
		// ���������е�����Ԫ��
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		System.out.println(names[5]);
		
		System.out.println("========forѭ��=========");
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("========whileѭ��=========");
		int index = 0;
		while (index < names.length) {
			System.out.println(names[index]);
			index++;
		}
		
		System.out.println("========foreachѭ��=========");
		/**
		 * foreach
		 * 	��ǿfor
		 * 	�߼�for
		 * 	�������顢���ϵȿ��Ե���������
		 * 	�����±�
		 * 
		 * for(Ԫ������  ��ʱ���� : Ŀ������){
		 * 	
		 * }
		 */
		for (String name : names) {
			System.out.println(name);
		}
	
	}
}
