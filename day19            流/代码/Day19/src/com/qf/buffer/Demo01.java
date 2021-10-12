package com.qf.buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	ʹ�û����ֽ�������һ���ļ�
		 */
		long startTime = System.currentTimeMillis();
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream(new File("D:\\software\\XTLBB-JD-3.67.9033_GF.zip")));
			bos = new BufferedOutputStream(new FileOutputStream(new File("D:\\software\\XTLBB-JD-3.67.9033_GF-����.zip")));
			
			// �����ļ�
			byte[] b = new byte[1024*1024];
			int len = -1;
			
			while ((len=bis.read(b)) != -1) {
				bos.write(b, 0, len);
			}
			
			// ǿ���������������
			bos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bos != null) {
					bos.close();
				}
				
				if (bis != null) {
					bis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(System.currentTimeMillis() - startTime);
		System.out.println("OVER");
	}
}
