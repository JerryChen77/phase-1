package com.qf.dujunqiang.exam01;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * (һ) ����¼���������֣��Ƚ����ǵĴ�С˳��
		 * 33	22	11
		 * 33	11	22
		 * 
		 * 11	33	22
		 * 22	33	11
		 * 
		 * 11	22	33	
		 * 22	11	33
		 */
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ�����ݣ�");
		int a = sc.nextInt();

		System.out.println("������ڶ������ݣ�");
		int b = sc.nextInt();

		System.out.println("��������������ݣ�");
		int c = sc.nextInt();

		if (a > b && b > c ) {
			System.out.println("a������:a=" + a);
			System.out.println("b���м�����:b=" + b);
			System.out.println("c����С��:c=" + c);
		} else if(a > c && c > b){
			System.out.println("a������:a=" + a);
			System.out.println("c���м�����:c=" + c);
			System.out.println("b����С��:b=" + b);
		} else if(b > a && a > c){
			System.out.println("b������:b=" + b);
			System.out.println("a���м�����:a=" + a);
			System.out.println("c����С��:c=" + c);
		} else if(b > c && c > a){
			System.out.println("b������:b=" + b);
			System.out.println("c���м�����:c=" + c);
			System.out.println("a����С��:a=" + a);
		} else if(c > a && a > b){
			System.out.println("c������:c=" + c);
			System.out.println("a���м�����:a=" + a);
			System.out.println("b����С��:b=" + b);
		} else if(c > b && b > a){
			System.out.println("c������:c=" + c);
			System.out.println("b���м�����:b=" + b);
			System.out.println("a����С��:a=" + a);
		} else {
			System.out.println("�����ֳ�������ȵ����������");
		}
	}
}
