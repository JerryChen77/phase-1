package com.qf.inter2;

public abstract class Computer implements Board {
	String type;
	double price;
	
	abstract void powerOn();
	abstract void powerOff();
	
}
