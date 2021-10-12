package com.qf.coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 	使用集合工具类把ArrayList包装成线程安全的对象
 * @author Dushine2008
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		// Vector<E>
		ArrayList<String> list = new ArrayList<String>();
		List<String> synchronizedList = Collections.synchronizedList(list);
		
		for (int i = 0; i < 20; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					for (int j = 0; j < 100; j++) {
						try {
							synchronizedList.add(Math.random() + "====" +j);
							System.out.println(synchronizedList);
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
