package com.qf.obj;

public class Demo02 {
	public static void main(String[] args) {
		/**
			 Class<?> getClass() 
			          ���ش� Object ������ʱ�ࡣ 
			 String toString() 
			          ���ظö�����ַ�����ʾ�� 
			 int hashCode() 
			          ���ظö���Ĺ�ϣ��ֵ�� 
		  	 boolean equals(Object obj) 
			          ָʾ����ĳ�������Ƿ���˶�����ȡ��� 
			 protected  void finalize() 
			          ������������ȷ�������ڶԸö���ĸ�������ʱ���ɶ�����������������ô˷����� 
		 */
		
		// �ж�һ������ʱ���������
		String str = "";
		System.out.println(str.getClass());
		
		int[] arr = {};
		System.out.println(arr.getClass());
		
		A a = new B();
		System.out.println(a.getClass());
		System.out.println(a instanceof A);
		
	}
}

class A{}

class B extends A{}
