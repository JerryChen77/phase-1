package com.qf.extend;

public class Demo03 {
	public static void main(String[] args) {
		JavaProgrammer jp = new JavaProgrammer();
		jp.work();
	}
}

class Worker{
	String name;
	int age;
	
	public void work() {
		System.out.println("ÿ��Ŭ������");
	}
}

/**
 * 	����̳�Worker
 */
class JavaProgrammer extends Worker{
	/**
	 * 	���Ǽ̳еķ���
	 * 	��д--Override
	 */
	public void work() {
		System.out.println("java����Աÿ��д���롢����bug�����bug,�Ͳ�Ʒ����չ�����ɲ���");
	}
}
