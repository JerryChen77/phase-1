package com.qf.exception;

import java.text.ParseException;

public class Demo09 {
	public static void main(String[] args) {
		
	}
}

class F{
	public void show() throws ParseException{
		System.out.println("�����show����");
	}
}

class S extends F{
	@Override
	public void show() throws ParseException{
		super.show();
	}
}