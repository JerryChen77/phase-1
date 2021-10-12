package com.qf.inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo03 {
	public static void main(String[] args) {
FileInputStream fis = null;
		
		try {
			// ʵ��������
			fis = new FileInputStream(new File("bbb.txt"));
			// ÿ�ζ�ȡһ����Ϣ
			byte[] b = new byte[4];
			System.out.println(Arrays.toString(b));
			
			int i = fis.read(b);
			System.out.println(i);
			System.out.println(Arrays.toString(b));
			
			i = fis.read(b);
			System.out.println(i);
			System.out.println(Arrays.toString(b));
			
			i = fis.read(b);
			System.out.println(i);
			System.out.println(Arrays.toString(b));
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
