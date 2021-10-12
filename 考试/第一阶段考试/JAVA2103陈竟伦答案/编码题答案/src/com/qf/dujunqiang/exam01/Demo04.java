package com.qf.dujunqiang.exam01;

public class Demo04 {
	public static void main(String[] args) {
		// 将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5
		decodeNum(100);
	}
	
	/**
	 * 分解质因数
	 * @param num
	 */
	public static void decodeNum(int num){
        int tmp = num/2;
        for(int i=2;i <= tmp ;i++){
            if(num%i == 0){
                num = num/i;
                System.out.println("质因数为："+i);
                i=1;
            }
        }
    }
}
