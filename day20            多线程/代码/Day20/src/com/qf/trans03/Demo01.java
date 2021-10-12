package com.qf.trans03;

public class Demo01 {
	public static void main(String[] args) {
		Card card = new Card();
		
		BB bb = new BB(card);
		CC cc = new CC(card);
		
		bb.start();
		cc.start();
	}
}
