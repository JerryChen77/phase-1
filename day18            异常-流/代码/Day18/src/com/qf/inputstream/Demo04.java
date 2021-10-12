package com.qf.inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Demo04 {
	public static void main(String[] args) {
		/**
		 * 	使用循环读取数据
		 */
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(new File("bbb.txt"));
			
			byte[] b = new byte[4];
			// 每次读取数据的数量
			int len = -1;
			
			while ((len = fis.read(b)) != -1) {
				// System.out.println(Arrays.toString(b));
				for (int i = 0; i < len; i++) {
					System.out.println(b[i]);
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
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
		
		System.out.println("OVER");
	}
}
