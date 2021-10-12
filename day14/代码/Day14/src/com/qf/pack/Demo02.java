package com.qf.pack;

public class Demo02 {
	public static void main(String[] args) {
		/**
		 * int		===》	String
		 * String	===》	int
		 * int 		===》	Integer
		 * Integer	===》	int
		 * String	===》	Integer
		 * Integer	===>	String
		 */
		
		// int		===》	String
		int i01 = 110;
		String s01 = i01 + "";
		String s02 = Integer.toString(110);
		
		// String	===》	int
		int i02 = Integer.parseInt("220");
		System.out.println(i02);
		
		// int 		===》	Integer
		Integer i03 = new Integer(330);
		Integer i04 = Integer.valueOf(330);
		
		// Integer	===》	int
		int i004 = i04.intValue();
		System.out.println(i004);
		
		// String	===》	Integer
		Integer i05 = new Integer("550");
		Integer i005 = Integer.valueOf("5500");
		
		/**
		 * 	Integer	===>	String
		 * 	static String toBinaryString(int i) 
			          以二进制（基数 2）无符号整数形式返回一个整数参数的字符串表示形式。 
			static String toHexString(int i) 
			          以十六进制（基数 16）无符号整数形式返回一个整数参数的字符串表示形式。 
			static String toOctalString(int i) 
			          以八进制（基数 8）无符号整数形式返回一个整数参数的字符串表示形式。 
			String toString() 
			          返回一个表示该 Integer 值的 String 对象。 
		 */
		
		String s05 = i005.toString();
		System.out.println(s05);
		
		String binaryString = Integer.toBinaryString(60);
		System.out.println(binaryString);
		
	}
}
