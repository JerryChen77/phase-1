package com.qf.tcp1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) throws IOException {
		// 1������ServerSocket����
		ServerSocket serverSocket = new ServerSocket(6677);
		
		// 2������accept������ȡSocket����
		Socket socket = serverSocket.accept();
		
		// 3����ȡ������
		InputStream is = socket.getInputStream();
		
		// 4����ȡ�ļ�����
		byte[] bytes = new byte[256];
		is.read(bytes);
		
		// bytesת�����ַ���
		String fileName = new String(bytes);
		fileName = "C:\\Users\\Dushine2008\\Desktop\\" + fileName.trim();
		
		// �����ļ�����
		File file = new File(fileName);
		
		// 5�����������
		FileOutputStream fos = new FileOutputStream(file);
		
		// 6��ѭ����д
		byte[] b = new byte[1024];
		int len = -1;
		
		while ((len = is.read(b)) != -1) {
			fos.write(b, 0, len);
		}
		System.out.println("�ļ����ճɹ�....................");
		
		fos.close();
		serverSocket.close();
	}
}
