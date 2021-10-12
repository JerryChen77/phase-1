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
		 * 	����������ļ�
		 * 	�ڸ����ļ������н����������
		 * 
		 * 	���ļ�--���ļ�ԭ���ı��뷽ʽ��
		 * 	д�ļ�--һ��ǰ�����������ַ�����д
		 * 
		 *  InputStreamReader(InputStream in) 
			          ����һ��ʹ��Ĭ���ַ����� InputStreamReader�� 
			InputStreamReader(InputStream in, String charsetName) 
			          ����ʹ��ָ���ַ����� InputStreamReader��
          
          
            OutputStreamWriter(OutputStream out) 
		          	����ʹ��Ĭ���ַ������ OutputStreamWriter�� 
		    OutputStreamWriter(OutputStream out, String charsetName) 
		          	����ʹ��ָ���ַ����� OutputStreamWriter�� 
		 * 
		 */
		
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		
		try {
			// ��������
			isr = new InputStreamReader(new BufferedInputStream(new FileInputStream(new File("day18�ʼ�.md"))), "UTF-8");
			osw = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(new File("day18�ʼ�-����.md"))), "GBK");
			
			// ��д����
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
