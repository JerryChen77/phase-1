package com.qf.sb;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 *  StringBuffer() 
			          ����һ�����в����ַ����ַ��������������ʼ����Ϊ 16 ���ַ��� 
			StringBuffer(int capacity) 
			          ����һ�������ַ���������ָ����ʼ�������ַ����������� 
			StringBuffer(String str) 
			          ����һ���ַ��������������������ݳ�ʼ��Ϊָ�����ַ������ݡ� 
		 */
		
		StringBuffer buffer = new StringBuffer();
		System.out.println(buffer);
		System.out.println(buffer.length());
		System.out.println(buffer.capacity());
		
		StringBuffer buffer2 = new StringBuffer(32);
		System.out.println(buffer2);
		System.out.println(buffer2.length());
		System.out.println(buffer2.capacity());
		
		StringBuffer buffer3 = new StringBuffer("��ǰ���¹�");
		System.out.println(buffer3);
		System.out.println(buffer3.length());
		System.out.println(buffer3.capacity());
		
		
	}
}
