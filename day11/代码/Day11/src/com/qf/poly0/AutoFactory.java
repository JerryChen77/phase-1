package com.qf.poly0;

/**
 * ��������
 * 	������������
 */
public class AutoFactory {
	public Auto getAuto(int num) {
		/**
		 * 1��С�γ�
		 * 2����ʿ��
		 * 3��������
		 * 4��Ħ�г�
		 * �������ַ���null
		 */
		Auto auto = null;
		// ����num���ض�Ӧ���͵ĳ���
		switch (num) {
		case 1:
			System.out.println("С���������ɹ�");
			auto = new Car();
			break;
		
		case 2:
			System.out.println("��ʿ�������ɹ�");
			auto = new Bus();
			break;
			
		case 3:
			System.out.println("�����������ɹ�");
			auto = new Tractor();
			break;
			
		case 4:
			System.out.println("Ħ�г������ɹ�");
			auto = new MOTOBicycle();
			break;

		default:
			System.err.println("���Ӳ�����");
			break;
		}
		
		return auto;
	}
}
