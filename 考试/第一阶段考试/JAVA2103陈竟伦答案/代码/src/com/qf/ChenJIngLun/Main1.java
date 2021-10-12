package com.qf.ChenJIngLun;
import java.util.Scanner;
/**
 * @author Cjl
 * @date 2021/9/23 14:59
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i =str.length()-1;i>=0;i--){
            if (str.charAt(i)==' '){
                System.out.println(str.length()-i-1);
                break;
            }
        }
    }

}
