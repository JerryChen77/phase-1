package com.qf.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 * 	����¼�����֣�����100����������ֵĽ��
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�����ֱ�100��:");
		
		
		try {
			int num = sc.nextInt();
			System.out.println(100 / num);
		} catch (ArithmeticException e) {
			// e.printStackTrace();
			System.err.println("��������Ϊ0��������");
		} catch (InputMismatchException e) {
			// e.printStackTrace();
			System.err.println("��������ֱ���������");
			System.out.println(10 / 0);
		} catch (Exception e) {
			// e.printStackTrace();
			System.err.println("δ֪�쳣");
		} finally {
			System.out.println("������ֹ");
		}
		
		
	}
}
