package com.qf.ChenJIngLun;

/**
 * @author Cjl
 * @date 2021/9/23 14:48
 */
public class Main {
    public static void main(String[] args) {
        for (int a=0;a<5;a++){
            for (int b=0;b<5;b++){
                for (int c =0;c<=9;c++){
                    if ((100*a+10*b+c+100*b+10*c+c)==532){
                        System.out.println(a+" "+b+" "+c);
                    }
                }

            }
        }
    }


}
