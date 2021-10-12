package com.qf.sb;

public class Demo02 {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		//builder.append("��ǰ���¹�");
		
		StringBuffer buffer = new StringBuffer();
		//buffer.append("abcdefgabcdefg");
		
		addData(buffer);
		addData(builder);
		
	}
	
	/**
	 * 	ͳ��StringBuffer����10�����������ĵ�ʱ��
	 *	 @param buffer
	 */
	public static void addData(StringBuffer buffer) {
		long startTime = System.currentTimeMillis();
		//builder.ensureCapacity(10000008);
		 for (int i = 0; i < 100000000; i++) {
			buffer.append(i);
		 }
		 long endTime = System.currentTimeMillis();
		 System.out.println(endTime - startTime);
		
	}
	
	/**
	 * 	ͳ��StringBuilder����10�����������ĵ�ʱ��
	 *	 @param buffer
	 */
	public static void addData(StringBuilder builder) {
		long startTime = System.currentTimeMillis();
		builder.ensureCapacity(100000008);
		for (int i = 0; i < 100000000; i++) {
			builder.append(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}
