package com.qf.dujunqiang.exam01;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * (��) ���100���ڵ�������ÿ���һ��
		 */
		//���ѭ������������i(��Ϊ1�Ȳ�������Ҳ���Ǻ���������ֱ�Ӵ�2��ʼ����)
		int count = 0;
		for (int i = 2; i <= 100; i++) {
			//����һ���߼�ֵ����ֵΪtrue
			boolean flag = true;
			//�ڲ��������j
			for (int j = 2; j < i; j++) {
				//�ж��Ƿ����j������i�������ڣ������flag��ֵ������ѭ��
				if (0 == i % j) {
					flag = false;
					break;
				}
			}
			//����flag��ֵ�ж��Ƿ����i
			if (flag) {
				System.out.print(i + "\t");
				count++;
				if (count % 5 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("OVER");
	}
}
