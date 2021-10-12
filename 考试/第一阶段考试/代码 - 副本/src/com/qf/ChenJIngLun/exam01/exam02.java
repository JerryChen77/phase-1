package com.qf.ChenJIngLun.exam01;

public class exam02 {
public static void main(String[] args) {
	int count = 0;
	for (int i = 2; i <= 100; i++) {
		boolean flag = true;
		for (int j = 2; j < i; j++) {
			if(i%j==0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.print(i+"\t");
			count++;
			if(count%5==0) {
				System.out.println();
			}
		}
	}
}
}
