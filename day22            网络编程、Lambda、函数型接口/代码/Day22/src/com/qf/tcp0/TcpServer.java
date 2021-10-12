package com.qf.tcp0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 1������ServerSocket,��ȷ����˶˿ں�
 * 2������accept������������
 * 3����ȡ������,��ȡ�ͻ��˷���������
 * 4���������
 * 5���ظ�����--�����
 * 6���ر�����
 * @author Dushine2008
 *
 */
public class TcpServer {

	public static void main(String[] args) throws IOException {
		// 1������ServerSocket,��ȷ����˶˿ں�
		ServerSocket serverSocket = new ServerSocket(5678);
		
		// 2������accept������������
		Socket socket = serverSocket.accept();
		
		// 3����ȡ������,��ȡ�ͻ��˷���������
		InputStream is = socket.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(is, "utf-8"));
		
		// 4���������
		String msg = reader.readLine();
		System.out.println(socket.getInetAddress().getHostAddress() + "������Ϣ:" + msg);
		
		// 6���ر�����
		serverSocket.close();
	}

}
