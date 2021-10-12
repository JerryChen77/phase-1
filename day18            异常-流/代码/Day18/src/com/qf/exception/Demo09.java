package com.qf.exception;

import java.text.ParseException;

public class Demo09 {
	public static void main(String[] args) {
		
	}
}

class F{
	public void show() throws ParseException{
		System.out.println("父类的show方法");
	}
}

class S extends F{
	@Override
	public void show() throws ParseException{
		super.show();
	}
}