package com.qf.arr;

public class Demo01 {
	public static void main(String[] args) {
		int sum = getSum(33,55);
		System.out.println(sum);
		
		show("����",23,"���ݽ������ű�");
	}

	/**
	 * 	���ҽ��ܵķ���
	 * @param name	��������
	 * @param age	��������
	 * @param addr	��������
	 */
	public static void show(String name, int age, String addr) {
		System.out.println("����:" + name + ",����:" + age + ",����:" + addr);
	}

	/**
	 * 	��������������ӵĽ��
	 * @param i	��������
	 * @param j	��������
	 * @return	��������
	 */
	public static int getSum(int i, int j) {
		return i+j;
	}
	
	
}
