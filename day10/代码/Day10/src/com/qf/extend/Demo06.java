package com.qf.extend;

import com.qf.modify.DD;

public class Demo06 {
	public static void main(String[] args) {
		DD dd = new DD();
		DDD ddd = new DDD();
		ddd.show();
	}
}

class DDD extends DD{
	public void show() {
		System.out.println(ddprotected);
		System.out.println(ddPublic);
	}
}
