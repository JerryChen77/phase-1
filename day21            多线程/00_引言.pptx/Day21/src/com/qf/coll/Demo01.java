package com.qf.coll;

import java.util.ArrayList;

/**
 * ArrayList是线程不安全的
 * @author Dushine2008
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		for (int i = 0; i < 20; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					for (int j = 0; j < 100; j++) {
						try {
							list.add(Math.random() + "===" + j);
							System.out.println(list);
						} catch (Exception e) {
							e.printStackTrace();
							System.exit(0);
						}
					}
				}
			}).start();
		}
	}
}
