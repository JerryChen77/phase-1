package com.qf.func;

public class Demo12 {
	public static void main(String[] args) {
		/**
		 * 	���ݲ����б�ͷ���ֵ
		 * 		�޲������޷���ֵ
		 * 		�޲������з���ֵ
		 * 		
		 * 		�в������޷���ֵ
		 * 		�в������з���ֵ
		 */
	}
	
	
	/**
	 * 	��ʾ������
	 * 		���������ݹ̶�
	 * 		��Ҫ�õ��κν��
	 */
	public static void notice() {
		System.out.println("��վ�ȷ���,ע����°�ȫ");
	}
	
	
	/**
	 * 	��ѯһЩ����
	 * 		��Ҫ���ز�ѯ�Ľ��
	 * @return
	 */
	public static String getInfo() {
		return "CPU:I5 9300H �ڴ�:32GB Ӳ��:128GB+1T";
	}
	
	/**
	 * 	�����������������
	 * @param name
	 * @param age
	 * @param addr
	 */
	public static void show(String name,int age,String addr) {
		System.out.println("���ǣ�" + name + ",����" + age + ",����:" + addr);
	}
	
	/**
	 * 	����num�Ľ׳�
	 * @param num
	 * @return
	 */
	public static int getMul(int num) {
		int mul = 1;
		for (int i = 1; i < num; i++) {
			mul *= i;
		}
		return mul;
	}
	
}
