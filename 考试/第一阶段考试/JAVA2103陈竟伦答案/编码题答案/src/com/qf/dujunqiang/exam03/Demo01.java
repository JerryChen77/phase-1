package com.qf.dujunqiang.exam03;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * (һ)	����¼��һ���ַ���
				a)	�ж�һ���ַ����ǲ��ǶԳ�(2��)
				b)	ͳ�����֡���ĸ�����ų��ֵĴ��������(3��)
				c)	��������ַ������������ʽ�������չ��û�е÷֣�
		 */
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���:");
		String str = sc.nextLine();
		
		
		// �ж�һ���ַ����ǲ��ǶԳ�
		chargeStr(str);
		
		// ͳ�����֡���ĸ�����ų��ֵĴ��������
		classifyStr(str);
		
	}
	
	/**
	 * �ж�һ���ַ����ǲ��ǶԳ�
	 * @param str
	 */
	public static void chargeStr(String str) {
		// ��ȡ��ת���ַ���
		String newStr = new StringBuffer(str).reverse().toString();
		if (str.equals(newStr)) {
			System.out.println(str + "��һ���ԳƵ��ַ���...");
		} else {
			System.out.println(str + "����һ���ԳƵ��ַ���...");
		}
	}
	
	/**
	 * ͳ�����֡���ĸ�����ų��ֵĴ��������
	 * @param str
	 */
    public static void classifyStr(String str){
        char[] strArr = str.toCharArray();
        int num1 = 0;  //��ĸ
        int num2 = 0;  //����
        int space = 0; //�ո�
        int other = 0; //����
        
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
        System.out.println(str + "�д�����ĸ����:" + num1);

        System.out.println(str + "�д������ָ���:" + num2);

        System.out.println(str + "�д��ڿո����:" + space);

        System.out.println(str + "�д�����������:" + other);

    }
}
