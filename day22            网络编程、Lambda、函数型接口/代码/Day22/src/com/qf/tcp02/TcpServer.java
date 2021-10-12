package com.qf.tcp02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 1������ServerSocket����
 * 2������accept������ȡSocket����
 * 3����ȡ������
 * 4�����������--�Ѷ�ȡ���ļ�����д������
 * 5��ѭ����д
 * 6���ر�����
 * @author Dushine2008
 *
 */
public class TcpServer {
	public static void main(String[] args) throws IOException {
		// 1������ServerSocket����
		ServerSocket serverSocket = new ServerSocket(6789);
		
		// 2������accept������ȡSocket����
		Socket socket = serverSocket.accept();
		
		// 3����ȡ������
		InputStream is = socket.getInputStream();
		
		// 4�����������--�Ѷ�ȡ���ļ�����д������
		FileOutputStream fos = new FileOutputStream(new File("img001.jpg"));
		
		//  5��ѭ����д
		byte[] b = new byte[1024];
		int len = -1;
		
		while ((len=is.read(b)) != -1) {
			fos.write(b, 0, len);
		}
		
		// 6���ر�����
		System.out.println("�ļ��������...");
		fos.close();
		serverSocket.close();
		
	}
}
