package com.qf.transfer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 	复制乱码的文件
		 * 	在复制文件过程中解决乱码问题
		 * 
		 * 	读文件--以文件原来的编码方式读
		 * 	写文件--一当前生产环境的字符编码写
		 * 
		 *  InputStreamReader(InputStream in) 
			          创建一个使用默认字符集的 InputStreamReader。 
			InputStreamReader(InputStream in, String charsetName) 
			          创建使用指定字符集的 InputStreamReader。
          
          
            OutputStreamWriter(OutputStream out) 
		          	创建使用默认字符编码的 OutputStreamWriter。 
		    OutputStreamWriter(OutputStream out, String charsetName) 
		          	创建使用指定字符集的 OutputStreamWriter。 
		 * 
		 */
		
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		
		try {
			// 创建对象
			isr = new InputStreamReader(new BufferedInputStream(new FileInputStream(new File("day18笔记.md"))), "UTF-8");
			osw = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(new File("day18笔记-副本.md"))), "GBK");
			
			// 读写数据
			char[] c = new char[1024];
			int len = -1;
			
			while ((len = isr.read(c)) != -1) {
				osw.write(c, 0, len);
			}
			osw.flush();
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (osw != null) {
					osw.close();
				}
				if (isr != null) {
					isr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
		System.out.println("OVER");
	}
}
