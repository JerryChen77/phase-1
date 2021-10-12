package com.qf.demos;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	���ֹ���ʦ
			����
				ITProgrammer
			����
				JavaProgrammer
				UiProgrammer
				DBAProgrammer
			ÿ�ֹ���ʦ�����Լ��Ĺ������ݣ���������������
		
			�����������show����������ITProgrammer��������󣬸��ݲ�ͬ������������ǵķ���չʾ������Ϣ
		 */
		
		show(new JavaProgrammer());
		
		System.out.println("============");
		
		show(new UiProgrammer());
		
		System.out.println("+=================+");
		
		show(new DBAProgrammer());
		
	}
	
	/**
	 * չʾITProgrammer����ķ���
	 * @param programmer
	 */
	public static void show(ITProgrammer programmer) {
		if (programmer instanceof JavaProgrammer) {
			programmer.coding();
			programmer.dress();
			((JavaProgrammer) programmer).liveAlone();
		} else if (programmer instanceof UiProgrammer) {
			programmer.coding();
			programmer.dress();
			((UiProgrammer) programmer).shopping();
		} else if (programmer instanceof DBAProgrammer) {
			programmer.coding();
			programmer.dress();
			((DBAProgrammer) programmer).putIntoPrison();
		} else {
			System.err.println("��������Ͳ�����...");
		}
	}
}
