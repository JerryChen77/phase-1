package com.qf.comm;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * Math ���������ִ�л�����ѧ����ķ����������ָ����������ƽ���������Ǻ����� 
		    static double abs(double a) 
			          ���� double ֵ�ľ���ֵ�� 
			static double cbrt(double a) 
			          ���� double ֵ���������� 
			static double ceil(double a) 
			          ������С�ģ���ӽ��������double ֵ����ֵ���ڵ��ڲ�����������ĳ�������� 
			static double floor(double a) 
			          �������ģ���ӽ��������double ֵ����ֵС�ڵ��ڲ�����������ĳ�������� 
			static double max(double a, double b) 
			          �������� double ֵ�нϴ��һ���� 
			static double min(double a, double b) 
			          �������� double ֵ�н�С��һ���� 
			static double pow(double a, double b) 
			          ���ص�һ�������ĵڶ����������ݵ�ֵ�� 
			static double random() 
			          ���ش����ŵ� double ֵ����ֵ���ڵ��� 0.0 ��С�� 1.0�� 
			static long round(double a) 
			          ������ӽ������� long�� 
			static int round(float a) 
			          ������ӽ������� int�� 
			static double sqrt(double a) 
			          ������ȷ����� double ֵ����ƽ������ 
		 */
		
		System.out.println(Math.abs(3.3));
		System.out.println(Math.abs(-3.3));
		
		for (int i = 2; i <= 20; i++) {
			System.out.println(i + "����������:" + Math.cbrt(i));
		}
		
		System.out.println(Math.ceil(3.3));
		System.out.println(Math.floor(3.3));
		
		System.out.println(Math.pow(2, 3));
		
		System.out.println(0.01*Math.pow(2, 30));
		
		for (int i = 0; i < 10; i++) {
			// ����33--88֮��������
			System.out.println(Math.random());
		}
		
		System.out.println(Math.round(33.33));
		System.out.println(Math.round(33.55));
		
		for (int i = 2; i <= 20; i++) {
			System.out.println(i + "��ƽ������:" + Math.sqrt(i));
		}
	}
}
