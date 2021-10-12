package com.qf.ChenJIngLun.exam02;

import java.util.Scanner;

public class exam03 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Factory f =new Factory();
	System.out.println("���������֣�1��С������2:������ ��3����������");
	int num = sc.nextInt();
	Vehicle v = f.chose(num);
	v.start();
	v.run();
}
}
class Vehicle{
	public void start() {
		System.out.println("�ܹ����");
	}
	public void run() {
		System.out.println("�ܹ�����");
	}
}
class Motor extends Vehicle{
	public void start() {
		super.start();
		System.out.println("Ħ�г��ܹ�һ������");
	}
	public void run() {
		super.run();
		System.out.println("Ħ�г��ܹ�������ʻ");
	}
}
class Tractor extends Vehicle{
	public void start() {
		super.start();
		System.out.println("��������ҡ������");
	}
	public void run() {
		super.run();
		System.out.println("��������ʻ����");
	}
}
class Bus extends Vehicle{
	public void start() {
		super.start();
		System.out.println("�������ʽΪ��ť");
	}
	public void run() {
		super.run();
		System.out.println("������ʻ����");
	}
}
class Factory{
	public Vehicle chose(int num) {
		Vehicle v = null;
		switch(num) {
		case 1:
			System.out.println("Ħ�г�");
			v = new Motor();
			break;
		case 2:
			System.out.println("������");
			v = new Tractor();
			break;	
		case 3:
			System.out.println("������");
			v = new Bus();
			break;
		default : 
			System.out.println("������������");
		}
		return v;
	}
}
