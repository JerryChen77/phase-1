package com.qf.loop;

public class Demo06 {
	public static void main(String[] args) {
		/**
		 * 	����һֵǮ�壬��ĸһֵǮ����������ֵǮһ��
		 * 	��Ǯ��ټ����ʼ��̡���ĸ�����������Σ�
		 */
		
		for (int g = 1; g < 20; g++) {
			for (int m = 1; m < 33 ; m++) {
				for (int x = 3; x < 100; x+=3) {
					// ��������==100 && Ǯ�Ļ���==100
					if ((g+m+x==100) && (g*5+m*3+x/3==100)) {
						System.out.println("����:" + g + ",ĸ��:" + m + ",С��:" + x); 
					}
				}
			}
		}
		// ��������ͬ����������ʮ��ͷ�����о�ʮ���㣬�����ø����Σ�
	}
}
