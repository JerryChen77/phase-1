package com.qf.dujunqiang.exam01;

public class Demo04 {
	public static void main(String[] args) {
		// ��һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5
		decodeNum(100);
	}
	
	/**
	 * �ֽ�������
	 * @param num
	 */
	public static void decodeNum(int num){
        int tmp = num/2;
        for(int i=2;i <= tmp ;i++){
            if(num%i == 0){
                num = num/i;
                System.out.println("������Ϊ��"+i);
                i=1;
            }
        }
    }
}
