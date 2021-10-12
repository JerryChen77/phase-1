package com.qf.dujunqiang.exam03;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * (一)	键盘录入一个字符串
				a)	判断一个字符串是不是对称(2分)
				b)	统计数字、字母、符号出现的次数并输出(3分)
				c)	把输入的字符串按照下面格式输出（拓展，没有得分）
		 */
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串:");
		String str = sc.nextLine();
		
		
		// 判断一个字符串是不是对称
		chargeStr(str);
		
		// 统计数字、字母、符号出现的次数并输出
		classifyStr(str);
		
	}
	
	/**
	 * 判断一个字符串是不是对称
	 * @param str
	 */
	public static void chargeStr(String str) {
		// 获取翻转的字符串
		String newStr = new StringBuffer(str).reverse().toString();
		if (str.equals(newStr)) {
			System.out.println(str + "是一个对称的字符串...");
		} else {
			System.out.println(str + "不是一个对称的字符串...");
		}
	}
	
	/**
	 * 统计数字、字母、符号出现的次数并输出
	 * @param str
	 */
    public static void classifyStr(String str){
        char[] strArr = str.toCharArray();
        int num1 = 0;  //字母
        int num2 = 0;  //数字
        int space = 0; //空格
        int other = 0; //其他
        
        for (int i = 0; i < strArr.length ; i++) {
            int ascii = (int)strArr[i];
            if( 48<= ascii && ascii <= 57){
                num2 += 1;
            } else if(ascii == 32){
                space = space +1;
            } else if((65<= ascii && ascii <= 90) || (97 <= ascii && ascii <=  122)){
                num1 += 1;
            } else{
                other += 1;
            }
        }
        System.out.println(str + "中存在字母个数:" + num1);

        System.out.println(str + "中存在数字个数:" + num2);

        System.out.println(str + "中存在空格个数:" + space);

        System.out.println(str + "中存在其他个数:" + other);

    }
}
