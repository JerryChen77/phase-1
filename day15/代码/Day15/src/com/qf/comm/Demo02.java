package com.qf.comm;

import java.util.Random;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 	�����ʵ����������α���������
		 * 
		 * 	Random() 
			          ����һ���µ�������������� 
			Random(long seed) 
			          ʹ�õ��� long ���Ӵ���һ���µ�������������� 
		 */
		
		Random r = new Random();
		for (int i = 0; i < 20; i++) {
			// 33-88֮��������
			System.out.println(r.nextInt(100));
		}
		
	}
}
