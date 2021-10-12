package com.qf.obj;

public class Demo06 {
	public static void main(String[] args) {
		// ��������������
		Calculator cal = new Calculator();
		// ���üӷ�,��ȡ������
		int sum = cal.getSum(33,55,77,88,99);
		System.out.println(sum);
		
		// ���ó˷�
		int mul = cal.getMul(2,3,5,8,9);
		System.out.println(mul);
		
	}
}

/**
 * 	��������
 */
class Calculator{
	// ����PIԲ����
	public final double PI = 3.141592653589793;
	
	/**
	 *	 �����������������ӵĽ��
	 * @param is
	 * @return
	 */
	public int getSum(int...is) {
		int sum = 0;
		for (int i = 0; i < is.length; i++) {
			sum += is[i];
		}
		return sum;
	}
	
	/**
	 * 	���������������˵Ľ��
	 * @param is
	 * @return
	 */
	public int getMul(int...is) {
		int mul = 1;
		for (int i = 0; i < is.length; i++) {
			mul *= is[i];
		}
		return mul;
	}
}