package com.qf.ChenJIngLun.exam03;
import java.util.Scanner;
public class exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ���");
		String str = sc.next();
		int count = 0;
		StringBuffer sb = new StringBuffer(str);
		for(int i = 0; i < sb.length()/2 ; i++) {
			int head = sb.codePointAt(i);
			int foot = sb.codePointAt(sb.length()-1-i);
			if(head != foot) {
				count ++;
			}
		}
		if(count != 0) {
			System.out.println("���Գ�");
		}else {
			System.out.println("�Գ�");
		}
		
		int num = 0;
		int abc = 0;
		int sym = 0;
		for (int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i) >=48 && sb.charAt(i) <=57) {
				num++;
			}else if(sb.charAt(i) >=65 && sb.charAt(i) <=90) {
				abc++;
			}else if(sb.charAt(i) >=97 && sb.charAt(i) <=122) {
				abc++;
			}else if(sb.charAt(i) >=33 && sb.charAt(i) <=47) {
				sym++;
			}else if(sb.charAt(i) >=58 && sb.charAt(i) <=63) {
				sym++;
			}else if(sb.charAt(i) >=91 && sb.charAt(i) <=95) {
				sym++;
			}else if(sb.charAt(i) >=123 && sb.charAt(i) <=127) {
				sym++;
			}
		}
		System.out.println("���ָ�����"+num);
		System.out.println("��ĸ������"+abc);
		System.out.println("���Ÿ�����"+sym);
		
	}

}
