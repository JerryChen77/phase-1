package com.qf.exam;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 2����дͼ�ι����࣬�������·�����
			a. ���������ε������ߣ����������ε��ܳ�
			b. ���������ε������ߣ����������ε����
		 */
		
		// �������󲢵��÷���--2��
		ShapeUtil shapeUtil = new ShapeUtil();
		
		double per = shapeUtil.getPer(3, 4, 5);
		System.out.println(per);
		
		double area = shapeUtil.getArea(3, 4, 5);
		System.out.println(area);
		
	}
}

class ShapeUtil{
	
	/**
	 * �����������ܳ�--4��
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public double getPer(double a,double b,double c) {
		// �ж��ܲ��ܹ���������
		if ((a+b>c) && (a+c>b) && (b+c>a)) {
			return a+b+c;
		}else {
			System.out.println("�޷�����������");
			return -1;
		}
	}
	
	/**
	 * �������������--4��
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public double getArea(double a,double b,double c) {
		// �ж��ܲ��ܹ���������
		if ((a+b>c) && (a+c>b) && (b+c>a)) {
			// ������ܳ�
			double p = (a+b+c)/2;
			double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
			return area;
		}else {
			System.out.println("�޷�����������");
			return -1;
		}
	}
	
}
