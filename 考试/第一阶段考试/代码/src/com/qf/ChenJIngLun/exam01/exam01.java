package com.qf.ChenJIngLun.exam01;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class exam01 {

	public static void main(String[] args) {
		TreeMap<Integer,String> t = new TreeMap<Integer,String>(new Comparator<Integer>(){
			@Override
			public int compare(Integer i1, Integer i2) {
				return i2-i1;
			}
		});
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����A");
		int s1 = sc.nextInt();
		System.out.println("������ڶ�����B");
		int s2 = sc.nextInt();
		System.out.println("�������������C");
		int s3 = sc.nextInt();
		t.put(s1,"A" );
		t.put(s2,"B");
		t.put(s3,"C" );
		Set<Integer> ks = t.keySet();
		int count = 0;
		for (Integer s : ks) {
			++count;
			switch (count) {
			case 1 : System.out.println(t.get(s)+"���ֵ��"+s);
					break;
			case 2 : System.out.println(t.get(s)+"��֮��ֵ��"+s);
					break;
			case 3 : System.out.println(t.get(s)+"��С��ֵ��"+s);
					break;
			}
			
		}
		
	}

}
