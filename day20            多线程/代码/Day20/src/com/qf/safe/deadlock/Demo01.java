package com.qf.safe.deadlock;

public class Demo01 {
	public static void main(String[] args) {
		BB01 bb = new BB01();
		CC01 cc = new CC01();
		
		bb.start();
		cc.start();
	}
}