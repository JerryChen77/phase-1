package com.qf.ChenJIngLun.exam01;

import java.util.Random;

public class exam03 {

	public static void main(String[] args) {
		Random r = new Random();
		int [] arr = new int [10];
		for (int i = 0; i < arr.length; i++) {
			//随机数0-1000
			arr[i] = r.nextInt(1000);
		}
		int sum = 0;
 		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
 		System.out.println("平均值为：" + sum/arr.length);
		
 		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length -1- i; j++) {
				int temp = 0;
				if(arr[j]< arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
 		for (int i : arr) {
			System.out.println(i);
		}
 		
 		
 		
 		
 		
 		
 		
	}

}
