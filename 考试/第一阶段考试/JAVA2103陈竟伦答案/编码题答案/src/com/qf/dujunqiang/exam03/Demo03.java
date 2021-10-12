package com.qf.dujunqiang.exam03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Demo03 {
	public static void main(String[] args) {
		/**
		 * (三)	(5分)生成双色球存入Map集合，key是颜色，value是排序后的球，效果如下
				a)	红球:[1,2,3,4,5,6]
				b)	蓝球:[7]
		 */
		
		// Map集合，key是颜色，value是排序后的球
		HashMap<String, Collection<Integer>> map = new HashMap<String, Collection<Integer>>();
		
		// 生成红球
		TreeSet<Integer> redBalls = new TreeSet<Integer>();
		getRedBalls(redBalls);
		
		// 生成蓝球
		TreeSet<Integer> blueBalls = new TreeSet<Integer>();
		getBlueBalls(blueBalls);
		
		// 把球放入map集合
		map.put("a红球", redBalls);
		map.put("b蓝球", blueBalls);
		
		Set<Entry<String,Collection<Integer>>> entrySet = map.entrySet();
		for (Entry<String, Collection<Integer>> entry : entrySet) {
			System.out.println(entry);
		}
	}
	
	/**
	 * 生成红球
	 * @param redBalls
	 */
	private static void getRedBalls(TreeSet<Integer> redBalls) {
		Random r = new Random();
		
		while (redBalls.size() < 6) {
			redBalls.add(r.nextInt(33) + 1);
		}
	}
	
	/**
	 * 生成蓝球
	 * @param blueBalls
	 */
	private static void getBlueBalls(TreeSet<Integer> blueBalls) {
		Random r = new Random();
		blueBalls.add(r.nextInt(16) + 1);
	}
}
