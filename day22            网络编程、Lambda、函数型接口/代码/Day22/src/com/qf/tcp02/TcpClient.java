package com.qf.tcp02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 1������Socket����
 * 2������������
 * 3����ȡ�����
 * 4����д����
 * 5���ر�����
 * @author Dushine2008
 *
 */
public class TcpClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		// 1������Socket����
		Socket socket = new Socket("10.31.154.53", 6789);
		
		// 2������������
		FileInputStream fis = new FileInputStream(new File("D:\\img001.jpg"));
		
		// 3����ȡ�����
		OutputStream os = socket.getOutputStream();
		
		// 4����д����
		byte[] b = new byte[1024];
		int len = -1;
		
		while ((len = fis.read(b)) != -1) {
			os.write(b, 0, len);
		}
		
		// 5���ر�����
		System.out.println("�ϴ����...");
		fis.close();
		socket.close();
	}
}
