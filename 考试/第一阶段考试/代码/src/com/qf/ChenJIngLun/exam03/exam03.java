package com.qf.ChenJIngLun.exam03;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class exam03 {
public static void main(String[] args) {
	Random r = new Random();
	int[] red = new int[6];
	for (int i = 0; i < red.length; i++) {
		red[i] = r.nextInt(9);
	}
	int temp = 0;
	for (int i = 0; i < red.length-1; i++) {
		for (int j = 0; j < red.length-i-1; j++) {
			if(red[j]>red[j+1]) {
				temp = red[j];
				red[j] = red[j+1];
				red[j+1] = temp;
			}
		}
	}
	int blue = r.nextInt(9);
	Integer[] rr = new Integer[6];
	for (int i = 0; i < rr.length; i++) {
		rr[i] = red[i];
	}
	Integer[] bb = new Integer[1];
	bb[0] = blue;
	TreeMap<String,Integer[]> m = new TreeMap<String, Integer[]>();
	m.put("∫Ï«Ú", rr);
	m.put("¿∂«Ú", bb);
	Set<String> ks = m.keySet();
	for (String s : ks) {
		System.out.println(s + ":"+Arrays.toString(m.get(s)));
	}
}
}
