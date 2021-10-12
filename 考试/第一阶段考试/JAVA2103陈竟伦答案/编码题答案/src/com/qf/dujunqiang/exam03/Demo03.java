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
		 * (��)	(5��)����˫ɫ�����Map���ϣ�key����ɫ��value����������Ч������
				a)	����:[1,2,3,4,5,6]
				b)	����:[7]
		 */
		
		// Map���ϣ�key����ɫ��value����������
		HashMap<String, Collection<Integer>> map = new HashMap<String, Collection<Integer>>();
		
		// ���ɺ���
		TreeSet<Integer> redBalls = new TreeSet<Integer>();
		getRedBalls(redBalls);
		
		// ��������
		TreeSet<Integer> blueBalls = new TreeSet<Integer>();
		getBlueBalls(blueBalls);
		
		// �������map����
		map.put("a����", redBalls);
		map.put("b����", blueBalls);
		
		Set<Entry<String,Collection<Integer>>> entrySet = map.entrySet();
		for (Entry<String, Collection<Integer>> entry : entrySet) {
			System.out.println(entry);
		}
	}
	
	/**
	 * ���ɺ���
	 * @param redBalls
	 */
	private static void getRedBalls(TreeSet<Integer> redBalls) {
		Random r = new Random();
		
		while (redBalls.size() < 6) {
			redBalls.add(r.nextInt(33) + 1);
		}
	}
	
	/**
	 * ��������
	 * @param blueBalls
	 */
	private static void getBlueBalls(TreeSet<Integer> blueBalls) {
		Random r = new Random();
		blueBalls.add(r.nextInt(16) + 1);
	}
}
