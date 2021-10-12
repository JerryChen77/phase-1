package com.qf.pack;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * int		===��	String
		 * String	===��	int
		 * int 		===��	Integer
		 * Integer	===��	int
		 * String	===��	Integer
		 * Integer	===>	String
		 */
		
		// int		===��	String
		int i01 = 110;
		String s01 = i01 + "";
		String s02 = Integer.toString(110);
		
		// String	===��	int
		int i02 = Integer.parseInt("220");
		System.out.println(i02);
		
		// int 		===��	Integer
		Integer i03 = new Integer(330);
		Integer i04 = Integer.valueOf(330);
		
		// Integer	===��	int
		int i004 = i04.intValue();
		System.out.println(i004);
		
		// String	===��	Integer
		Integer i05 = new Integer("550");
		Integer i005 = Integer.valueOf("5500");
		
		/**
		 * 	Integer	===>	String
		 * 	static String toBinaryString(int i) 
			          �Զ����ƣ����� 2���޷���������ʽ����һ�������������ַ�����ʾ��ʽ�� 
			static String toHexString(int i) 
			          ��ʮ�����ƣ����� 16���޷���������ʽ����һ�������������ַ�����ʾ��ʽ�� 
			static String toOctalString(int i) 
			          �԰˽��ƣ����� 8���޷���������ʽ����һ�������������ַ�����ʾ��ʽ�� 
			String toString() 
			          ����һ����ʾ�� Integer ֵ�� String ���� 
		 */
		
		String s05 = i005.toString();
		System.out.println(s05);
		
		String binaryString = Integer.toBinaryString(60);
		System.out.println(binaryString);
		
	}
}
