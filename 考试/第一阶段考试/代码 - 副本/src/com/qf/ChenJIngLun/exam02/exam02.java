package com.qf.ChenJIngLun.exam02;

public class exam02 {

	public static void main(String[] args) {
		Animal b = new Bird();
		b.eat();
		Bird bi = (Bird) b;
		bi.fly();
		bi.eat();
		
	}

}
class Animal{
	public void eat() {
		System.out.println("³Ô¶«Î÷");
	}
}
interface A {
	public void fly();
}
class Bird extends Animal implements A{

	@Override
	public void fly() {
		System.out.println("Äñ¶ù·ÉÏè");
	}
	public void eat() {
		System.out.println("Äñ¶ù³Ô³æ");
	}
}