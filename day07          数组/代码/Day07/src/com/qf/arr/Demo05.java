package com.qf.arr;

public class Demo05 {
	public static void main(String[] args) {
		String[] names = new String[6];
		
		names[0] = "ÎäËÉ";
		names[1] = "ÎäÖ²";
		names[2] = "Î÷ÃÅ´ó¹ÙÈË";
		names[3] = "ÅË½ðÁ«";
		names[4] = "ÍõÆÅ";
		names[5] = "Û©¸ç";
		
		// µ¹Ðò±éÀú
		for (int i = names.length-1; i >= 0; i--) {
			System.out.println(names[i]);
		}
		
		System.out.println("========");
		
	}
}
