package com.qf.ChenJIngLun.exam02;

import java.util.Scanner;

public class exam03 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Factory f =new Factory();
	System.out.println("请输入数字（1：小汽车，2:拖拉机 ，3：公交车）");
	int num = sc.nextInt();
	Vehicle v = f.chose(num);
	v.start();
	v.run();
}
}
class Vehicle{
	public void start() {
		System.out.println("能够点火");
	}
	public void run() {
		System.out.println("能够开动");
	}
}
class Motor extends Vehicle{
	public void start() {
		super.start();
		System.out.println("摩托车能够一键启动");
	}
	public void run() {
		super.run();
		System.out.println("摩托车能够高速行驶");
	}
}
class Tractor extends Vehicle{
	public void start() {
		super.start();
		System.out.println("拖拉机用摇把启动");
	}
	public void run() {
		super.run();
		System.out.println("拖拉机行驶缓慢");
	}
}
class Bus extends Vehicle{
	public void start() {
		super.start();
		System.out.println("公交点火方式为旋钮");
	}
	public void run() {
		super.run();
		System.out.println("公交行驶缓慢");
	}
}
class Factory{
	public Vehicle chose(int num) {
		Vehicle v = null;
		switch(num) {
		case 1:
			System.out.println("摩托车");
			v = new Motor();
			break;
		case 2:
			System.out.println("拖拉机");
			v = new Tractor();
			break;	
		case 3:
			System.out.println("公交车");
			v = new Bus();
			break;
		default : 
			System.out.println("输入数字有误");
		}
		return v;
	}
}
